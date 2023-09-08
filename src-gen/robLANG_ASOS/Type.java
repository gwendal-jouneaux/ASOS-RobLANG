package robLANG_ASOS;

import org.eclipse.emf.ecore.EObject;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.Type#getType <em>Type</em>}</li>
 *   <li>{@link robLANG_ASOS.Type#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robLANG_ASOS.BasicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robLANG_ASOS.BasicType
	 * @see #setType(BasicType)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getType_Type()
	 * @model
	 * @generated
	 */
	BasicType getType();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Type#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robLANG_ASOS.BasicType
	 * @see #getType()
	 * @generated
	 */
	void setType(BasicType value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getType_Dimension()
	 * @model
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Type#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);

} // Type
