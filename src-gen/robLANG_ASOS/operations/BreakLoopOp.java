package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.BreakLoopData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = BreakLoop.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class BreakLoopOp extends AdaptiveOperation<BreakLoop, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, BreakLoop node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		BreakLoopData data = new BreakLoopData();
		
		while(true){
			Object termination = null;
			BreakLoopData local_data = new BreakLoopData();
		
			boolean validPatternInput198 = true;
			if(validPatternInput198)
			{
				if(config.before_break() != null){
					config.before_break().adapt(vis, node, data, config);
				}
				
				if(config.specialize_break() != null){
					config.specialize_break().adapt(vis, node, data, config);
				} else {
					BreakSignal breakSignal0 = SdFactory.eINSTANCE.createBreakSignal();
					BreakSignal out = breakSignal0;
					result = new Termination(out);
				}
				
				if(config.after_break() != null){
					if(result == null){
						config.after_break().adapt(vis, node, data, config);
					} else {
						config.after_break().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
