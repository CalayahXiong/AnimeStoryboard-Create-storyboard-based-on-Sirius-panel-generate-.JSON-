/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.Camera#getType <em>Type</em>}</li>
 *   <li>{@link org.anime.storyboard.Camera#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.anime.storyboard.Camera#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.anime.storyboard.Camera#getMovement <em>Movement</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.anime.storyboard.CameraType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.anime.storyboard.CameraType
	 * @see #setType(CameraType)
	 * @see org.anime.storyboard.StoryboardPackage#getCamera_Type()
	 * @model
	 * @generated
	 */
	CameraType getType();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Camera#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.anime.storyboard.CameraType
	 * @see #getType()
	 * @generated
	 */
	void setType(CameraType value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(float)
	 * @see org.anime.storyboard.StoryboardPackage#getCamera_PositionX()
	 * @model required="true"
	 * @generated
	 */
	float getPositionX();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Camera#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(float value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(float)
	 * @see org.anime.storyboard.StoryboardPackage#getCamera_PositionY()
	 * @model required="true"
	 * @generated
	 */
	float getPositionY();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Camera#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(float value);

	/**
	 * Returns the value of the '<em><b>Movement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.anime.storyboard.CameraMovementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement</em>' attribute.
	 * @see org.anime.storyboard.CameraMovementType
	 * @see #setMovement(CameraMovementType)
	 * @see org.anime.storyboard.StoryboardPackage#getCamera_Movement()
	 * @model required="true"
	 * @generated
	 */
	CameraMovementType getMovement();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Camera#getMovement <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement</em>' attribute.
	 * @see org.anime.storyboard.CameraMovementType
	 * @see #getMovement()
	 * @generated
	 */
	void setMovement(CameraMovementType value);

} // Camera
