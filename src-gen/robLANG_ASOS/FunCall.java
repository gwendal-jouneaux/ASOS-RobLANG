package robLANG_ASOS;

import org.eclipse.emf.common.util.EList;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.FunCall#getFunction <em>Function</em>}</li>
 *   <li>{@link robLANG_ASOS.FunCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends Expression, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunDefinition)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunCall_Function()
	 * @model
	 * @generated
	 */
	FunDefinition getFunction();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.FunCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunDefinition value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link robLANG_ASOS.FunParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunParam> getParams();

} // FunCall
