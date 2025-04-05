/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.Dialogue#getId <em>Id</em>}</li>
 *   <li>{@link org.anime.storyboard.Dialogue#getText <em>Text</em>}</li>
 *   <li>{@link org.anime.storyboard.Dialogue#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.anime.storyboard.Dialogue#getSpeaker <em>Speaker</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getDialogue()
 * @model
 * @generated
 */
public interface Dialogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.anime.storyboard.StoryboardPackage#getDialogue_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Dialogue#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' reference.
	 * @see #setSpeaker(org.anime.storyboard.Character)
	 * @see org.anime.storyboard.StoryboardPackage#getDialogue_Speaker()
	 * @model required="true"
	 * @generated
	 */
	org.anime.storyboard.Character getSpeaker();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Dialogue#getSpeaker <em>Speaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(org.anime.storyboard.Character value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see org.anime.storyboard.StoryboardPackage#getDialogue_Duration()
	 * @model required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Dialogue#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.anime.storyboard.StoryboardPackage#getDialogue_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL null='self.id &lt;&gt; null and self.id.trim().size &gt; 0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Dialogue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Dialogue
