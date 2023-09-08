package robLANG_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import org.eclipse.emf.common.util.EList;

import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Off</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.TradeOff#getProperties <em>Properties</em>}</li>
 *   <li>{@link robLANG_ASOS.TradeOff#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getTradeOff()
 * @model
 * @generated
 */
public interface TradeOff extends Statement, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute list.
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getTradeOff_Properties()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getProperties();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link robLANG_ASOS.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getTradeOff_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // TradeOff
