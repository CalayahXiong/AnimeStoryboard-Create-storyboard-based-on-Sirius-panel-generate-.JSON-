/**
 */
package org.anime.storyboard.impl;

import org.anime.storyboard.Camera;
import org.anime.storyboard.CameraScene;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.impl.CameraSceneImpl#getCamera <em>Camera</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraSceneImpl extends SceneImpl implements CameraScene {
	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera camera;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraSceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoryboardPackage.Literals.CAMERA_SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera getCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamera(Camera newCamera, NotificationChain msgs) {
		Camera oldCamera = camera;
		camera = newCamera;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StoryboardPackage.CAMERA_SCENE__CAMERA, oldCamera, newCamera);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamera(Camera newCamera) {
		if (newCamera != camera) {
			NotificationChain msgs = null;
			if (camera != null)
				msgs = ((InternalEObject) camera).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StoryboardPackage.CAMERA_SCENE__CAMERA, null, msgs);
			if (newCamera != null)
				msgs = ((InternalEObject) newCamera).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StoryboardPackage.CAMERA_SCENE__CAMERA, null, msgs);
			msgs = basicSetCamera(newCamera, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.CAMERA_SCENE__CAMERA, newCamera,
					newCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StoryboardPackage.CAMERA_SCENE__CAMERA:
			return basicSetCamera(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StoryboardPackage.CAMERA_SCENE__CAMERA:
			return getCamera();
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
		case StoryboardPackage.CAMERA_SCENE__CAMERA:
			setCamera((Camera) newValue);
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
		case StoryboardPackage.CAMERA_SCENE__CAMERA:
			setCamera((Camera) null);
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
		case StoryboardPackage.CAMERA_SCENE__CAMERA:
			return camera != null;
		}
		return super.eIsSet(featureID);
	}

} //CameraSceneImpl
