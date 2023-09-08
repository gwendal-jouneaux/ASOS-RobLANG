/**
 */
package robLANG_ASOS.sd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robLANG_ASOS.sd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdFactoryImpl extends EFactoryImpl implements SdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SdFactory init() {
		try {
			SdFactory theSdFactory = (SdFactory) EPackage.Registry.INSTANCE.getEFactory(SdPackage.eNS_URI);
			if (theSdFactory != null) {
				return theSdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SdPackage.VALUE:
			return createValue();
		case SdPackage.VALUE_STRING:
			return createValueString();
		case SdPackage.VALUE_INT:
			return createValueInt();
		case SdPackage.VALUE_DOUBLE:
			return createValueDouble();
		case SdPackage.VALUE_BOOL:
			return createValueBool();
		case SdPackage.BREAK_SIGNAL:
			return createBreakSignal();
		case SdPackage.ARRAY:
			return createArray();
		case SdPackage.RETURN_VALUE:
			return createReturnValue();
		case SdPackage.EXECUTION_CONTEXT:
			return createExecutionContext();
		case SdPackage.RUNTIME_ERROR:
			return createRuntimeError();
		case SdPackage.NIL_VALUE:
			return createNilValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueString createValueString() {
		ValueStringImpl valueString = new ValueStringImpl();
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInt createValueInt() {
		ValueIntImpl valueInt = new ValueIntImpl();
		return valueInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueDouble createValueDouble() {
		ValueDoubleImpl valueDouble = new ValueDoubleImpl();
		return valueDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueBool createValueBool() {
		ValueBoolImpl valueBool = new ValueBoolImpl();
		return valueBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakSignal createBreakSignal() {
		BreakSignalImpl breakSignal = new BreakSignalImpl();
		return breakSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnValue createReturnValue() {
		ReturnValueImpl returnValue = new ReturnValueImpl();
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionContext createExecutionContext() {
		ExecutionContextImpl executionContext = new ExecutionContextImpl();
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeError createRuntimeError() {
		RuntimeErrorImpl runtimeError = new RuntimeErrorImpl();
		return runtimeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NilValue createNilValue() {
		NilValueImpl nilValue = new NilValueImpl();
		return nilValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SdPackage getSdPackage() {
		return (SdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SdPackage getPackage() {
		return SdPackage.eINSTANCE;
	}

} //SdFactoryImpl
