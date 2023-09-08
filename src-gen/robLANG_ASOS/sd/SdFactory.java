/**
 */
package robLANG_ASOS.sd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.sd.SdPackage
 * @generated
 */
public interface SdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdFactory eINSTANCE = robLANG_ASOS.sd.impl.SdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value String</em>'.
	 * @generated
	 */
	ValueString createValueString();

	/**
	 * Returns a new object of class '<em>Value Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Int</em>'.
	 * @generated
	 */
	ValueInt createValueInt();

	/**
	 * Returns a new object of class '<em>Value Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Double</em>'.
	 * @generated
	 */
	ValueDouble createValueDouble();

	/**
	 * Returns a new object of class '<em>Value Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Bool</em>'.
	 * @generated
	 */
	ValueBool createValueBool();

	/**
	 * Returns a new object of class '<em>Break Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Signal</em>'.
	 * @generated
	 */
	BreakSignal createBreakSignal();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Value</em>'.
	 * @generated
	 */
	ReturnValue createReturnValue();

	/**
	 * Returns a new object of class '<em>Execution Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Context</em>'.
	 * @generated
	 */
	ExecutionContext createExecutionContext();

	/**
	 * Returns a new object of class '<em>Runtime Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Error</em>'.
	 * @generated
	 */
	RuntimeError createRuntimeError();

	/**
	 * Returns a new object of class '<em>Nil Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nil Value</em>'.
	 * @generated
	 */
	NilValue createNilValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SdPackage getSdPackage();

} //SdFactory
