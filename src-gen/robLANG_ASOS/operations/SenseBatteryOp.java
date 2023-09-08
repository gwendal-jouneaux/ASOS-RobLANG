package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SenseBatteryData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SenseBattery.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SenseBatteryOp extends AdaptiveOperation<SenseBattery, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SenseBattery node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SenseBatteryData data = new SenseBatteryData();
		
		while(true){
			Object termination = null;
			SenseBatteryData local_data = new SenseBatteryData();
		
			boolean validPatternInput69 = true;
			if(validPatternInput69)
			{
				if(config.before_battery() != null){
					config.before_battery().adapt(vis, node, data, config);
				}
				
				if(config.specialize_battery() != null){
					config.specialize_battery().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object out = ((ExecutionContext) ctx).getBattery();
					result = out;
				}
				
				if(config.after_battery() != null){
					if(result == null){
						config.after_battery().adapt(vis, node, data, config);
					} else {
						config.after_battery().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
