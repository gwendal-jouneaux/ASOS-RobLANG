/**
 */
package robLANG_ASOS.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robLANG_ASOS.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.RobLANG_ASOSPackage
 * @generated
 */
public class RobLANG_ASOSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobLANG_ASOSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobLANG_ASOSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobLANG_ASOSPackage.eINSTANCE;
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
	protected RobLANG_ASOSSwitch<Adapter> modelSwitch = new RobLANG_ASOSSwitch<Adapter>() {
		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseSymbol(Symbol object) {
			return createSymbolAdapter();
		}

		@Override
		public Adapter caseFunDefinition(FunDefinition object) {
			return createFunDefinitionAdapter();
		}

		@Override
		public Adapter caseInlineFunction(InlineFunction object) {
			return createInlineFunctionAdapter();
		}

		@Override
		public Adapter caseComplexFunction(ComplexFunction object) {
			return createComplexFunctionAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseFunParam(FunParam object) {
			return createFunParamAdapter();
		}

		@Override
		public Adapter caseFunCall(FunCall object) {
			return createFunCallAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseAssignment(Assignment object) {
			return createAssignmentAdapter();
		}

		@Override
		public Adapter casePrintExpression(PrintExpression object) {
			return createPrintExpressionAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseReturn(Return object) {
			return createReturnAdapter();
		}

		@Override
		public Adapter caseBreakLoop(BreakLoop object) {
			return createBreakLoopAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseArrayExpression(ArrayExpression object) {
			return createArrayExpressionAdapter();
		}

		@Override
		public Adapter caseArrayStatement(ArrayStatement object) {
			return createArrayStatementAdapter();
		}

		@Override
		public Adapter caseArrayNew(ArrayNew object) {
			return createArrayNewAdapter();
		}

		@Override
		public Adapter caseArrayLength(ArrayLength object) {
			return createArrayLengthAdapter();
		}

		@Override
		public Adapter caseArrayGet(ArrayGet object) {
			return createArrayGetAdapter();
		}

		@Override
		public Adapter caseArraySet(ArraySet object) {
			return createArraySetAdapter();
		}

		@Override
		public Adapter caseArrayAdd(ArrayAdd object) {
			return createArrayAddAdapter();
		}

		@Override
		public Adapter caseArrayRemove(ArrayRemove object) {
			return createArrayRemoveAdapter();
		}

		@Override
		public Adapter caseMathExpression(MathExpression object) {
			return createMathExpressionAdapter();
		}

		@Override
		public Adapter caseMathSqrt(MathSqrt object) {
			return createMathSqrtAdapter();
		}

		@Override
		public Adapter caseMathPow(MathPow object) {
			return createMathPowAdapter();
		}

		@Override
		public Adapter caseMathSin(MathSin object) {
			return createMathSinAdapter();
		}

		@Override
		public Adapter caseMathCos(MathCos object) {
			return createMathCosAdapter();
		}

		@Override
		public Adapter caseMathAbs(MathAbs object) {
			return createMathAbsAdapter();
		}

		@Override
		public Adapter caseMathModulo(MathModulo object) {
			return createMathModuloAdapter();
		}

		@Override
		public Adapter caseEffector(Effector object) {
			return createEffectorAdapter();
		}

		@Override
		public Adapter caseMove(Move object) {
			return createMoveAdapter();
		}

		@Override
		public Adapter caseMoveForward(MoveForward object) {
			return createMoveForwardAdapter();
		}

		@Override
		public Adapter caseMoveBackward(MoveBackward object) {
			return createMoveBackwardAdapter();
		}

		@Override
		public Adapter caseTurn(Turn object) {
			return createTurnAdapter();
		}

		@Override
		public Adapter caseTurnLeft(TurnLeft object) {
			return createTurnLeftAdapter();
		}

		@Override
		public Adapter caseTurnRight(TurnRight object) {
			return createTurnRightAdapter();
		}

		@Override
		public Adapter caseSpeed(Speed object) {
			return createSpeedAdapter();
		}

		@Override
		public Adapter caseSetNominalSpeed(SetNominalSpeed object) {
			return createSetNominalSpeedAdapter();
		}

		@Override
		public Adapter caseGetMaxSpeed(GetMaxSpeed object) {
			return createGetMaxSpeedAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseSenseTime(SenseTime object) {
			return createSenseTimeAdapter();
		}

		@Override
		public Adapter caseSenseBattery(SenseBattery object) {
			return createSenseBatteryAdapter();
		}

		@Override
		public Adapter caseSensePosition(SensePosition object) {
			return createSensePositionAdapter();
		}

		@Override
		public Adapter caseSenseDistance(SenseDistance object) {
			return createSenseDistanceAdapter();
		}

		@Override
		public Adapter caseSenseCompass(SenseCompass object) {
			return createSenseCompassAdapter();
		}

		@Override
		public Adapter caseTradeOff(TradeOff object) {
			return createTradeOffAdapter();
		}

		@Override
		public Adapter caseFunParamExp(FunParamExp object) {
			return createFunParamExpAdapter();
		}

		@Override
		public Adapter caseFunParamCapture(FunParamCapture object) {
			return createFunParamCaptureAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseEquality(Equality object) {
			return createEqualityAdapter();
		}

		@Override
		public Adapter caseInequality(Inequality object) {
			return createInequalityAdapter();
		}

		@Override
		public Adapter caseGreaterEq(GreaterEq object) {
			return createGreaterEqAdapter();
		}

		@Override
		public Adapter caseLessEq(LessEq object) {
			return createLessEqAdapter();
		}

		@Override
		public Adapter caseGreater(Greater object) {
			return createGreaterAdapter();
		}

		@Override
		public Adapter caseLess(Less object) {
			return createLessAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseMultiply(Multiply object) {
			return createMultiplyAdapter();
		}

		@Override
		public Adapter caseDivide(Divide object) {
			return createDivideAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseIntConstant(IntConstant object) {
			return createIntConstantAdapter();
		}

		@Override
		public Adapter caseDoubleConstant(DoubleConstant object) {
			return createDoubleConstantAdapter();
		}

		@Override
		public Adapter caseStringConstant(StringConstant object) {
			return createStringConstantAdapter();
		}

		@Override
		public Adapter caseBoolConstant(BoolConstant object) {
			return createBoolConstantAdapter();
		}

		@Override
		public Adapter caseSymbolRef(SymbolRef object) {
			return createSymbolRefAdapter();
		}

		@Override
		public Adapter caseBinOp(BinOp object) {
			return createBinOpAdapter();
		}

		@Override
		public Adapter caseConstructWithContext(ConstructWithContext object) {
			return createConstructWithContextAdapter();
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
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.FunDefinition <em>Fun Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.FunDefinition
	 * @generated
	 */
	public Adapter createFunDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.InlineFunction <em>Inline Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.InlineFunction
	 * @generated
	 */
	public Adapter createInlineFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ComplexFunction <em>Complex Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ComplexFunction
	 * @generated
	 */
	public Adapter createComplexFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.FunParam <em>Fun Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.FunParam
	 * @generated
	 */
	public Adapter createFunParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.FunCall
	 * @generated
	 */
	public Adapter createFunCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.PrintExpression <em>Print Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.PrintExpression
	 * @generated
	 */
	public Adapter createPrintExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.BreakLoop <em>Break Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.BreakLoop
	 * @generated
	 */
	public Adapter createBreakLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayExpression <em>Array Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayExpression
	 * @generated
	 */
	public Adapter createArrayExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayStatement <em>Array Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayStatement
	 * @generated
	 */
	public Adapter createArrayStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayNew <em>Array New</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayNew
	 * @generated
	 */
	public Adapter createArrayNewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayLength <em>Array Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayLength
	 * @generated
	 */
	public Adapter createArrayLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayGet <em>Array Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayGet
	 * @generated
	 */
	public Adapter createArrayGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArraySet <em>Array Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArraySet
	 * @generated
	 */
	public Adapter createArraySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayAdd <em>Array Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayAdd
	 * @generated
	 */
	public Adapter createArrayAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ArrayRemove <em>Array Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ArrayRemove
	 * @generated
	 */
	public Adapter createArrayRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathExpression <em>Math Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathExpression
	 * @generated
	 */
	public Adapter createMathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathSqrt <em>Math Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathSqrt
	 * @generated
	 */
	public Adapter createMathSqrtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathPow <em>Math Pow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathPow
	 * @generated
	 */
	public Adapter createMathPowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathSin <em>Math Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathSin
	 * @generated
	 */
	public Adapter createMathSinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathCos <em>Math Cos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathCos
	 * @generated
	 */
	public Adapter createMathCosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathAbs <em>Math Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathAbs
	 * @generated
	 */
	public Adapter createMathAbsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MathModulo <em>Math Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MathModulo
	 * @generated
	 */
	public Adapter createMathModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Effector <em>Effector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Effector
	 * @generated
	 */
	public Adapter createEffectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MoveForward
	 * @generated
	 */
	public Adapter createMoveForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.MoveBackward <em>Move Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.MoveBackward
	 * @generated
	 */
	public Adapter createMoveBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.TurnLeft
	 * @generated
	 */
	public Adapter createTurnLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.TurnRight
	 * @generated
	 */
	public Adapter createTurnRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Speed
	 * @generated
	 */
	public Adapter createSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SetNominalSpeed <em>Set Nominal Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SetNominalSpeed
	 * @generated
	 */
	public Adapter createSetNominalSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.GetMaxSpeed <em>Get Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.GetMaxSpeed
	 * @generated
	 */
	public Adapter createGetMaxSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SenseTime <em>Sense Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SenseTime
	 * @generated
	 */
	public Adapter createSenseTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SenseBattery <em>Sense Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SenseBattery
	 * @generated
	 */
	public Adapter createSenseBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SensePosition <em>Sense Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SensePosition
	 * @generated
	 */
	public Adapter createSensePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SenseDistance <em>Sense Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SenseDistance
	 * @generated
	 */
	public Adapter createSenseDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SenseCompass <em>Sense Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SenseCompass
	 * @generated
	 */
	public Adapter createSenseCompassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.TradeOff <em>Trade Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.TradeOff
	 * @generated
	 */
	public Adapter createTradeOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.FunParamExp <em>Fun Param Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.FunParamExp
	 * @generated
	 */
	public Adapter createFunParamExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.FunParamCapture <em>Fun Param Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.FunParamCapture
	 * @generated
	 */
	public Adapter createFunParamCaptureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Inequality
	 * @generated
	 */
	public Adapter createInequalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.GreaterEq <em>Greater Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.GreaterEq
	 * @generated
	 */
	public Adapter createGreaterEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.LessEq <em>Less Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.LessEq
	 * @generated
	 */
	public Adapter createLessEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.DoubleConstant <em>Double Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.DoubleConstant
	 * @generated
	 */
	public Adapter createDoubleConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.SymbolRef
	 * @generated
	 */
	public Adapter createSymbolRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.BinOp
	 * @generated
	 */
	public Adapter createBinOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robLANG_ASOS.ConstructWithContext <em>Construct With Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robLANG_ASOS.ConstructWithContext
	 * @generated
	 */
	public Adapter createConstructWithContextAdapter() {
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

} //RobLANG_ASOSAdapterFactory
