package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class VLEGeneratorUtil {
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
    if (!_matched) {
      if (Objects.equal(kind, VisibilityKind.PUBLIC)) {
        _matched=true;
        visibilityKind = "public";
      }
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
      boolean _or = false;
      ParameterDirectionKind _direction = param.getDirection();
      boolean _equals = _direction.equals(Integer.valueOf(ParameterDirectionKind.RETURN));
      if (_equals) {
        _or = true;
      } else {
        ParameterDirectionKind _direction_1 = param.getDirection();
        boolean _equals_1 = _direction_1.equals(ParameterDirectionKind.RETURN_LITERAL);
        _or = _equals_1;
      }
      if (_or) {
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
      boolean _and = false;
      ParameterDirectionKind _direction = param_1.getDirection();
      boolean _equals = _direction.equals(Integer.valueOf(ParameterDirectionKind.RETURN));
      boolean _equals_1 = (_equals == false);
      if (!_equals_1) {
        _and = false;
      } else {
        ParameterDirectionKind _direction_1 = param_1.getDirection();
        boolean _equals_2 = _direction_1.equals(ParameterDirectionKind.RETURN_LITERAL);
        boolean _equals_3 = (_equals_2 == false);
        _and = _equals_3;
      }
      if (_and) {
        String _name_1 = param_1.getName();
        boolean _containsKey = paramMap.containsKey(_name_1);
        boolean _equals_4 = (_containsKey == false);
        if (_equals_4) {
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
      boolean _or = false;
      ParameterDirectionKind _direction = param.getDirection();
      boolean _equals = Objects.equal(_direction, Integer.valueOf(ParameterDirectionKind.INOUT));
      if (_equals) {
        _or = true;
      } else {
        ParameterDirectionKind _direction_1 = param.getDirection();
        boolean _equals_1 = Objects.equal(_direction_1, ParameterDirectionKind.INOUT_LITERAL);
        _or = _equals_1;
      }
      if (_or) {
        Type _type = param.getType();
        String _name = _type.getName();
        _builder.append(_name, "");
        _builder.append("& ");
        String _name_1 = param.getName();
        _builder.append(_name_1, "");
      } else {
        boolean _or_1 = false;
        ParameterDirectionKind _direction_2 = param.getDirection();
        boolean _equals_2 = Objects.equal(_direction_2, Integer.valueOf(ParameterDirectionKind.OUT));
        if (_equals_2) {
          _or_1 = true;
        } else {
          ParameterDirectionKind _direction_3 = param.getDirection();
          boolean _equals_3 = Objects.equal(_direction_3, ParameterDirectionKind.OUT_LITERAL);
          _or_1 = _equals_3;
        }
        if (_or_1) {
          Type _type_1 = param.getType();
          String _name_2 = _type_1.getName();
          _builder.append(_name_2, "");
          _builder.append("& ");
          String _name_3 = param.getName();
          _builder.append(_name_3, "");
        } else {
          boolean _or_2 = false;
          ParameterDirectionKind _direction_4 = param.getDirection();
          boolean _equals_4 = Objects.equal(_direction_4, Integer.valueOf(ParameterDirectionKind.IN));
          if (_equals_4) {
            _or_2 = true;
          } else {
            ParameterDirectionKind _direction_5 = param.getDirection();
            boolean _equals_5 = Objects.equal(_direction_5, ParameterDirectionKind.IN_LITERAL);
            _or_2 = _equals_5;
          }
          if (_or_2) {
            _builder.append("const ");
            Type _type_2 = param.getType();
            String _name_4 = _type_2.getName();
            _builder.append(_name_4, "");
            _builder.append("& ");
            String _name_5 = param.getName();
            _builder.append(_name_5, "");
          } else {
            _builder.append("s/*");
            ParameterDirectionKind _direction_6 = param.getDirection();
            String _name_6 = _direction_6.name();
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
}
