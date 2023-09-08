
package robLANG_ASOS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robLANG_ASOS.FunDefinition;
import robLANG_ASOS.RobLANG_ASOSPackage;
import robLANG_ASOS.Robot;

import robLANG_ASOS.sd.ExecutionContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.RobotImpl#getMain <em>Main</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.RobotImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link robLANG_ASOS.impl.RobotImpl#getExecutioncontext <em>Executioncontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {

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
	 * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected FunDefinition main;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunDefinition> functions;

	/**
	 * The cached value of the '{@link #getExecutioncontext() <em>Executioncontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutioncontext()
	 * @generated
	 * @ordered
	 */
	protected ExecutionContext executioncontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.ROBOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunDefinition getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain(FunDefinition newMain, NotificationChain msgs) {
		FunDefinition oldMain = main;
		main = newMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobLANG_ASOSPackage.ROBOT__MAIN, oldMain, newMain);
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
	public void setMain(FunDefinition newMain) {
		if (newMain != main) {
			NotificationChain msgs = null;
			if (main != null)
				msgs = ((InternalEObject) main).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.ROBOT__MAIN, null, msgs);
			if (newMain != null)
				msgs = ((InternalEObject) newMain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobLANG_ASOSPackage.ROBOT__MAIN, null, msgs);
			msgs = basicSetMain(newMain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.ROBOT__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunDefinition> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<FunDefinition>(FunDefinition.class, this,
					RobLANG_ASOSPackage.ROBOT__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionContext getExecutioncontext() {
		if (executioncontext != null && executioncontext.eIsProxy()) {
			InternalEObject oldExecutioncontext = (InternalEObject) executioncontext;
			executioncontext = (ExecutionContext) eResolveProxy(oldExecutioncontext);
			if (executioncontext != oldExecutioncontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT, oldExecutioncontext, executioncontext));
			}
		}
		return executioncontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext basicGetExecutioncontext() {
		return executioncontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutioncontext(ExecutionContext newExecutioncontext) {
		ExecutionContext oldExecutioncontext = executioncontext;
		executioncontext = newExecutioncontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT,
					oldExecutioncontext, executioncontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobLANG_ASOSPackage.ROBOT__MAIN:
			return basicSetMain(null, msgs);
		case RobLANG_ASOSPackage.ROBOT__FUNCTIONS:
			return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
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
		case RobLANG_ASOSPackage.ROBOT__NAME:
			return getName();
		case RobLANG_ASOSPackage.ROBOT__MAIN:
			return getMain();
		case RobLANG_ASOSPackage.ROBOT__FUNCTIONS:
			return getFunctions();
		case RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT:
			if (resolve)
				return getExecutioncontext();
			return basicGetExecutioncontext();
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
		case RobLANG_ASOSPackage.ROBOT__NAME:
			setName((String) newValue);
			return;
		case RobLANG_ASOSPackage.ROBOT__MAIN:
			setMain((FunDefinition) newValue);
			return;
		case RobLANG_ASOSPackage.ROBOT__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends FunDefinition>) newValue);
			return;
		case RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT:
			setExecutioncontext((ExecutionContext) newValue);
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
		case RobLANG_ASOSPackage.ROBOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RobLANG_ASOSPackage.ROBOT__MAIN:
			setMain((FunDefinition) null);
			return;
		case RobLANG_ASOSPackage.ROBOT__FUNCTIONS:
			getFunctions().clear();
			return;
		case RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT:
			setExecutioncontext((ExecutionContext) null);
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
		case RobLANG_ASOSPackage.ROBOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RobLANG_ASOSPackage.ROBOT__MAIN:
			return main != null;
		case RobLANG_ASOSPackage.ROBOT__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		case RobLANG_ASOSPackage.ROBOT__EXECUTIONCONTEXT:
			return executioncontext != null;
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

} //RobotImpl
