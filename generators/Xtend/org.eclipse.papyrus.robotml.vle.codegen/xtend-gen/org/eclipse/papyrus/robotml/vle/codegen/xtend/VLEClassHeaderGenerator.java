package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEGeneratorUtil;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class VLEClassHeaderGenerator {
  public static CharSequence generateCode(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*******************************************/");
    _builder.newLine();
    _builder.append("/*        ");
    String _name = classElt.getName();
    _builder.append(_name, "");
    _builder.append(" header file      */");
    _builder.newLineIfNotEmpty();
    _builder.append("/*******************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _name_1 = classElt.getName();
    String _upperCase = _name_1.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_HEADER ");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _name_2 = classElt.getName();
    String _upperCase_1 = _name_2.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
    CharSequence _generateIncludes = VLEClassHeaderGenerator.generateIncludes(_superClasses);
    _builder.append(_generateIncludes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("namespace generated {");
    _builder.newLine();
    _builder.append("class ");
    String _name_3 = classElt.getName();
    _builder.append(_name_3, "");
    _builder.append(" ");
    {
      EList<org.eclipse.uml2.uml.Class> _superClasses_1 = classElt.getSuperClasses();
      boolean _notEquals = (!Objects.equal(_superClasses_1, null));
      if (_notEquals) {
        _builder.append(" ");
        EList<org.eclipse.uml2.uml.Class> _superClasses_2 = classElt.getSuperClasses();
        CharSequence _generateInheritanceDefinition = VLEClassHeaderGenerator.generateInheritanceDefinition(_superClasses_2);
        _builder.append(_generateInheritanceDefinition, "");
        _builder.append(" ");
      }
    }
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*Constructor*/");
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    String _name_4 = classElt.getName();
    _builder.append(_name_4, "\t");
    _builder.append("(const vd::DynamicsInit& init, const vd::InitEventList& events);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("virtual ~");
    String _name_5 = classElt.getName();
    _builder.append(_name_5, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*OPERATIONS MEMBERS*/");
    _builder.newLine();
    CharSequence _generationOperationForBaseClass = VLEClassHeaderGenerator.generationOperationForBaseClass(classElt);
    _builder.append(_generationOperationForBaseClass, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generateOpeartionsForChildClass = VLEClassHeaderGenerator.generateOpeartionsForChildClass(classElt);
    _builder.append(_generateOpeartionsForChildClass, "");
    _builder.newLineIfNotEmpty();
    EList<Operation> _operations = classElt.getOperations();
    Hashtable<String, List<Operation>> _operationList = VLEGeneratorUtil.getOperationList(_operations);
    CharSequence _generateOperations = VLEClassHeaderGenerator.generateOperations(_operationList);
    _builder.append(_generateOperations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*ATTRIBUTES MEMBERS*/");
    _builder.newLine();
    EList<Property> _attributes = classElt.getAttributes();
    Hashtable<String, List<Property>> _attributeList = VLEClassHeaderGenerator.getAttributeList(_attributes);
    CharSequence _generateAttributes = VLEClassHeaderGenerator.generateAttributes(_attributeList);
    _builder.append(_generateAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*");
    String _name_6 = classElt.getName();
    String _upperCase_2 = _name_6.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_HEADER*/");
    return _builder;
  }
  
  public static CharSequence generateIncludes(final EList<org.eclipse.uml2.uml.Class> clazzList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(clazzList, null));
      if (_notEquals) {
        {
          for(final org.eclipse.uml2.uml.Class clazz : clazzList) {
            _builder.append("#include \"");
            String _name = clazz.getName();
            _builder.append(_name, "");
            _builder.append(".h\"");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("#include <vle/devs.Dynamics.hpp>");
        _builder.newLine();
        _builder.append("namespace vd = vle::devs;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence generateInheritanceDefinition(final EList<org.eclipse.uml2.uml.Class> clazzList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = clazzList.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        _builder.append(": ");
        {
          for(final org.eclipse.uml2.uml.Class clazz : clazzList) {
            _builder.append("public ");
            String _name = clazz.getName();
            _builder.append(_name, "");
          }
        }
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append(": public vd::Dynamics");
        _builder.newLine();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  public static CharSequence generateAttribute(final Property attr) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = attr.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = attr.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    return _builder;
  }
  
  public static Hashtable<String, List<Property>> getAttributeList(final EList<Property> attrs) {
    Hashtable<String, List<Property>> attrMap = new Hashtable<String, List<Property>>();
    for (final Property attr : attrs) {
      {
        VisibilityKind _visibility = attr.getVisibility();
        String visibilityKind = VLEGeneratorUtil.convertVisibility(_visibility);
        boolean _contains = attrMap.contains(visibilityKind);
        boolean _equals = (_contains == false);
        if (_equals) {
          ArrayList<Property> _arrayList = new ArrayList<Property>();
          attrMap.put(visibilityKind, _arrayList);
        }
        List<Property> _get = attrMap.get(visibilityKind);
        _get.add(attr);
      }
    }
    return attrMap;
  }
  
  public static CharSequence generateOperations(final Hashtable<String, List<Operation>> opMap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<String> _keySet = opMap.keySet();
      for(final String kind : _keySet) {
        _builder.append(kind, "");
        _builder.append(": ");
        _builder.newLineIfNotEmpty();
        {
          List<Operation> _get = opMap.get(kind);
          for(final Operation op : _get) {
            CharSequence _generateOperation = VLEClassHeaderGenerator.generateOperation(op);
            _builder.append(_generateOperation, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence generateAttributes(final Hashtable<String, List<Property>> attrs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<String> _keySet = attrs.keySet();
      for(final String kind : _keySet) {
        _builder.append(kind, "");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        {
          List<Property> _get = attrs.get(kind);
          for(final Property attr : _get) {
            CharSequence _generateAttribute = VLEClassHeaderGenerator.generateAttribute(attr);
            _builder.append(_generateAttribute, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence generateOperation(final Operation op) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Parameter> _outputParameters = op.outputParameters();
    CharSequence _generateReturnParameter = VLEGeneratorUtil.generateReturnParameter(_outputParameters);
    _builder.append(_generateReturnParameter, "");
    _builder.append(" ");
    String _name = op.getName();
    _builder.append(_name, "");
    _builder.append("(");
    EList<Parameter> _inputParameters = op.inputParameters();
    EList<Parameter> _outputParameters_1 = op.outputParameters();
    Hashtable<String, Parameter> _prameterList = VLEGeneratorUtil.getPrameterList(_inputParameters, _outputParameters_1);
    Collection<Parameter> _values = _prameterList.values();
    CharSequence _generateParameters = VLEGeneratorUtil.generateParameters(_values);
    _builder.append(_generateParameters, "");
    _builder.append(");");
    return _builder;
  }
  
  public static CharSequence generationOperationForBaseClass(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
      boolean _isEmpty = _superClasses.isEmpty();
      boolean _equals = (_isEmpty == true);
      if (_equals) {
        _builder.append("public: ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual vd::Time init(const vd::time& time);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void output(const vd::Time& time, vd::ExternalEventList& output) const; ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void internalTransition(const vd::Time& time); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void externalTransition(const vd::ExternalEventList& eventList, const vd::Time& time); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual vv::Value* observation(const vd::ObservationEvent& event) const;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual vd::Time timeAdvance() const;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("protected:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void doInit(const vd::Time& time) = 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void doOuput(const vd::Time& time, vd::ExternalEventList& output) = 0;");
        _builder.newLine();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  public static CharSequence generateOpeartionsForChildClass(final org.eclipse.uml2.uml.Class classElt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<org.eclipse.uml2.uml.Class> _superClasses = classElt.getSuperClasses();
      boolean _isEmpty = _superClasses.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        _builder.append("protected:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void doInit(const vd::Time& time);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("virtual void doOuput(const vd::Time& time, vd::ExternalEventList& output);");
        _builder.newLine();
        _builder.append("\t");
      }
    }
    return _builder;
  }
}
