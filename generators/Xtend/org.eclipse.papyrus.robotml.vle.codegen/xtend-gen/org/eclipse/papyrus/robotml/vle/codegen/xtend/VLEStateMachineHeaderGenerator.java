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
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class VLEStateMachineHeaderGenerator {
  public static CharSequence generateCode(final StateMachine smElt, final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.append("/*\t\t\t\t");
    _builder.append(prefix, "");
    _builder.append("_");
    String _name = smElt.getName();
    _builder.append(_name, "");
    _builder.append(" header file\t\t\t\t*/");
    _builder.newLineIfNotEmpty();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _upperCase = prefix.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_");
    String _name_1 = smElt.getName();
    String _upperCase_1 = _name_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _upperCase_2 = prefix.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_");
    String _name_2 = smElt.getName();
    String _upperCase_3 = _name_2.toUpperCase();
    _builder.append(_upperCase_3, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum ");
    String _upperCase_4 = prefix.toUpperCase();
    _builder.append(_upperCase_4, "");
    _builder.append("_STATES {");
    _builder.newLineIfNotEmpty();
    {
      List<Vertex> _states = VLEGeneratorUtil.getStates(smElt);
      for(final Vertex state : _states) {
        _builder.append("\t");
        String _name_3 = state.getName();
        _builder.append(_name_3, "\t");
        {
          List<Vertex> _states_1 = VLEGeneratorUtil.getStates(smElt);
          int _indexOf = _states_1.indexOf(state);
          List<Vertex> _states_2 = VLEGeneratorUtil.getStates(smElt);
          int _length = ((Object[])Conversions.unwrapArray(_states_2, Object.class)).length;
          int _minus = (_length - 1);
          boolean _lessThan = (_indexOf < _minus);
          if (_lessThan) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace vf = vle::extension::fsa;");
    _builder.newLine();
    _builder.append("namespace generated {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class I");
    _builder.append(prefix, "\t");
    _builder.append("_");
    String _name_4 = smElt.getName();
    _builder.append(_name_4, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public:\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    {
      List<Transition> _transition = VLEGeneratorUtil.getTransition(smElt);
      for(final Transition transition : _transition) {
        _builder.append("virtual void doTransition_");
        Vertex _source = transition.getSource();
        String _name_5 = _source.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("_to_");
        Vertex _target = transition.getTarget();
        String _name_6 = _target.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("(const vd::Time& /*time*/) = 0;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Constraint _guard = transition.getGuard();
          boolean _notEquals = (!Objects.equal(_guard, null));
          if (_notEquals) {
            _builder.append("virtual bool doGuard_");
            Constraint _guard_1 = transition.getGuard();
            ValueSpecification _specification = _guard_1.getSpecification();
            String _name_7 = _specification.getName();
            _builder.append(_name_7, "\t");
            _builder.append("(const vd::Time& /*time*/) = 0;");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Behavior _effect = transition.getEffect();
          boolean _notEquals_1 = (!Objects.equal(_effect, null));
          if (_notEquals_1) {
            _builder.append("virtual void doEffect_");
            Behavior _effect_1 = transition.getEffect();
            BehavioralFeature _specification_1 = _effect_1.getSpecification();
            String _name_8 = _specification_1.getName();
            _builder.append(_name_8, "\t");
            _builder.append("(const vd::Time& /*time*/) = 0;");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<State> _robotMLStates = VLEGeneratorUtil.getRobotMLStates(smElt);
      for(final State state_1 : _robotMLStates) {
        {
          Behavior _behavior = state_1.getBehavior();
          boolean _notEquals_2 = (!Objects.equal(_behavior, null));
          if (_notEquals_2) {
            _builder.append("virtual void do");
            org.eclipse.uml2.uml.State _base_State = state_1.getBase_State();
            String _name_9 = _base_State.getName();
            _builder.append(_name_9, "");
            _builder.append("() = 0;");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    _builder.append(prefix, "\t");
    _builder.append("_");
    String _name_10 = smElt.getName();
    _builder.append(_name_10, "\t");
    _builder.append(" : public vf::StateChart {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(prefix, "\t\t");
    _builder.append("_");
    String _name_11 = smElt.getName();
    _builder.append(_name_11, "\t\t");
    _builder.append("(const I");
    _builder.append(prefix, "\t\t");
    _builder.append("_");
    String _name_12 = smElt.getName();
    _builder.append(_name_12, "\t\t");
    _builder.append("* pSystem, const vd::DynamicsInit& init, const vd::InitEventList& events);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("virutal ~");
    _builder.append(prefix, "\t\t");
    _builder.append("_");
    String _name_13 = smElt.getName();
    _builder.append(_name_13, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      List<Transition> _transition_1 = VLEGeneratorUtil.getTransition(smElt);
      for(final Transition transition_1 : _transition_1) {
        _builder.append("virtual void transition_");
        Vertex _source_1 = transition_1.getSource();
        String _name_14 = _source_1.getName();
        _builder.append(_name_14, "\t\t");
        _builder.append("_to_");
        Vertex _target_1 = transition_1.getTarget();
        String _name_15 = _target_1.getName();
        _builder.append(_name_15, "\t\t");
        _builder.append("(const vd::Time& /*time*/);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Constraint _guard_2 = transition_1.getGuard();
          boolean _notEquals_3 = (!Objects.equal(_guard_2, null));
          if (_notEquals_3) {
            _builder.append("virtual bool guard_");
            Constraint _guard_3 = transition_1.getGuard();
            ValueSpecification _specification_2 = _guard_3.getSpecification();
            String _name_16 = _specification_2.getName();
            _builder.append(_name_16, "\t");
            _builder.append("(const vd::Time& /*time*/);");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          Behavior _effect_2 = transition_1.getEffect();
          boolean _notEquals_4 = (!Objects.equal(_effect_2, null));
          if (_notEquals_4) {
            _builder.append("virtual void effect_");
            Behavior _effect_3 = transition_1.getEffect();
            BehavioralFeature _specification_3 = _effect_3.getSpecification();
            String _name_17 = _specification_3.getName();
            _builder.append(_name_17, "\t");
            _builder.append("(const vd::Time& /*time*/);");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const I");
    _builder.append(prefix, "\t\t");
    _builder.append("_");
    String _name_18 = smElt.getName();
    _builder.append(_name_18, "\t\t");
    _builder.append("* _pMachine = NULL;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif /*");
    String _upperCase_5 = prefix.toUpperCase();
    _builder.append(_upperCase_5, "");
    _builder.append("_");
    String _name_19 = smElt.getName();
    String _upperCase_6 = _name_19.toUpperCase();
    _builder.append(_upperCase_6, "");
    _builder.append("_HEADER*/");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
