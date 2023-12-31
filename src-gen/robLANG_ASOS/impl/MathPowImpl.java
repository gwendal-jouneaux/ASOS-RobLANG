
package robLANG_ASOS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robLANG_ASOS.Expression;
import robLANG_ASOS.MathPow;
import robLANG_ASOS.RobLANG_ASOSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Pow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.impl.MathPowImpl#getValue <em>Value</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.MathPowImpl#getExponant <em>Exponant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathPowImpl extends MathExpressionImpl implements MathPow {

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The cached value of the '{@link #getExponant() <em>Exponant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponant()
	 * @generated
	 * @ordered
	 */
	protected Expression exponant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathPowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.MATH_POW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.MATH_POW__VALUE, oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.MATH_POW__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.MATH_POW__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.MATH_POW__VALUE, newValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExponant() {
		return exponant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExponant(Expression newExponant, NotificationChain msgs) {
		Expression oldExponant = exponant;
		exponant = newExponant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.MATH_POW__EXPONANT, oldExponant, newExponant);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponant(Expression newExponant) {
		if (newExponant != exponant) {
			NotificationChain msgs = null;
			if (exponant != null)
				msgs = ((InternalEObject) exponant).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.MATH_POW__EXPONANT, null, msgs);
			if (newExponant != null)
				msgs = ((InternalEObject) newExponant).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.MATH_POW__EXPONANT, null, msgs);
			msgs = basicSetExponant(newExponant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.MATH_POW__EXPONANT, newExponant,
					newExponant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobLANG_ASOSPackage.MATH_POW__VALUE:
			return basicSetValue(null, msgs);
		case RobLANG_ASOSPackage.MATH_POW__EXPONANT:
			return basicSetExponant(null, msgs);
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
		case RobLANG_ASOSPackage.MATH_POW__VALUE:
			return getValue();
		case RobLANG_ASOSPackage.MATH_POW__EXPONANT:
			return getExponant();
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
		case RobLANG_ASOSPackage.MATH_POW__VALUE:
			setValue((Expression) newValue);
			return;
		case RobLANG_ASOSPackage.MATH_POW__EXPONANT:
			setExponant((Expression) newValue);
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
		case RobLANG_ASOSPackage.MATH_POW__VALUE:
			setValue((Expression) null);
			return;
		case RobLANG_ASOSPackage.MATH_POW__EXPONANT:
			setExponant((Expression) null);
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
		case RobLANG_ASOSPackage.MATH_POW__VALUE:
			return value != null;
		case RobLANG_ASOSPackage.MATH_POW__EXPONANT:
			return exponant != null;
		}
		return super.eIsSet(featureID);
	}

} //MathPowImpl
