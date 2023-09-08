package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SetNominalSpeedData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SetNominalSpeed.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SetNominalSpeedOp extends AdaptiveOperation<SetNominalSpeed, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SetNominalSpeed node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SetNominalSpeedData data = new SetNominalSpeedData();
		
		while(true){
			Object termination = null;
			SetNominalSpeedData local_data = new SetNominalSpeedData();
		
			boolean validPatternInput133 = true;
			if(validPatternInput133)
			{
				if(data.getcomputed_speed() == null){
					local_data.setcomputed_speed(((Node) node.getSpeed()).accept(vis, execCtx));
					if(!(local_data.getcomputed_speed() instanceof Termination)){
						if(config.before_speed_expr() != null){
							config.before_speed_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_speed_expr() != null){
							config.specialize_speed_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_speed(local_data.getcomputed_speed());
						}
						
						if(config.after_speed_expr() != null){
							if(result == null){
								config.after_speed_expr().adapt(vis, node, data, config);
							} else {
								config.after_speed_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_speed();
					}
				}
			}
			boolean validPatternInput134 = true && (data.getcomputed_speed() instanceof ValueDouble);
			if(validPatternInput134)
			{
				if(config.before_speed_act() != null){
					config.before_speed_act().adapt(vis, node, data, config);
				}
				
				if(config.specialize_speed_act() != null){
					config.specialize_speed_act().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue3 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue3;
					result = out;
					 // prelude
					((ExecutionContext) ctx).setNominalSpeed((java.lang.Double) ((ValueDouble) data.getcomputed_speed()).getValue());
				}
				
				if(config.after_speed_act() != null){
					if(result == null){
						config.after_speed_act().adapt(vis, node, data, config);
					} else {
						config.after_speed_act().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
