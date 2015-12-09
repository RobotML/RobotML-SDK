package org.eclipse.papyrus.robotml.vle.codegen.xtend;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Operation;
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
    _builder.newLine();
    _builder.append("#ifndef ");
    String _name_1 = classElt.getName();
    String _upperCase = _name_1.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _name_2 = classElt.getName();
    String _upperCase_1 = _name_2.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_HEADER");
    _builder.newLineIfNotEmpty();
    _builder.append("class ");
    String _name_3 = classElt.getName();
    _builder.append(_name_3, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Operation> _allOperations = classElt.getAllOperations();
    for (final Operation op : _allOperations) {
      {
        op.getReturnResult();
        op.getName();
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("#endif /*");
    String _name_4 = classElt.getName();
    String _upperCase_2 = _name_4.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_HEADER*/");
    return _builder;
  }
}
