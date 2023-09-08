package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.ComplexFunctionData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = ComplexFunction.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class ComplexFunctionOp extends AdaptiveOperation<ComplexFunction, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, ComplexFunction node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		ComplexFunctionData data = new ComplexFunctionData();
		
		while(true){
			Object termination = null;
			ComplexFunctionData local_data = new ComplexFunctionData();
		
			boolean validPatternInput107 = true && (node.getVarNames() instanceof List && node.getVarNames().size() <= data.getindex_varNames());
			if(validPatternInput107)
			{
				if(data.getcomputed_body() == null){
					local_data.setcomputed_body(((Node) node.getBody()).accept(vis, execCtx));
					if(!(local_data.getcomputed_body() instanceof Termination)){
						if(config.before_complex_call() != null){
							config.before_complex_call().adapt(vis, node, data, config);
						}
						
						if(config.specialize_complex_call() != null){
							config.specialize_complex_call().adapt(vis, node, data, config);
						} else {
							data.setcomputed_body(local_data.getcomputed_body());
						}
						
						if(config.after_complex_call() != null){
							if(result == null){
								config.after_complex_call().adapt(vis, node, data, config);
							} else {
								config.after_complex_call().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_body();
					}
				}
			}
			boolean validPatternInput109 = true && (node.getVarNames() instanceof List && node.getVarNames().size() <= data.getindex_varNames());
			if(validPatternInput109)
			{
				if(data.getcomputed_body() == null){
					local_data.setcomputed_body(((Node) node.getBody()).accept(vis, execCtx));
					if((local_data.getcomputed_body() instanceof Termination)){
						boolean validPatternPremise108 = true && (((Termination)local_data.getcomputed_body()).unbox() instanceof ReturnValue);
						if(validPatternPremise108)
						{
							if(config.before_complex_return() != null){
								config.before_complex_return().adapt(vis, node, data, config);
							}
							
							if(config.specialize_complex_return() != null){
								config.specialize_complex_return().adapt(vis, node, data, config);
							} else {
								 // prelude
								Object ctx = ((ConstructWithContext) node).getContext();
								result = ((ReturnValue) local_data.getcomputed_body()).getValue();
								 // prelude
								((ExecutionContext) ctx).popContext();
							}
							
							if(config.after_complex_return() != null){
								if(result == null){
									config.after_complex_return().adapt(vis, node, data, config);
								} else {
									config.after_complex_return().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
				}
			}
			boolean validPatternInput110 = true && (node.getVarNames() instanceof List && node.getVarNames().size() <= data.getindex_varNames()) && (data.getcomputed_body() instanceof NilValue);
			if(validPatternInput110)
			{
				if(config.before_complex_end() != null){
					config.before_complex_end().adapt(vis, node, data, config);
				}
				
				if(config.specialize_complex_end() != null){
					config.specialize_complex_end().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue0 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue0;
					result = out;
					 // prelude
					((ExecutionContext) ctx).popContext();
				}
				
				if(config.after_complex_end() != null){
					if(result == null){
						config.after_complex_end().adapt(vis, node, data, config);
					} else {
						config.after_complex_end().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput111 = true && (node.getVarNames() instanceof List && node.getVarNames().size() > data.getindex_varNames());
			if(validPatternInput111)
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
