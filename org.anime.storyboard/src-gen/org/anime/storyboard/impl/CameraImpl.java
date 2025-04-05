/**
 */
package org.anime.storyboard.impl;

import org.anime.storyboard.Camera;
import org.anime.storyboard.CameraMovementType;
import org.anime.storyboard.CameraType;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.impl.CameraImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.CameraImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.CameraImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.CameraImpl#getMovement <em>Movement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraImpl extends MinimalEObjectImpl.Container implements Camera {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CameraType TYPE_EDEFAULT = CameraType.LONG_SHOT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CameraType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected float positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected float positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMovement() <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovement()
	 * @generated
	 * @ordered
	 */
	protected static final CameraMovementType MOVEMENT_EDEFAULT = CameraMovementType.PAN_LEFT;

	/**
	 * The cached value of the '{@link #getMovement() <em>Movement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovement()
	 * @generated
	 * @ordered
	 */
	protected CameraMovementType movement = MOVEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoryboardPackage.Literals.CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CameraType newType) {
		CameraType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.CAMERA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(float newPositionX) {
		float oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.CAMERA__POSITION_X, oldPositionX,
					positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(float newPositionY) {
		float oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.CAMERA__POSITION_Y, oldPositionY,
					positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraMovementType getMovement() {
		return movement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovement(CameraMovementType newMovement) {
		CameraMovementType oldMovement = movement;
		movement = newMovement == null ? MOVEMENT_EDEFAULT : newMovement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.CAMERA__MOVEMENT, oldMovement,
					movement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StoryboardPackage.CAMERA__TYPE:
			return getType();
		case StoryboardPackage.CAMERA__POSITION_X:
			return getPositionX();
		case StoryboardPackage.CAMERA__POSITION_Y:
			return getPositionY();
		case StoryboardPackage.CAMERA__MOVEMENT:
			return getMovement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StoryboardPackage.CAMERA__TYPE:
			setType((CameraType) newValue);
			return;
		case StoryboardPackage.CAMERA__POSITION_X:
			setPositionX((Float) newValue);
			return;
		case StoryboardPackage.CAMERA__POSITION_Y:
			setPositionY((Float) newValue);
			return;
		case StoryboardPackage.CAMERA__MOVEMENT:
			setMovement((CameraMovementType) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case StoryboardPackage.CAMERA__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case StoryboardPackage.CAMERA__POSITION_X:
			setPositionX(POSITION_X_EDEFAULT);
			return;
		case StoryboardPackage.CAMERA__POSITION_Y:
			setPositionY(POSITION_Y_EDEFAULT);
			return;
		case StoryboardPackage.CAMERA__MOVEMENT:
			setMovement(MOVEMENT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StoryboardPackage.CAMERA__TYPE:
			return type != TYPE_EDEFAULT;
		case StoryboardPackage.CAMERA__POSITION_X:
			return positionX != POSITION_X_EDEFAULT;
		case StoryboardPackage.CAMERA__POSITION_Y:
			return positionY != POSITION_Y_EDEFAULT;
		case StoryboardPackage.CAMERA__MOVEMENT:
			return movement != MOVEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", movement: ");
		result.append(movement);
		result.append(')');
		return result.toString();
	}

} //CameraImpl
