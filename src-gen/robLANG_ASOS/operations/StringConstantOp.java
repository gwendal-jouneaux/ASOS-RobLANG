package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.StringConstantData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = StringConstant.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class StringConstantOp extends AdaptiveOperation<StringConstant, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, StringConstant node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		StringConstantData data = new StringConstantData();
		
		while(true){
			Object termination = null;
			StringConstantData local_data = new StringConstantData();
		
			boolean validPatternInput168 = true;
			if(validPatternInput168)
			{
				if(config.before_StringConst() != null){
					config.before_StringConst().adapt(vis, node, data, config);
				}
				
				if(config.specialize_StringConst() != null){
					config.specialize_StringConst().adapt(vis, node, data, config);
				} else {
					ValueString valueString5 = RobLANG_ASOSFactory.eINSTANCE.createValueString();
					valueString5.setValue((java.lang.String) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					ValueString out = valueString5;
					result = out;
				}
				
				if(config.after_StringConst() != null){
					if(result == null){
						config.after_StringConst().adapt(vis, node, data, config);
					} else {
						config.after_StringConst().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
