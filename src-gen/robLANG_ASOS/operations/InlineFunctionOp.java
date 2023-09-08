package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.InlineFunctionData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = InlineFunction.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class InlineFunctionOp extends AdaptiveOperation<InlineFunction, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, InlineFunction node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		InlineFunctionData data = new InlineFunctionData();
		
		while(true){
			Object termination = null;
			InlineFunctionData local_data = new InlineFunctionData();
		
			boolean validPatternInput137 = true && (node.getVarNames() instanceof List && node.getVarNames().size() <= data.getindex_varNames());
			if(validPatternInput137)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_inline_call() != null){
							config.before_inline_call().adapt(vis, node, data, config);
						}
						
						if(config.specialize_inline_call() != null){
							config.specialize_inline_call().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_inline_call() != null){
							if(result == null){
								config.after_inline_call().adapt(vis, node, data, config);
							} else {
								config.after_inline_call().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput138 = true && (node.getVarNames() instanceof List && node.getVarNames().size() <= data.getindex_varNames()) && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput138)
			{
				if(config.before_inline_return() != null){
					config.before_inline_return().adapt(vis, node, data, config);
				}
				
				if(config.specialize_inline_return() != null){
					config.specialize_inline_return().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					result = ((Value) data.getcomputed_expression());
					 // prelude
					((ExecutionContext) ctx).popContext();
				}
				
				if(config.after_inline_return() != null){
					if(result == null){
						config.after_inline_return().adapt(vis, node, data, config);
					} else {
						config.after_inline_return().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput139 = true && (node.getVarNames() instanceof List && node.getVarNames().size() > data.getindex_varNames());
			if(validPatternInput139)
			{
				if(config.before_fundef_vars() != null){
					config.before_fundef_vars().adapt(vis, node, data, config);
				}
				
				if(config.specialize_fundef_vars() != null){
					config.specialize_fundef_vars().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					data.incindex_varNames();
					data.setcomputed_varNames(null);
					 // prelude
					((ExecutionContext) ctx).setParam((java.lang.String) (data.getcomputed_varNames() == null ? node.getVarNames().get(data.getindex_varNames()) : data.getcomputed_varNames()));
				}
				
				if(config.after_fundef_vars() != null){
					if(result == null){
						config.after_fundef_vars().adapt(vis, node, data, config);
					} else {
						config.after_fundef_vars().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
