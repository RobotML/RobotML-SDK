package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import RobotMLExtension.Alias;
import RobotMLExtension.Array;
import RobotMLExtension.BasicType;
import RobotMLExtension.Define;
import RobotMLExtension.Map;
import RobotMLExtension.Union;
import RobotMLExtension.Vector;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.RobotML.State;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class VLEGeneratorUtil<T extends Object> {
  public static List<String> getListInheritance(final org.eclipse.uml2.uml.Class clazz) {
    ArrayList<String> list = new ArrayList<String>();
    EList<org.eclipse.uml2.uml.Class> _superClasses = clazz.getSuperClasses();
    boolean _notEquals = (!Objects.equal(_superClasses, null));
    if (_notEquals) {
      EList<org.eclipse.uml2.uml.Class> _superClasses_1 = clazz.getSuperClasses();
      for (final org.eclipse.uml2.uml.Class parentClass : _superClasses_1) {
        String _name = parentClass.getName();
        list.add(_name);
      }
    } else {
      list.add("vd::Dynamics");
    }
    Behavior behavior = clazz.getClassifierBehavior();
    boolean _notEquals_1 = (!Objects.equal(behavior, null));
    if (_notEquals_1) {
      if ((behavior instanceof StateMachine)) {
        StateMachine stateMachine = ((StateMachine) behavior);
        String _name_1 = clazz.getName();
        String _plus = ("I" + _name_1);
        String _plus_1 = (_plus + "_");
        String _name_2 = stateMachine.getName();
        String _plus_2 = (_plus_1 + _name_2);
        list.add(_plus_2);
      }
    }
    return list;
  }
  
  public static boolean HasStateMachine(final org.eclipse.uml2.uml.Class clazz) {
    boolean result = false;
    Behavior _classifierBehavior = clazz.getClassifierBehavior();
    boolean _notEquals = (!Objects.equal(_classifierBehavior, null));
    if (_notEquals) {
      Behavior _classifierBehavior_1 = clazz.getClassifierBehavior();
      result = (_classifierBehavior_1 instanceof StateMachine);
    } else {
      EList<org.eclipse.uml2.uml.Class> _superClasses = clazz.getSuperClasses();
      for (final org.eclipse.uml2.uml.Class supClazz : _superClasses) {
        if ((result == false)) {
          boolean _HasStateMachine = VLEGeneratorUtil.HasStateMachine(supClazz);
          result = _HasStateMachine;
        }
      }
    }
    return result;
  }
  
  public static StateMachine GetStateMachine(final org.eclipse.uml2.uml.Class clazz) {
    Behavior _classifierBehavior = clazz.getClassifierBehavior();
    boolean _notEquals = (!Objects.equal(_classifierBehavior, null));
    if (_notEquals) {
      Behavior _classifierBehavior_1 = clazz.getClassifierBehavior();
      if ((_classifierBehavior_1 instanceof StateMachine)) {
        Behavior _classifierBehavior_2 = clazz.getClassifierBehavior();
        return ((StateMachine) _classifierBehavior_2);
      }
    }
    EList<org.eclipse.uml2.uml.Class> _superClasses = clazz.getSuperClasses();
    for (final org.eclipse.uml2.uml.Class supClazz : _superClasses) {
      {
        StateMachine obj = VLEGeneratorUtil.GetStateMachine(supClazz);
        boolean _notEquals_1 = (!Objects.equal(obj, null));
        if (_notEquals_1) {
          return ((StateMachine) obj);
        }
      }
    }
    return null;
  }
  
  public static Hashtable<String, List<Operation>> getOperationList(final EList<Operation> ops) {
    final Hashtable<String, List<Operation>> opMap = new Hashtable<String, List<Operation>>();
    for (final Operation op : ops) {
      {
        VisibilityKind _visibility = op.getVisibility();
        String visibilityKind = VLEGeneratorUtil.convertVisibility(_visibility);
        boolean _containsKey = opMap.containsKey(visibilityKind);
        boolean _equals = (_containsKey == false);
        if (_equals) {
          ArrayList<Operation> _arrayList = new ArrayList<Operation>();
          opMap.put(visibilityKind, _arrayList);
        }
        List<Operation> _get = opMap.get(visibilityKind);
        _get.add(op);
      }
    }
    return opMap;
  }
  
  public static String convertVisibility(final VisibilityKind kind) {
    String visibilityKind = null;
    boolean _matched = false;
    if (Objects.equal(kind, VisibilityKind.PUBLIC)) {
      _matched=true;
      visibilityKind = "public";
    }
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PUBLIC_LITERAL)) {
        _matched=true;
        visibilityKind = "public";
      }
    }
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PRIVATE)) {
        _matched=true;
        visibilityKind = "private";
      }
    }
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PRIVATE_LITERAL)) {
        _matched=true;
        visibilityKind = "private";
      }
    }
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PROTECTED)) {
        _matched=true;
        visibilityKind = "protected";
      }
    }
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PROTECTED_LITERAL)) {
        _matched=true;
        visibilityKind = "protected";
      }
    }
    if (!_matched) {
      visibilityKind = "public";
    }
    return visibilityKind;
  }
  
  public static CharSequence generateReturnParameter(final EList<Parameter> params) {
    StringConcatenation _builder = new StringConcatenation();
    String _returnType = VLEGeneratorUtil.getReturnType(params);
    _builder.append(_returnType, "");
    return _builder;
  }
  
  public static String getReturnType(final EList<Parameter> params) {
    for (final Parameter param : params) {
      if ((param.getDirection().equals(Integer.valueOf(ParameterDirectionKind.RETURN)) || param.getDirection().equals(ParameterDirectionKind.RETURN_LITERAL))) {
        Type _type = param.getType();
        return _type.getName();
      }
    }
    return "void";
  }
  
  public static Hashtable<String, Parameter> getPrameterList(final EList<Parameter> input, final EList<Parameter> output) {
    final Hashtable<String, Parameter> paramMap = new Hashtable<String, Parameter>();
    for (final Parameter param : input) {
      String _name = param.getName();
      paramMap.put(_name, param);
    }
    for (final Parameter param_1 : output) {
      if (((param_1.getDirection().equals(Integer.valueOf(ParameterDirectionKind.RETURN)) == false) && 
        (param_1.getDirection().equals(ParameterDirectionKind.RETURN_LITERAL) == false))) {
        String _name_1 = param_1.getName();
        boolean _containsKey = paramMap.containsKey(_name_1);
        boolean _equals = (_containsKey == false);
        if (_equals) {
          String _name_2 = param_1.getName();
          paramMap.put(_name_2, param_1);
        }
      }
    }
    return paramMap;
  }
  
  public static CharSequence generateParameters(final Collection<Parameter> params) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = params.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        {
          for(final Parameter param : params) {
            CharSequence _generateParameter = VLEGeneratorUtil.generateParameter(param);
            _builder.append(_generateParameter, "");
            {
              Parameter _last = IterableExtensions.<Parameter>last(params);
              boolean _equals_1 = _last.equals(param);
              boolean _equals_2 = (_equals_1 == false);
              if (_equals_2) {
                _builder.append(",");
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence generateParameter(final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((Objects.equal(param.getDirection(), Integer.valueOf(ParameterDirectionKind.INOUT)) || Objects.equal(param.getDirection(), ParameterDirectionKind.INOUT_LITERAL))) {
        Type _type = param.getType();
        String _name = _type.getName();
        _builder.append(_name, "");
        _builder.append("& ");
        String _name_1 = param.getName();
        _builder.append(_name_1, "");
      } else {
        if ((Objects.equal(param.getDirection(), Integer.valueOf(ParameterDirectionKind.OUT)) || Objects.equal(param.getDirection(), ParameterDirectionKind.OUT_LITERAL))) {
          Type _type_1 = param.getType();
          String _name_2 = _type_1.getName();
          _builder.append(_name_2, "");
          _builder.append("& ");
          String _name_3 = param.getName();
          _builder.append(_name_3, "");
        } else {
          if ((Objects.equal(param.getDirection(), Integer.valueOf(ParameterDirectionKind.IN)) || Objects.equal(param.getDirection(), ParameterDirectionKind.IN_LITERAL))) {
            _builder.append("const ");
            Type _type_2 = param.getType();
            String _name_4 = _type_2.getName();
            _builder.append(_name_4, "");
            _builder.append("& ");
            String _name_5 = param.getName();
            _builder.append(_name_5, "");
          } else {
            _builder.append("s/*");
            ParameterDirectionKind _direction = param.getDirection();
            String _name_6 = _direction.name();
            _builder.append(_name_6, "");
            _builder.append("*/const ");
            Type _type_3 = param.getType();
            String _name_7 = _type_3.getName();
            _builder.append(_name_7, "");
            _builder.append("& ");
            String _name_8 = param.getName();
            _builder.append(_name_8, "");
          }
        }
      }
    }
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
  
  public static List<Vertex> getStates(final StateMachine smElt) {
    ArrayList<Vertex> statesList = new ArrayList<Vertex>();
    EList<Region> _regions = smElt.getRegions();
    for (final Region region : _regions) {
      EList<Vertex> _subvertices = region.getSubvertices();
      for (final Vertex state : _subvertices) {
        statesList.add(state);
      }
    }
    return statesList;
  }
  
  public static List<State> getRobotMLStates(final StateMachine smeElt) {
    ArrayList<State> statesList = new ArrayList<State>();
    EList<Region> _regions = smeElt.getRegions();
    for (final Region region : _regions) {
      EList<Vertex> _subvertices = region.getSubvertices();
      for (final Vertex state : _subvertices) {
        EList<Stereotype> _appliedStereotypes = state.getAppliedStereotypes();
        for (final Stereotype type : _appliedStereotypes) {
          if ((type instanceof State)) {
            statesList.add(((State)type));
          }
        }
      }
    }
    return statesList;
  }
  
  public static boolean isBasicType(final DataType datatype) {
    return false;
  }
  
  public static boolean isVectorType(final DataType datatype) {
    EList<Stereotype> _appliedStereotypes = datatype.getAppliedStereotypes();
    return _appliedStereotypes.contains(Vector.class);
  }
  
  public static boolean isMapType(final DataType datatype) {
    EList<Stereotype> _appliedStereotypes = datatype.getAppliedStereotypes();
    return _appliedStereotypes.contains(Map.class);
  }
  
  public static boolean isStructuredType(final DataType datatype) {
    EList<Property> _attributes = datatype.getAttributes();
    int _length = ((Object[])Conversions.unwrapArray(_attributes, Object.class)).length;
    return (_length > 1);
  }
  
  public static boolean isEnumeration(final DataType datatype) {
    return (datatype instanceof Enumeration);
  }
  
  public static boolean HasStereotype(final NamedElement element, final Class<? extends EObject> stereotype) {
    EObject _stereotypeApplication = UMLUtil.getStereotypeApplication(element, stereotype);
    return (!Objects.equal(_stereotypeApplication, null));
  }
  
  public static EObject GetStereotype(final NamedElement element, final Class<? extends EObject> stereotype) {
    return UMLUtil.getStereotypeApplication(element, stereotype);
  }
  
  public static boolean HasStereotypApplied(final NamedElement element) {
    return ((((((VLEGeneratorUtil.HasStereotype(element, BasicType.class) || 
      VLEGeneratorUtil.HasStereotype(element, Map.class)) || 
      VLEGeneratorUtil.HasStereotype(element, Vector.class)) || 
      VLEGeneratorUtil.HasStereotype(element, Array.class)) || 
      VLEGeneratorUtil.HasStereotype(element, Alias.class)) || 
      VLEGeneratorUtil.HasStereotype(element, Define.class)) || 
      VLEGeneratorUtil.HasStereotype(element, Union.class));
  }
}
