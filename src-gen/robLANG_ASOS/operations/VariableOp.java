package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.VariableData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Variable.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class VariableOp extends AdaptiveOperation<Variable, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Variable node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		VariableData data = new VariableData();
		
		while(true){
			Object termination = null;
			VariableData local_data = new VariableData();
		
			boolean validPatternInput122 = true;
			if(validPatternInput122)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_var_expr() != null){
							config.before_var_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_var_expr() != null){
							config.specialize_var_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_var_expr() != null){
							if(result == null){
								config.after_var_expr().adapt(vis, node, data, config);
							} else {
								config.after_var_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput123 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput123)
			{
				if(config.before_var_set() != null){
					config.before_var_set().adapt(vis, node, data, config);
				}
				
				if(config.specialize_var_set() != null){
					config.specialize_var_set().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue2 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue2;
					result = out;
					 // prelude
					((ExecutionContext) ctx).put((java.lang.String) (data.getcomputed_name() == null ? node.getName() : data.getcomputed_name()), (java.lang.Object) ((Value) data.getcomputed_expression()));
				}
				
				if(config.after_var_set() != null){
					if(result == null){
						config.after_var_set().adapt(vis, node, data, config);
					} else {
						config.after_var_set().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput124 = true;
			if(validPatternInput124)
			{
				if(config.before_symbol_name() != null){
					config.before_symbol_name().adapt(vis, node, data, config);
				}
				
				if(config.specialize_symbol_name() != null){
					config.specialize_symbol_name().adapt(vis, node, data, config);
				} else {
					ValueString valueString0 = SdFactory.eINSTANCE.createValueString();
					valueString0.setValue((java.lang.String) (data.getcomputed_name() == null ? node.getName() : data.getcomputed_name()));
					ValueString out = valueString0;
					result = out;
				}
				
				if(config.after_symbol_name() != null){
					if(result == null){
						config.after_symbol_name().adapt(vis, node, data, config);
					} else {
						config.after_symbol_name().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
