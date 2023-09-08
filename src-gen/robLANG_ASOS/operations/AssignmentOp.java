package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.AssignmentData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Assignment.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class AssignmentOp extends AdaptiveOperation<Assignment, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Assignment node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		AssignmentData data = new AssignmentData();
		
		while(true){
			Object termination = null;
			AssignmentData local_data = new AssignmentData();
		
			boolean validPatternInput112 = true;
			if(validPatternInput112)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_assign_expr() != null){
							config.before_assign_expr().adapt(vis, node, data, config);
						}
						
						if(config.specialize_assign_expr() != null){
							config.specialize_assign_expr().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_assign_expr() != null){
							if(result == null){
								config.after_assign_expr().adapt(vis, node, data, config);
							} else {
								config.after_assign_expr().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput113 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput113)
			{
				if(config.before_assign_set() != null){
					config.before_assign_set().adapt(vis, node, data, config);
				}
				
				if(config.specialize_assign_set() != null){
					config.specialize_assign_set().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					NilValue nilValue1 = SdFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue1;
					result = out;
					 // prelude
					((ExecutionContext) ctx).putSymbol((Symbol) (data.getcomputed_assignee() == null ? node.getAssignee() : data.getcomputed_assignee()), (java.lang.Object) ((Value) data.getcomputed_expression()));
				}
				
				if(config.after_assign_set() != null){
					if(result == null){
						config.after_assign_set().adapt(vis, node, data, config);
					} else {
						config.after_assign_set().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
