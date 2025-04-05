/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardPackage
 * @generated
 */
public interface StoryboardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoryboardFactory eINSTANCE = org.anime.storyboard.impl.StoryboardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character</em>'.
	 * @generated
	 */
	Character createCharacter();

	/**
	 * Returns a new object of class '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera</em>'.
	 * @generated
	 */
	Camera createCamera();

	/**
	 * Returns a new object of class '<em>Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue</em>'.
	 * @generated
	 */
	Dialogue createDialogue();

	/**
	 * Returns a new object of class '<em>Storyboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storyboard</em>'.
	 * @generated
	 */
	Storyboard createStoryboard();

	/**
	 * Returns a new object of class '<em>Dialogue Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue Scene</em>'.
	 * @generated
	 */
	DialogueScene createDialogueScene();

	/**
	 * Returns a new object of class '<em>Camera Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Scene</em>'.
	 * @generated
	 */
	CameraScene createCameraScene();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StoryboardPackage getStoryboardPackage();

} //StoryboardFactory
