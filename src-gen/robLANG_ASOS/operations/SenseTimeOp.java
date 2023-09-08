package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SenseTimeData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SenseTime.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SenseTimeOp extends AdaptiveOperation<SenseTime, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SenseTime node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SenseTimeData data = new SenseTimeData();
		
		while(true){
			Object termination = null;
			SenseTimeData local_data = new SenseTimeData();
		
			boolean validPatternInput201 = true;
			if(validPatternInput201)
			{
				if(config.before_time() != null){
					config.before_time().adapt(vis, node, data, config);
				}
				
				if(config.specialize_time() != null){
					config.specialize_time().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object out = ((ExecutionContext) ctx).getTime();
					result = out;
				}
				
				if(config.after_time() != null){
					if(result == null){
						config.after_time().adapt(vis, node, data, config);
					} else {
						config.after_time().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
