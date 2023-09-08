package robLANG_ASOS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import robLANG_ASOS.sd.ExecutionContext;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.Robot#getName <em>Name</em>}</li>
 *   <li>{@link robLANG_ASOS.Robot#getMain <em>Main</em>}</li>
 *   <li>{@link robLANG_ASOS.Robot#getFunctions <em>Functions</em>}</li>
 *   <li>{@link robLANG_ASOS.Robot#getExecutioncontext <em>Executioncontext</em>}</li>
 * </ul>
 *
 * @see robLANG_ASOS.RobLANG_ASOSPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject, AdaptableNode<robLANG_ASOSInterface> {
	@Override
	default public robLANG_ASOSInterface defaultInterface() {
		return new robLANG_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getRobot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(FunDefinition)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getRobot_Main()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunDefinition getMain();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Robot#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(FunDefinition value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link robLANG_ASOS.FunDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getRobot_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunDefinition> getFunctions();

	/**
	 * Returns the value of the '<em><b>Executioncontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executioncontext</em>' reference.
	 * @see #setExecutioncontext(ExecutionContext)
	 * @see robLANG_ASOS.RobLANG_ASOSPackage#getRobot_Executioncontext()
	 * @model
	 * @generated
	 */
	ExecutionContext getExecutioncontext();

	/**
	 * Sets the value of the '{@link robLANG_ASOS.Robot#getExecutioncontext <em>Executioncontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executioncontext</em>' reference.
	 * @see #getExecutioncontext()
	 * @generated
	 */
	void setExecutioncontext(ExecutionContext value);

} // Robot
