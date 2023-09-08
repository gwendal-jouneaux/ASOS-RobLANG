package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.PrintExpressionData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = PrintExpression.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class PrintExpressionOp extends AdaptiveOperation<PrintExpression, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, PrintExpression node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		PrintExpressionData data = new PrintExpressionData();
		
		while(true){
			Object termination = null;
			PrintExpressionData local_data = new PrintExpressionData();
		
			boolean validPatternInput213 = true;
			if(validPatternInput213)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_print_expr() != null){
							config.before_print_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_print_expr() != null){
							config.specialize_print_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_print_expr() != null){
							if(result == null){
								config.after_print_expr().adapt(vis, node, data, config);
							} else {
								config.after_print_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput214 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput214)
			{
				if(config.before_print_send() != null){
					config.before_print_send().adapt(vis, node, data, config);
				}
				
				if(config.specialize_print_send() != null){
					config.specialize_print_send().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue11 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue11;
					result = out;
					 // prelude
					((ExecutionContext) ctx).println((Value) ((Value) data.getcomputed_expression()));
				}
				
				if(config.after_print_send() != null){
					if(result == null){
						config.after_print_send().adapt(vis, node, data, config);
					} else {
						config.after_print_send().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
