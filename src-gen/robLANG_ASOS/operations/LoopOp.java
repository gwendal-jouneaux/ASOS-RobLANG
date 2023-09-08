package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.LoopData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Loop.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class LoopOp extends AdaptiveOperation<Loop, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Loop node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		LoopData data = new LoopData();
		
		while(true){
			Object termination = null;
			LoopData local_data = new LoopData();
		
			boolean validPatternInput179 = true;
			if(validPatternInput179)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_loop_cond() != null){
							config.before_loop_cond().adapt(vis, node, data, config);
						}
						
						if(config.specialize_loop_cond() != null){
							config.specialize_loop_cond().adapt(vis, node, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_loop_cond() != null){
							if(result == null){
								config.after_loop_cond().adapt(vis, node, data, config);
							} else {
								config.after_loop_cond().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput180 = true && (data.getcomputed_expression() instanceof ValueBool);
			if(validPatternInput180)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(true))){
					if(data.getcomputed_body() == null){
						local_data.setcomputed_body(((Node) node.getBody()).accept(vis, execCtx));
						if(!(local_data.getcomputed_body() instanceof Termination)){
							if(config.before_loop_true_exec() != null){
								config.before_loop_true_exec().adapt(vis, node, data, config);
							}
							
							if(config.specialize_loop_true_exec() != null){
								config.specialize_loop_true_exec().adapt(vis, node, data, config);
							} else {
								data.setcomputed_body(local_data.getcomputed_body());
							}
							
							if(config.after_loop_true_exec() != null){
								if(result == null){
									config.after_loop_true_exec().adapt(vis, node, data, config);
								} else {
									config.after_loop_true_exec().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			}
			boolean validPatternInput182 = true && (data.getcomputed_expression() instanceof ValueBool);
			if(validPatternInput182)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(true))){
					if(data.getcomputed_body() == null){
						local_data.setcomputed_body(((Node) node.getBody()).accept(vis, execCtx));
						if((local_data.getcomputed_body() instanceof Termination)){
							boolean validPatternPremise181 = true && (((Termination)local_data.getcomputed_body()).unbox() instanceof BreakSignal);
							if(validPatternPremise181)
							{
								if(config.before_loop_true_break() != null){
									config.before_loop_true_break().adapt(vis, node, data, config);
								}
								
								if(config.specialize_loop_true_break() != null){
									config.specialize_loop_true_break().adapt(vis, node, data, config);
								} else {
									NilValue nilValue7 = SdFactory.eINSTANCE.createNilValue();
									NilValue out = nilValue7;
									result = out;
								}
								
								if(config.after_loop_true_break() != null){
									if(result == null){
										config.after_loop_true_break().adapt(vis, node, data, config);
									} else {
										config.after_loop_true_break().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			}
			boolean validPatternInput183 = true && (data.getcomputed_expression() instanceof ValueBool);
			if(validPatternInput183)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(false))){
					if(config.before_loop_false() != null){
						config.before_loop_false().adapt(vis, node, data, config);
					}
					
					if(config.specialize_loop_false() != null){
						config.specialize_loop_false().adapt(vis, node, data, config);
					} else {
						NilValue nilValue8 = SdFactory.eINSTANCE.createNilValue();
						NilValue out = nilValue8;
						result = out;
					}
					
					if(config.after_loop_false() != null){
						if(result == null){
							config.after_loop_false().adapt(vis, node, data, config);
						} else {
							config.after_loop_false().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput184 = true && (data.getcomputed_expression() instanceof ValueBool) && (data.getcomputed_body() instanceof NilValue);
			if(validPatternInput184)
			{
				if((((ValueBool) data.getcomputed_expression()).getValue().equals(true))){
					if(config.before_loop_true_done() != null){
						config.before_loop_true_done().adapt(vis, node, data, config);
					}
					
					if(config.specialize_loop_true_done() != null){
						config.specialize_loop_true_done().adapt(vis, node, data, config);
					} else {
						Object loop = node;
						result = loop;
					}
					
					if(config.after_loop_true_done() != null){
						if(result == null){
							config.after_loop_true_done().adapt(vis, node, data, config);
						} else {
							config.after_loop_true_done().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
