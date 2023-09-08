package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.TurnRightData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = TurnRight.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class TurnRightOp extends AdaptiveOperation<TurnRight, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, TurnRight node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		TurnRightData data = new TurnRightData();
		
		while(true){
			Object termination = null;
			TurnRightData local_data = new TurnRightData();
		
			boolean validPatternInput144 = true;
			if(validPatternInput144)
			{
				if(data.getcomputed_angle() == null){
					local_data.setcomputed_angle(((Node) node.getAngle()).accept(vis, execCtx));
					if(!(local_data.getcomputed_angle() instanceof Termination)){
						if(config.before_right_expr() != null){
							config.before_right_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_right_expr() != null){
							config.specialize_right_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_angle(local_data.getcomputed_angle());
						}
						
						if(config.after_right_expr() != null){
							if(result == null){
								config.after_right_expr().adapt(vis, node, data, config);
							} else {
								config.after_right_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
							}
						}
						
						if(result != null){
							if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
								return ((Node) result).accept(vis, execCtx);
							} else {
								return result;
							}
						} else {
							continue;
						}
					}
					else {
						termination = local_data.getcomputed_angle();
					}
				}
			}
			boolean validPatternInput145 = true && (data.getcomputed_angle() instanceof ValueDouble);
			if(validPatternInput145)
			{
				if(config.before_right_act() != null){
					config.before_right_act().adapt(vis, node, data, config);
				}
				
				if(config.specialize_right_act() != null){
					config.specialize_right_act().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					Object inv = (-((ValueDouble) data.getcomputed_angle()).getValue());
					NilValue nilValue5 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue5;
					result = out;
					 // prelude
					((ExecutionContext) ctx).turnRobot((java.lang.Double) inv);
				}
				
				if(config.after_right_act() != null){
					if(result == null){
						config.after_right_act().adapt(vis, node, data, config);
					} else {
						config.after_right_act().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
					}
				}
				
				if(result != null){
					if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
						return ((Node) result).accept(vis, execCtx);
					} else {
						return result;
					}
				} else {
					continue;
				}
			}
		
			return termination;
		}
	}
}
