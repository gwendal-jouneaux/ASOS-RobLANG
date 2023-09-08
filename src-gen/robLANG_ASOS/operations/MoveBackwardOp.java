package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.MoveBackwardData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = MoveBackward.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class MoveBackwardOp extends AdaptiveOperation<MoveBackward, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, MoveBackward node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		MoveBackwardData data = new MoveBackwardData();
		
		while(true){
			Object termination = null;
			MoveBackwardData local_data = new MoveBackwardData();
		
			boolean validPatternInput171 = true;
			if(validPatternInput171)
			{
				if(data.getcomputed_distance() == null){
					local_data.setcomputed_distance(((Node) node.getDistance()).accept(vis, execCtx));
					if(!(local_data.getcomputed_distance() instanceof Termination)){
						if(config.before_backward_expr() != null){
							config.before_backward_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_backward_expr() != null){
							config.specialize_backward_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_distance(local_data.getcomputed_distance());
						}
						
						if(config.after_backward_expr() != null){
							if(result == null){
								config.after_backward_expr().adapt(vis, node, data, config);
							} else {
								config.after_backward_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_distance();
					}
				}
			}
			boolean validPatternInput172 = true && (data.getcomputed_distance() instanceof ValueDouble);
			if(validPatternInput172)
			{
				if(config.before_backward_act() != null){
					config.before_backward_act().adapt(vis, node, data, config);
				}
				
				if(config.specialize_backward_act() != null){
					config.specialize_backward_act().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					Object inv = (-((ValueDouble) data.getcomputed_distance()).getValue());
					NilValue nilValue6 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue6;
					result = out;
					 // prelude
					((ExecutionContext) ctx).moveRobot((java.lang.Double) inv);
				}
				
				if(config.after_backward_act() != null){
					if(result == null){
						config.after_backward_act().adapt(vis, node, data, config);
					} else {
						config.after_backward_act().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
