/**
 */
package org.anime.storyboard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.DialogueScene#getDialogues <em>Dialogues</em>}</li>
 *   <li>{@link org.anime.storyboard.DialogueScene#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getDialogueScene()
 * @model
 * @generated
 */
public interface DialogueScene extends Scene {
	/**
	 * Returns the value of the '<em><b>Dialogues</b></em>' containment reference list.
	 * The list contents are of type {@link org.anime.storyboard.Dialogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogues</em>' containment reference list.
	 * @see org.anime.storyboard.StoryboardPackage#getDialogueScene_Dialogues()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL null='self.dialogues-&gt;forAll(d1,d2 | d1 &lt;&gt; d2 implies d1.id &lt;&gt; d2.id)'"
	 * @generated
	 */
	EList<Dialogue> getDialogues();

	/**
	 * Returns the value of the '<em><b>Characters</b></em>' containment reference list.
	 * The list contents are of type {@link org.anime.storyboard.Character}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characters</em>' containment reference list.
	 * @see org.anime.storyboard.StoryboardPackage#getDialogueScene_Characters()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL null='self.characters-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name )'"
	 * @generated
	 */
	EList<org.anime.storyboard.Character> getCharacters();

} // DialogueScene
