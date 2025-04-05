/**
 */
package org.anime.storyboard.impl;

import org.anime.storyboard.Camera;
import org.anime.storyboard.CameraMovementType;
import org.anime.storyboard.CameraScene;
import org.anime.storyboard.CameraType;
import org.anime.storyboard.Dialogue;
import org.anime.storyboard.DialogueScene;
import org.anime.storyboard.Storyboard;
import org.anime.storyboard.StoryboardFactory;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryboardFactoryImpl extends EFactoryImpl implements StoryboardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoryboardFactory init() {
		try {
			StoryboardFactory theStoryboardFactory = (StoryboardFactory) EPackage.Registry.INSTANCE
					.getEFactory(StoryboardPackage.eNS_URI);
			if (theStoryboardFactory != null) {
				return theStoryboardFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StoryboardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StoryboardPackage.STORYBOARD:
			return createStoryboard();
		case StoryboardPackage.DIALOGUE_SCENE:
			return createDialogueScene();
		case StoryboardPackage.CAMERA_SCENE:
			return createCameraScene();
		case StoryboardPackage.CHARACTER:
			return createCharacter();
		case StoryboardPackage.CAMERA:
			return createCamera();
		case StoryboardPackage.DIALOGUE:
			return createDialogue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case StoryboardPackage.CAMERA_TYPE:
			return createCameraTypeFromString(eDataType, initialValue);
		case StoryboardPackage.CAMERA_MOVEMENT_TYPE:
			return createCameraMovementTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case StoryboardPackage.CAMERA_TYPE:
			return convertCameraTypeToString(eDataType, instanceValue);
		case StoryboardPackage.CAMERA_MOVEMENT_TYPE:
			return convertCameraMovementTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.anime.storyboard.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue createDialogue() {
		DialogueImpl dialogue = new DialogueImpl();
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storyboard createStoryboard() {
		StoryboardImpl storyboard = new StoryboardImpl();
		return storyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogueScene createDialogueScene() {
		DialogueSceneImpl dialogueScene = new DialogueSceneImpl();
		return dialogueScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraScene createCameraScene() {
		CameraSceneImpl cameraScene = new CameraSceneImpl();
		return cameraScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraType createCameraTypeFromString(EDataType eDataType, String initialValue) {
		CameraType result = CameraType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCameraTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraMovementType createCameraMovementTypeFromString(EDataType eDataType, String initialValue) {
		CameraMovementType result = CameraMovementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCameraMovementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardPackage getStoryboardPackage() {
		return (StoryboardPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StoryboardPackage getPackage() {
		return StoryboardPackage.eINSTANCE;
	}

} //StoryboardFactoryImpl
