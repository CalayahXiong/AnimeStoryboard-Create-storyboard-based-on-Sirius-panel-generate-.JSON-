/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardFactory
 * @model kind="package"
 * @generated
 */
public interface StoryboardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storyboard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/storyboard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "storyboard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoryboardPackage eINSTANCE = org.anime.storyboard.impl.StoryboardPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.SceneImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 1;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.DialogueSceneImpl <em>Dialogue Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.DialogueSceneImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getDialogueScene()
	 * @generated
	 */
	int DIALOGUE_SCENE = 2;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.CameraSceneImpl <em>Camera Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.CameraSceneImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraScene()
	 * @generated
	 */
	int CAMERA_SCENE = 3;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.CharacterImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 4;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.CameraImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 5;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.DialogueImpl <em>Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.DialogueImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getDialogue()
	 * @generated
	 */
	int DIALOGUE = 6;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.impl.StoryboardImpl <em>Storyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.impl.StoryboardImpl
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getStoryboard()
	 * @generated
	 */
	int STORYBOARD = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD__SCENES = 1;

	/**
	 * The number of structural features of the '<em>Storyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Storyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORYBOARD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE__ID = SCENE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE__DESCRIPTION = SCENE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE__DURATION = SCENE__DURATION;

	/**
	 * The feature id for the '<em><b>Dialogues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE__DIALOGUES = SCENE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE__CHARACTERS = SCENE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dialogue Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE_FEATURE_COUNT = SCENE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dialogue Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_SCENE_OPERATION_COUNT = SCENE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE__ID = SCENE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE__DESCRIPTION = SCENE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE__DURATION = SCENE__DURATION;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE__CAMERA = SCENE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Camera Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE_FEATURE_COUNT = SCENE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Camera Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_SCENE_OPERATION_COUNT = SCENE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Movement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MOVEMENT = 3;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__SPEAKER = 3;

	/**
	 * The number of structural features of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.CameraType <em>Camera Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.CameraType
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraType()
	 * @generated
	 */
	int CAMERA_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.anime.storyboard.CameraMovementType <em>Camera Movement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.anime.storyboard.CameraMovementType
	 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraMovementType()
	 * @generated
	 */
	int CAMERA_MOVEMENT_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see org.anime.storyboard.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Scene#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.anime.storyboard.Scene#getDescription()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Scene#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.anime.storyboard.Scene#getId()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Scene#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.anime.storyboard.Scene#getDuration()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Duration();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.DialogueScene <em>Dialogue Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue Scene</em>'.
	 * @see org.anime.storyboard.DialogueScene
	 * @generated
	 */
	EClass getDialogueScene();

	/**
	 * Returns the meta object for the containment reference list '{@link org.anime.storyboard.DialogueScene#getDialogues <em>Dialogues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogues</em>'.
	 * @see org.anime.storyboard.DialogueScene#getDialogues()
	 * @see #getDialogueScene()
	 * @generated
	 */
	EReference getDialogueScene_Dialogues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.anime.storyboard.DialogueScene#getCharacters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characters</em>'.
	 * @see org.anime.storyboard.DialogueScene#getCharacters()
	 * @see #getDialogueScene()
	 * @generated
	 */
	EReference getDialogueScene_Characters();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.CameraScene <em>Camera Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Scene</em>'.
	 * @see org.anime.storyboard.CameraScene
	 * @generated
	 */
	EClass getCameraScene();

	/**
	 * Returns the meta object for the containment reference '{@link org.anime.storyboard.CameraScene#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Camera</em>'.
	 * @see org.anime.storyboard.CameraScene#getCamera()
	 * @see #getCameraScene()
	 * @generated
	 */
	EReference getCameraScene_Camera();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.anime.storyboard.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Character#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.anime.storyboard.Character#getName()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Character#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see org.anime.storyboard.Character#getPositionX()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Character#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see org.anime.storyboard.Character#getPositionY()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Character#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.anime.storyboard.Character#getAction()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Action();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see org.anime.storyboard.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Camera#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.anime.storyboard.Camera#getType()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Camera#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see org.anime.storyboard.Camera#getPositionX()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Camera#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see org.anime.storyboard.Camera#getPositionY()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Camera#getMovement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement</em>'.
	 * @see org.anime.storyboard.Camera#getMovement()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Movement();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue</em>'.
	 * @see org.anime.storyboard.Dialogue
	 * @generated
	 */
	EClass getDialogue();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Dialogue#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.anime.storyboard.Dialogue#getText()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Text();

	/**
	 * Returns the meta object for the reference '{@link org.anime.storyboard.Dialogue#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speaker</em>'.
	 * @see org.anime.storyboard.Dialogue#getSpeaker()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Speaker();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Dialogue#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.anime.storyboard.Dialogue#getDuration()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Dialogue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.anime.storyboard.Dialogue#getId()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Id();

	/**
	 * Returns the meta object for class '{@link org.anime.storyboard.Storyboard <em>Storyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storyboard</em>'.
	 * @see org.anime.storyboard.Storyboard
	 * @generated
	 */
	EClass getStoryboard();

	/**
	 * Returns the meta object for the attribute '{@link org.anime.storyboard.Storyboard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.anime.storyboard.Storyboard#getDescription()
	 * @see #getStoryboard()
	 * @generated
	 */
	EAttribute getStoryboard_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.anime.storyboard.Storyboard#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see org.anime.storyboard.Storyboard#getScenes()
	 * @see #getStoryboard()
	 * @generated
	 */
	EReference getStoryboard_Scenes();

	/**
	 * Returns the meta object for enum '{@link org.anime.storyboard.CameraType <em>Camera Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Camera Type</em>'.
	 * @see org.anime.storyboard.CameraType
	 * @generated
	 */
	EEnum getCameraType();

	/**
	 * Returns the meta object for enum '{@link org.anime.storyboard.CameraMovementType <em>Camera Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Camera Movement Type</em>'.
	 * @see org.anime.storyboard.CameraMovementType
	 * @generated
	 */
	EEnum getCameraMovementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StoryboardFactory getStoryboardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.SceneImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__DESCRIPTION = eINSTANCE.getScene_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__ID = eINSTANCE.getScene_Id();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__DURATION = eINSTANCE.getScene_Duration();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.DialogueSceneImpl <em>Dialogue Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.DialogueSceneImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getDialogueScene()
		 * @generated
		 */
		EClass DIALOGUE_SCENE = eINSTANCE.getDialogueScene();

		/**
		 * The meta object literal for the '<em><b>Dialogues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_SCENE__DIALOGUES = eINSTANCE.getDialogueScene_Dialogues();

		/**
		 * The meta object literal for the '<em><b>Characters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_SCENE__CHARACTERS = eINSTANCE.getDialogueScene_Characters();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.CameraSceneImpl <em>Camera Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.CameraSceneImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraScene()
		 * @generated
		 */
		EClass CAMERA_SCENE = eINSTANCE.getCameraScene();

		/**
		 * The meta object literal for the '<em><b>Camera</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_SCENE__CAMERA = eINSTANCE.getCameraScene_Camera();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.CharacterImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__NAME = eINSTANCE.getCharacter_Name();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__POSITION_X = eINSTANCE.getCharacter_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__POSITION_Y = eINSTANCE.getCharacter_PositionY();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__ACTION = eINSTANCE.getCharacter_Action();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.CameraImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__TYPE = eINSTANCE.getCamera_Type();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__POSITION_X = eINSTANCE.getCamera_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__POSITION_Y = eINSTANCE.getCamera_PositionY();

		/**
		 * The meta object literal for the '<em><b>Movement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MOVEMENT = eINSTANCE.getCamera_Movement();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.DialogueImpl <em>Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.DialogueImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getDialogue()
		 * @generated
		 */
		EClass DIALOGUE = eINSTANCE.getDialogue();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__TEXT = eINSTANCE.getDialogue_Text();

		/**
		 * The meta object literal for the '<em><b>Speaker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__SPEAKER = eINSTANCE.getDialogue_Speaker();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__DURATION = eINSTANCE.getDialogue_Duration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__ID = eINSTANCE.getDialogue_Id();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.impl.StoryboardImpl <em>Storyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.impl.StoryboardImpl
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getStoryboard()
		 * @generated
		 */
		EClass STORYBOARD = eINSTANCE.getStoryboard();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORYBOARD__DESCRIPTION = eINSTANCE.getStoryboard_Description();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORYBOARD__SCENES = eINSTANCE.getStoryboard_Scenes();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.CameraType <em>Camera Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.CameraType
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraType()
		 * @generated
		 */
		EEnum CAMERA_TYPE = eINSTANCE.getCameraType();

		/**
		 * The meta object literal for the '{@link org.anime.storyboard.CameraMovementType <em>Camera Movement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.anime.storyboard.CameraMovementType
		 * @see org.anime.storyboard.impl.StoryboardPackageImpl#getCameraMovementType()
		 * @generated
		 */
		EEnum CAMERA_MOVEMENT_TYPE = eINSTANCE.getCameraMovementType();

	}

} //StoryboardPackage
