package robLANG_ASOS.interpreter;

import fr.diverse.team.SEALS.lang.SelfAdaptableLanguage;
import fr.diverse.team.SEALS.lang.adaptation.FeedbackLoop;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;

public class SelfAdaptiveRobLANG_ASOS extends SelfAdaptableLanguage<RobLANG_ASOSAdaptationContext> {

	@Override
	protected RobLANG_ASOSAdaptationContext createAdaptationContext() {
		return new RobLANG_ASOSAdaptationContext();
	}

	@Override
	protected FeedbackLoop<?, RobLANG_ASOSAdaptationContext> createFeedbackLoop(RobLANG_ASOSAdaptationContext ctx) {
		return new RobLANG_ASOSFeedbackLoop(ctx);
	}

	@Override
	protected SelfAdaptiveVisitor createVisitor() {
		return new RobLANG_ASOSVisitor();
	}

}
