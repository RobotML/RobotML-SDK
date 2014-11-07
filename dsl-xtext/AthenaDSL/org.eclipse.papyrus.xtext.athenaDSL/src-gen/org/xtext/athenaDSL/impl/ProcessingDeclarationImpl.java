/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.localEventDeclaration;
import org.xtext.athenaDSL.localParameterDeclaration;
import org.xtext.athenaDSL.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.ProcessingDeclarationImpl#getLocalParameters <em>Local Parameters</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProcessingDeclarationImpl#getLocalEvents <em>Local Events</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProcessingDeclarationImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingDeclarationImpl extends FuncProcImpl implements ProcessingDeclaration
{
  /**
   * The cached value of the '{@link #getLocalParameters() <em>Local Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalParameters()
   * @generated
   * @ordered
   */
  protected EList<localParameterDeclaration> localParameters;

  /**
   * The cached value of the '{@link #getLocalEvents() <em>Local Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalEvents()
   * @generated
   * @ordered
   */
  protected EList<localEventDeclaration> localEvents;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessingDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AthenaDSLPackage.Literals.PROCESSING_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<localParameterDeclaration> getLocalParameters()
  {
    if (localParameters == null)
    {
      localParameters = new EObjectContainmentEList<localParameterDeclaration>(localParameterDeclaration.class, this, AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS);
    }
    return localParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<localEventDeclaration> getLocalEvents()
  {
    if (localEvents == null)
    {
      localEvents = new EObjectContainmentEList<localEventDeclaration>(localEventDeclaration.class, this, AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS);
    }
    return localEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<statement>(statement.class, this, AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS:
        return ((InternalEList<?>)getLocalParameters()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS:
        return ((InternalEList<?>)getLocalEvents()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS:
        return getLocalParameters();
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS:
        return getLocalEvents();
      case AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS:
        getLocalParameters().clear();
        getLocalParameters().addAll((Collection<? extends localParameterDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS:
        getLocalEvents().clear();
        getLocalEvents().addAll((Collection<? extends localEventDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS:
        getLocalParameters().clear();
        return;
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS:
        getLocalEvents().clear();
        return;
      case AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS:
        getStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_PARAMETERS:
        return localParameters != null && !localParameters.isEmpty();
      case AthenaDSLPackage.PROCESSING_DECLARATION__LOCAL_EVENTS:
        return localEvents != null && !localEvents.isEmpty();
      case AthenaDSLPackage.PROCESSING_DECLARATION__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcessingDeclarationImpl
