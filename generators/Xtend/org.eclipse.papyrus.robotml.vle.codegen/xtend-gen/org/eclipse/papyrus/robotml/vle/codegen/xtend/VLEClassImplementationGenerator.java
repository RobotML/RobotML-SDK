package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEGeneratorUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class VLEClassImplementationGenerator {
  public static CharSequence generateCode(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"");
    String _name = classElt.getName();
    _builder.append(_name, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace generated {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Constructor & destructor*/");
    _builder.newLine();
    _builder.append("\t");
    String _name_1 = classElt.getName();
    _builder.append(_name_1, "\t");
    _builder.append("::");
    String _name_2 = classElt.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(const vd::DynamicsInit& init, const vd::InitEventList& events) ");
    EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
    CharSequence _generateInheritedConstructor = VLEClassImplementationGenerator.generateInheritedConstructor(_superClasses);
    _builder.append(_generateInheritedConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _name_3 = classElt.getName();
    _builder.append(_name_3, "\t");
    _builder.append("::~");
    String _name_4 = classElt.getName();
    _builder.append(_name_4, "\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Operations*/");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateOperationForBaseClass = VLEClassImplementationGenerator.generateOperationForBaseClass(classElt);
    _builder.append(_generateOperationForBaseClass, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateOperationsForChildClass = VLEClassImplementationGenerator.generateOperationsForChildClass(classElt);
    _builder.append(_generateOperationsForChildClass, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateOperationsForStateMachine = VLEClassImplementationGenerator.generateOperationsForStateMachine(classElt);
    _builder.append(_generateOperationsForStateMachine, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Operation> _operations = classElt.getOperations();
    Hashtable<String, List<Operation>> _operationList = VLEGeneratorUtil.getOperationList(_operations);
    CharSequence _generateOperation = VLEClassImplementationGenerator.generateOperation(_operationList);
    _builder.append(_generateOperation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generateInheritedConstructor(final EList<org.eclipse.uml2.uml.Class> classList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = classList.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        _builder.append(": ");
        {
          for(final org.eclipse.uml2.uml.Class clazz : classList) {
            String _name = clazz.getName();
            _builder.append(_name, "");
            _builder.append("(init, events)");
            {
              org.eclipse.uml2.uml.Class _last = IterableExtensions.<org.eclipse.uml2.uml.Class>last(classList);
              boolean _equals_1 = _last.equals(clazz);
              boolean _equals_2 = (_equals_1 == false);
              if (_equals_2) {
                _builder.append(", ");
              }
            }
          }
        }
      } else {
        _builder.append(": vd::Dynamics(init,evnts)");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateOperation(final Hashtable<String, List<Operation>> opMap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Collection<List<Operation>> _values = opMap.values();
      for(final List<Operation> opList : _values) {
        {
          for(final Operation op : opList) {
            CharSequence _generateOperation = VLEClassImplementationGenerator.generateOperation(op);
            _builder.append(_generateOperation, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateOperation(final Operation op) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Parameter> _outputParameters = op.outputParameters();
    CharSequence _generateReturnParameter = VLEGeneratorUtil.generateReturnParameter(_outputParameters);
    _builder.append(_generateReturnParameter, "");
    _builder.append(" ");
    org.eclipse.uml2.uml.Class _class_ = op.getClass_();
    String _name = _class_.getName();
    _builder.append(_name, "");
    _builder.append("::");
    String _name_1 = op.getName();
    _builder.append(_name_1, "");
    _builder.append("(");
    EList<Parameter> _inputParameters = op.inputParameters();
    EList<Parameter> _outputParameters_1 = op.outputParameters();
    Hashtable<String, Parameter> _prameterList = VLEGeneratorUtil.getPrameterList(_inputParameters, _outputParameters_1);
    Collection<Parameter> _values = _prameterList.values();
    CharSequence _generateParameters = VLEGeneratorUtil.generateParameters(_values);
    _builder.append(_generateParameters, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generateOperationForBaseClass(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
      boolean _isEmpty = _superClasses.isEmpty();
      boolean _equals = (_isEmpty == true);
      if (_equals) {
        _builder.append("vd::Time ");
        String _name = classElt.getName();
        _builder.append(_name, "");
        _builder.append("::init(const vd::time& time)");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_1 = classElt.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" - init\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("doInit(time);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return vd::Time(0.0);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("void ");
        String _name_2 = classElt.getName();
        _builder.append(_name_2, "");
        _builder.append("::output(const vd::Time& time, vd::ExternalEventList& output) const ");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_3 = classElt.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" - output\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("doOuput(time, output);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("void ");
        String _name_4 = classElt.getName();
        _builder.append(_name_4, "");
        _builder.append("::internalTransition(const vd::Time& time) ");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_5 = classElt.getName();
        _builder.append(_name_5, "\t");
        _builder.append(" - internalTransition\");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("void ");
        String _name_6 = classElt.getName();
        _builder.append(_name_6, "");
        _builder.append("::externalTransition(const vd::ExternalEventList& eventList, const vd::Time& time) ");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_7 = classElt.getName();
        _builder.append(_name_7, "\t");
        _builder.append(" - externalTransition\");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("vv::Value* ");
        String _name_8 = classElt.getName();
        _builder.append(_name_8, "");
        _builder.append("::observation(const vd::ObservationEvent& event) const {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_9 = classElt.getName();
        _builder.append(_name_9, "\t");
        _builder.append(" - observation\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return vd::Dynamics::observation(event);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("vd::Time ");
        String _name_10 = classElt.getName();
        _builder.append(_name_10, "");
        _builder.append("::timeAdvance() const {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("TraceAlways(vu::DateTime::currentDate() + \" - ");
        String _name_11 = classElt.getName();
        _builder.append(_name_11, "\t");
        _builder.append(" - timeAdvance\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return vd::Time(1.0);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("vd::ExternalEvent* ");
        String _name_12 = classElt.getName();
        _builder.append(_name_12, "");
        _builder.append("::GenerateEvent(vv::Value* pValue, std::string portName) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("vd::ExternalEvent* pEvent = NULL");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if(pValue != NULL)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("pEvent = new ExternalEvent(portName);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("pEvent << vd::attribute(portName, pValue);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("TraceModel(vu::DateTime::currentDate() + \" - Output port \" + portName + \" is changed to \" + pValue->writeToString();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return pEvent;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence generateOperationsForChildClass(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
      boolean _isEmpty = _superClasses.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        _builder.append("void ");
        String _name = classElt.getName();
        _builder.append(_name, "");
        _builder.append("::doInit(const vd::Time& time)");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        {
          EList<Property> _attributes = classElt.getAttributes();
          for(final Property attr : _attributes) {
            _builder.append("\t");
            {
              Type _type = attr.getType();
              if ((_type instanceof DataType)) {
                _builder.append("init_");
                Type _type_1 = attr.getType();
                String _name_1 = _type_1.getName();
                _builder.append(_name_1, "\t");
                _builder.append("(");
                String _name_2 = attr.getName();
                _builder.append(_name_2, "\t");
                _builder.append(");");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("void ");
        String _name_3 = classElt.getName();
        _builder.append(_name_3, "");
        _builder.append("::doOutput(const vd::Time& time, vd::ExternalEventList& output)");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        {
          EList<Property> _attributes_1 = classElt.getAttributes();
          for(final Property attr_1 : _attributes_1) {
            _builder.append("\t");
            _builder.append("vd::ExternalEvent* pEvent = GenerateEvent(");
            String _name_4 = attr_1.getName();
            _builder.append(_name_4, "\t");
            _builder.append(", \"");
            String _name_5 = attr_1.getName();
            _builder.append(_name_5, "\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if(pEvent != NULL)");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("ouput.push_back(pEvent);");
            _builder.newLine();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence generateOperationsForStateMachine(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Behavior _classifierBehavior = classElt.getClassifierBehavior();
      boolean _notEquals = (!Objects.equal(_classifierBehavior, null));
      if (_notEquals) {
        {
          Behavior _classifierBehavior_1 = classElt.getClassifierBehavior();
          List<Transition> _transition = VLEGeneratorUtil.getTransition(((StateMachine) _classifierBehavior_1));
          for(final Transition transition : _transition) {
            _builder.append("void ");
            String _name = classElt.getName();
            _builder.append(_name, "");
            _builder.append("::doTransition_");
            Vertex _source = transition.getSource();
            String _name_1 = _source.getName();
            _builder.append(_name_1, "");
            _builder.append("_to_");
            Vertex _target = transition.getTarget();
            String _name_2 = _target.getName();
            _builder.append(_name_2, "");
            _builder.append("(const vd::Time& time) {");
            _builder.newLineIfNotEmpty();
            {
              boolean _HasStereotype = VLEGeneratorUtil.HasStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
              if (_HasStereotype) {
                _builder.append("\t");
                {
                  EObject _GetStereotype = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                  Behavior _guard = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype).getGuard();
                  boolean _notEquals_1 = (!Objects.equal(_guard, null));
                  if (_notEquals_1) {
                    _builder.append("if(Guard_");
                    EObject _GetStereotype_1 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                    Behavior _guard_1 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_1).getGuard();
                    BehavioralFeature _specification = _guard_1.getSpecification();
                    String _name_3 = _specification.getName();
                    _builder.append(_name_3, "\t");
                    _builder.append(") {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
                _builder.append("\t");
                {
                  EObject _GetStereotype_2 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                  Behavior _effect = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_2).getEffect();
                  boolean _notEquals_2 = (!Objects.equal(_effect, null));
                  if (_notEquals_2) {
                    _builder.append("Effect_");
                    EObject _GetStereotype_3 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                    Behavior _effect_1 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_3).getEffect();
                    BehavioralFeature _specification_1 = _effect_1.getSpecification();
                    String _name_4 = _specification_1.getName();
                    _builder.append(_name_4, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("}");
            _builder.newLine();
            {
              boolean _HasStereotype_1 = VLEGeneratorUtil.HasStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
              if (_HasStereotype_1) {
                {
                  EObject _GetStereotype_4 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                  Behavior _guard_2 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_4).getGuard();
                  boolean _notEquals_3 = (!Objects.equal(_guard_2, null));
                  if (_notEquals_3) {
                    _builder.append("bool ");
                    String _name_5 = classElt.getName();
                    _builder.append(_name_5, "");
                    _builder.append("::doGuard_");
                    EObject _GetStereotype_5 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                    Behavior _guard_3 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_5).getGuard();
                    BehavioralFeature _specification_2 = _guard_3.getSpecification();
                    String _name_6 = _specification_2.getName();
                    _builder.append(_name_6, "");
                    _builder.append("(const vd::Time& time) {\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
                {
                  EObject _GetStereotype_6 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                  Behavior _effect_2 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_6).getEffect();
                  boolean _notEquals_4 = (!Objects.equal(_effect_2, null));
                  if (_notEquals_4) {
                    _builder.append("void ");
                    String _name_7 = classElt.getName();
                    _builder.append(_name_7, "");
                    _builder.append("::doEffect_");
                    EObject _GetStereotype_7 = VLEGeneratorUtil.GetStereotype(transition, org.eclipse.papyrus.RobotML.Transition.class);
                    Behavior _effect_3 = ((org.eclipse.papyrus.RobotML.Transition) _GetStereotype_7).getEffect();
                    BehavioralFeature _specification_3 = _effect_3.getSpecification();
                    String _name_8 = _specification_3.getName();
                    _builder.append(_name_8, "");
                    _builder.append("(const vd::Time& time) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
