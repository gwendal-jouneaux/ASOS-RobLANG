package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.GreaterEqData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = GreaterEq.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class GreaterEqOp extends AdaptiveOperation<GreaterEq, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, GreaterEq node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		GreaterEqData data = new GreaterEqData();
		
		while(true){
			Object termination = null;
			GreaterEqData local_data = new GreaterEqData();
		
			boolean validPatternInput192 = true;
			if(validPatternInput192)
			{
				if(data.getcomputed_left() == null){
					local_data.setcomputed_left(((Node) node.getLeft()).accept(vis, execCtx));
					if(!(local_data.getcomputed_left() instanceof Termination)){
						if(config.before_BinOp_lhs() != null){
							config.before_BinOp_lhs().adapt(vis, node, data, config);
						}
						
						if(config.specialize_BinOp_lhs() != null){
							config.specialize_BinOp_lhs().adapt(vis, node, data, config);
						} else {
							data.setcomputed_left(local_data.getcomputed_left());
						}
						
						if(config.after_BinOp_lhs() != null){
							if(result == null){
								config.after_BinOp_lhs().adapt(vis, node, data, config);
							} else {
								config.after_BinOp_lhs().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_left();
					}
				}
			}
			boolean validPatternInput193 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput193)
			{
				if(data.getcomputed_right() == null){
					local_data.setcomputed_right(((Node) node.getRight()).accept(vis, execCtx));
					if(!(local_data.getcomputed_right() instanceof Termination)){
						if(config.before_BinOp_rhs() != null){
							config.before_BinOp_rhs().adapt(vis, node, data, config);
						}
						
						if(config.specialize_BinOp_rhs() != null){
							config.specialize_BinOp_rhs().adapt(vis, node, data, config);
						} else {
							data.setcomputed_right(local_data.getcomputed_right());
						}
						
						if(config.after_BinOp_rhs() != null){
							if(result == null){
								config.after_BinOp_rhs().adapt(vis, node, data, config);
							} else {
								config.after_BinOp_rhs().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
						termination = local_data.getcomputed_right();
					}
				}
			}
			boolean validPatternInput194 = true && (data.getcomputed_left() instanceof ValueInt) && (data.getcomputed_right() instanceof ValueInt);
			if(validPatternInput194)
			{
				if(config.before_great_eq() != null){
					config.before_great_eq().adapt(vis, node, data, config);
				}
				
				if(config.specialize_great_eq() != null){
					config.specialize_great_eq().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueInt) data.getcomputed_right()).getValue() <= ((ValueInt) data.getcomputed_left()).getValue());
					ValueBool valueBool10 = SdFactory.eINSTANCE.createValueBool();
					valueBool10.setValue((java.lang.Boolean) n);
					ValueBool out = valueBool10;
					result = out;
				}
				
				if(config.after_great_eq() != null){
					if(result == null){
						config.after_great_eq().adapt(vis, node, data, config);
					} else {
						config.after_great_eq().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
