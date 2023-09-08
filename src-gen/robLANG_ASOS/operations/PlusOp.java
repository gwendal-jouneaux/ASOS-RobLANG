package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.PlusData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Plus.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class PlusOp extends AdaptiveOperation<Plus, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Plus node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		PlusData data = new PlusData();
		
		while(true){
			Object termination = null;
			PlusData local_data = new PlusData();
		
			boolean validPatternInput126 = true;
			if(validPatternInput126)
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
			boolean validPatternInput127 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput127)
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
			boolean validPatternInput128 = true && (data.getcomputed_left() instanceof ValueString) && (data.getcomputed_right() instanceof ValueString);
			if(validPatternInput128)
			{
				if(config.before_plus_string() != null){
					config.before_plus_string().adapt(vis, node, data, config);
				}
				
				if(config.specialize_plus_string() != null){
					config.specialize_plus_string().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueString) data.getcomputed_left()).getValue() + ((ValueString) data.getcomputed_right()).getValue());
					ValueString valueString1 = SdFactory.eINSTANCE.createValueString();
					valueString1.setValue((java.lang.String) n);
					ValueString out = valueString1;
					result = out;
				}
				
				if(config.after_plus_string() != null){
					if(result == null){
						config.after_plus_string().adapt(vis, node, data, config);
					} else {
						config.after_plus_string().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput129 = true && (data.getcomputed_left() instanceof ValueInt) && (data.getcomputed_right() instanceof ValueInt);
			if(validPatternInput129)
			{
				if(config.before_plus_int() != null){
					config.before_plus_int().adapt(vis, node, data, config);
				}
				
				if(config.specialize_plus_int() != null){
					config.specialize_plus_int().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueInt) data.getcomputed_left()).getValue() + ((ValueInt) data.getcomputed_right()).getValue());
					ValueInt valueInt3 = SdFactory.eINSTANCE.createValueInt();
					valueInt3.setValue((java.lang.Integer) n);
					ValueInt out = valueInt3;
					result = out;
				}
				
				if(config.after_plus_int() != null){
					if(result == null){
						config.after_plus_int().adapt(vis, node, data, config);
					} else {
						config.after_plus_int().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput130 = true && (data.getcomputed_left() instanceof ValueDouble) && (data.getcomputed_right() instanceof ValueDouble);
			if(validPatternInput130)
			{
				if(config.before_plus_double() != null){
					config.before_plus_double().adapt(vis, node, data, config);
				}
				
				if(config.specialize_plus_double() != null){
					config.specialize_plus_double().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueDouble) data.getcomputed_left()).getValue() + ((ValueDouble) data.getcomputed_right()).getValue());
					ValueDouble valueDouble4 = SdFactory.eINSTANCE.createValueDouble();
					valueDouble4.setValue((java.lang.Double) n);
					ValueDouble out = valueDouble4;
					result = out;
				}
				
				if(config.after_plus_double() != null){
					if(result == null){
						config.after_plus_double().adapt(vis, node, data, config);
					} else {
						config.after_plus_double().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
