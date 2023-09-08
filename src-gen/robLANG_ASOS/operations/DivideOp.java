package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.DivideData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Divide.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class DivideOp extends AdaptiveOperation<Divide, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Divide node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		DivideData data = new DivideData();
		
		while(true){
			Object termination = null;
			DivideData local_data = new DivideData();
		
			boolean validPatternInput150 = true;
			if(validPatternInput150)
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
			boolean validPatternInput151 = true && (node.getLeft() instanceof Value);
			if(validPatternInput151)
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
			boolean validPatternInput152 = true && (node.getLeft() instanceof ValueInt) && (node.getRight() instanceof ValueInt);
			if(validPatternInput152)
			{
				if((!((ValueInt) data.getcomputed_right()).getValue().equals(0))){
					if(config.before_div() != null){
						config.before_div().adapt(vis, node, data, config);
					}
					
					if(config.specialize_div() != null){
						config.specialize_div().adapt(vis, node, data, config);
					} else {
						Object n = (((ValueInt) data.getcomputed_left()).getValue() / ((ValueInt) data.getcomputed_right()).getValue());
						ValueInt valueInt7 = RobLANG_ASOSFactory.eINSTANCE.createValueInt();
						valueInt7.setValue((java.lang.Integer) n);
						ValueInt out = valueInt7;
						result = out;
					}
					
					if(config.after_div() != null){
						if(result == null){
							config.after_div().adapt(vis, node, data, config);
						} else {
							config.after_div().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput153 = true && (node.getLeft() instanceof ValueInt) && (node.getRight() instanceof ValueInt);
			if(validPatternInput153)
			{
				if((n2.equals(0))){
					if(config.before_div() != null){
						config.before_div().adapt(vis, node, data, config);
					}
					
					if(config.specialize_div() != null){
						config.specialize_div().adapt(vis, node, data, config);
					} else {
						Error error2 = RobLANG_ASOSFactory.eINSTANCE.createError();
						Error out = error2;
						result = new Termination(out);
					}
					
					if(config.after_div() != null){
						if(result == null){
							config.after_div().adapt(vis, node, data, config);
						} else {
							config.after_div().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput154 = true && (node.getLeft() instanceof ValueDouble) && (node.getRight() instanceof ValueDouble);
			if(validPatternInput154)
			{
				if((!n2.equals(0))){
					if(config.before_div() != null){
						config.before_div().adapt(vis, node, data, config);
					}
					
					if(config.specialize_div() != null){
						config.specialize_div().adapt(vis, node, data, config);
					} else {
						Object n = (n1 / n2);
						ValueDouble valueDouble8 = RobLANG_ASOSFactory.eINSTANCE.createValueDouble();
						valueDouble8.setValue((java.lang.Double) n);
						ValueDouble out = valueDouble8;
						result = out;
					}
					
					if(config.after_div() != null){
						if(result == null){
							config.after_div().adapt(vis, node, data, config);
						} else {
							config.after_div().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput155 = true && (node.getLeft() instanceof ValueDouble) && (node.getRight() instanceof ValueDouble);
			if(validPatternInput155)
			{
				if((n2.equals(0))){
					if(config.before_div() != null){
						config.before_div().adapt(vis, node, data, config);
					}
					
					if(config.specialize_div() != null){
						config.specialize_div().adapt(vis, node, data, config);
					} else {
						Error error3 = RobLANG_ASOSFactory.eINSTANCE.createError();
						Error out = error3;
						result = new Termination(out);
					}
					
					if(config.after_div() != null){
						if(result == null){
							config.after_div().adapt(vis, node, data, config);
						} else {
							config.after_div().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
		
			return termination;
		}
	}
}
