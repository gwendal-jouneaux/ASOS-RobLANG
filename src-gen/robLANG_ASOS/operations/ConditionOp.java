package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.ConditionData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Condition.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class ConditionOp extends AdaptiveOperation<Condition, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Condition node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		ConditionData data = new ConditionData();
		
		while(true){
			Object termination = null;
			ConditionData local_data = new ConditionData();
		
			boolean validPatternInput202 = true;
			if(validPatternInput202)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_if_cond() != null){
							config.before_if_cond().adapt(vis, node, data, config);
						}
						
						if(config.specialize_if_cond() != null){
							config.specialize_if_cond().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_if_cond() != null){
							if(result == null){
								config.after_if_cond().adapt(vis, node, data, config);
							} else {
								config.after_if_cond().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_expression();
					}
				}
			}
			boolean validPatternInput203 = true && (data.getcomputed_expression() instanceof ValueBool);
			if(validPatternInput203)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(true))){
					if(config.before_if_true() != null){
						config.before_if_true().adapt(vis, node, data, config);
					}
					
					if(config.specialize_if_true() != null){
						config.specialize_if_true().adapt(vis, node, data, config);
					} else {
						result = (data.getcomputed_ifz() == null ? node.getIfz() : data.getcomputed_ifz());
					}
					
					if(config.after_if_true() != null){
						if(result == null){
							config.after_if_true().adapt(vis, node, data, config);
						} else {
							config.after_if_true().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			}
			boolean validPatternInput204 = true && (data.getcomputed_expression() instanceof ValueBool);
			if(validPatternInput204)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(false))){
					if(config.before_if_false() != null){
						config.before_if_false().adapt(vis, node, data, config);
					}
					
					if(config.specialize_if_false() != null){
						config.specialize_if_false().adapt(vis, node, data, config);
					} else {
						result = (data.getcomputed_elsez() == null ? node.getElsez() : data.getcomputed_elsez());
					}
					
					if(config.after_if_false() != null){
						if(result == null){
							config.after_if_false().adapt(vis, node, data, config);
						} else {
							config.after_if_false().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			}
		
			return termination;
		}
	}
}
