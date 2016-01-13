package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class VLEStateMachineHeaderGenerator {
  public static CharSequence generateCode(final StateMachine smElt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.append("/*\t\t\t\t");
    String _name = smElt.getName();
    _builder.append(_name, "");
    _builder.append(" header file\t\t\t\t*/");
    _builder.newLineIfNotEmpty();
    _builder.append("/********************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _name_1 = smElt.getName();
    String _upperCase = _name_1.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _name_2 = smElt.getName();
    String _upperCase_1 = _name_2.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace generated {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class ");
    String _name_3 = smElt.getName();
    _builder.append(_name_3, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_4 = smElt.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("virutal ~");
    String _name_5 = smElt.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      List<Transition> _transition = VLEStateMachineHeaderGenerator.getTransition(smElt);
      for(final Transition transition : _transition) {
        _builder.append("\t\t");
        _builder.append("void transition_");
        Vertex _source = transition.getSource();
        String _name_6 = _source.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("_to_");
        Vertex _target = transition.getTarget();
        String _name_7 = _target.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("(const vd::Time& /*time*/);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("bool guard_");
        Constraint _guard = transition.getGuard();
        ValueSpecification _specification = _guard.getSpecification();
        String _name_8 = _specification.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append("(const vd::Time& /*time*/);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("void effect_");
        Behavior _effect = transition.getEffect();
        BehavioralFeature _specification_1 = _effect.getSpecification();
        String _name_9 = _specification_1.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("(const vd::Time& /*time*/);");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif /*");
    String _name_10 = smElt.getName();
    String _upperCase_2 = _name_10.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_HEADER*/");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static List<Transition> getTransition(final StateMachine smElt) {
    ArrayList<Transition> transitionList = new ArrayList<Transition>();
    EList<Region> _regions = smElt.getRegions();
    for (final Region region : _regions) {
      EList<Transition> _transitions = region.getTransitions();
      for (final Transition transition : _transitions) {
        transitionList.add(transition);
      }
    }
    return transitionList;
  }
  
  public static List<Vertex> getStates(final StateMachine smeElt) {
    ArrayList<Vertex> statesList = new ArrayList<Vertex>();
    EList<Region> _regions = smeElt.getRegions();
    for (final Region region : _regions) {
      EList<Vertex> _subvertices = region.getSubvertices();
      for (final Vertex state : _subvertices) {
        statesList.add(state);
      }
    }
    return statesList;
  }
}
