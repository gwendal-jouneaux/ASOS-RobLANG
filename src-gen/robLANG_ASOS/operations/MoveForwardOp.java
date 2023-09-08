package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.MoveForwardData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = MoveForward.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class MoveForwardOp extends AdaptiveOperation<MoveForward, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, MoveForward node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		MoveForwardData data = new MoveForwardData();
		
		while(true){
			Object termination = null;
			MoveForwardData local_data = new MoveForwardData();
		
			boolean validPatternInput195 = true;
			if(validPatternInput195)
			{
				if(data.getcomputed_distance() == null){
					local_data.setcomputed_distance(((Node) node.getDistance()).accept(vis, execCtx));
					if(!(local_data.getcomputed_distance() instanceof Termination)){
						if(config.before_forward_expr() != null){
							config.before_forward_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_forward_expr() != null){
							config.specialize_forward_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_distance(local_data.getcomputed_distance());
						}
						
						if(config.after_forward_expr() != null){
							if(result == null){
								config.after_forward_expr().adapt(vis, node, data, config);
							} else {
								config.after_forward_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput196 = true && (data.getcomputed_distance() instanceof ValueDouble);
			if(validPatternInput196)
			{
				if(config.before_forward_act() != null){
					config.before_forward_act().adapt(vis, node, data, config);
				}
				
				if(config.specialize_forward_act() != null){
					config.specialize_forward_act().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue9 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue9;
					result = out;
					 // prelude
					((ExecutionContext) ctx).moveRobot((java.lang.Double) ((ValueDouble) data.getcomputed_distance()).getValue());
				}
				
				if(config.after_forward_act() != null){
					if(result == null){
						config.after_forward_act().adapt(vis, node, data, config);
					} else {
						config.after_forward_act().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
