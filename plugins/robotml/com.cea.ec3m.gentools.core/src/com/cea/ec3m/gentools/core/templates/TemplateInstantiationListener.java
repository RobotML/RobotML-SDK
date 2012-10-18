/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package com.cea.ec3m.gentools.core.templates;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.Type;

import FCM.ActualChoice;
import FCM.Template;
import FCM.TemplateKind;

import com.cea.ec3m.gentools.core.PortUtils;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.Stereotypes;
import com.cea.ec3m.gentools.core.acceleo.AcceleoDriver;
import com.cea.ec3m.gentools.core.listeners.CopyListener;
import com.cea.ec3m.gentools.core.transformations.Copy;
import com.cea.ec3m.gentools.core.transformations.TransformationContext;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

/**
 * Template instantiation is implemented by means of an CopyListener that
 * evaluates the template stereotype.
 */

public class TemplateInstantiationListener implements CopyListener {

	public static TemplateInstantiationListener getInstance() {
		if(templateInstantiationListener == null) {
			templateInstantiationListener = new TemplateInstantiationListener();
			templateInstantiationListener.treatTemplate = false;
		}
		return templateInstantiationListener;
	}

	public void init(Copy copy, TemplateBinding binding, Object[] args) {
		treatTemplate = false;
		this.copy = copy;
		this.binding = binding;
		this.args = args;
	}

	private TemplateBinding binding;

	private Copy copy;

	private Object[] args;

	private boolean treatTemplate;

	private static TemplateInstantiationListener templateInstantiationListener;

	public EObject copyEObject(Copy copy, EObject sourceEObj) {
		if(treatTemplate) {
			return sourceEObj;
		}
		treatTemplate = true;
		EObject targetEObj = checkEObject(copy, sourceEObj);
		treatTemplate = false;
		return targetEObj;
	}

	protected EObject checkEObject(Copy copy, EObject sourceEObj) {
		try {
			if(sourceEObj instanceof Element) {
				if(sourceEObj instanceof OpaqueBehavior) {
					OpaqueBehavior behavior = (OpaqueBehavior)sourceEObj;
					// in case of a behavior, examine stereotype on associated operation
					BehavioralFeature bf = behavior.getSpecification();
					if(bf != null) {
						Template template = StUtils.getApplication(bf, Template.class);
						if(template != null) {
							return null;
						}
					}
				}
				else {
					Template template = StUtils.getApplication((Element)sourceEObj, Template.class);
					if((template != null)) { // && (!treatTemplateElement.containsKey(sourceEObj))) {
						// treatTemplateElement.put(sourceEObj, true);
						if(sourceEObj instanceof Operation) {
							Operation operation = (Operation)sourceEObj;

							Classifier actual = getFirstActualFromBinding(operation);
							Class boundClass = copy.getCopy(operation.getClass_());
							if(template.getKind() == TemplateKind.LOOP_OPERATIONS) {
								// in case of loop operations, the template parameter is iteratively an
								// operation of the actual (which should be an interface) in this case.
								// 
								// The template operation typically inherits all parameters. This is expressed by
								// a single parameter with the LOOP_PARAMETERS options (<%name%> as name, what as type?)
								// cleaner (more general: if user writes loop with Acceleo as well?]
								//   // owns template operation parameter??
								Type passedActual = getPassedActual(template, actual, boundClass);
								if(!(passedActual instanceof Interface)) {
									return sourceEObj;
								}
								Interface passedActualIntf = (Interface)passedActual;
								Operation last = null;
								EList<Element> removalList = new BasicEList<Element>();
								for(Operation intfOperation : passedActualIntf.getAllOperations()) {
									for(Element removalElement : removalList) {
										copy.removeForCopy(removalElement); // enable subsequent instantiations
									}
									removalList.clear();
									last = instantiateOperation(intfOperation, template, operation, boundClass);
									removalList.add(operation);
									for(Behavior method : operation.getMethods()) {
										if(method instanceof OpaqueBehavior) {
											Behavior newBehavior =
												instantiateBehavior(intfOperation, template, (OpaqueBehavior)method);
											newBehavior.setSpecification(last);
											removalList.add(method);
										}
									}
								}
								// from a logical viewpoint, we need to copy parameters & name, but not the
								// operation identity.
								copy.put(operation, last);
								return last;
							}
							else {
								Operation newOperation = instantiateOperation(actual, template, operation, boundClass);
								for(Behavior method : operation.getMethods()) {
									if(method instanceof OpaqueBehavior) {
										Behavior newBehavior =
											instantiateBehavior(actual, template, (OpaqueBehavior)method);
										newBehavior.setSpecification(newOperation);
									}
								}
								return newOperation;
							}
						}
						else if(sourceEObj instanceof EnumerationLiteral) {
							if(template.getKind() == TemplateKind.LOOP_OPERATIONS) {
								EnumerationLiteral literal = (EnumerationLiteral)sourceEObj;
								Classifier actual = getFirstActualFromBinding(literal);
								// Type passedActual = getPassedActual(template, actual, boundClass);
								Type passedActual = actual;
								if(!(passedActual instanceof Interface)) {
									return sourceEObj;
								}
								Interface passedActualIntf = (Interface)passedActual;
								EnumerationLiteral newLiteral = null;
								for(Operation intfOperation : passedActualIntf.getAllOperations()) {
									copy.removeForCopy(literal);
									newLiteral = copy.getCopy(literal);
									String newName = AcceleoDriver.bind(literal.getName(), intfOperation, args);
									newLiteral.setName(newName);
								}
								return newLiteral;
							}
						}
					}
				}
			}
			return sourceEObj;

		} catch (TransformationException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Operation instantiateOperation(Element actual, Template template, Operation operation, Class boundClass) {
		try {
			Operation newOperation = copy.getCopy(operation);
			if(actual instanceof Operation) {
				for(Parameter parameter : ((Operation)actual).getOwnedParameters()) {
					Parameter newParam = EcoreUtil.copy(parameter); // copy parameter via EcoreUtil
					newParam.setType(copy.getCopy(parameter.getType()));
					newOperation.getOwnedParameters().add(newParam);
				}
			}
			TransformationContext.classifier = newOperation.getClass_();
			if(actual instanceof Classifier) {
				bindOperation(newOperation, (Classifier)actual);
			}
			String newName = AcceleoDriver.bind(operation.getName(), actual, args);
			newOperation.setName(newName);

			return newOperation;
		} catch (TransformationException e) {
			e.printStackTrace();
		}
		return null;
	}

	public OpaqueBehavior instantiateBehavior(Element actual, Template template, OpaqueBehavior opaqueBehavior) {
		try {
			OpaqueBehavior newBehavior = copy.getCopy(opaqueBehavior);
			if(actual instanceof NamedElement) {
				String newName = AcceleoDriver.bind(opaqueBehavior.getName(), actual, args);
				newBehavior.setName(newName);
			}
			EList<String> bodyList = newBehavior.getBodies();
			for(int i = 0; i < bodyList.size(); i++) {
				String body = bodyList.get(i);
				TransformationContext.classifier = (Classifier)newBehavior.getOwner();
				String newBody = AcceleoDriver.bind(body, actual, args);
				bodyList.set(i, newBody);
			}
			return newBehavior;
		} catch (TransformationException e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * @param element
	 *        an element that is stereotyped with FCM::Template. The
	 *        template parameter identified there is taken into account. If
	 *        set to null, all actuals from the binding are returned. This
	 *        is practical, since it implies that it is not necessary to
	 *        specify the template parameter for the common case of a
	 *        signature containing a single parameter.
	 * @return a list of actuals which, either for all parameters or the binding
	 *         or a selection specified by the stereotype attribute
	 *         templateParams (on element).
	 * @throws TransformationException
	 */
	public EList<Classifier> getActuals(Element element) throws TransformationException {
		Template template = StUtils.getApplication(element, Template.class);
		if(template != null) {
			EList<Classifier> templateParams = template.getTemplateParams();
			EList<Classifier> actuals = new BasicEList<Classifier>();
			if(templateParams.size() == 0) {
				for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
					if(substitution.getActual() instanceof Classifier) {
						actuals.add((Classifier)substitution.getActual());
					}
				}
			} else {
				for(Classifier cl : templateParams) {
					// actuals.add((Classifier)bindNamedElement(cl));
					System.err.println(cl);
				}
			}
			return actuals;
		}
		return null;
	}

	/**
	 * Useful (instead of first matching a certain type??)
	 * 
	 * @param element
	 * @param binding
	 * @return
	 * @throws TransformationException
	 */
	public Classifier getFirstActualFromBinding(Element element) throws TransformationException {
		EList<Classifier> actuals = getActuals(element);
		if((actuals.size() > 0) && (actuals.get(0) instanceof Classifier)) {
			return (Classifier)actuals.get(0);
		}
		return null;
	}


	/**
	 * Bind C++ const initializer
	 * 
	 * @param operation
	 * @param actual
	 * @throws TransformationException
	 */
	public void bindOperation(Operation operation, Classifier actual) throws TransformationException {
		// perform binding in case of C++ initializer
		if(StUtils.isApplied(operation, Stereotypes.cppConstInit)) {
			// TODO: specific to C++
			String init = (String)StUtils.getAttribute(operation, Stereotypes.cppConstInit, "initialisation");
			String newInit = AcceleoDriver.bind(init, actual);
			StUtils.setAttribute(operation, Stereotypes.cppConstInit, "initialisation", newInit);
		}
	}

	/**
	 * @param actual
	 *        the actual template parameter
	 * @param boundClass
	 *        the bound class
	 * @param provides
	 *        true, if the provided interface should be returned
	 * @return the provided or required interface of a port (of the passed
	 *         boundClass) that is typed with the the actual.
	 */
	private static Interface getInterfaceFromPortTypedWithActual(Type actual, Class boundClass, boolean provided) {
		for(Port port : PortUtils.getAllPorts(boundClass)) {
			Interface provOrReqIntf;
			if(provided) {
				provOrReqIntf = PortUtils.getProvided(port);
			} else {
				provOrReqIntf = PortUtils.getRequired(port);
			}

			if((port.getType() == actual) && (provOrReqIntf != null)) {
				return provOrReqIntf;
			}
		}
		return null;
	}

	private Type getPassedActual(Template template, Type actual, Class boundClass) {
		if(template.getActualChoice() == ActualChoice.INTERFACE_OF_PPORT) {
			return getInterfaceFromPortTypedWithActual(actual, boundClass, true);
		} else if(template.getActualChoice() == ActualChoice.INTERFACE_OF_RPORT) {
			// TODO: typically does not make sense to loop over it.
			return getInterfaceFromPortTypedWithActual(actual, boundClass, false);
		} else if(template.getActualChoice() == ActualChoice.PASS_ACTUAL) {
			return actual;
		} else {
			// default behavior (common use in connectors): in case of a loop over operations, return actual
			// from provided port
			// TODO: Again, this is a hack!
			if(template.getKind() == TemplateKind.LOOP_OPERATIONS) {
				return getInterfaceFromPortTypedWithActual(actual, boundClass, true);
			} else {
				return actual;
			}
		}
	}
}
