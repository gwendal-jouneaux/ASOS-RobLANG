package robLANG_ASOS.interpreter;

import java.util.Map;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.lang.adaptation.AdaptationContext;
import robLANG_ASOS.StandaloneContext;
import robLANG_ASOS.impl.ConstructWithContextImpl;

public class RobLANG_ASOSAdaptationContext extends AdaptationContext<SelfAdaptiveRobLANG_ASOS> {

	@Override
	public Map<String, Double> readExpectedTradeOff() {
		return ((StandaloneContext) ConstructWithContextImpl.ctx).getTradeoff();
	}

	@Override
	public String[] propertiesOfInterest() {
		return new String[] {"Time", "Energy"};
	}

	@Override
	protected Resource[] environment() {
		return new Resource[] {new Resource("Battery")};
	}

}

