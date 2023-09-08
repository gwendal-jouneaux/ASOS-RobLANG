package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SensePositionData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SensePosition.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SensePositionOp extends AdaptiveOperation<SensePosition, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SensePosition node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SensePositionData data = new SensePositionData();
		
		while(true){
			Object termination = null;
			SensePositionData local_data = new SensePositionData();
		
			boolean validPatternInput197 = true;
			if(validPatternInput197)
			{
				if(config.before_position() != null){
					config.before_position().adapt(vis, node, data, config);
				}
				
				if(config.specialize_position() != null){
					config.specialize_position().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object out = ((ExecutionContext) ctx).getPosition();
					result = out;
				}
				
				if(config.after_position() != null){
					if(result == null){
						config.after_position().adapt(vis, node, data, config);
					} else {
						config.after_position().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
