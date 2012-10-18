/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.parameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#isHasNbW <em>Has Nb W</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#getNbw <em>Nbw</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#isHasInfiniteWriter <em>Has Infinite Writer</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#isHasValue <em>Has Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#isHasConfig <em>Has Config</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl#isHasConfigWithDefaultValue <em>Has Config With Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameterDeclarationImpl extends architectureElementImpl implements parameterDeclaration
{
  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected DataType typeName;

  /**
   * The default value of the '{@link #isHasNbW() <em>Has Nb W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNbW()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_NB_W_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasNbW() <em>Has Nb W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNbW()
   * @generated
   * @ordered
   */
  protected boolean hasNbW = HAS_NB_W_EDEFAULT;

  /**
   * The default value of the '{@link #getNbw() <em>Nbw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbw()
   * @generated
   * @ordered
   */
  protected static final int NBW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNbw() <em>Nbw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbw()
   * @generated
   * @ordered
   */
  protected int nbw = NBW_EDEFAULT;

  /**
   * The default value of the '{@link #isHasInfiniteWriter() <em>Has Infinite Writer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInfiniteWriter()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_INFINITE_WRITER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasInfiniteWriter() <em>Has Infinite Writer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInfiniteWriter()
   * @generated
   * @ordered
   */
  protected boolean hasInfiniteWriter = HAS_INFINITE_WRITER_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isHasValue() <em>Has Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasValue()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasValue() <em>Has Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasValue()
   * @generated
   * @ordered
   */
  protected boolean hasValue = HAS_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isHasConfig() <em>Has Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasConfig()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_CONFIG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasConfig() <em>Has Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasConfig()
   * @generated
   * @ordered
   */
  protected boolean hasConfig = HAS_CONFIG_EDEFAULT;

  /**
   * The default value of the '{@link #isHasConfigWithDefaultValue() <em>Has Config With Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasConfigWithDefaultValue()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_CONFIG_WITH_DEFAULT_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasConfigWithDefaultValue() <em>Has Config With Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasConfigWithDefaultValue()
   * @generated
   * @ordered
   */
  protected boolean hasConfigWithDefaultValue = HAS_CONFIG_WITH_DEFAULT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameterDeclarationImpl()
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
    return AthenaDSLPackage.Literals.PARAMETER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getTypeName()
  {
    if (typeName != null && typeName.eIsProxy())
    {
      InternalEObject oldTypeName = (InternalEObject)typeName;
      typeName = (DataType)eResolveProxy(oldTypeName);
      if (typeName != oldTypeName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME, oldTypeName, typeName));
      }
    }
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(DataType newTypeName)
  {
    DataType oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME, oldTypeName, typeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasNbW()
  {
    return hasNbW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasNbW(boolean newHasNbW)
  {
    boolean oldHasNbW = hasNbW;
    hasNbW = newHasNbW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__HAS_NB_W, oldHasNbW, hasNbW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNbw()
  {
    return nbw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNbw(int newNbw)
  {
    int oldNbw = nbw;
    nbw = newNbw;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__NBW, oldNbw, nbw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasInfiniteWriter()
  {
    return hasInfiniteWriter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasInfiniteWriter(boolean newHasInfiniteWriter)
  {
    boolean oldHasInfiniteWriter = hasInfiniteWriter;
    hasInfiniteWriter = newHasInfiniteWriter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__HAS_INFINITE_WRITER, oldHasInfiniteWriter, hasInfiniteWriter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasValue()
  {
    return hasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasValue(boolean newHasValue)
  {
    boolean oldHasValue = hasValue;
    hasValue = newHasValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__HAS_VALUE, oldHasValue, hasValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasConfig()
  {
    return hasConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasConfig(boolean newHasConfig)
  {
    boolean oldHasConfig = hasConfig;
    hasConfig = newHasConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG, oldHasConfig, hasConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasConfigWithDefaultValue()
  {
    return hasConfigWithDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasConfigWithDefaultValue(boolean newHasConfigWithDefaultValue)
  {
    boolean oldHasConfigWithDefaultValue = hasConfigWithDefaultValue;
    hasConfigWithDefaultValue = newHasConfigWithDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE, oldHasConfigWithDefaultValue, hasConfigWithDefaultValue));
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
      case AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME:
        if (resolve) return getTypeName();
        return basicGetTypeName();
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_NB_W:
        return isHasNbW();
      case AthenaDSLPackage.PARAMETER_DECLARATION__NBW:
        return getNbw();
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_INFINITE_WRITER:
        return isHasInfiniteWriter();
      case AthenaDSLPackage.PARAMETER_DECLARATION__NAME:
        return getName();
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_VALUE:
        return isHasValue();
      case AthenaDSLPackage.PARAMETER_DECLARATION__VALUE:
        return getValue();
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG:
        return isHasConfig();
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE:
        return isHasConfigWithDefaultValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME:
        setTypeName((DataType)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_NB_W:
        setHasNbW((Boolean)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NBW:
        setNbw((Integer)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_INFINITE_WRITER:
        setHasInfiniteWriter((Boolean)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_VALUE:
        setHasValue((Boolean)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__VALUE:
        setValue((String)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG:
        setHasConfig((Boolean)newValue);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE:
        setHasConfigWithDefaultValue((Boolean)newValue);
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
      case AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME:
        setTypeName((DataType)null);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_NB_W:
        setHasNbW(HAS_NB_W_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NBW:
        setNbw(NBW_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_INFINITE_WRITER:
        setHasInfiniteWriter(HAS_INFINITE_WRITER_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_VALUE:
        setHasValue(HAS_VALUE_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG:
        setHasConfig(HAS_CONFIG_EDEFAULT);
        return;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE:
        setHasConfigWithDefaultValue(HAS_CONFIG_WITH_DEFAULT_VALUE_EDEFAULT);
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
      case AthenaDSLPackage.PARAMETER_DECLARATION__TYPE_NAME:
        return typeName != null;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_NB_W:
        return hasNbW != HAS_NB_W_EDEFAULT;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NBW:
        return nbw != NBW_EDEFAULT;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_INFINITE_WRITER:
        return hasInfiniteWriter != HAS_INFINITE_WRITER_EDEFAULT;
      case AthenaDSLPackage.PARAMETER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_VALUE:
        return hasValue != HAS_VALUE_EDEFAULT;
      case AthenaDSLPackage.PARAMETER_DECLARATION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG:
        return hasConfig != HAS_CONFIG_EDEFAULT;
      case AthenaDSLPackage.PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE:
        return hasConfigWithDefaultValue != HAS_CONFIG_WITH_DEFAULT_VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hasNbW: ");
    result.append(hasNbW);
    result.append(", nbw: ");
    result.append(nbw);
    result.append(", hasInfiniteWriter: ");
    result.append(hasInfiniteWriter);
    result.append(", name: ");
    result.append(name);
    result.append(", hasValue: ");
    result.append(hasValue);
    result.append(", value: ");
    result.append(value);
    result.append(", hasConfig: ");
    result.append(hasConfig);
    result.append(", hasConfigWithDefaultValue: ");
    result.append(hasConfigWithDefaultValue);
    result.append(')');
    return result.toString();
  }

} //parameterDeclarationImpl
