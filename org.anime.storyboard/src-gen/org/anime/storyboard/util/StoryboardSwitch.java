/**
 */
package org.anime.storyboard.util;

import org.anime.storyboard.Camera;
import org.anime.storyboard.CameraScene;
import org.anime.storyboard.Dialogue;
import org.anime.storyboard.DialogueScene;
import org.anime.storyboard.Scene;
import org.anime.storyboard.Storyboard;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardPackage
 * @generated
 */
public class StoryboardSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StoryboardPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardSwitch() {
		if (modelPackage == null) {
			modelPackage = StoryboardPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StoryboardPackage.STORYBOARD: {
			Storyboard storyboard = (Storyboard) theEObject;
			T result = caseStoryboard(storyboard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.SCENE: {
			Scene scene = (Scene) theEObject;
			T result = caseScene(scene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.DIALOGUE_SCENE: {
			DialogueScene dialogueScene = (DialogueScene) theEObject;
			T result = caseDialogueScene(dialogueScene);
			if (result == null)
				result = caseScene(dialogueScene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.CAMERA_SCENE: {
			CameraScene cameraScene = (CameraScene) theEObject;
			T result = caseCameraScene(cameraScene);
			if (result == null)
				result = caseScene(cameraScene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.CHARACTER: {
			org.anime.storyboard.Character character = (org.anime.storyboard.Character) theEObject;
			T result = caseCharacter(character);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.CAMERA: {
			Camera camera = (Camera) theEObject;
			T result = caseCamera(camera);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StoryboardPackage.DIALOGUE: {
			Dialogue dialogue = (Dialogue) theEObject;
			T result = caseDialogue(dialogue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogueScene(DialogueScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraScene(CameraScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(org.anime.storyboard.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogue(Dialogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboard(Storyboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StoryboardSwitch
