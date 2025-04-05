/**
 */
package org.anime.storyboard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.Scene#getId <em>Id</em>}</li>
 *   <li>{@link org.anime.storyboard.Scene#getDescription <em>Description</em>}</li>
 *   <li>{@link org.anime.storyboard.Scene#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.anime.storyboard.StoryboardPackage#getScene()
 * @model abstract="true"
 * @generated
 */
public interface Scene extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.anime.storyboard.StoryboardPackage#getScene_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Scene#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.anime.storyboard.StoryboardPackage#getScene_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL null='self.id &lt;&gt; null and self.id.trim().size() &gt; 0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Scene#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see org.anime.storyboard.StoryboardPackage#getScene_Duration()
	 * @model required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link org.anime.storyboard.Scene#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

} // Scene
