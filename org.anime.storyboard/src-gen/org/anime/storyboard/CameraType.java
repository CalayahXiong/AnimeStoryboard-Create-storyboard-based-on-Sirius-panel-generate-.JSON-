/**
 */
package org.anime.storyboard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Camera Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardPackage#getCameraType()
 * @model
 * @generated
 */
public enum CameraType implements Enumerator {
	/**
	 * The '<em><b>Long Shot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_SHOT_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_SHOT(0, "LongShot", "LongShot"),

	/**
	 * The '<em><b>Close Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE_UP(1, "CloseUp", "CloseUp"),

	/**
	 * The '<em><b>Wide Angle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDE_ANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	WIDE_ANGLE(2, "WideAngle", "WideAngle");

	/**
	 * The '<em><b>Long Shot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_SHOT
	 * @model name="LongShot"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_SHOT_VALUE = 0;

	/**
	 * The '<em><b>Close Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_UP
	 * @model name="CloseUp"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_UP_VALUE = 1;

	/**
	 * The '<em><b>Wide Angle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDE_ANGLE
	 * @model name="WideAngle"
	 * @generated
	 * @ordered
	 */
	public static final int WIDE_ANGLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Camera Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CameraType[] VALUES_ARRAY = new CameraType[] { LONG_SHOT, CLOSE_UP, WIDE_ANGLE, };

	/**
	 * A public read-only list of all the '<em><b>Camera Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CameraType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Camera Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraType get(int value) {
		switch (value) {
		case LONG_SHOT_VALUE:
			return LONG_SHOT;
		case CLOSE_UP_VALUE:
			return CLOSE_UP;
		case WIDE_ANGLE_VALUE:
			return WIDE_ANGLE;
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
	private CameraType(int value, String name, String literal) {
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

} //CameraType
