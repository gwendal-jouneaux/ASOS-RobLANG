package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.MultiplyData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Multiply.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class MultiplyOp extends AdaptiveOperation<Multiply, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Multiply node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		MultiplyData data = new MultiplyData();
		
		while(true){
			Object termination = null;
			MultiplyData local_data = new MultiplyData();
		
			boolean validPatternInput103 = true;
			if(validPatternInput103)
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
			boolean validPatternInput104 = true && (node.getLeft() instanceof Value);
			if(validPatternInput104)
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
			boolean validPatternInput105 = true && (node.getLeft() instanceof ValueInt) && (node.getRight() instanceof ValueInt);
			if(validPatternInput105)
			{
				if(config.before_mult() != null){
					config.before_mult().adapt(vis, node, data, config);
				}
				
				if(config.specialize_mult() != null){
					config.specialize_mult().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueInt) data.getcomputed_left()).getValue() * ((ValueInt) data.getcomputed_right()).getValue());
					ValueInt valueInt6 = RobLANG_ASOSFactory.eINSTANCE.createValueInt();
					valueInt6.setValue((java.lang.Integer) n);
					ValueInt out = valueInt6;
					result = out;
				}
				
				if(config.after_mult() != null){
					if(result == null){
						config.after_mult().adapt(vis, node, data, config);
					} else {
						config.after_mult().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput106 = true && (node.getLeft() instanceof ValueDouble) && (node.getRight() instanceof ValueDouble);
			if(validPatternInput106)
			{
				if(config.before_mult() != null){
					config.before_mult().adapt(vis, node, data, config);
				}
				
				if(config.specialize_mult() != null){
					config.specialize_mult().adapt(vis, node, data, config);
				} else {
					Object n = (n1 * n2);
					ValueDouble valueDouble7 = RobLANG_ASOSFactory.eINSTANCE.createValueDouble();
					valueDouble7.setValue((java.lang.Double) n);
					ValueDouble out = valueDouble7;
					result = out;
				}
				
				if(config.after_mult() != null){
					if(result == null){
						config.after_mult().adapt(vis, node, data, config);
					} else {
						config.after_mult().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
