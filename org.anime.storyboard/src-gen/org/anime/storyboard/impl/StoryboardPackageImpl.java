/**
 */
package org.anime.storyboard.impl;

import org.anime.storyboard.Camera;
import org.anime.storyboard.CameraMovementType;
import org.anime.storyboard.CameraScene;
import org.anime.storyboard.CameraType;
import org.anime.storyboard.Dialogue;
import org.anime.storyboard.DialogueScene;
import org.anime.storyboard.Scene;
import org.anime.storyboard.Storyboard;
import org.anime.storyboard.StoryboardFactory;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryboardPackageImpl extends EPackageImpl implements StoryboardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameraTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameraMovementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.anime.storyboard.StoryboardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StoryboardPackageImpl() {
		super(eNS_URI, StoryboardFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StoryboardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StoryboardPackage init() {
		if (isInited)
			return (StoryboardPackage) EPackage.Registry.INSTANCE.getEPackage(StoryboardPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStoryboardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StoryboardPackageImpl theStoryboardPackage = registeredStoryboardPackage instanceof StoryboardPackageImpl
				? (StoryboardPackageImpl) registeredStoryboardPackage
				: new StoryboardPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStoryboardPackage.createPackageContents();

		// Initialize created meta-data
		theStoryboardPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStoryboardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StoryboardPackage.eNS_URI, theStoryboardPackage);
		return theStoryboardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScene() {
		return sceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScene_Description() {
		return (EAttribute) sceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScene_Id() {
		return (EAttribute) sceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScene_Duration() {
		return (EAttribute) sceneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogueScene() {
		return dialogueSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueScene_Dialogues() {
		return (EReference) dialogueSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueScene_Characters() {
		return (EReference) dialogueSceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraScene() {
		return cameraSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCameraScene_Camera() {
		return (EReference) cameraSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Name() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_PositionX() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_PositionY() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Action() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamera() {
		return cameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_Type() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_PositionX() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_PositionY() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamera_Movement() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogue() {
		return dialogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_Text() {
		return (EAttribute) dialogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogue_Speaker() {
		return (EReference) dialogueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_Duration() {
		return (EAttribute) dialogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_Id() {
		return (EAttribute) dialogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboard() {
		return storyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryboard_Description() {
		return (EAttribute) storyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_Scenes() {
		return (EReference) storyboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCameraType() {
		return cameraTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCameraMovementType() {
		return cameraMovementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardFactory getStoryboardFactory() {
		return (StoryboardFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		storyboardEClass = createEClass(STORYBOARD);
		createEAttribute(storyboardEClass, STORYBOARD__DESCRIPTION);
		createEReference(storyboardEClass, STORYBOARD__SCENES);

		sceneEClass = createEClass(SCENE);
		createEAttribute(sceneEClass, SCENE__ID);
		createEAttribute(sceneEClass, SCENE__DESCRIPTION);
		createEAttribute(sceneEClass, SCENE__DURATION);

		dialogueSceneEClass = createEClass(DIALOGUE_SCENE);
		createEReference(dialogueSceneEClass, DIALOGUE_SCENE__DIALOGUES);
		createEReference(dialogueSceneEClass, DIALOGUE_SCENE__CHARACTERS);

		cameraSceneEClass = createEClass(CAMERA_SCENE);
		createEReference(cameraSceneEClass, CAMERA_SCENE__CAMERA);

		characterEClass = createEClass(CHARACTER);
		createEAttribute(characterEClass, CHARACTER__NAME);
		createEAttribute(characterEClass, CHARACTER__POSITION_X);
		createEAttribute(characterEClass, CHARACTER__POSITION_Y);
		createEAttribute(characterEClass, CHARACTER__ACTION);

		cameraEClass = createEClass(CAMERA);
		createEAttribute(cameraEClass, CAMERA__TYPE);
		createEAttribute(cameraEClass, CAMERA__POSITION_X);
		createEAttribute(cameraEClass, CAMERA__POSITION_Y);
		createEAttribute(cameraEClass, CAMERA__MOVEMENT);

		dialogueEClass = createEClass(DIALOGUE);
		createEAttribute(dialogueEClass, DIALOGUE__ID);
		createEAttribute(dialogueEClass, DIALOGUE__TEXT);
		createEAttribute(dialogueEClass, DIALOGUE__DURATION);
		createEReference(dialogueEClass, DIALOGUE__SPEAKER);

		// Create enums
		cameraTypeEEnum = createEEnum(CAMERA_TYPE);
		cameraMovementTypeEEnum = createEEnum(CAMERA_MOVEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dialogueSceneEClass.getESuperTypes().add(this.getScene());
		cameraSceneEClass.getESuperTypes().add(this.getScene());

		// Initialize classes, features, and operations; add parameters
		initEClass(storyboardEClass, Storyboard.class, "Storyboard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryboard_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				Storyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStoryboard_Scenes(), this.getScene(), null, "scenes", null, 0, -1, Storyboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneEClass, Scene.class, "Scene", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScene_Id(), ecorePackage.getEString(), "id", null, 1, 1, Scene.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScene_Description(), ecorePackage.getEString(), "description", null, 1, 1, Scene.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScene_Duration(), ecorePackage.getEFloat(), "duration", null, 1, 1, Scene.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueSceneEClass, DialogueScene.class, "DialogueScene", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogueScene_Dialogues(), this.getDialogue(), null, "dialogues", null, 0, -1,
				DialogueScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogueScene_Characters(), this.getCharacter(), null, "characters", null, 0, -1,
				DialogueScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraSceneEClass, CameraScene.class, "CameraScene", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCameraScene_Camera(), this.getCamera(), null, "camera", null, 1, 1, CameraScene.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterEClass, org.anime.storyboard.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacter_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				org.anime.storyboard.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_PositionX(), ecorePackage.getEFloat(), "positionX", null, 1, 1,
				org.anime.storyboard.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_PositionY(), ecorePackage.getEFloat(), "positionY", null, 1, 1,
				org.anime.storyboard.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_Action(), ecorePackage.getEString(), "action", null, 1, 1,
				org.anime.storyboard.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamera_Type(), this.getCameraType(), "type", null, 0, 1, Camera.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_PositionX(), ecorePackage.getEFloat(), "positionX", null, 1, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_PositionY(), ecorePackage.getEFloat(), "positionY", null, 1, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_Movement(), this.getCameraMovementType(), "movement", null, 1, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueEClass, Dialogue.class, "Dialogue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogue_Id(), ecorePackage.getEString(), "id", null, 1, 1, Dialogue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogue_Text(), ecorePackage.getEString(), "text", null, 1, 1, Dialogue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogue_Duration(), ecorePackage.getEFloat(), "duration", null, 1, 1, Dialogue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogue_Speaker(), this.getCharacter(), null, "speaker", null, 1, 1, Dialogue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cameraTypeEEnum, CameraType.class, "CameraType");
		addEEnumLiteral(cameraTypeEEnum, CameraType.LONG_SHOT);
		addEEnumLiteral(cameraTypeEEnum, CameraType.CLOSE_UP);
		addEEnumLiteral(cameraTypeEEnum, CameraType.WIDE_ANGLE);

		initEEnum(cameraMovementTypeEEnum, CameraMovementType.class, "CameraMovementType");
		addEEnumLiteral(cameraMovementTypeEEnum, CameraMovementType.PAN_LEFT);
		addEEnumLiteral(cameraMovementTypeEEnum, CameraMovementType.ZOOM_IN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(getScene_Id(), source, new String[] { null, "self.id <> null and self.id.trim().size() > 0" });
		addAnnotation(getDialogueScene_Dialogues(), source,
				new String[] { null, "self.dialogues->forAll(d1,d2 | d1 <> d2 implies d1.id <> d2.id)" });
		addAnnotation(getDialogueScene_Characters(), source,
				new String[] { null, "self.characters->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name )" });
		addAnnotation(getCharacter_Name(), source,
				new String[] { null, "self.name <> null and self.name.trim().size() > 0" });
		addAnnotation(getDialogue_Id(), source, new String[] { null, "self.id <> null and self.id.trim().size > 0" });
	}

} //StoryboardPackageImpl
