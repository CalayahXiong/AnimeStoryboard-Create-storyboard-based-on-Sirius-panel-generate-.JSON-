/**
 */
package org.anime.storyboard.impl;

import org.anime.storyboard.Dialogue;
import org.anime.storyboard.StoryboardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.anime.storyboard.impl.DialogueImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.DialogueImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.DialogueImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.anime.storyboard.impl.DialogueImpl#getSpeaker <em>Speaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialogueImpl extends MinimalEObjectImpl.Container implements Dialogue {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeaker() <em>Speaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaker()
	 * @generated
	 * @ordered
	 */
	protected org.anime.storyboard.Character speaker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoryboardPackage.Literals.DIALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.DIALOGUE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.anime.storyboard.Character getSpeaker() {
		if (speaker != null && speaker.eIsProxy()) {
			InternalEObject oldSpeaker = (InternalEObject) speaker;
			speaker = (org.anime.storyboard.Character) eResolveProxy(oldSpeaker);
			if (speaker != oldSpeaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoryboardPackage.DIALOGUE__SPEAKER,
							oldSpeaker, speaker));
			}
		}
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.anime.storyboard.Character basicGetSpeaker() {
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeaker(org.anime.storyboard.Character newSpeaker) {
		org.anime.storyboard.Character oldSpeaker = speaker;
		speaker = newSpeaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.DIALOGUE__SPEAKER, oldSpeaker,
					speaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.DIALOGUE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoryboardPackage.DIALOGUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StoryboardPackage.DIALOGUE__ID:
			return getId();
		case StoryboardPackage.DIALOGUE__TEXT:
			return getText();
		case StoryboardPackage.DIALOGUE__DURATION:
			return getDuration();
		case StoryboardPackage.DIALOGUE__SPEAKER:
			if (resolve)
				return getSpeaker();
			return basicGetSpeaker();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StoryboardPackage.DIALOGUE__ID:
			setId((String) newValue);
			return;
		case StoryboardPackage.DIALOGUE__TEXT:
			setText((String) newValue);
			return;
		case StoryboardPackage.DIALOGUE__DURATION:
			setDuration((Float) newValue);
			return;
		case StoryboardPackage.DIALOGUE__SPEAKER:
			setSpeaker((org.anime.storyboard.Character) newValue);
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
		case StoryboardPackage.DIALOGUE__ID:
			setId(ID_EDEFAULT);
			return;
		case StoryboardPackage.DIALOGUE__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case StoryboardPackage.DIALOGUE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case StoryboardPackage.DIALOGUE__SPEAKER:
			setSpeaker((org.anime.storyboard.Character) null);
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
		case StoryboardPackage.DIALOGUE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case StoryboardPackage.DIALOGUE__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case StoryboardPackage.DIALOGUE__DURATION:
			return duration != DURATION_EDEFAULT;
		case StoryboardPackage.DIALOGUE__SPEAKER:
			return speaker != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", text: ");
		result.append(text);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //DialogueImpl
