/**
 */
package robLANG_ASOS.sd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robLANG_ASOS.sd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.sd.SdPackage
 * @generated
 */
public class SdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdSwitch<Adapter> modelSwitch = new SdSwitch<Adapter>() {
		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseValueString(ValueString object) {
			return createValueStringAdapter();
		}

		@Override
		public Adapter caseValueInt(ValueInt object) {
			return createValueIntAdapter();
		}

		@Override
		public Adapter caseValueDouble(ValueDouble object) {
			return createValueDoubleAdapter();
		}

		@Override
		public Adapter caseValueBool(ValueBool object) {
			return createValueBoolAdapter();
		}

		@Override
		public Adapter caseBreakSignal(BreakSignal object) {
			return createBreakSignalAdapter();
		}

		@Override
		public Adapter caseArray(Array object) {
			return createArrayAdapter();
		}

		@Override
		public Adapter caseReturnValue(ReturnValue object) {
			return createReturnValueAdapter();
		}

		@Override
		public Adapter caseExecutionContext(ExecutionContext object) {
			return createExecutionContextAdapter();
		}

		@Override
		public Adapter caseRuntimeError(RuntimeError object) {
			return createRuntimeErrorAdapter();
		}

		@Override
		public Adapter caseNilValue(NilValue object) {
			return createNilValueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ValueString
	 * @generated
	 */
	public Adapter createValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ValueInt
	 * @generated
	 */
	public Adapter createValueIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ValueDouble
	 * @generated
	 */
	public Adapter createValueDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ValueBool <em>Value Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ValueBool
	 * @generated
	 */
	public Adapter createValueBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.BreakSignal <em>Break Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.BreakSignal
	 * @generated
	 */
	public Adapter createBreakSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ReturnValue
	 * @generated
	 */
	public Adapter createReturnValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.ExecutionContext
	 * @generated
	 */
	public Adapter createExecutionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.RuntimeError
	 * @generated
	 */
	public Adapter createRuntimeErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.sd.NilValue <em>Nil Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.sd.NilValue
	 * @generated
	 */
	public Adapter createNilValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SdAdapterFactory
