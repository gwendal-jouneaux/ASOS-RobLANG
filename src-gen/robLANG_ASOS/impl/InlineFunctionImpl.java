
package robLANG_ASOS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robLANG_ASOS.Expression;
import robLANG_ASOS.InlineFunction;
import robLANG_ASOS.Parameter;
import robLANG_ASOS.RobLANG_ASOSPackage;
import robLANG_ASOS.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.impl.InlineFunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.InlineFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.InlineFunctionImpl#getVarNames <em>Var Names</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.InlineFunctionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineFunctionImpl extends ConstructWithContextImpl implements InlineFunction {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVarNames() <em>Var Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarNames()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> varNames;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.INLINE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE, oldType, newType);
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
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE, newType,
					newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.INLINE_FUNCTION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getVarNames() {
		if (varNames == null) {
			varNames = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES);
		}
		return varNames;
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
					RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION, oldExpression, newExpression);
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
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION,
					newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE:
			return basicSetType(null, msgs);
		case RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES:
			return ((InternalEList<?>) getVarNames()).basicRemove(otherEnd, msgs);
		case RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION:
			return basicSetExpression(null, msgs);
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
		case RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE:
			return getType();
		case RobLANG_ASOSPackage.INLINE_FUNCTION__NAME:
			return getName();
		case RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES:
			return getVarNames();
		case RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION:
			return getExpression();
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
		case RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE:
			setType((Type) newValue);
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__NAME:
			setName((String) newValue);
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES:
			getVarNames().clear();
			getVarNames().addAll((Collection<? extends Parameter>) newValue);
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION:
			setExpression((Expression) newValue);
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
		case RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE:
			setType((Type) null);
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES:
			getVarNames().clear();
			return;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION:
			setExpression((Expression) null);
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
		case RobLANG_ASOSPackage.INLINE_FUNCTION__TYPE:
			return type != null;
		case RobLANG_ASOSPackage.INLINE_FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobLANG_ASOSPackage.INLINE_FUNCTION__VAR_NAMES:
			return varNames != null && !varNames.isEmpty();
		case RobLANG_ASOSPackage.INLINE_FUNCTION__EXPRESSION:
			return expression != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InlineFunctionImpl
