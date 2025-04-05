/**
 */
package org.anime.storyboard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.Storyboard#getDescription <em>Description</em>}</li>
 *   <li>{@link org.anime.storyboard.Storyboard#getScenes <em>Scenes</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getStoryboard()
 * @model
 * @generated
 */
public interface Storyboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.anime.storyboard.StoryboardPackage#getStoryboard_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Storyboard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link org.anime.storyboard.Scene}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see org.anime.storyboard.StoryboardPackage#getStoryboard_Scenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scene> getScenes();

} // Storyboard
