package robLANG_ASOS.adaptations.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import robLANG_ASOS.*;
import robLANG_ASOS.ASOS.AdaptationRule;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.sd.*;
import robLANG_ASOS.operations.data.MoveBackwardData;

public class reduce_half_backwardAdaptationRule extends AdaptationRule {
	@Override
	public Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> adaptableNode, Object execCtx, SemanticsAdaptationInterface config){
		MoveBackward node = ((MoveBackward) adaptableNode);
		MoveBackwardData data = new MoveBackwardData(execCtx);
		Object result = null;
		
		boolean validPatternInput226 = true && (data.getcomputed_distance() instanceof ValueDouble);
		if(validPatternInput226)
		{
			 // prelude
			Object ctx = ((ConstructWithContext) node).getContext();
			 // prelude
			Object speed = ((ExecutionContext) ctx).getNominalSpeed();
			Object inv = (-((ValueDouble) data.getcomputed_distance()).getValue());
			Object quarter = (0.5 * speed);
			NilValue nilValue17 = SdFactory.eINSTANCE.createNilValue();
			NilValue out = nilValue17;
			result = out;
			 // prelude
			((ExecutionContext) ctx).setSpeed((java.lang.Double) quarter);
			 // prelude
			((ExecutionContext) ctx).moveRobot((java.lang.Double) inv);
			 // prelude
			((ExecutionContext) ctx).setSpeed((java.lang.Double) speed);
			
			if(result != null){
				if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
					return ((Node) result).accept(vis, execCtx);
				} else {
					return result;
				}
			}
		}
		
		return result;
	}
}
