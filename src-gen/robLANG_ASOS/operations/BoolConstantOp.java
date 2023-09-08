package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.BoolConstantData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = BoolConstant.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class BoolConstantOp extends AdaptiveOperation<BoolConstant, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, BoolConstant node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		BoolConstantData data = new BoolConstantData();
		
		while(true){
			Object termination = null;
			BoolConstantData local_data = new BoolConstantData();
		
			boolean validPatternInput98 = true;
			if(validPatternInput98)
			{
				if(config.before_BoolConst() != null){
					config.before_BoolConst().adapt(vis, node, data, config);
				}
				
				if(config.specialize_BoolConst() != null){
					config.specialize_BoolConst().adapt(vis, node, data, config);
				} else {
					ValueBool valueBool0 = SdFactory.eINSTANCE.createValueBool();
					valueBool0.setValue((java.lang.Boolean) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					ValueBool out = valueBool0;
					result = out;
				}
				
				if(config.after_BoolConst() != null){
					if(result == null){
						config.after_BoolConst().adapt(vis, node, data, config);
					} else {
						config.after_BoolConst().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
