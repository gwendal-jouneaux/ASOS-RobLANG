
package robLANG_ASOS.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robLANG_ASOS.ConstructWithContext;
import robLANG_ASOS.RobLANG_ASOSPackage;
import robLANG_ASOS.StandaloneContext;
import robLANG_ASOS.sd.ExecutionContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct With Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstructWithContextImpl extends MinimalEObjectImpl.Container implements ConstructWithContext {

	public final static ExecutionContext ctx = new StandaloneContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructWithContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.CONSTRUCT_WITH_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ExecutionContext getContext() {
		return ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RobLANG_ASOSPackage.CONSTRUCT_WITH_CONTEXT___GET_CONTEXT:
			return getContext();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstructWithContextImpl
