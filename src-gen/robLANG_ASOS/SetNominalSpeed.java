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
 * A representation of the model object '<em><b>Set Nominal Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.SetNominalSpeed#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getSetNominalSpeed()
 * @model
 * @generated
 */
public interface SetNominalSpeed extends Speed, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(Expression)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getSetNominalSpeed_Speed()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSpeed();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.SetNominalSpeed#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Expression value);

} // SetNominalSpeed
