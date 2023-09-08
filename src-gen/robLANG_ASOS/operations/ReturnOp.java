package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.ReturnData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Return.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class ReturnOp extends AdaptiveOperation<Return, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Return node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		ReturnData data = new ReturnData();
		
		while(true){
			Object termination = null;
			ReturnData local_data = new ReturnData();
		
			boolean validPatternInput208 = true;
			if(validPatternInput208)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_return_expr() != null){
							config.before_return_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_return_expr() != null){
							config.specialize_return_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_return_expr() != null){
							if(result == null){
								config.after_return_expr().adapt(vis, node, data, config);
							} else {
								config.after_return_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput209 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput209)
			{
				if(config.before_return_end() != null){
					config.before_return_end().adapt(vis, node, data, config);
				}
				
				if(config.specialize_return_end() != null){
					config.specialize_return_end().adapt(vis, node, data, config);
				} else {
					ReturnValue returnValue0 = SdFactory.eINSTANCE.createReturnValue();
					returnValue0.setValue(EcoreUtil.copy((Value) ((Value) data.getcomputed_expression())));
					ReturnValue out = returnValue0;
					result = new Termination(out);
				}
				
				if(config.after_return_end() != null){
					if(result == null){
						config.after_return_end().adapt(vis, node, data, config);
					} else {
						config.after_return_end().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
