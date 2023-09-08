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
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link robLANG_ASOS.Condition#getIfz <em>Ifz</em>}</li>
 *   <li>{@link robLANG_ASOS.Condition#getElsez <em>Elsez</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Statement, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Condition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Ifz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifz</em>' containment reference.
	 * @see #setIfz(Block)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getCondition_Ifz()
	 * @model containment="true"
	 * @generated
	 */
	Block getIfz();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Condition#getIfz <em>Ifz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifz</em>' containment reference.
	 * @see #getIfz()
	 * @generated
	 */
	void setIfz(Block value);

	/**
	 * Returns the value of the '<em><b>Elsez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsez</em>' containment reference.
	 * @see #setElsez(Block)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getCondition_Elsez()
	 * @model containment="true"
	 * @generated
	 */
	Block getElsez();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Condition#getElsez <em>Elsez</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsez</em>' containment reference.
	 * @see #getElsez()
	 * @generated
	 */
	void setElsez(Block value);

} // Condition
