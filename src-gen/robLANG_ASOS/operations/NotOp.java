package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.NotData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Not.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class NotOp extends AdaptiveOperation<Not, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Not node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		NotData data = new NotData();
		
		while(true){
			Object termination = null;
			NotData local_data = new NotData();
		
			boolean validPatternInput215 = true;
			if(validPatternInput215)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_not_expr() != null){
							config.before_not_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_not_expr() != null){
							config.specialize_not_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_not_expr() != null){
							if(result == null){
								config.after_not_expr().adapt(vis, node, data, config);
							} else {
								config.after_not_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput216 = true && (node.getExpression() instanceof ValueBool);
			if(validPatternInput216)
			{
				if(config.before_not_done() != null){
					config.before_not_done().adapt(vis, node, data, config);
				}
				
				if(config.specialize_not_done() != null){
					config.specialize_not_done().adapt(vis, node, data, config);
				} else {
					Object notB = (!((ValueBool) data.getcomputed_expression()).getValue());
					ValueBool valueBool19 = RobLANG_ASOSFactory.eINSTANCE.createValueBool();
					valueBool19.setValue((java.lang.Boolean) notB);
					ValueBool out = valueBool19;
					result = out;
				}
				
				if(config.after_not_done() != null){
					if(result == null){
						config.after_not_done().adapt(vis, node, data, config);
					} else {
						config.after_not_done().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
