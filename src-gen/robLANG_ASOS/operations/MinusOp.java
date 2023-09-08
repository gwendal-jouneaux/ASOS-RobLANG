package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.MinusData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Minus.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class MinusOp extends AdaptiveOperation<Minus, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Minus node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		MinusData data = new MinusData();
		
		while(true){
			Object termination = null;
			MinusData local_data = new MinusData();
		
			boolean validPatternInput185 = true;
			if(validPatternInput185)
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
			boolean validPatternInput186 = true && (node.getLeft() instanceof Value);
			if(validPatternInput186)
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
			boolean validPatternInput187 = true && (node.getLeft() instanceof ValueInt) && (node.getRight() instanceof ValueInt);
			if(validPatternInput187)
			{
				if(config.before_minus() != null){
					config.before_minus().adapt(vis, node, data, config);
				}
				
				if(config.specialize_minus() != null){
					config.specialize_minus().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueInt) data.getcomputed_left()).getValue() - ((ValueInt) data.getcomputed_right()).getValue());
					ValueInt valueInt8 = RobLANG_ASOSFactory.eINSTANCE.createValueInt();
					valueInt8.setValue((java.lang.Integer) n);
					ValueInt out = valueInt8;
					result = out;
				}
				
				if(config.after_minus() != null){
					if(result == null){
						config.after_minus().adapt(vis, node, data, config);
					} else {
						config.after_minus().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput188 = true && (node.getLeft() instanceof ValueDouble) && (node.getRight() instanceof ValueDouble);
			if(validPatternInput188)
			{
				if(config.before_minus() != null){
					config.before_minus().adapt(vis, node, data, config);
				}
				
				if(config.specialize_minus() != null){
					config.specialize_minus().adapt(vis, node, data, config);
				} else {
					Object n = (n1 - n2);
					ValueDouble valueDouble9 = RobLANG_ASOSFactory.eINSTANCE.createValueDouble();
					valueDouble9.setValue((java.lang.Double) n);
					ValueDouble out = valueDouble9;
					result = out;
				}
				
				if(config.after_minus() != null){
					if(result == null){
						config.after_minus().adapt(vis, node, data, config);
					} else {
						config.after_minus().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
