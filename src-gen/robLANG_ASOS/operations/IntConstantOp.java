package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.IntConstantData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = IntConstant.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class IntConstantOp extends AdaptiveOperation<IntConstant, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, IntConstant node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		IntConstantData data = new IntConstantData();
		
		while(true){
			Object termination = null;
			IntConstantData local_data = new IntConstantData();
		
			boolean validPatternInput212 = true;
			if(validPatternInput212)
			{
				if(config.before_IntConst() != null){
					config.before_IntConst().adapt(vis, node, data, config);
				}
				
				if(config.specialize_IntConst() != null){
					config.specialize_IntConst().adapt(vis, node, data, config);
				} else {
					ValueInt valueInt9 = RobLANG_ASOSFactory.eINSTANCE.createValueInt();
					valueInt9.setValue((java.lang.Integer) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					ValueInt out = valueInt9;
					result = out;
				}
				
				if(config.after_IntConst() != null){
					if(result == null){
						config.after_IntConst().adapt(vis, node, data, config);
					} else {
						config.after_IntConst().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
