package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.papyrus.RobotML.State;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEGeneratorUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class VLEStateMachineImplementationGenerator {
  public static CharSequence generateCode(final StateMachine smElt, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.append("/*\t\t\t");
    _builder.append(prefix, "");
    _builder.append("_");
    String _name = smElt.getName();
    _builder.append(_name, "");
    _builder.append(" implementation file\t\t\t*/");
    _builder.newLineIfNotEmpty();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.append("#include \"");
    _builder.append(prefix, "");
    _builder.append("_");
    String _name_1 = smElt.getName();
    _builder.append(_name_1, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.append("namespace generated {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Constructor*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(prefix, "\t");
    _builder.append("_");
    String _name_2 = smElt.getName();
    _builder.append(_name_2, "\t");
    _builder.append("::");
    _builder.append(prefix, "\t");
    _builder.append("_");
    String _name_3 = smElt.getName();
    _builder.append(_name_3, "\t");
    _builder.append("(const I");
    _builder.append(prefix, "\t");
    _builder.append("_");
    String _name_4 = smElt.getName();
    _builder.append(_name_4, "\t");
    _builder.append("* pMachine, const vd::DynamicsInit& init, const vd::InitEventList& events) : _pMachine(pMachine) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("states(this)");
    {
      List<State> _robotMLStates = VLEGeneratorUtil.getRobotMLStates(smElt);
      for(final State state : _robotMLStates) {
        _builder.append(" << ");
        _builder.append(prefix, "\t\t");
        _builder.append("_");
        String _name_5 = smElt.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("::");
        org.eclipse.uml2.uml.State _base_State = state.getBase_State();
        String _name_6 = _base_State.getName();
        _builder.append(_name_6, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      List<Transition> _transition = VLEGeneratorUtil.getTransition(smElt);
      for(final Transition transition : _transition) {
        _builder.append("\t\t");
        _builder.append("transition(this,");
        _builder.append(prefix, "\t\t");
        _builder.append("_");
        String _name_7 = smElt.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("::");
        Vertex _source = transition.getSource();
        String _name_8 = _source.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append(",");
        _builder.append(prefix, "\t\t");
        _builder.append("_");
        String _name_9 = smElt.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("::");
        Vertex _target = transition.getTarget();
        String _name_10 = _target.getName();
        _builder.append(_name_10, "\t\t");
        _builder.append(") << action(&");
        _builder.append(prefix, "\t\t");
        _builder.append("_");
        String _name_11 = smElt.getName();
        _builder.append(_name_11, "\t\t");
        _builder.append("::transition_");
        Vertex _source_1 = transition.getSource();
        String _name_12 = _source_1.getName();
        _builder.append(_name_12, "\t\t");
        _builder.append("_to_");
        Vertex _target_1 = transition.getTarget();
        String _name_13 = _target_1.getName();
        _builder.append(_name_13, "\t\t");
        _builder.append(")");
        {
          Constraint _guard = transition.getGuard();
          boolean _notEquals = (!Objects.equal(_guard, null));
          if (_notEquals) {
            _builder.append("<< guard(&");
            _builder.append(prefix, "\t\t");
            _builder.append("_");
            String _name_14 = smElt.getName();
            _builder.append(_name_14, "\t\t");
            _builder.append("::guard_");
            Constraint _guard_1 = transition.getGuard();
            ValueSpecification _specification = _guard_1.getSpecification();
            String _name_15 = _specification.getName();
            _builder.append(_name_15, "\t\t");
            _builder.append(")");
          }
        }
        {
          Behavior _effect = transition.getEffect();
          boolean _notEquals_1 = (!Objects.equal(_effect, null));
          if (_notEquals_1) {
            _builder.append("<< effect(&");
            _builder.append(prefix, "\t\t");
            _builder.append("_");
            String _name_16 = smElt.getName();
            _builder.append(_name_16, "\t\t");
            _builder.append("::");
            Behavior _effect_1 = transition.getEffect();
            BehavioralFeature _specification_1 = _effect_1.getSpecification();
            String _name_17 = _specification_1.getName();
            _builder.append(_name_17, "\t\t");
            _builder.append(")");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Destructor*/");
    _builder.newLine();
    _builder.append("\t");
    String _name_18 = smElt.getName();
    _builder.append(_name_18, "\t");
    _builder.append("::~");
    String _name_19 = smElt.getName();
    _builder.append(_name_19, "\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Transitions*/");
    _builder.newLine();
    {
      List<Transition> _transition_1 = VLEGeneratorUtil.getTransition(smElt);
      for(final Transition transition_1 : _transition_1) {
        _builder.append("\t");
        _builder.append("void ");
        String _name_20 = smElt.getName();
        _builder.append(_name_20, "\t");
        _builder.append("::transition_");
        Vertex _source_2 = transition_1.getSource();
        String _name_21 = _source_2.getName();
        _builder.append(_name_21, "\t");
        _builder.append("_to_");
        Vertex _target_2 = transition_1.getTarget();
        String _name_22 = _target_2.getName();
        _builder.append(_name_22, "\t");
        _builder.append("(const vd::Time& time)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(_pMachine != NULL)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("_pMachine->doTransition_");
        Vertex _source_3 = transition_1.getSource();
        String _name_23 = _source_3.getName();
        _builder.append(_name_23, "\t\t\t");
        _builder.append("_to_");
        Vertex _target_3 = transition_1.getTarget();
        String _name_24 = _target_3.getName();
        _builder.append(_name_24, "\t\t\t");
        _builder.append("(time);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        {
          Constraint _guard_2 = transition_1.getGuard();
          boolean _notEquals_2 = (!Objects.equal(_guard_2, null));
          if (_notEquals_2) {
            _builder.append("bool ");
            String _name_25 = smElt.getName();
            _builder.append(_name_25, "");
            _builder.append("::guard_");
            Constraint _guard_3 = transition_1.getGuard();
            ValueSpecification _specification_2 = _guard_3.getSpecification();
            String _name_26 = _specification_2.getName();
            _builder.append(_name_26, "");
            _builder.append("(const vd::Time& time)");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if(_pMachine != NULL)");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("_pMachine->doGuard_");
            Constraint _guard_4 = transition_1.getGuard();
            ValueSpecification _specification_3 = _guard_4.getSpecification();
            String _name_27 = _specification_3.getName();
            _builder.append(_name_27, "\t\t");
            _builder.append("(time);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          Behavior _effect_2 = transition_1.getEffect();
          boolean _notEquals_3 = (!Objects.equal(_effect_2, null));
          if (_notEquals_3) {
            _builder.append("void ");
            String _name_28 = smElt.getName();
            _builder.append(_name_28, "");
            _builder.append("::effect_");
            Behavior _effect_3 = transition_1.getEffect();
            BehavioralFeature _specification_4 = _effect_3.getSpecification();
            String _name_29 = _specification_4.getName();
            _builder.append(_name_29, "");
            _builder.append("(const vd::Time& time)");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("if(_pMachine != NULL)");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("_pMachine->doEffect_");
            Behavior _effect_4 = transition_1.getEffect();
            BehavioralFeature _specification_5 = _effect_4.getSpecification();
            String _name_30 = _specification_5.getName();
            _builder.append(_name_30, "\t\t");
            _builder.append("(time);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
