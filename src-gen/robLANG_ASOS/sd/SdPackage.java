/**
 */
package robLANG_ASOS.sd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.sd.SdFactory
 * @model kind="package"
 * @generated
 */
public interface SdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gwendal_jouneaux.fr/rob_lang/sd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdPackage eINSTANCE = robLANG_ASOS.sd.impl.SdPackageImpl.init();

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ValueImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ValueStringImpl <em>Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ValueStringImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueString()
	 * @generated
	 */
	int VALUE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ValueIntImpl <em>Value Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ValueIntImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueInt()
	 * @generated
	 */
	int VALUE_INT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ValueDoubleImpl <em>Value Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ValueDoubleImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueDouble()
	 * @generated
	 */
	int VALUE_DOUBLE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ValueBoolImpl <em>Value Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ValueBoolImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueBool()
	 * @generated
	 */
	int VALUE_BOOL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOL__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.BreakSignalImpl <em>Break Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.BreakSignalImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getBreakSignal()
	 * @generated
	 */
	int BREAK_SIGNAL = 5;

	/**
	 * The number of structural features of the '<em>Break Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SIGNAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Break Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ArrayImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ReturnValueImpl <em>Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ReturnValueImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getReturnValue()
	 * @generated
	 */
	int RETURN_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.ExecutionContextImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getExecutionContext()
	 * @generated
	 */
	int EXECUTION_CONTEXT = 8;

	/**
	 * The number of structural features of the '<em>Execution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Put Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PUT_SYMBOL__SYMBOL_OBJECT = 0;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PUT__STRING_OBJECT = 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET__VARIABLE = 2;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___ADD_ALL__MAP = 3;

	/**
	 * The operation id for the '<em>Push Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PUSH_CONTEXT__MAP = 4;

	/**
	 * The operation id for the '<em>Push Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PUSH_CONTEXT = 5;

	/**
	 * The operation id for the '<em>Pop Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___POP_CONTEXT = 6;

	/**
	 * The operation id for the '<em>Get Battery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_BATTERY = 7;

	/**
	 * The operation id for the '<em>Get Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_POSITION = 8;

	/**
	 * The operation id for the '<em>Get Distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_DISTANCE__INTEGER = 9;

	/**
	 * The operation id for the '<em>Get Compass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_COMPASS = 10;

	/**
	 * The operation id for the '<em>Get Speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_SPEED = 11;

	/**
	 * The operation id for the '<em>Get Nominal Speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_NOMINAL_SPEED = 12;

	/**
	 * The operation id for the '<em>Get Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___GET_TIME = 13;

	/**
	 * The operation id for the '<em>Move Robot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___MOVE_ROBOT__DOUBLE = 14;

	/**
	 * The operation id for the '<em>Turn Robot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___TURN_ROBOT__DOUBLE = 15;

	/**
	 * The operation id for the '<em>Set Nominal Speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___SET_NOMINAL_SPEED__DOUBLE = 16;

	/**
	 * The operation id for the '<em>Set Speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___SET_SPEED__DOUBLE = 17;

	/**
	 * The operation id for the '<em>Println</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PRINTLN__VALUE = 18;

	/**
	 * The operation id for the '<em>Push Arg</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___PUSH_ARG__VALUE = 19;

	/**
	 * The operation id for the '<em>Set Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT___SET_PARAM__STRING = 20;

	/**
	 * The number of operations of the '<em>Execution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_OPERATION_COUNT = 21;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.RuntimeErrorImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getRuntimeError()
	 * @generated
	 */
	int RUNTIME_ERROR = 9;

	/**
	 * The number of structural features of the '<em>Runtime Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.sd.impl.NilValueImpl <em>Nil Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.sd.impl.NilValueImpl
	 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getNilValue()
	 * @generated
	 */
	int NIL_VALUE = 10;

	/**
	 * The number of structural features of the '<em>Nil Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Nil Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value String</em>'.
	 * @see robLANG_ASOS.sd.ValueString
	 * @generated
	 */
	EClass getValueString();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.sd.ValueString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.ValueString#getValue()
	 * @see #getValueString()
	 * @generated
	 */
	EAttribute getValueString_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Int</em>'.
	 * @see robLANG_ASOS.sd.ValueInt
	 * @generated
	 */
	EClass getValueInt();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.sd.ValueInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.ValueInt#getValue()
	 * @see #getValueInt()
	 * @generated
	 */
	EAttribute getValueInt_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Double</em>'.
	 * @see robLANG_ASOS.sd.ValueDouble
	 * @generated
	 */
	EClass getValueDouble();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.sd.ValueDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.ValueDouble#getValue()
	 * @see #getValueDouble()
	 * @generated
	 */
	EAttribute getValueDouble_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ValueBool <em>Value Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Bool</em>'.
	 * @see robLANG_ASOS.sd.ValueBool
	 * @generated
	 */
	EClass getValueBool();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.sd.ValueBool#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.ValueBool#getValue()
	 * @see #getValueBool()
	 * @generated
	 */
	EAttribute getValueBool_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.BreakSignal <em>Break Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Signal</em>'.
	 * @see robLANG_ASOS.sd.BreakSignal
	 * @generated
	 */
	EClass getBreakSignal();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see robLANG_ASOS.sd.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute list '{@link robLANG_ASOS.sd.Array#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see robLANG_ASOS.sd.Array#getElements()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Elements();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value</em>'.
	 * @see robLANG_ASOS.sd.ReturnValue
	 * @generated
	 */
	EClass getReturnValue();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.sd.ReturnValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see robLANG_ASOS.sd.ReturnValue#getValue()
	 * @see #getReturnValue()
	 * @generated
	 */
	EReference getReturnValue_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Context</em>'.
	 * @see robLANG_ASOS.sd.ExecutionContext
	 * @generated
	 */
	EClass getExecutionContext();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#putSymbol(robLANG_ASOS.Symbol, java.lang.Object) <em>Put Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put Symbol</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#putSymbol(robLANG_ASOS.Symbol, java.lang.Object)
	 * @generated
	 */
	EOperation getExecutionContext__PutSymbol__Symbol_Object();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#put(java.lang.String, java.lang.Object) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#put(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getExecutionContext__Put__String_Object();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#get(robLANG_ASOS.Variable) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#get(robLANG_ASOS.Variable)
	 * @generated
	 */
	EOperation getExecutionContext__Get__Variable();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#addAll(java.util.Map) <em>Add All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#addAll(java.util.Map)
	 * @generated
	 */
	EOperation getExecutionContext__AddAll__Map();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#pushContext(java.util.Map) <em>Push Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Context</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#pushContext(java.util.Map)
	 * @generated
	 */
	EOperation getExecutionContext__PushContext__Map();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#pushContext() <em>Push Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Context</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#pushContext()
	 * @generated
	 */
	EOperation getExecutionContext__PushContext();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#popContext() <em>Pop Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pop Context</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#popContext()
	 * @generated
	 */
	EOperation getExecutionContext__PopContext();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getBattery() <em>Get Battery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Battery</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getBattery()
	 * @generated
	 */
	EOperation getExecutionContext__GetBattery();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getPosition() <em>Get Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Position</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getPosition()
	 * @generated
	 */
	EOperation getExecutionContext__GetPosition();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getDistance(java.lang.Integer) <em>Get Distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Distance</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getDistance(java.lang.Integer)
	 * @generated
	 */
	EOperation getExecutionContext__GetDistance__Integer();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getCompass() <em>Get Compass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Compass</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getCompass()
	 * @generated
	 */
	EOperation getExecutionContext__GetCompass();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getSpeed() <em>Get Speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Speed</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getSpeed()
	 * @generated
	 */
	EOperation getExecutionContext__GetSpeed();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getNominalSpeed() <em>Get Nominal Speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nominal Speed</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getNominalSpeed()
	 * @generated
	 */
	EOperation getExecutionContext__GetNominalSpeed();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#getTime() <em>Get Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#getTime()
	 * @generated
	 */
	EOperation getExecutionContext__GetTime();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#moveRobot(java.lang.Double) <em>Move Robot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Robot</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#moveRobot(java.lang.Double)
	 * @generated
	 */
	EOperation getExecutionContext__MoveRobot__Double();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#turnRobot(java.lang.Double) <em>Turn Robot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Robot</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#turnRobot(java.lang.Double)
	 * @generated
	 */
	EOperation getExecutionContext__TurnRobot__Double();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#setNominalSpeed(java.lang.Double) <em>Set Nominal Speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nominal Speed</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#setNominalSpeed(java.lang.Double)
	 * @generated
	 */
	EOperation getExecutionContext__SetNominalSpeed__Double();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#setSpeed(java.lang.Double) <em>Set Speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Speed</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#setSpeed(java.lang.Double)
	 * @generated
	 */
	EOperation getExecutionContext__SetSpeed__Double();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#println(robLANG_ASOS.sd.Value) <em>Println</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Println</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#println(robLANG_ASOS.sd.Value)
	 * @generated
	 */
	EOperation getExecutionContext__Println__Value();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#pushArg(robLANG_ASOS.sd.Value) <em>Push Arg</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Arg</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#pushArg(robLANG_ASOS.sd.Value)
	 * @generated
	 */
	EOperation getExecutionContext__PushArg__Value();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.sd.ExecutionContext#setParam(java.lang.String) <em>Set Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Param</em>' operation.
	 * @see robLANG_ASOS.sd.ExecutionContext#setParam(java.lang.String)
	 * @generated
	 */
	EOperation getExecutionContext__SetParam__String();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Error</em>'.
	 * @see robLANG_ASOS.sd.RuntimeError
	 * @generated
	 */
	EClass getRuntimeError();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.sd.NilValue <em>Nil Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nil Value</em>'.
	 * @see robLANG_ASOS.sd.NilValue
	 * @generated
	 */
	EClass getNilValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SdFactory getSdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ValueImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ValueStringImpl <em>Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ValueStringImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueString()
		 * @generated
		 */
		EClass VALUE_STRING = eINSTANCE.getValueString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_STRING__VALUE = eINSTANCE.getValueString_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ValueIntImpl <em>Value Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ValueIntImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueInt()
		 * @generated
		 */
		EClass VALUE_INT = eINSTANCE.getValueInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_INT__VALUE = eINSTANCE.getValueInt_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ValueDoubleImpl <em>Value Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ValueDoubleImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueDouble()
		 * @generated
		 */
		EClass VALUE_DOUBLE = eINSTANCE.getValueDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DOUBLE__VALUE = eINSTANCE.getValueDouble_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ValueBoolImpl <em>Value Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ValueBoolImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getValueBool()
		 * @generated
		 */
		EClass VALUE_BOOL = eINSTANCE.getValueBool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_BOOL__VALUE = eINSTANCE.getValueBool_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.BreakSignalImpl <em>Break Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.BreakSignalImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getBreakSignal()
		 * @generated
		 */
		EClass BREAK_SIGNAL = eINSTANCE.getBreakSignal();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ArrayImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__ELEMENTS = eINSTANCE.getArray_Elements();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ReturnValueImpl <em>Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ReturnValueImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getReturnValue()
		 * @generated
		 */
		EClass RETURN_VALUE = eINSTANCE.getReturnValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE__VALUE = eINSTANCE.getReturnValue_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.ExecutionContextImpl <em>Execution Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.ExecutionContextImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getExecutionContext()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT = eINSTANCE.getExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Put Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PUT_SYMBOL__SYMBOL_OBJECT = eINSTANCE
				.getExecutionContext__PutSymbol__Symbol_Object();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PUT__STRING_OBJECT = eINSTANCE.getExecutionContext__Put__String_Object();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET__VARIABLE = eINSTANCE.getExecutionContext__Get__Variable();

		/**
		 * The meta object literal for the '<em><b>Add All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___ADD_ALL__MAP = eINSTANCE.getExecutionContext__AddAll__Map();

		/**
		 * The meta object literal for the '<em><b>Push Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PUSH_CONTEXT__MAP = eINSTANCE.getExecutionContext__PushContext__Map();

		/**
		 * The meta object literal for the '<em><b>Push Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PUSH_CONTEXT = eINSTANCE.getExecutionContext__PushContext();

		/**
		 * The meta object literal for the '<em><b>Pop Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___POP_CONTEXT = eINSTANCE.getExecutionContext__PopContext();

		/**
		 * The meta object literal for the '<em><b>Get Battery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_BATTERY = eINSTANCE.getExecutionContext__GetBattery();

		/**
		 * The meta object literal for the '<em><b>Get Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_POSITION = eINSTANCE.getExecutionContext__GetPosition();

		/**
		 * The meta object literal for the '<em><b>Get Distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_DISTANCE__INTEGER = eINSTANCE.getExecutionContext__GetDistance__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Compass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_COMPASS = eINSTANCE.getExecutionContext__GetCompass();

		/**
		 * The meta object literal for the '<em><b>Get Speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_SPEED = eINSTANCE.getExecutionContext__GetSpeed();

		/**
		 * The meta object literal for the '<em><b>Get Nominal Speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_NOMINAL_SPEED = eINSTANCE.getExecutionContext__GetNominalSpeed();

		/**
		 * The meta object literal for the '<em><b>Get Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___GET_TIME = eINSTANCE.getExecutionContext__GetTime();

		/**
		 * The meta object literal for the '<em><b>Move Robot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___MOVE_ROBOT__DOUBLE = eINSTANCE.getExecutionContext__MoveRobot__Double();

		/**
		 * The meta object literal for the '<em><b>Turn Robot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___TURN_ROBOT__DOUBLE = eINSTANCE.getExecutionContext__TurnRobot__Double();

		/**
		 * The meta object literal for the '<em><b>Set Nominal Speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___SET_NOMINAL_SPEED__DOUBLE = eINSTANCE
				.getExecutionContext__SetNominalSpeed__Double();

		/**
		 * The meta object literal for the '<em><b>Set Speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___SET_SPEED__DOUBLE = eINSTANCE.getExecutionContext__SetSpeed__Double();

		/**
		 * The meta object literal for the '<em><b>Println</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PRINTLN__VALUE = eINSTANCE.getExecutionContext__Println__Value();

		/**
		 * The meta object literal for the '<em><b>Push Arg</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___PUSH_ARG__VALUE = eINSTANCE.getExecutionContext__PushArg__Value();

		/**
		 * The meta object literal for the '<em><b>Set Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION_CONTEXT___SET_PARAM__STRING = eINSTANCE.getExecutionContext__SetParam__String();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.RuntimeErrorImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getRuntimeError()
		 * @generated
		 */
		EClass RUNTIME_ERROR = eINSTANCE.getRuntimeError();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.sd.impl.NilValueImpl <em>Nil Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.sd.impl.NilValueImpl
		 * @see robLANG_ASOS.sd.impl.SdPackageImpl#getNilValue()
		 * @generated
		 */
		EClass NIL_VALUE = eINSTANCE.getNilValue();

	}

} //SdPackage
