package robLANG_ASOS.ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;

public abstract class AdaptationRule {

	private AdaptationRule next;

	public void chain(AdaptationRule next) {
		this.next = next;
	}

	public abstract Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> node, Object execCtx, SemanticsAdaptationInterface config);

}

