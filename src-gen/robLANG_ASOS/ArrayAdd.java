package robLANG_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.ArrayAdd#getValueOrIndex <em>Value Or Index</em>}</li>
 *   <li>{@link robLANG_ASOS.ArrayAdd#getIndexedValue <em>Indexed Value</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getArrayAdd()
 * @model
 * @generated
 */
public interface ArrayAdd extends ArrayStatement, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Value Or Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Or Index</em>' containment reference.
	 * @see #setValueOrIndex(Expression)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getArrayAdd_ValueOrIndex()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValueOrIndex();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.ArrayAdd#getValueOrIndex <em>Value Or Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Or Index</em>' containment reference.
	 * @see #getValueOrIndex()
	 * @generated
	 */
	void setValueOrIndex(Expression value);

	/**
	 * Returns the value of the '<em><b>Indexed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Value</em>' containment reference.
	 * @see #setIndexedValue(Expression)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getArrayAdd_IndexedValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIndexedValue();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.ArrayAdd#getIndexedValue <em>Indexed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed Value</em>' containment reference.
	 * @see #getIndexedValue()
	 * @generated
	 */
	void setIndexedValue(Expression value);

} // ArrayAdd
