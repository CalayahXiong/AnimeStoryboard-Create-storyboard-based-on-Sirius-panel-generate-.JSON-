/**
 */
package org.anime.storyboard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.CameraScene#getCamera <em>Camera</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getCameraScene()
 * @model
 * @generated
 */
public interface CameraScene extends Scene {
	/**
	 * Returns the value of the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' containment reference.
	 * @see #setCamera(Camera)
	 * @see org.anime.storyboard.StoryboardPackage#getCameraScene_Camera()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Camera getCamera();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.CameraScene#getCamera <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' containment reference.
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(Camera value);

} // CameraScene
