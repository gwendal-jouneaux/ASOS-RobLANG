package robLANG_ASOS.adaptations.modules;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.decision.model.Softgoal;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.module.adaptation.SelfAdaptationModule;
import robLANG_ASOS.interpreter.RobLANG_ASOSAdaptationContext;

import robLANG_ASOS.adaptations.rules.reduce_quarter_forwardAdaptationRule;
import robLANG_ASOS.adaptations.rules.reduce_quarter_backwardAdaptationRule;
import robLANG_ASOS.adaptations.rules.reduce_quarter_leftAdaptationRule;
import robLANG_ASOS.adaptations.rules.reduce_quarter_rightAdaptationRule;

import robLANG_ASOS.*;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

public class QuarterSpeedModule extends SelfAdaptationModule<RobLANG_ASOSAdaptationContext, AdaptableNode<robLANG_ASOSInterface>, robLANG_ASOSInterface> {

	
	public QuarterSpeedModule() {
		super("QuarterSpeed", null);
	}

	@Override
	public robLANG_ASOSInterface adapt(robLANG_ASOSInterface configInterface) {
		configInterface.add_specialize_forward_act(new reduce_quarter_forwardAdaptationRule());
		configInterface.add_specialize_backward_act(new reduce_quarter_backwardAdaptationRule());
		configInterface.add_specialize_left_act(new reduce_quarter_leftAdaptationRule());
		configInterface.add_specialize_right_act(new reduce_quarter_rightAdaptationRule());
		return configInterface;
	}

	@Override
	public boolean isTargetedNode(AdaptableNode<robLANG_ASOSInterface> node) {
		boolean match0 = true && (node instanceof Effector);
		if(match0){
			return true;
		}
		
		return false;
	}
	
	@Override
	public void init(RobLANG_ASOSAdaptationContext adaptationContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectSoftGoal(Softgoal softgoal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectResource(Resource resource) {
		// TODO Auto-generated method stub
		
	}
}
