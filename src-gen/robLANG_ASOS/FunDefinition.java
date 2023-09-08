package robLANG_ASOS;

import org.eclipse.emf.common.util.EList;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.FunDefinition#getType <em>Type</em>}</li>
 *   <li>{@link robLANG_ASOS.FunDefinition#getName <em>Name</em>}</li>
 *   <li>{@link robLANG_ASOS.FunDefinition#getVarNames <em>Var Names</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FunDefinition extends ConstructWithContext, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.FunDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.FunDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Var Names</b></em>' containment reference list.
	 * The list contents are of type {@link robLANG_ASOS.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Names</em>' containment reference list.
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getFunDefinition_VarNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getVarNames();

} // FunDefinition
