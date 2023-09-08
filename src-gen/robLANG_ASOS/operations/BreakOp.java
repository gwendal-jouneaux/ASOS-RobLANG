package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.BreakData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Break.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class BreakOp extends AdaptiveOperation<Break, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Break node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		BreakData data = new BreakData();
		
		while(true){
			Object termination = null;
			BreakData local_data = new BreakData();
		
			boolean validPatternInput70 = true;
			if(validPatternInput70)
			{
				if(config.before_break() != null){
					config.before_break().adapt(vis, node, data, config);
				}
				
				if(config.specialize_break() != null){
					config.specialize_break().adapt(vis, node, data, config);
				} else {
					Break break1 = RobLANG_ASOSFactory.eINSTANCE.createBreak();
					Break out = break1;
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
