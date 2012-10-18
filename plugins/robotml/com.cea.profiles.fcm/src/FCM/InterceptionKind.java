/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package FCM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interception Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FCM.FCMPackage#getInterceptionKind()
 * @model
 * @generated
 */
public enum InterceptionKind implements Enumerator {
	/**
	 * The '<em><b>Intercept Some Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_SOME_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCEPT_SOME_PORTS(0, "InterceptSomePorts", "InterceptSomePorts"),

	/**
	 * The '<em><b>Intercept All Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCEPT_ALL_PORTS(1, "InterceptAllPorts", "InterceptAllPorts"),

	/**
	 * The '<em><b>Intercept All Out Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_OUT_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCEPT_ALL_OUT_PORTS(2, "InterceptAllOutPorts", "InterceptAllOutPorts"),

	/**
	 * The '<em><b>Intercept All In Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_IN_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCEPT_ALL_IN_PORTS(3, "InterceptAllInPorts", "InterceptAllInPorts");

	/**
	 * The '<em><b>Intercept Some Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intercept Some Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_SOME_PORTS
	 * @model name="InterceptSomePorts"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCEPT_SOME_PORTS_VALUE = 0;

	/**
	 * The '<em><b>Intercept All Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intercept All Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_PORTS
	 * @model name="InterceptAllPorts"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCEPT_ALL_PORTS_VALUE = 1;

	/**
	 * The '<em><b>Intercept All Out Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intercept All Out Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_OUT_PORTS
	 * @model name="InterceptAllOutPorts"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCEPT_ALL_OUT_PORTS_VALUE = 2;

	/**
	 * The '<em><b>Intercept All In Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intercept All In Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCEPT_ALL_IN_PORTS
	 * @model name="InterceptAllInPorts"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCEPT_ALL_IN_PORTS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Interception Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterceptionKind[] VALUES_ARRAY =
		new InterceptionKind[] {
			INTERCEPT_SOME_PORTS,
			INTERCEPT_ALL_PORTS,
			INTERCEPT_ALL_OUT_PORTS,
			INTERCEPT_ALL_IN_PORTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Interception Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterceptionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interception Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterceptionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterceptionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interception Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterceptionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterceptionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interception Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterceptionKind get(int value) {
		switch (value) {
			case INTERCEPT_SOME_PORTS_VALUE: return INTERCEPT_SOME_PORTS;
			case INTERCEPT_ALL_PORTS_VALUE: return INTERCEPT_ALL_PORTS;
			case INTERCEPT_ALL_OUT_PORTS_VALUE: return INTERCEPT_ALL_OUT_PORTS;
			case INTERCEPT_ALL_IN_PORTS_VALUE: return INTERCEPT_ALL_IN_PORTS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterceptionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterceptionKind
