package robLANG_ASOS.interpreter;

public class RobLANG_ASOSVisitor implements fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor {
	public Object visitReturn(robLANG_ASOS.Return node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.ReturnOp()).execute(this,node,execCtx,config);}
	public Object visitCondition(robLANG_ASOS.Condition node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.ConditionOp()).execute(this,node,execCtx,config);}
	public Object visitEquality(robLANG_ASOS.Equality node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.EqualityOp()).execute(this,node,execCtx,config);}
	public Object visitFunCall(robLANG_ASOS.FunCall node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.FunCallOp()).execute(this,node,execCtx,config);}
	public Object visitInlineFunction(robLANG_ASOS.InlineFunction node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.InlineFunctionOp()).execute(this,node,execCtx,config);}
	public Object visitRobot(robLANG_ASOS.Robot node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.RobotOp()).execute(this,node,execCtx,config);}
	public Object visitGreater(robLANG_ASOS.Greater node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.GreaterOp()).execute(this,node,execCtx,config);}
	public Object visitDivide(robLANG_ASOS.Divide node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.DivideOp()).execute(this,node,execCtx,config);}
	public Object visitVariable(robLANG_ASOS.Variable node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.VariableOp()).execute(this,node,execCtx,config);}
	public Object visitInequality(robLANG_ASOS.Inequality node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.InequalityOp()).execute(this,node,execCtx,config);}
	public Object visitTurnRight(robLANG_ASOS.TurnRight node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.TurnRightOp()).execute(this,node,execCtx,config);}
	public Object visitPrintExpression(robLANG_ASOS.PrintExpression node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.PrintExpressionOp()).execute(this,node,execCtx,config);}
	public Object visitMultiply(robLANG_ASOS.Multiply node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.MultiplyOp()).execute(this,node,execCtx,config);}
	public Object visitSenseCompass(robLANG_ASOS.SenseCompass node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SenseCompassOp()).execute(this,node,execCtx,config);}
	public Object visitMoveForward(robLANG_ASOS.MoveForward node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.MoveForwardOp()).execute(this,node,execCtx,config);}
	public Object visitSenseDistance(robLANG_ASOS.SenseDistance node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SenseDistanceOp()).execute(this,node,execCtx,config);}
	public Object visitSensePosition(robLANG_ASOS.SensePosition node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SensePositionOp()).execute(this,node,execCtx,config);}
	public Object visitAssignment(robLANG_ASOS.Assignment node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.AssignmentOp()).execute(this,node,execCtx,config);}
	public Object visitSenseTime(robLANG_ASOS.SenseTime node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SenseTimeOp()).execute(this,node,execCtx,config);}
	public Object visitBlock(robLANG_ASOS.Block node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.BlockOp()).execute(this,node,execCtx,config);}
	public Object visitLess(robLANG_ASOS.Less node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.LessOp()).execute(this,node,execCtx,config);}
	public Object visitLoop(robLANG_ASOS.Loop node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.LoopOp()).execute(this,node,execCtx,config);}
	public Object visitLessEq(robLANG_ASOS.LessEq node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.LessEqOp()).execute(this,node,execCtx,config);}
	public Object visitSenseBattery(robLANG_ASOS.SenseBattery node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SenseBatteryOp()).execute(this,node,execCtx,config);}
	public Object visitTurnLeft(robLANG_ASOS.TurnLeft node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.TurnLeftOp()).execute(this,node,execCtx,config);}
	public Object visitMinus(robLANG_ASOS.Minus node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.MinusOp()).execute(this,node,execCtx,config);}
	public Object visitSetNominalSpeed(robLANG_ASOS.SetNominalSpeed node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SetNominalSpeedOp()).execute(this,node,execCtx,config);}
	public Object visitNot(robLANG_ASOS.Not node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.NotOp()).execute(this,node,execCtx,config);}
	public Object visitBreakLoop(robLANG_ASOS.BreakLoop node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.BreakLoopOp()).execute(this,node,execCtx,config);}
	public Object visitAnd(robLANG_ASOS.And node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.AndOp()).execute(this,node,execCtx,config);}
	public Object visitSymbolRef(robLANG_ASOS.SymbolRef node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.SymbolRefOp()).execute(this,node,execCtx,config);}
	public Object visitPlus(robLANG_ASOS.Plus node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.PlusOp()).execute(this,node,execCtx,config);}
	public Object visitMoveBackward(robLANG_ASOS.MoveBackward node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.MoveBackwardOp()).execute(this,node,execCtx,config);}
	public Object visitIntConstant(robLANG_ASOS.IntConstant node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.IntConstantOp()).execute(this,node,execCtx,config);}
	public Object visitOr(robLANG_ASOS.Or node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.OrOp()).execute(this,node,execCtx,config);}
	public Object visitComplexFunction(robLANG_ASOS.ComplexFunction node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.ComplexFunctionOp()).execute(this,node,execCtx,config);}
	public Object visitBoolConstant(robLANG_ASOS.BoolConstant node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.BoolConstantOp()).execute(this,node,execCtx,config);}
	public Object visitDoubleConstant(robLANG_ASOS.DoubleConstant node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.DoubleConstantOp()).execute(this,node,execCtx,config);}
	public Object visitStringConstant(robLANG_ASOS.StringConstant node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.StringConstantOp()).execute(this,node,execCtx,config);}
	public Object visitGreaterEq(robLANG_ASOS.GreaterEq node, Object execCtx, robLANG_ASOS.interfaces.robLANG_ASOSInterface config){ return (new robLANG_ASOS.operations.GreaterEqOp()).execute(this,node,execCtx,config);}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.Node node, Object executionCtx){
		return null;
	}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.AdaptableNode node, Object executionCtx, fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface config){
		if(node instanceof robLANG_ASOS.Return){
			return visitReturn((robLANG_ASOS.Return) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Condition){
			return visitCondition((robLANG_ASOS.Condition) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Equality){
			return visitEquality((robLANG_ASOS.Equality) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.FunCall){
			return visitFunCall((robLANG_ASOS.FunCall) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.InlineFunction){
			return visitInlineFunction((robLANG_ASOS.InlineFunction) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Robot){
			return visitRobot((robLANG_ASOS.Robot) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Greater){
			return visitGreater((robLANG_ASOS.Greater) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Divide){
			return visitDivide((robLANG_ASOS.Divide) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Variable){
			return visitVariable((robLANG_ASOS.Variable) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Inequality){
			return visitInequality((robLANG_ASOS.Inequality) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.TurnRight){
			return visitTurnRight((robLANG_ASOS.TurnRight) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.PrintExpression){
			return visitPrintExpression((robLANG_ASOS.PrintExpression) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Multiply){
			return visitMultiply((robLANG_ASOS.Multiply) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SenseCompass){
			return visitSenseCompass((robLANG_ASOS.SenseCompass) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.MoveForward){
			return visitMoveForward((robLANG_ASOS.MoveForward) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SenseDistance){
			return visitSenseDistance((robLANG_ASOS.SenseDistance) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SensePosition){
			return visitSensePosition((robLANG_ASOS.SensePosition) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Assignment){
			return visitAssignment((robLANG_ASOS.Assignment) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SenseTime){
			return visitSenseTime((robLANG_ASOS.SenseTime) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Block){
			return visitBlock((robLANG_ASOS.Block) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Less){
			return visitLess((robLANG_ASOS.Less) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Loop){
			return visitLoop((robLANG_ASOS.Loop) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.LessEq){
			return visitLessEq((robLANG_ASOS.LessEq) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SenseBattery){
			return visitSenseBattery((robLANG_ASOS.SenseBattery) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.TurnLeft){
			return visitTurnLeft((robLANG_ASOS.TurnLeft) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Minus){
			return visitMinus((robLANG_ASOS.Minus) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SetNominalSpeed){
			return visitSetNominalSpeed((robLANG_ASOS.SetNominalSpeed) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Not){
			return visitNot((robLANG_ASOS.Not) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.BreakLoop){
			return visitBreakLoop((robLANG_ASOS.BreakLoop) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.And){
			return visitAnd((robLANG_ASOS.And) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.SymbolRef){
			return visitSymbolRef((robLANG_ASOS.SymbolRef) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Plus){
			return visitPlus((robLANG_ASOS.Plus) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.MoveBackward){
			return visitMoveBackward((robLANG_ASOS.MoveBackward) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.IntConstant){
			return visitIntConstant((robLANG_ASOS.IntConstant) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.Or){
			return visitOr((robLANG_ASOS.Or) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.ComplexFunction){
			return visitComplexFunction((robLANG_ASOS.ComplexFunction) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.BoolConstant){
			return visitBoolConstant((robLANG_ASOS.BoolConstant) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.DoubleConstant){
			return visitDoubleConstant((robLANG_ASOS.DoubleConstant) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.StringConstant){
			return visitStringConstant((robLANG_ASOS.StringConstant) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		if(node instanceof robLANG_ASOS.GreaterEq){
			return visitGreaterEq((robLANG_ASOS.GreaterEq) node, executionCtx,(robLANG_ASOS.interfaces.robLANG_ASOSInterface) config);
		}
		return null;
	}
}