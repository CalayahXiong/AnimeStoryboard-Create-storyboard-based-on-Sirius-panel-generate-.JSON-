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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.anime.storyboard.StoryboardPackage
 * @generated
 */
public class StoryboardAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StoryboardPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StoryboardPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryboardSwitch<Adapter> modelSwitch = new StoryboardSwitch<Adapter>() {
		@Override
		public Adapter caseStoryboard(Storyboard object) {
			return createStoryboardAdapter();
		}

		@Override
		public Adapter caseScene(Scene object) {
			return createSceneAdapter();
		}

		@Override
		public Adapter caseDialogueScene(DialogueScene object) {
			return createDialogueSceneAdapter();
		}

		@Override
		public Adapter caseCameraScene(CameraScene object) {
			return createCameraSceneAdapter();
		}

		@Override
		public Adapter caseCharacter(org.anime.storyboard.Character object) {
			return createCharacterAdapter();
		}

		@Override
		public Adapter caseCamera(Camera object) {
			return createCameraAdapter();
		}

		@Override
		public Adapter caseDialogue(Dialogue object) {
			return createDialogueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.DialogueScene <em>Dialogue Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.DialogueScene
	 * @generated
	 */
	public Adapter createDialogueSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.CameraScene <em>Camera Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.CameraScene
	 * @generated
	 */
	public Adapter createCameraSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.Dialogue
	 * @generated
	 */
	public Adapter createDialogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.anime.storyboard.Storyboard <em>Storyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.anime.storyboard.Storyboard
	 * @generated
	 */
	public Adapter createStoryboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StoryboardAdapterFactory
