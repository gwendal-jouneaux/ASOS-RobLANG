/**
 */
package robLANG_ASOS.sd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robLANG_ASOS.RobLANG_ASOSPackage;

import robLANG_ASOS.impl.RobLANG_ASOSPackageImpl;

import robLANG_ASOS.sd.Array;
import robLANG_ASOS.sd.BreakSignal;
import robLANG_ASOS.sd.ExecutionContext;
import robLANG_ASOS.sd.NilValue;
import robLANG_ASOS.sd.ReturnValue;
import robLANG_ASOS.sd.RuntimeError;
import robLANG_ASOS.sd.SdFactory;
import robLANG_ASOS.sd.SdPackage;
import robLANG_ASOS.sd.Value;
import robLANG_ASOS.sd.ValueBool;
import robLANG_ASOS.sd.ValueDouble;
import robLANG_ASOS.sd.ValueInt;
import robLANG_ASOS.sd.ValueString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdPackageImpl extends EPackageImpl implements SdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nilValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robLANG_ASOS.sd.SdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SdPackageImpl() {
		super(eNS_URI, SdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SdPackage init() {
		if (isInited)
			return (SdPackage) EPackage.Registry.INSTANCE.getEPackage(SdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SdPackageImpl theSdPackage = registeredSdPackage instanceof SdPackageImpl ? (SdPackageImpl) registeredSdPackage
				: new SdPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RobLANG_ASOSPackage.eNS_URI);
		RobLANG_ASOSPackageImpl theRobLANG_ASOSPackage = (RobLANG_ASOSPackageImpl) (registeredPackage instanceof RobLANG_ASOSPackageImpl
				? registeredPackage
				: RobLANG_ASOSPackage.eINSTANCE);

		// Create package meta-data objects
		theSdPackage.createPackageContents();
		theRobLANG_ASOSPackage.createPackageContents();

		// Initialize created meta-data
		theSdPackage.initializePackageContents();
		theRobLANG_ASOSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SdPackage.eNS_URI, theSdPackage);
		return theSdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueString() {
		return valueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueString_Value() {
		return (EAttribute) valueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueInt() {
		return valueIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueInt_Value() {
		return (EAttribute) valueIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueDouble() {
		return valueDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueDouble_Value() {
		return (EAttribute) valueDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueBool() {
		return valueBoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueBool_Value() {
		return (EAttribute) valueBoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBreakSignal() {
		return breakSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArray_Elements() {
		return (EAttribute) arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnValue() {
		return returnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnValue_Value() {
		return (EReference) returnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionContext() {
		return executionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__PutSymbol__Symbol_Object() {
		return executionContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__Put__String_Object() {
		return executionContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__Get__Variable() {
		return executionContextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__AddAll__Map() {
		return executionContextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__PushContext__Map() {
		return executionContextEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__PushContext() {
		return executionContextEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__PopContext() {
		return executionContextEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetBattery() {
		return executionContextEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetPosition() {
		return executionContextEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetDistance__Integer() {
		return executionContextEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetCompass() {
		return executionContextEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetSpeed() {
		return executionContextEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetNominalSpeed() {
		return executionContextEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__GetTime() {
		return executionContextEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__MoveRobot__Double() {
		return executionContextEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__TurnRobot__Double() {
		return executionContextEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__SetNominalSpeed__Double() {
		return executionContextEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__SetSpeed__Double() {
		return executionContextEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__Println__Value() {
		return executionContextEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__PushArg__Value() {
		return executionContextEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecutionContext__SetParam__String() {
		return executionContextEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeError() {
		return runtimeErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNilValue() {
		return nilValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SdFactory getSdFactory() {
		return (SdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		valueEClass = createEClass(VALUE);

		valueStringEClass = createEClass(VALUE_STRING);
		createEAttribute(valueStringEClass, VALUE_STRING__VALUE);

		valueIntEClass = createEClass(VALUE_INT);
		createEAttribute(valueIntEClass, VALUE_INT__VALUE);

		valueDoubleEClass = createEClass(VALUE_DOUBLE);
		createEAttribute(valueDoubleEClass, VALUE_DOUBLE__VALUE);

		valueBoolEClass = createEClass(VALUE_BOOL);
		createEAttribute(valueBoolEClass, VALUE_BOOL__VALUE);

		breakSignalEClass = createEClass(BREAK_SIGNAL);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__ELEMENTS);

		returnValueEClass = createEClass(RETURN_VALUE);
		createEReference(returnValueEClass, RETURN_VALUE__VALUE);

		executionContextEClass = createEClass(EXECUTION_CONTEXT);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PUT_SYMBOL__SYMBOL_OBJECT);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PUT__STRING_OBJECT);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET__VARIABLE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___ADD_ALL__MAP);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PUSH_CONTEXT__MAP);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PUSH_CONTEXT);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___POP_CONTEXT);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_BATTERY);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_POSITION);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_DISTANCE__INTEGER);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_COMPASS);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_SPEED);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_NOMINAL_SPEED);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___GET_TIME);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___MOVE_ROBOT__DOUBLE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___TURN_ROBOT__DOUBLE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___SET_NOMINAL_SPEED__DOUBLE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___SET_SPEED__DOUBLE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PRINTLN__VALUE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___PUSH_ARG__VALUE);
		createEOperation(executionContextEClass, EXECUTION_CONTEXT___SET_PARAM__STRING);

		runtimeErrorEClass = createEClass(RUNTIME_ERROR);

		nilValueEClass = createEClass(NIL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RobLANG_ASOSPackage theRobLANG_ASOSPackage = (RobLANG_ASOSPackage) EPackage.Registry.INSTANCE
				.getEPackage(RobLANG_ASOSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueStringEClass.getESuperTypes().add(this.getValue());
		valueIntEClass.getESuperTypes().add(this.getValue());
		valueDoubleEClass.getESuperTypes().add(this.getValue());
		valueBoolEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueStringEClass, ValueString.class, "ValueString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueString_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueString.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueIntEClass, ValueInt.class, "ValueInt", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueInt_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, ValueInt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueDoubleEClass, ValueDouble.class, "ValueDouble", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueDouble_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, ValueDouble.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueBoolEClass, ValueBool.class, "ValueBool", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueBool_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, ValueBool.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakSignalEClass, BreakSignal.class, "BreakSignal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Elements(), ecorePackage.getEJavaObject(), "elements", null, 0, -1, Array.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnValue_Value(), this.getValue(), null, "value", null, 1, 1, ReturnValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionContextEClass, ExecutionContext.class, "ExecutionContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getExecutionContext__PutSymbol__Symbol_Object(), null, "putSymbol", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRobLANG_ASOSPackage.getSymbol(), "varName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__Put__String_Object(), null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "varName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__Get__Variable(), ecorePackage.getEJavaObject(), "get", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRobLANG_ASOSPackage.getVariable(), "var", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__AddAll__Map(), null, "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "vars", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__PushContext__Map(), null, "pushContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "vars", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__PushContext(), null, "pushContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__PopContext(), null, "popContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__GetBattery(), this.getValueDouble(), "getBattery", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExecutionContext__GetPosition(), this.getArray(), "getPosition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__GetDistance__Integer(), this.getValueDouble(), "getDistance", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__GetCompass(), this.getValueDouble(), "getCompass", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExecutionContext__GetSpeed(), this.getValueDouble(), "getSpeed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__GetNominalSpeed(), this.getValueDouble(), "getNominalSpeed", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecutionContext__GetTime(), this.getValueDouble(), "getTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__MoveRobot__Double(), null, "moveRobot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDoubleObject(), "dist", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__TurnRobot__Double(), null, "turnRobot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDoubleObject(), "angle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__SetNominalSpeed__Double(), null, "setNominalSpeed", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDoubleObject(), "speed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__SetSpeed__Double(), null, "setSpeed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDoubleObject(), "speed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__Println__Value(), null, "println", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValue(), "expr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__PushArg__Value(), null, "pushArg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValue(), "arg", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionContext__SetParam__String(), null, "setParam", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(runtimeErrorEClass, RuntimeError.class, "RuntimeError", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nilValueEClass, NilValue.class, "NilValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //SdPackageImpl
