package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.FunCallData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = FunCall.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class FunCallOp extends AdaptiveOperation<FunCall, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, FunCall node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		FunCallData data = new FunCallData();
		
		while(true){
			Object termination = null;
			FunCallData local_data = new FunCallData();
		
			boolean validPatternInput146 = true && (node.getParams() instanceof List && node.getParams().size() > data.getindex_params());
			if(validPatternInput146)
			{
				if(data.getcomputed_params() == null){
					local_data.setcomputed_params(((Node) node.getParams().get(data.getindex_params())).accept(vis, execCtx));
					if(!(local_data.getcomputed_params() instanceof Termination)){
						if(config.before_funcall_param() != null){
							config.before_funcall_param().adapt(vis, node, data, config);
						}
						
						if(config.specialize_funcall_param() != null){
							config.specialize_funcall_param().adapt(vis, node, data, config);
						} else {
							data.setcomputed_params(local_data.getcomputed_params());
						}
						
						if(config.after_funcall_param() != null){
							if(result == null){
								config.after_funcall_param().adapt(vis, node, data, config);
							} else {
								config.after_funcall_param().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_params();
					}
				}
			}
			boolean validPatternInput147 = true && (node.getParams() instanceof List && node.getParams().size() > data.getindex_params()) && (data.getcomputed_params() instanceof Value);
			if(validPatternInput147)
			{
				if(config.before_funcall_value() != null){
					config.before_funcall_value().adapt(vis, node, data, config);
				}
				
				if(config.specialize_funcall_value() != null){
					config.specialize_funcall_value().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					data.incindex_params();
					data.setcomputed_params(null);
					 // prelude
					((ExecutionContext) ctx).pushArg((Value) ((Value) data.getcomputed_params()));
				}
				
				if(config.after_funcall_value() != null){
					if(result == null){
						config.after_funcall_value().adapt(vis, node, data, config);
					} else {
						config.after_funcall_value().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput148 = true && (node.getParams() instanceof List && node.getParams().size() <= data.getindex_params());
			if(validPatternInput148)
			{
				if(config.before_funcall_call() != null){
					config.before_funcall_call().adapt(vis, node, data, config);
				}
				
				if(config.specialize_funcall_call() != null){
					config.specialize_funcall_call().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					result = (data.getcomputed_function() == null ? node.getFunction() : data.getcomputed_function());
					 // prelude
					((ExecutionContext) ctx).pushContext();
				}
				
				if(config.after_funcall_call() != null){
					if(result == null){
						config.after_funcall_call().adapt(vis, node, data, config);
					} else {
						config.after_funcall_call().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
