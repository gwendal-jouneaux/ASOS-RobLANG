package robLANG_ASOS;

import org.eclipse.emf.ecore.EObject;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.Symbol#getType <em>Type</em>}</li>
 *   <li>{@link robLANG_ASOS.Symbol#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getSymbol()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Symbol extends EObject, AdaptableNode<robLANG_ASOSInterface> {
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
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getSymbol_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Symbol#getType <em>Type</em>}' containment reference.
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
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getSymbol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Symbol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Symbol
