package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SenseDistanceData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SenseDistance.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SenseDistanceOp extends AdaptiveOperation<SenseDistance, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SenseDistance node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SenseDistanceData data = new SenseDistanceData();
		
		while(true){
			Object termination = null;
			SenseDistanceData local_data = new SenseDistanceData();
		
			boolean validPatternInput210 = true;
			if(validPatternInput210)
			{
				if(config.before_dist() != null){
					config.before_dist().adapt(vis, node, data, config);
				}
				
				if(config.specialize_dist() != null){
					config.specialize_dist().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object out = ((ExecutionContext) ctx).getDistance();
					result = out;
				}
				
				if(config.after_dist() != null){
					if(result == null){
						config.after_dist().adapt(vis, node, data, config);
					} else {
						config.after_dist().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
