/**
 */
package org.anime.storyboard.impl;

import java.util.Collection;
import org.anime.storyboard.Dialogue;
import org.anime.storyboard.DialogueScene;
import org.anime.storyboard.StoryboardPackage;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialogue Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.impl.DialogueSceneImpl#getDialogues <em>Dialogues</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.DialogueSceneImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogueSceneImpl extends SceneImpl implements DialogueScene {
	/**
	 * The cached value of the '{@link #getDialogues() <em>Dialogues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogues()
	 * @generated
	 * @ordered
	 */
	protected EList<Dialogue> dialogues;

	/**
	 * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacters()
	 * @generated
	 * @ordered
	 */
	protected EList<org.anime.storyboard.Character> characters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogueSceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoryboardPackage.Literals.DIALOGUE_SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dialogue> getDialogues() {
		if (dialogues == null) {
			dialogues = new EObjectContainmentEList<Dialogue>(Dialogue.class, this,
					StoryboardPackage.DIALOGUE_SCENE__DIALOGUES);
		}
		return dialogues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.anime.storyboard.Character> getCharacters() {
		if (characters == null) {
			characters = new EObjectContainmentEList<org.anime.storyboard.Character>(
					org.anime.storyboard.Character.class, this, StoryboardPackage.DIALOGUE_SCENE__CHARACTERS);
		}
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StoryboardPackage.DIALOGUE_SCENE__DIALOGUES:
			return ((InternalEList<?>) getDialogues()).basicRemove(otherEnd, msgs);
		case StoryboardPackage.DIALOGUE_SCENE__CHARACTERS:
			return ((InternalEList<?>) getCharacters()).basicRemove(otherEnd, msgs);
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
		case StoryboardPackage.DIALOGUE_SCENE__DIALOGUES:
			return getDialogues();
		case StoryboardPackage.DIALOGUE_SCENE__CHARACTERS:
			return getCharacters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StoryboardPackage.DIALOGUE_SCENE__DIALOGUES:
			getDialogues().clear();
			getDialogues().addAll((Collection<? extends Dialogue>) newValue);
			return;
		case StoryboardPackage.DIALOGUE_SCENE__CHARACTERS:
			getCharacters().clear();
			getCharacters().addAll((Collection<? extends org.anime.storyboard.Character>) newValue);
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
		case StoryboardPackage.DIALOGUE_SCENE__DIALOGUES:
			getDialogues().clear();
			return;
		case StoryboardPackage.DIALOGUE_SCENE__CHARACTERS:
			getCharacters().clear();
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
		case StoryboardPackage.DIALOGUE_SCENE__DIALOGUES:
			return dialogues != null && !dialogues.isEmpty();
		case StoryboardPackage.DIALOGUE_SCENE__CHARACTERS:
			return characters != null && !characters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DialogueSceneImpl
