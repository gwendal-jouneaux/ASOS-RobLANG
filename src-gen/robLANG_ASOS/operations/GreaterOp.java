package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.GreaterData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Greater.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class GreaterOp extends AdaptiveOperation<Greater, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Greater node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		GreaterData data = new GreaterData();
		
		while(true){
			Object termination = null;
			GreaterData local_data = new GreaterData();
		
			boolean validPatternInput117 = true;
			if(validPatternInput117)
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
			boolean validPatternInput118 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput118)
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
			boolean validPatternInput119 = true && (data.getcomputed_left() instanceof ValueInt) && (data.getcomputed_right() instanceof ValueInt);
			if(validPatternInput119)
			{
				if(config.before_great() != null){
					config.before_great().adapt(vis, node, data, config);
				}
				
				if(config.specialize_great() != null){
					config.specialize_great().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueInt) data.getcomputed_right()).getValue() < ((ValueInt) data.getcomputed_left()).getValue());
					ValueBool valueBool3 = SdFactory.eINSTANCE.createValueBool();
					valueBool3.setValue((java.lang.Boolean) n);
					ValueBool out = valueBool3;
					result = out;
				}
				
				if(config.after_great() != null){
					if(result == null){
						config.after_great().adapt(vis, node, data, config);
					} else {
						config.after_great().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput120 = true && (data.getcomputed_left() instanceof ValueDouble) && (data.getcomputed_right() instanceof ValueDouble);
			if(validPatternInput120)
			{
				if(config.before_great_double() != null){
					config.before_great_double().adapt(vis, node, data, config);
				}
				
				if(config.specialize_great_double() != null){
					config.specialize_great_double().adapt(vis, node, data, config);
				} else {
					Object n = (((ValueDouble) data.getcomputed_right()).getValue() < ((ValueDouble) data.getcomputed_left()).getValue());
					ValueBool valueBool4 = SdFactory.eINSTANCE.createValueBool();
					valueBool4.setValue((java.lang.Boolean) n);
					ValueBool out = valueBool4;
					result = out;
				}
				
				if(config.after_great_double() != null){
					if(result == null){
						config.after_great_double().adapt(vis, node, data, config);
					} else {
						config.after_great_double().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
