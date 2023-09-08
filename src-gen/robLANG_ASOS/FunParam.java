package robLANG_ASOS;

import org.eclipse.emf.ecore.EObject;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Param</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunParam()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FunParam extends EObject, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

} // FunParam
