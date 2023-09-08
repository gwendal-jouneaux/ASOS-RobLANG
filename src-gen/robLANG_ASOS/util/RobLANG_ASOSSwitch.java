/**
 */
package robLANG_ASOS.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robLANG_ASOS.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.RobLANG_ASOSPackage
 * @generated
 */
public class RobLANG_ASOSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobLANG_ASOSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobLANG_ASOSSwitch() {
		if (modelPackage == null) {
			modelPackage = RobLANG_ASOSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RobLANG_ASOSPackage.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SYMBOL: {
			Symbol symbol = (Symbol) theEObject;
			T result = caseSymbol(symbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.FUN_DEFINITION: {
			FunDefinition funDefinition = (FunDefinition) theEObject;
			T result = caseFunDefinition(funDefinition);
			if (result == null)
				result = caseConstructWithContext(funDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.INLINE_FUNCTION: {
			InlineFunction inlineFunction = (InlineFunction) theEObject;
			T result = caseInlineFunction(inlineFunction);
			if (result == null)
				result = caseFunDefinition(inlineFunction);
			if (result == null)
				result = caseConstructWithContext(inlineFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.COMPLEX_FUNCTION: {
			ComplexFunction complexFunction = (ComplexFunction) theEObject;
			T result = caseComplexFunction(complexFunction);
			if (result == null)
				result = caseFunDefinition(complexFunction);
			if (result == null)
				result = caseConstructWithContext(complexFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseSymbol(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.FUN_PARAM: {
			FunParam funParam = (FunParam) theEObject;
			T result = caseFunParam(funParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.FUN_CALL: {
			FunCall funCall = (FunCall) theEObject;
			T result = caseFunCall(funCall);
			if (result == null)
				result = caseExpression(funCall);
			if (result == null)
				result = caseStatement(funCall);
			if (result == null)
				result = caseConstructWithContext(funCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = caseConstructWithContext(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseSymbol(variable);
			if (result == null)
				result = caseStatement(variable);
			if (result == null)
				result = caseConstructWithContext(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ASSIGNMENT: {
			Assignment assignment = (Assignment) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = caseStatement(assignment);
			if (result == null)
				result = caseConstructWithContext(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.PRINT_EXPRESSION: {
			PrintExpression printExpression = (PrintExpression) theEObject;
			T result = casePrintExpression(printExpression);
			if (result == null)
				result = caseStatement(printExpression);
			if (result == null)
				result = caseConstructWithContext(printExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = caseConstructWithContext(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseStatement(condition);
			if (result == null)
				result = caseConstructWithContext(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.RETURN: {
			Return return_ = (Return) theEObject;
			T result = caseReturn(return_);
			if (result == null)
				result = caseStatement(return_);
			if (result == null)
				result = caseConstructWithContext(return_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.BREAK_LOOP: {
			BreakLoop breakLoop = (BreakLoop) theEObject;
			T result = caseBreakLoop(breakLoop);
			if (result == null)
				result = caseStatement(breakLoop);
			if (result == null)
				result = caseConstructWithContext(breakLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = caseConstructWithContext(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_EXPRESSION: {
			ArrayExpression arrayExpression = (ArrayExpression) theEObject;
			T result = caseArrayExpression(arrayExpression);
			if (result == null)
				result = caseExpression(arrayExpression);
			if (result == null)
				result = caseStatement(arrayExpression);
			if (result == null)
				result = caseConstructWithContext(arrayExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_STATEMENT: {
			ArrayStatement arrayStatement = (ArrayStatement) theEObject;
			T result = caseArrayStatement(arrayStatement);
			if (result == null)
				result = caseStatement(arrayStatement);
			if (result == null)
				result = caseConstructWithContext(arrayStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_NEW: {
			ArrayNew arrayNew = (ArrayNew) theEObject;
			T result = caseArrayNew(arrayNew);
			if (result == null)
				result = caseArrayExpression(arrayNew);
			if (result == null)
				result = caseExpression(arrayNew);
			if (result == null)
				result = caseStatement(arrayNew);
			if (result == null)
				result = caseConstructWithContext(arrayNew);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_LENGTH: {
			ArrayLength arrayLength = (ArrayLength) theEObject;
			T result = caseArrayLength(arrayLength);
			if (result == null)
				result = caseArrayExpression(arrayLength);
			if (result == null)
				result = caseExpression(arrayLength);
			if (result == null)
				result = caseStatement(arrayLength);
			if (result == null)
				result = caseConstructWithContext(arrayLength);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_GET: {
			ArrayGet arrayGet = (ArrayGet) theEObject;
			T result = caseArrayGet(arrayGet);
			if (result == null)
				result = caseArrayExpression(arrayGet);
			if (result == null)
				result = caseExpression(arrayGet);
			if (result == null)
				result = caseStatement(arrayGet);
			if (result == null)
				result = caseConstructWithContext(arrayGet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_SET: {
			ArraySet arraySet = (ArraySet) theEObject;
			T result = caseArraySet(arraySet);
			if (result == null)
				result = caseArrayStatement(arraySet);
			if (result == null)
				result = caseStatement(arraySet);
			if (result == null)
				result = caseConstructWithContext(arraySet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_ADD: {
			ArrayAdd arrayAdd = (ArrayAdd) theEObject;
			T result = caseArrayAdd(arrayAdd);
			if (result == null)
				result = caseArrayStatement(arrayAdd);
			if (result == null)
				result = caseStatement(arrayAdd);
			if (result == null)
				result = caseConstructWithContext(arrayAdd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.ARRAY_REMOVE: {
			ArrayRemove arrayRemove = (ArrayRemove) theEObject;
			T result = caseArrayRemove(arrayRemove);
			if (result == null)
				result = caseArrayStatement(arrayRemove);
			if (result == null)
				result = caseStatement(arrayRemove);
			if (result == null)
				result = caseConstructWithContext(arrayRemove);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_EXPRESSION: {
			MathExpression mathExpression = (MathExpression) theEObject;
			T result = caseMathExpression(mathExpression);
			if (result == null)
				result = caseExpression(mathExpression);
			if (result == null)
				result = caseStatement(mathExpression);
			if (result == null)
				result = caseConstructWithContext(mathExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_SQRT: {
			MathSqrt mathSqrt = (MathSqrt) theEObject;
			T result = caseMathSqrt(mathSqrt);
			if (result == null)
				result = caseMathExpression(mathSqrt);
			if (result == null)
				result = caseExpression(mathSqrt);
			if (result == null)
				result = caseStatement(mathSqrt);
			if (result == null)
				result = caseConstructWithContext(mathSqrt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_POW: {
			MathPow mathPow = (MathPow) theEObject;
			T result = caseMathPow(mathPow);
			if (result == null)
				result = caseMathExpression(mathPow);
			if (result == null)
				result = caseExpression(mathPow);
			if (result == null)
				result = caseStatement(mathPow);
			if (result == null)
				result = caseConstructWithContext(mathPow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_SIN: {
			MathSin mathSin = (MathSin) theEObject;
			T result = caseMathSin(mathSin);
			if (result == null)
				result = caseMathExpression(mathSin);
			if (result == null)
				result = caseExpression(mathSin);
			if (result == null)
				result = caseStatement(mathSin);
			if (result == null)
				result = caseConstructWithContext(mathSin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_COS: {
			MathCos mathCos = (MathCos) theEObject;
			T result = caseMathCos(mathCos);
			if (result == null)
				result = caseMathExpression(mathCos);
			if (result == null)
				result = caseExpression(mathCos);
			if (result == null)
				result = caseStatement(mathCos);
			if (result == null)
				result = caseConstructWithContext(mathCos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_ABS: {
			MathAbs mathAbs = (MathAbs) theEObject;
			T result = caseMathAbs(mathAbs);
			if (result == null)
				result = caseMathExpression(mathAbs);
			if (result == null)
				result = caseExpression(mathAbs);
			if (result == null)
				result = caseStatement(mathAbs);
			if (result == null)
				result = caseConstructWithContext(mathAbs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MATH_MODULO: {
			MathModulo mathModulo = (MathModulo) theEObject;
			T result = caseMathModulo(mathModulo);
			if (result == null)
				result = caseMathExpression(mathModulo);
			if (result == null)
				result = caseExpression(mathModulo);
			if (result == null)
				result = caseStatement(mathModulo);
			if (result == null)
				result = caseConstructWithContext(mathModulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.EFFECTOR: {
			Effector effector = (Effector) theEObject;
			T result = caseEffector(effector);
			if (result == null)
				result = caseStatement(effector);
			if (result == null)
				result = caseConstructWithContext(effector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MOVE: {
			Move move = (Move) theEObject;
			T result = caseMove(move);
			if (result == null)
				result = caseEffector(move);
			if (result == null)
				result = caseStatement(move);
			if (result == null)
				result = caseConstructWithContext(move);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MOVE_FORWARD: {
			MoveForward moveForward = (MoveForward) theEObject;
			T result = caseMoveForward(moveForward);
			if (result == null)
				result = caseMove(moveForward);
			if (result == null)
				result = caseEffector(moveForward);
			if (result == null)
				result = caseStatement(moveForward);
			if (result == null)
				result = caseConstructWithContext(moveForward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MOVE_BACKWARD: {
			MoveBackward moveBackward = (MoveBackward) theEObject;
			T result = caseMoveBackward(moveBackward);
			if (result == null)
				result = caseMove(moveBackward);
			if (result == null)
				result = caseEffector(moveBackward);
			if (result == null)
				result = caseStatement(moveBackward);
			if (result == null)
				result = caseConstructWithContext(moveBackward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.TURN: {
			Turn turn = (Turn) theEObject;
			T result = caseTurn(turn);
			if (result == null)
				result = caseEffector(turn);
			if (result == null)
				result = caseStatement(turn);
			if (result == null)
				result = caseConstructWithContext(turn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.TURN_LEFT: {
			TurnLeft turnLeft = (TurnLeft) theEObject;
			T result = caseTurnLeft(turnLeft);
			if (result == null)
				result = caseTurn(turnLeft);
			if (result == null)
				result = caseEffector(turnLeft);
			if (result == null)
				result = caseStatement(turnLeft);
			if (result == null)
				result = caseConstructWithContext(turnLeft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.TURN_RIGHT: {
			TurnRight turnRight = (TurnRight) theEObject;
			T result = caseTurnRight(turnRight);
			if (result == null)
				result = caseTurn(turnRight);
			if (result == null)
				result = caseEffector(turnRight);
			if (result == null)
				result = caseStatement(turnRight);
			if (result == null)
				result = caseConstructWithContext(turnRight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SPEED: {
			Speed speed = (Speed) theEObject;
			T result = caseSpeed(speed);
			if (result == null)
				result = caseEffector(speed);
			if (result == null)
				result = caseStatement(speed);
			if (result == null)
				result = caseConstructWithContext(speed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SET_NOMINAL_SPEED: {
			SetNominalSpeed setNominalSpeed = (SetNominalSpeed) theEObject;
			T result = caseSetNominalSpeed(setNominalSpeed);
			if (result == null)
				result = caseSpeed(setNominalSpeed);
			if (result == null)
				result = caseEffector(setNominalSpeed);
			if (result == null)
				result = caseStatement(setNominalSpeed);
			if (result == null)
				result = caseConstructWithContext(setNominalSpeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.GET_MAX_SPEED: {
			GetMaxSpeed getMaxSpeed = (GetMaxSpeed) theEObject;
			T result = caseGetMaxSpeed(getMaxSpeed);
			if (result == null)
				result = caseSpeed(getMaxSpeed);
			if (result == null)
				result = caseEffector(getMaxSpeed);
			if (result == null)
				result = caseStatement(getMaxSpeed);
			if (result == null)
				result = caseConstructWithContext(getMaxSpeed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseExpression(sensor);
			if (result == null)
				result = caseStatement(sensor);
			if (result == null)
				result = caseConstructWithContext(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSE_TIME: {
			SenseTime senseTime = (SenseTime) theEObject;
			T result = caseSenseTime(senseTime);
			if (result == null)
				result = caseSensor(senseTime);
			if (result == null)
				result = caseExpression(senseTime);
			if (result == null)
				result = caseStatement(senseTime);
			if (result == null)
				result = caseConstructWithContext(senseTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSE_BATTERY: {
			SenseBattery senseBattery = (SenseBattery) theEObject;
			T result = caseSenseBattery(senseBattery);
			if (result == null)
				result = caseSensor(senseBattery);
			if (result == null)
				result = caseExpression(senseBattery);
			if (result == null)
				result = caseStatement(senseBattery);
			if (result == null)
				result = caseConstructWithContext(senseBattery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSE_POSITION: {
			SensePosition sensePosition = (SensePosition) theEObject;
			T result = caseSensePosition(sensePosition);
			if (result == null)
				result = caseSensor(sensePosition);
			if (result == null)
				result = caseExpression(sensePosition);
			if (result == null)
				result = caseStatement(sensePosition);
			if (result == null)
				result = caseConstructWithContext(sensePosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSE_DISTANCE: {
			SenseDistance senseDistance = (SenseDistance) theEObject;
			T result = caseSenseDistance(senseDistance);
			if (result == null)
				result = caseSensor(senseDistance);
			if (result == null)
				result = caseExpression(senseDistance);
			if (result == null)
				result = caseStatement(senseDistance);
			if (result == null)
				result = caseConstructWithContext(senseDistance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SENSE_COMPASS: {
			SenseCompass senseCompass = (SenseCompass) theEObject;
			T result = caseSenseCompass(senseCompass);
			if (result == null)
				result = caseSensor(senseCompass);
			if (result == null)
				result = caseExpression(senseCompass);
			if (result == null)
				result = caseStatement(senseCompass);
			if (result == null)
				result = caseConstructWithContext(senseCompass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.TRADE_OFF: {
			TradeOff tradeOff = (TradeOff) theEObject;
			T result = caseTradeOff(tradeOff);
			if (result == null)
				result = caseStatement(tradeOff);
			if (result == null)
				result = caseConstructWithContext(tradeOff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.FUN_PARAM_EXP: {
			FunParamExp funParamExp = (FunParamExp) theEObject;
			T result = caseFunParamExp(funParamExp);
			if (result == null)
				result = caseFunParam(funParamExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.FUN_PARAM_CAPTURE: {
			FunParamCapture funParamCapture = (FunParamCapture) theEObject;
			T result = caseFunParamCapture(funParamCapture);
			if (result == null)
				result = caseFunParam(funParamCapture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBinOp(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = caseStatement(or);
			if (result == null)
				result = caseConstructWithContext(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBinOp(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = caseStatement(and);
			if (result == null)
				result = caseConstructWithContext(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.EQUALITY: {
			Equality equality = (Equality) theEObject;
			T result = caseEquality(equality);
			if (result == null)
				result = caseBinOp(equality);
			if (result == null)
				result = caseExpression(equality);
			if (result == null)
				result = caseStatement(equality);
			if (result == null)
				result = caseConstructWithContext(equality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.INEQUALITY: {
			Inequality inequality = (Inequality) theEObject;
			T result = caseInequality(inequality);
			if (result == null)
				result = caseBinOp(inequality);
			if (result == null)
				result = caseExpression(inequality);
			if (result == null)
				result = caseStatement(inequality);
			if (result == null)
				result = caseConstructWithContext(inequality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.GREATER_EQ: {
			GreaterEq greaterEq = (GreaterEq) theEObject;
			T result = caseGreaterEq(greaterEq);
			if (result == null)
				result = caseBinOp(greaterEq);
			if (result == null)
				result = caseExpression(greaterEq);
			if (result == null)
				result = caseStatement(greaterEq);
			if (result == null)
				result = caseConstructWithContext(greaterEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.LESS_EQ: {
			LessEq lessEq = (LessEq) theEObject;
			T result = caseLessEq(lessEq);
			if (result == null)
				result = caseBinOp(lessEq);
			if (result == null)
				result = caseExpression(lessEq);
			if (result == null)
				result = caseStatement(lessEq);
			if (result == null)
				result = caseConstructWithContext(lessEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseBinOp(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = caseStatement(greater);
			if (result == null)
				result = caseConstructWithContext(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.LESS: {
			Less less = (Less) theEObject;
			T result = caseLess(less);
			if (result == null)
				result = caseBinOp(less);
			if (result == null)
				result = caseExpression(less);
			if (result == null)
				result = caseStatement(less);
			if (result == null)
				result = caseConstructWithContext(less);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseBinOp(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = caseStatement(plus);
			if (result == null)
				result = caseConstructWithContext(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseBinOp(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = caseStatement(minus);
			if (result == null)
				result = caseConstructWithContext(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.MULTIPLY: {
			Multiply multiply = (Multiply) theEObject;
			T result = caseMultiply(multiply);
			if (result == null)
				result = caseBinOp(multiply);
			if (result == null)
				result = caseExpression(multiply);
			if (result == null)
				result = caseStatement(multiply);
			if (result == null)
				result = caseConstructWithContext(multiply);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.DIVIDE: {
			Divide divide = (Divide) theEObject;
			T result = caseDivide(divide);
			if (result == null)
				result = caseBinOp(divide);
			if (result == null)
				result = caseExpression(divide);
			if (result == null)
				result = caseStatement(divide);
			if (result == null)
				result = caseConstructWithContext(divide);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = caseStatement(not);
			if (result == null)
				result = caseConstructWithContext(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.INT_CONSTANT: {
			IntConstant intConstant = (IntConstant) theEObject;
			T result = caseIntConstant(intConstant);
			if (result == null)
				result = caseExpression(intConstant);
			if (result == null)
				result = caseStatement(intConstant);
			if (result == null)
				result = caseConstructWithContext(intConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.DOUBLE_CONSTANT: {
			DoubleConstant doubleConstant = (DoubleConstant) theEObject;
			T result = caseDoubleConstant(doubleConstant);
			if (result == null)
				result = caseExpression(doubleConstant);
			if (result == null)
				result = caseStatement(doubleConstant);
			if (result == null)
				result = caseConstructWithContext(doubleConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.STRING_CONSTANT: {
			StringConstant stringConstant = (StringConstant) theEObject;
			T result = caseStringConstant(stringConstant);
			if (result == null)
				result = caseExpression(stringConstant);
			if (result == null)
				result = caseStatement(stringConstant);
			if (result == null)
				result = caseConstructWithContext(stringConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.BOOL_CONSTANT: {
			BoolConstant boolConstant = (BoolConstant) theEObject;
			T result = caseBoolConstant(boolConstant);
			if (result == null)
				result = caseExpression(boolConstant);
			if (result == null)
				result = caseStatement(boolConstant);
			if (result == null)
				result = caseConstructWithContext(boolConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.SYMBOL_REF: {
			SymbolRef symbolRef = (SymbolRef) theEObject;
			T result = caseSymbolRef(symbolRef);
			if (result == null)
				result = caseExpression(symbolRef);
			if (result == null)
				result = caseStatement(symbolRef);
			if (result == null)
				result = caseConstructWithContext(symbolRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.BIN_OP: {
			BinOp binOp = (BinOp) theEObject;
			T result = caseBinOp(binOp);
			if (result == null)
				result = caseExpression(binOp);
			if (result == null)
				result = caseStatement(binOp);
			if (result == null)
				result = caseConstructWithContext(binOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobLANG_ASOSPackage.CONSTRUCT_WITH_CONTEXT: {
			ConstructWithContext constructWithContext = (ConstructWithContext) theEObject;
			T result = caseConstructWithContext(constructWithContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunDefinition(FunDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineFunction(InlineFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFunction(ComplexFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunParam(FunParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunCall(FunCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintExpression(PrintExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakLoop(BreakLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayExpression(ArrayExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayStatement(ArrayStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array New</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array New</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayNew(ArrayNew object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLength(ArrayLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayGet(ArrayGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySet(ArraySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAdd(ArrayAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayRemove(ArrayRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathExpression(MathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Sqrt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Sqrt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathSqrt(MathSqrt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Pow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Pow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathPow(MathPow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Sin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Sin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathSin(MathSin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Cos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Cos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathCos(MathCos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Abs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Abs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathAbs(MathAbs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathModulo(MathModulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffector(Effector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveForward(MoveForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveBackward(MoveBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnLeft(TurnLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnRight(TurnRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeed(Speed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Nominal Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Nominal Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetNominalSpeed(SetNominalSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Max Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Max Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMaxSpeed(GetMaxSpeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseTime(SenseTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseBattery(SenseBattery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensePosition(SensePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseDistance(SenseDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Compass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Compass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseCompass(SenseCompass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradeOff(TradeOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Param Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Param Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunParamExp(FunParamExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fun Param Capture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fun Param Capture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunParamCapture(FunParamCapture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquality(Equality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inequality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inequality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInequality(Inequality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEq(GreaterEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEq(LessEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstant(IntConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleConstant(DoubleConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolConstant(BoolConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolRef(SymbolRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinOp(BinOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct With Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct With Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructWithContext(ConstructWithContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobLANG_ASOSSwitch
