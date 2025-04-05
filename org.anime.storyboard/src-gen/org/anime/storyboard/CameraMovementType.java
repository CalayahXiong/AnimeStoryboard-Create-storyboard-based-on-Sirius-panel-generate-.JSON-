/**
 */
package org.anime.storyboard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Camera Movement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardPackage#getCameraMovementType()
 * @model
 * @generated
 */
public enum CameraMovementType implements Enumerator {
	/**
	 * The '<em><b>Pan Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	PAN_LEFT(0, "PanLeft", "PanLeft"),

	/**
	 * The '<em><b>Zoom In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ZOOM_IN(1, "ZoomIn", "ZoomIn");

	/**
	 * The '<em><b>Pan Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_LEFT
	 * @model name="PanLeft"
	 * @generated
	 * @ordered
	 */
	public static final int PAN_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Zoom In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM_IN
	 * @model name="ZoomIn"
	 * @generated
	 * @ordered
	 */
	public static final int ZOOM_IN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Camera Movement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CameraMovementType[] VALUES_ARRAY = new CameraMovementType[] { PAN_LEFT, ZOOM_IN, };

	/**
	 * A public read-only list of all the '<em><b>Camera Movement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CameraMovementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Camera Movement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraMovementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraMovementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Movement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraMovementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraMovementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Movement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraMovementType get(int value) {
		switch (value) {
		case PAN_LEFT_VALUE:
			return PAN_LEFT;
		case ZOOM_IN_VALUE:
			return ZOOM_IN;
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
	private CameraMovementType(int value, String name, String literal) {
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

} //CameraMovementType
