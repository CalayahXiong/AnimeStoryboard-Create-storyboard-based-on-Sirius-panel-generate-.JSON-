/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.Character#getName <em>Name</em>}</li>
 *   <li>{@link org.anime.storyboard.Character#getPositionX <em>Position X</em>}</li>
 *   <li>{@link org.anime.storyboard.Character#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link org.anime.storyboard.Character#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.anime.storyboard.StoryboardPackage#getCharacter_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL null='self.name &lt;&gt; null and self.name.trim().size() &gt; 0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Character#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(float)
	 * @see org.anime.storyboard.StoryboardPackage#getCharacter_PositionX()
	 * @model required="true"
	 * @generated
	 */
	float getPositionX();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Character#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(float value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(float)
	 * @see org.anime.storyboard.StoryboardPackage#getCharacter_PositionY()
	 * @model required="true"
	 * @generated
	 */
	float getPositionY();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Character#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(float value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see org.anime.storyboard.StoryboardPackage#getCharacter_Action()
	 * @model required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Character#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

} // Character
