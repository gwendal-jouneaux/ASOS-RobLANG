/**
 */
package robLANG_ASOS.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robLANG_ASOS.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobLANG_ASOSFactoryImpl extends EFactoryImpl implements RobLANG_ASOSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobLANG_ASOSFactory init() {
		try {
			RobLANG_ASOSFactory theRobLANG_ASOSFactory = (RobLANG_ASOSFactory) EPackage.Registry.INSTANCE
					.getEFactory(RobLANG_ASOSPackage.eNS_URI);
			if (theRobLANG_ASOSFactory != null) {
				return theRobLANG_ASOSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobLANG_ASOSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobLANG_ASOSFactoryImpl() {
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
		case RobLANG_ASOSPackage.ROBOT:
			return createRobot();
		case RobLANG_ASOSPackage.BLOCK:
			return createBlock();
		case RobLANG_ASOSPackage.TYPE:
			return createType();
		case RobLANG_ASOSPackage.INLINE_FUNCTION:
			return createInlineFunction();
		case RobLANG_ASOSPackage.COMPLEX_FUNCTION:
			return createComplexFunction();
		case RobLANG_ASOSPackage.PARAMETER:
			return createParameter();
		case RobLANG_ASOSPackage.FUN_CALL:
			return createFunCall();
		case RobLANG_ASOSPackage.VARIABLE:
			return createVariable();
		case RobLANG_ASOSPackage.ASSIGNMENT:
			return createAssignment();
		case RobLANG_ASOSPackage.PRINT_EXPRESSION:
			return createPrintExpression();
		case RobLANG_ASOSPackage.LOOP:
			return createLoop();
		case RobLANG_ASOSPackage.CONDITION:
			return createCondition();
		case RobLANG_ASOSPackage.RETURN:
			return createReturn();
		case RobLANG_ASOSPackage.BREAK_LOOP:
			return createBreakLoop();
		case RobLANG_ASOSPackage.ARRAY_EXPRESSION:
			return createArrayExpression();
		case RobLANG_ASOSPackage.ARRAY_STATEMENT:
			return createArrayStatement();
		case RobLANG_ASOSPackage.ARRAY_NEW:
			return createArrayNew();
		case RobLANG_ASOSPackage.ARRAY_LENGTH:
			return createArrayLength();
		case RobLANG_ASOSPackage.ARRAY_GET:
			return createArrayGet();
		case RobLANG_ASOSPackage.ARRAY_SET:
			return createArraySet();
		case RobLANG_ASOSPackage.ARRAY_ADD:
			return createArrayAdd();
		case RobLANG_ASOSPackage.ARRAY_REMOVE:
			return createArrayRemove();
		case RobLANG_ASOSPackage.MATH_EXPRESSION:
			return createMathExpression();
		case RobLANG_ASOSPackage.MATH_SQRT:
			return createMathSqrt();
		case RobLANG_ASOSPackage.MATH_POW:
			return createMathPow();
		case RobLANG_ASOSPackage.MATH_SIN:
			return createMathSin();
		case RobLANG_ASOSPackage.MATH_COS:
			return createMathCos();
		case RobLANG_ASOSPackage.MATH_ABS:
			return createMathAbs();
		case RobLANG_ASOSPackage.MATH_MODULO:
			return createMathModulo();
		case RobLANG_ASOSPackage.EFFECTOR:
			return createEffector();
		case RobLANG_ASOSPackage.MOVE:
			return createMove();
		case RobLANG_ASOSPackage.MOVE_FORWARD:
			return createMoveForward();
		case RobLANG_ASOSPackage.MOVE_BACKWARD:
			return createMoveBackward();
		case RobLANG_ASOSPackage.TURN:
			return createTurn();
		case RobLANG_ASOSPackage.TURN_LEFT:
			return createTurnLeft();
		case RobLANG_ASOSPackage.TURN_RIGHT:
			return createTurnRight();
		case RobLANG_ASOSPackage.SPEED:
			return createSpeed();
		case RobLANG_ASOSPackage.SET_NOMINAL_SPEED:
			return createSetNominalSpeed();
		case RobLANG_ASOSPackage.GET_MAX_SPEED:
			return createGetMaxSpeed();
		case RobLANG_ASOSPackage.SENSOR:
			return createSensor();
		case RobLANG_ASOSPackage.SENSE_TIME:
			return createSenseTime();
		case RobLANG_ASOSPackage.SENSE_BATTERY:
			return createSenseBattery();
		case RobLANG_ASOSPackage.SENSE_POSITION:
			return createSensePosition();
		case RobLANG_ASOSPackage.SENSE_DISTANCE:
			return createSenseDistance();
		case RobLANG_ASOSPackage.SENSE_COMPASS:
			return createSenseCompass();
		case RobLANG_ASOSPackage.TRADE_OFF:
			return createTradeOff();
		case RobLANG_ASOSPackage.FUN_PARAM_EXP:
			return createFunParamExp();
		case RobLANG_ASOSPackage.FUN_PARAM_CAPTURE:
			return createFunParamCapture();
		case RobLANG_ASOSPackage.OR:
			return createOr();
		case RobLANG_ASOSPackage.AND:
			return createAnd();
		case RobLANG_ASOSPackage.EQUALITY:
			return createEquality();
		case RobLANG_ASOSPackage.INEQUALITY:
			return createInequality();
		case RobLANG_ASOSPackage.GREATER_EQ:
			return createGreaterEq();
		case RobLANG_ASOSPackage.LESS_EQ:
			return createLessEq();
		case RobLANG_ASOSPackage.GREATER:
			return createGreater();
		case RobLANG_ASOSPackage.LESS:
			return createLess();
		case RobLANG_ASOSPackage.PLUS:
			return createPlus();
		case RobLANG_ASOSPackage.MINUS:
			return createMinus();
		case RobLANG_ASOSPackage.MULTIPLY:
			return createMultiply();
		case RobLANG_ASOSPackage.DIVIDE:
			return createDivide();
		case RobLANG_ASOSPackage.NOT:
			return createNot();
		case RobLANG_ASOSPackage.INT_CONSTANT:
			return createIntConstant();
		case RobLANG_ASOSPackage.DOUBLE_CONSTANT:
			return createDoubleConstant();
		case RobLANG_ASOSPackage.STRING_CONSTANT:
			return createStringConstant();
		case RobLANG_ASOSPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case RobLANG_ASOSPackage.SYMBOL_REF:
			return createSymbolRef();
		case RobLANG_ASOSPackage.CONSTRUCT_WITH_CONTEXT:
			return createConstructWithContext();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RobLANG_ASOSPackage.BASIC_TYPE:
			return createBasicTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RobLANG_ASOSPackage.BASIC_TYPE:
			return convertBasicTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineFunction createInlineFunction() {
		InlineFunctionImpl inlineFunction = new InlineFunctionImpl();
		return inlineFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexFunction createComplexFunction() {
		ComplexFunctionImpl complexFunction = new ComplexFunctionImpl();
		return complexFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunCall createFunCall() {
		FunCallImpl funCall = new FunCallImpl();
		return funCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrintExpression createPrintExpression() {
		PrintExpressionImpl printExpression = new PrintExpressionImpl();
		return printExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakLoop createBreakLoop() {
		BreakLoopImpl breakLoop = new BreakLoopImpl();
		return breakLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayExpression createArrayExpression() {
		ArrayExpressionImpl arrayExpression = new ArrayExpressionImpl();
		return arrayExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayStatement createArrayStatement() {
		ArrayStatementImpl arrayStatement = new ArrayStatementImpl();
		return arrayStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayNew createArrayNew() {
		ArrayNewImpl arrayNew = new ArrayNewImpl();
		return arrayNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLength createArrayLength() {
		ArrayLengthImpl arrayLength = new ArrayLengthImpl();
		return arrayLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayGet createArrayGet() {
		ArrayGetImpl arrayGet = new ArrayGetImpl();
		return arrayGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArraySet createArraySet() {
		ArraySetImpl arraySet = new ArraySetImpl();
		return arraySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAdd createArrayAdd() {
		ArrayAddImpl arrayAdd = new ArrayAddImpl();
		return arrayAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayRemove createArrayRemove() {
		ArrayRemoveImpl arrayRemove = new ArrayRemoveImpl();
		return arrayRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathExpression createMathExpression() {
		MathExpressionImpl mathExpression = new MathExpressionImpl();
		return mathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathSqrt createMathSqrt() {
		MathSqrtImpl mathSqrt = new MathSqrtImpl();
		return mathSqrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathPow createMathPow() {
		MathPowImpl mathPow = new MathPowImpl();
		return mathPow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathSin createMathSin() {
		MathSinImpl mathSin = new MathSinImpl();
		return mathSin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathCos createMathCos() {
		MathCosImpl mathCos = new MathCosImpl();
		return mathCos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathAbs createMathAbs() {
		MathAbsImpl mathAbs = new MathAbsImpl();
		return mathAbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathModulo createMathModulo() {
		MathModuloImpl mathModulo = new MathModuloImpl();
		return mathModulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Effector createEffector() {
		EffectorImpl effector = new EffectorImpl();
		return effector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveForward createMoveForward() {
		MoveForwardImpl moveForward = new MoveForwardImpl();
		return moveForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveBackward createMoveBackward() {
		MoveBackwardImpl moveBackward = new MoveBackwardImpl();
		return moveBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speed createSpeed() {
		SpeedImpl speed = new SpeedImpl();
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetNominalSpeed createSetNominalSpeed() {
		SetNominalSpeedImpl setNominalSpeed = new SetNominalSpeedImpl();
		return setNominalSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetMaxSpeed createGetMaxSpeed() {
		GetMaxSpeedImpl getMaxSpeed = new GetMaxSpeedImpl();
		return getMaxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseTime createSenseTime() {
		SenseTimeImpl senseTime = new SenseTimeImpl();
		return senseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseBattery createSenseBattery() {
		SenseBatteryImpl senseBattery = new SenseBatteryImpl();
		return senseBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensePosition createSensePosition() {
		SensePositionImpl sensePosition = new SensePositionImpl();
		return sensePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseDistance createSenseDistance() {
		SenseDistanceImpl senseDistance = new SenseDistanceImpl();
		return senseDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenseCompass createSenseCompass() {
		SenseCompassImpl senseCompass = new SenseCompassImpl();
		return senseCompass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradeOff createTradeOff() {
		TradeOffImpl tradeOff = new TradeOffImpl();
		return tradeOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunParamExp createFunParamExp() {
		FunParamExpImpl funParamExp = new FunParamExpImpl();
		return funParamExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunParamCapture createFunParamCapture() {
		FunParamCaptureImpl funParamCapture = new FunParamCaptureImpl();
		return funParamCapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inequality createInequality() {
		InequalityImpl inequality = new InequalityImpl();
		return inequality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterEq createGreaterEq() {
		GreaterEqImpl greaterEq = new GreaterEqImpl();
		return greaterEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessEq createLessEq() {
		LessEqImpl lessEq = new LessEqImpl();
		return lessEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstant createDoubleConstant() {
		DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
		return doubleConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolRef createSymbolRef() {
		SymbolRefImpl symbolRef = new SymbolRefImpl();
		return symbolRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructWithContext createConstructWithContext() {
		ConstructWithContextImpl constructWithContext = new ConstructWithContextImpl();
		return constructWithContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicTypeFromString(EDataType eDataType, String initialValue) {
		BasicType result = BasicType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobLANG_ASOSPackage getRobLANG_ASOSPackage() {
		return (RobLANG_ASOSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobLANG_ASOSPackage getPackage() {
		return RobLANG_ASOSPackage.eINSTANCE;
	}

} //RobLANG_ASOSFactoryImpl
