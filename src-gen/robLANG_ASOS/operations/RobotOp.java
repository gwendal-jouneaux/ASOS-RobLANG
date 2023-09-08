package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.RobotData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Robot.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class RobotOp extends AdaptiveOperation<Robot, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Robot node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		RobotData data = new RobotData();
		
		while(true){
			Object termination = null;
			RobotData local_data = new RobotData();
		
			boolean validPatternInput169 = true;
			if(validPatternInput169)
			{
				if(config.before_robot_main() != null){
					config.before_robot_main().adapt(vis, node, data, config);
				}
				
				if(config.specialize_robot_main() != null){
					config.specialize_robot_main().adapt(vis, node, data, config);
				} else {
					result = (data.getcomputed_main() == null ? node.getMain() : data.getcomputed_main());
				}
				
				if(config.after_robot_main() != null){
					if(result == null){
						config.after_robot_main().adapt(vis, node, data, config);
					} else {
						config.after_robot_main().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
