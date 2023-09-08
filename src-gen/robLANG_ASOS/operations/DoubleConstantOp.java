package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.DoubleConstantData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = DoubleConstant.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class DoubleConstantOp extends AdaptiveOperation<DoubleConstant, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, DoubleConstant node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		DoubleConstantData data = new DoubleConstantData();
		
		while(true){
			Object termination = null;
			DoubleConstantData local_data = new DoubleConstantData();
		
			boolean validPatternInput125 = true;
			if(validPatternInput125)
			{
				if(config.before_DoubleConst() != null){
					config.before_DoubleConst().adapt(vis, node, data, config);
				}
				
				if(config.specialize_DoubleConst() != null){
					config.specialize_DoubleConst().adapt(vis, node, data, config);
				} else {
					ValueDouble valueDouble3 = SdFactory.eINSTANCE.createValueDouble();
					valueDouble3.setValue((java.lang.Double) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					ValueDouble out = valueDouble3;
					result = out;
				}
				
				if(config.after_DoubleConst() != null){
					if(result == null){
						config.after_DoubleConst().adapt(vis, node, data, config);
					} else {
						config.after_DoubleConst().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
