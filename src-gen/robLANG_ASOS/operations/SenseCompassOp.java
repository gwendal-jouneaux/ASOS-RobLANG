package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SenseCompassData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SenseCompass.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SenseCompassOp extends AdaptiveOperation<SenseCompass, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SenseCompass node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SenseCompassData data = new SenseCompassData();
		
		while(true){
			Object termination = null;
			SenseCompassData local_data = new SenseCompassData();
		
			boolean validPatternInput135 = true;
			if(validPatternInput135)
			{
				if(config.before_compass() != null){
					config.before_compass().adapt(vis, node, data, config);
				}
				
				if(config.specialize_compass() != null){
					config.specialize_compass().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object out = ((ExecutionContext) ctx).getCompass();
					result = out;
				}
				
				if(config.after_compass() != null){
					if(result == null){
						config.after_compass().adapt(vis, node, data, config);
					} else {
						config.after_compass().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
