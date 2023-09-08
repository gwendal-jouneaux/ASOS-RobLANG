
package robLANG_ASOS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robLANG_ASOS.Block;
import robLANG_ASOS.Condition;
import robLANG_ASOS.Expression;
import robLANG_ASOS.RobLANG_ASOSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.impl.ConditionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.ConditionImpl#getIfz <em>Ifz</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.ConditionImpl#getElsez <em>Elsez</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends StatementImpl implements Condition {

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getIfz() <em>Ifz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfz()
	 * @generated
	 * @ordered
	 */
	protected Block ifz;

	/**
	 * The cached value of the '{@link #getElsez() <em>Elsez</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsez()
	 * @generated
	 * @ordered
	 */
	protected Block elsez;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.CONDITION__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.CONDITION__EXPRESSION,
					newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getIfz() {
		return ifz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfz(Block newIfz, NotificationChain msgs) {
		Block oldIfz = ifz;
		ifz = newIfz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.CONDITION__IFZ, oldIfz, newIfz);
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
	public void setIfz(Block newIfz) {
		if (newIfz != ifz) {
			NotificationChain msgs = null;
			if (ifz != null)
				msgs = ((InternalEObject) ifz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__IFZ, null, msgs);
			if (newIfz != null)
				msgs = ((InternalEObject) newIfz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__IFZ, null, msgs);
			msgs = basicSetIfz(newIfz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.CONDITION__IFZ, newIfz, newIfz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getElsez() {
		return elsez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElsez(Block newElsez, NotificationChain msgs) {
		Block oldElsez = elsez;
		elsez = newElsez;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.CONDITION__ELSEZ, oldElsez, newElsez);
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
	public void setElsez(Block newElsez) {
		if (newElsez != elsez) {
			NotificationChain msgs = null;
			if (elsez != null)
				msgs = ((InternalEObject) elsez).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__ELSEZ, null, msgs);
			if (newElsez != null)
				msgs = ((InternalEObject) newElsez).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.CONDITION__ELSEZ, null, msgs);
			msgs = basicSetElsez(newElsez, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.CONDITION__ELSEZ, newElsez,
					newElsez));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobLANG_ASOSPackage.CONDITION__EXPRESSION:
			return basicSetExpression(null, msgs);
		case RobLANG_ASOSPackage.CONDITION__IFZ:
			return basicSetIfz(null, msgs);
		case RobLANG_ASOSPackage.CONDITION__ELSEZ:
			return basicSetElsez(null, msgs);
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
		case RobLANG_ASOSPackage.CONDITION__EXPRESSION:
			return getExpression();
		case RobLANG_ASOSPackage.CONDITION__IFZ:
			return getIfz();
		case RobLANG_ASOSPackage.CONDITION__ELSEZ:
			return getElsez();
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
		case RobLANG_ASOSPackage.CONDITION__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case RobLANG_ASOSPackage.CONDITION__IFZ:
			setIfz((Block) newValue);
			return;
		case RobLANG_ASOSPackage.CONDITION__ELSEZ:
			setElsez((Block) newValue);
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
		case RobLANG_ASOSPackage.CONDITION__EXPRESSION:
			setExpression((Expression) null);
			return;
		case RobLANG_ASOSPackage.CONDITION__IFZ:
			setIfz((Block) null);
			return;
		case RobLANG_ASOSPackage.CONDITION__ELSEZ:
			setElsez((Block) null);
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
		case RobLANG_ASOSPackage.CONDITION__EXPRESSION:
			return expression != null;
		case RobLANG_ASOSPackage.CONDITION__IFZ:
			return ifz != null;
		case RobLANG_ASOSPackage.CONDITION__ELSEZ:
			return elsez != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
