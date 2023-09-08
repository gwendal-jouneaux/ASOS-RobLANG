package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.TurnLeftData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = TurnLeft.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class TurnLeftOp extends AdaptiveOperation<TurnLeft, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, TurnLeft node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		TurnLeftData data = new TurnLeftData();
		
		while(true){
			Object termination = null;
			TurnLeftData local_data = new TurnLeftData();
		
			boolean validPatternInput199 = true;
			if(validPatternInput199)
			{
				if(data.getcomputed_angle() == null){
					local_data.setcomputed_angle(((Node) node.getAngle()).accept(vis, execCtx));
					if(!(local_data.getcomputed_angle() instanceof Termination)){
						if(config.before_left_expr() != null){
							config.before_left_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_left_expr() != null){
							config.specialize_left_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_angle(local_data.getcomputed_angle());
						}
						
						if(config.after_left_expr() != null){
							if(result == null){
								config.after_left_expr().adapt(vis, node, data, config);
							} else {
								config.after_left_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput200 = true && (data.getcomputed_angle() instanceof ValueDouble);
			if(validPatternInput200)
			{
				if(config.before_left_act() != null){
					config.before_left_act().adapt(vis, node, data, config);
				}
				
				if(config.specialize_left_act() != null){
					config.specialize_left_act().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue10 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue10;
					result = out;
					 // prelude
					((ExecutionContext) ctx).turnRobot((java.lang.Double) ((ValueDouble) data.getcomputed_angle()).getValue());
				}
				
				if(config.after_left_act() != null){
					if(result == null){
						config.after_left_act().adapt(vis, node, data, config);
					} else {
						config.after_left_act().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
