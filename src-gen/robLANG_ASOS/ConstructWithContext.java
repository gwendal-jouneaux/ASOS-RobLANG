package robLANG_ASOS;

import org.eclipse.emf.ecore.EObject;
import robLANG_ASOS.sd.ExecutionContext;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct With Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getConstructWithContext()
 * @model
 * @generated
 */
public interface ConstructWithContext extends EObject, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExecutionContext getContext();

} // ConstructWithContext
