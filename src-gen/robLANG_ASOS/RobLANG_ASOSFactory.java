/**
 */
package robLANG_ASOS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.RobLANG_ASOSPackage
 * @generated
 */
public interface RobLANG_ASOSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobLANG_ASOSFactory eINSTANCE = robLANG_ASOS.impl.RobLANG_ASOSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Inline Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Function</em>'.
	 * @generated
	 */
	InlineFunction createInlineFunction();

	/**
	 * Returns a new object of class '<em>Complex Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Function</em>'.
	 * @generated
	 */
	ComplexFunction createComplexFunction();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Fun Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fun Call</em>'.
	 * @generated
	 */
	FunCall createFunCall();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Print Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Expression</em>'.
	 * @generated
	 */
	PrintExpression createPrintExpression();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Break Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Loop</em>'.
	 * @generated
	 */
	BreakLoop createBreakLoop();

	/**
	 * Returns a new object of class '<em>Array Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Expression</em>'.
	 * @generated
	 */
	ArrayExpression createArrayExpression();

	/**
	 * Returns a new object of class '<em>Array Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Statement</em>'.
	 * @generated
	 */
	ArrayStatement createArrayStatement();

	/**
	 * Returns a new object of class '<em>Array New</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array New</em>'.
	 * @generated
	 */
	ArrayNew createArrayNew();

	/**
	 * Returns a new object of class '<em>Array Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Length</em>'.
	 * @generated
	 */
	ArrayLength createArrayLength();

	/**
	 * Returns a new object of class '<em>Array Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Get</em>'.
	 * @generated
	 */
	ArrayGet createArrayGet();

	/**
	 * Returns a new object of class '<em>Array Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Set</em>'.
	 * @generated
	 */
	ArraySet createArraySet();

	/**
	 * Returns a new object of class '<em>Array Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Add</em>'.
	 * @generated
	 */
	ArrayAdd createArrayAdd();

	/**
	 * Returns a new object of class '<em>Array Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Remove</em>'.
	 * @generated
	 */
	ArrayRemove createArrayRemove();

	/**
	 * Returns a new object of class '<em>Math Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Expression</em>'.
	 * @generated
	 */
	MathExpression createMathExpression();

	/**
	 * Returns a new object of class '<em>Math Sqrt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Sqrt</em>'.
	 * @generated
	 */
	MathSqrt createMathSqrt();

	/**
	 * Returns a new object of class '<em>Math Pow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Pow</em>'.
	 * @generated
	 */
	MathPow createMathPow();

	/**
	 * Returns a new object of class '<em>Math Sin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Sin</em>'.
	 * @generated
	 */
	MathSin createMathSin();

	/**
	 * Returns a new object of class '<em>Math Cos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Cos</em>'.
	 * @generated
	 */
	MathCos createMathCos();

	/**
	 * Returns a new object of class '<em>Math Abs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Abs</em>'.
	 * @generated
	 */
	MathAbs createMathAbs();

	/**
	 * Returns a new object of class '<em>Math Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Modulo</em>'.
	 * @generated
	 */
	MathModulo createMathModulo();

	/**
	 * Returns a new object of class '<em>Effector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effector</em>'.
	 * @generated
	 */
	Effector createEffector();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Move Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward</em>'.
	 * @generated
	 */
	MoveForward createMoveForward();

	/**
	 * Returns a new object of class '<em>Move Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Backward</em>'.
	 * @generated
	 */
	MoveBackward createMoveBackward();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Left</em>'.
	 * @generated
	 */
	TurnLeft createTurnLeft();

	/**
	 * Returns a new object of class '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Right</em>'.
	 * @generated
	 */
	TurnRight createTurnRight();

	/**
	 * Returns a new object of class '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed</em>'.
	 * @generated
	 */
	Speed createSpeed();

	/**
	 * Returns a new object of class '<em>Set Nominal Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Nominal Speed</em>'.
	 * @generated
	 */
	SetNominalSpeed createSetNominalSpeed();

	/**
	 * Returns a new object of class '<em>Get Max Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Max Speed</em>'.
	 * @generated
	 */
	GetMaxSpeed createGetMaxSpeed();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Sense Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Time</em>'.
	 * @generated
	 */
	SenseTime createSenseTime();

	/**
	 * Returns a new object of class '<em>Sense Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Battery</em>'.
	 * @generated
	 */
	SenseBattery createSenseBattery();

	/**
	 * Returns a new object of class '<em>Sense Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Position</em>'.
	 * @generated
	 */
	SensePosition createSensePosition();

	/**
	 * Returns a new object of class '<em>Sense Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Distance</em>'.
	 * @generated
	 */
	SenseDistance createSenseDistance();

	/**
	 * Returns a new object of class '<em>Sense Compass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Compass</em>'.
	 * @generated
	 */
	SenseCompass createSenseCompass();

	/**
	 * Returns a new object of class '<em>Trade Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Off</em>'.
	 * @generated
	 */
	TradeOff createTradeOff();

	/**
	 * Returns a new object of class '<em>Fun Param Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fun Param Exp</em>'.
	 * @generated
	 */
	FunParamExp createFunParamExp();

	/**
	 * Returns a new object of class '<em>Fun Param Capture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fun Param Capture</em>'.
	 * @generated
	 */
	FunParamCapture createFunParamCapture();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality</em>'.
	 * @generated
	 */
	Equality createEquality();

	/**
	 * Returns a new object of class '<em>Inequality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inequality</em>'.
	 * @generated
	 */
	Inequality createInequality();

	/**
	 * Returns a new object of class '<em>Greater Eq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Eq</em>'.
	 * @generated
	 */
	GreaterEq createGreaterEq();

	/**
	 * Returns a new object of class '<em>Less Eq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Eq</em>'.
	 * @generated
	 */
	LessEq createLessEq();

	/**
	 * Returns a new object of class '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater</em>'.
	 * @generated
	 */
	Greater createGreater();

	/**
	 * Returns a new object of class '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less</em>'.
	 * @generated
	 */
	Less createLess();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus</em>'.
	 * @generated
	 */
	Minus createMinus();

	/**
	 * Returns a new object of class '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply</em>'.
	 * @generated
	 */
	Multiply createMultiply();

	/**
	 * Returns a new object of class '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide</em>'.
	 * @generated
	 */
	Divide createDivide();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Constant</em>'.
	 * @generated
	 */
	IntConstant createIntConstant();

	/**
	 * Returns a new object of class '<em>Double Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Constant</em>'.
	 * @generated
	 */
	DoubleConstant createDoubleConstant();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Constant</em>'.
	 * @generated
	 */
	BoolConstant createBoolConstant();

	/**
	 * Returns a new object of class '<em>Symbol Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Ref</em>'.
	 * @generated
	 */
	SymbolRef createSymbolRef();

	/**
	 * Returns a new object of class '<em>Construct With Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Construct With Context</em>'.
	 * @generated
	 */
	ConstructWithContext createConstructWithContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobLANG_ASOSPackage getRobLANG_ASOSPackage();

} //RobLANG_ASOSFactory
