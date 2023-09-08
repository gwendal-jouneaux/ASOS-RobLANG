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
import robLANG_ASOS.operations.data.TurnLeftData;

public class reduce_quarter_leftAdaptationRule extends AdaptationRule {
	@Override
	public Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> adaptableNode, Object execCtx, SemanticsAdaptationInterface config){
		TurnLeft node = ((TurnLeft) adaptableNode);
		TurnLeftData data = new TurnLeftData(execCtx);
		Object result = null;
		
		boolean validPatternInput223 = true && (data.getcomputed_angle() instanceof ValueDouble);
		if(validPatternInput223)
		{
			 // prelude
			Object ctx = ((ConstructWithContext) node).getContext();
			 // prelude
			Object speed = ((ExecutionContext) ctx).getNominalSpeed();
			Object quarter = (0.25 * speed);
			NilValue nilValue14 = SdFactory.eINSTANCE.createNilValue();
			NilValue out = nilValue14;
			result = out;
			 // prelude
			((ExecutionContext) ctx).setSpeed((java.lang.Double) quarter);
			 // prelude
			((ExecutionContext) ctx).turnRobot((java.lang.Double) ((ValueDouble) data.getcomputed_angle()).getValue());
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
