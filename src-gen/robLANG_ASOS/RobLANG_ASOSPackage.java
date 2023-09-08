/**
 */
package robLANG_ASOS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robLANG_ASOS.RobLANG_ASOSFactory
 * @model kind="package"
 * @generated
 */
public interface RobLANG_ASOSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robLANG_ASOS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robLANG_ASOS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robLANG_ASOS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobLANG_ASOSPackage eINSTANCE = robLANG_ASOS.impl.RobLANG_ASOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.RobotImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MAIN = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Executioncontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__EXECUTIONCONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.BlockImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.TypeImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.Symbol <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.Symbol
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ConstructWithContextImpl <em>Construct With Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ConstructWithContextImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getConstructWithContext()
	 * @generated
	 */
	int CONSTRUCT_WITH_CONTEXT = 72;

	/**
	 * The number of structural features of the '<em>Construct With Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_WITH_CONTEXT___GET_CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Construct With Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_WITH_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.FunDefinition <em>Fun Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.FunDefinition
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunDefinition()
	 * @generated
	 */
	int FUN_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION__TYPE = CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION__NAME = CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION__VAR_NAMES = CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fun Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION_FEATURE_COUNT = CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION___GET_CONTEXT = CONSTRUCT_WITH_CONTEXT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Fun Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_DEFINITION_OPERATION_COUNT = CONSTRUCT_WITH_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.InlineFunctionImpl <em>Inline Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.InlineFunctionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getInlineFunction()
	 * @generated
	 */
	int INLINE_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__TYPE = FUN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__NAME = FUN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION__EXPRESSION = FUN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION___GET_CONTEXT = FUN_DEFINITION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Inline Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ComplexFunctionImpl <em>Complex Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ComplexFunctionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getComplexFunction()
	 * @generated
	 */
	int COMPLEX_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__TYPE = FUN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__NAME = FUN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__VAR_NAMES = FUN_DEFINITION__VAR_NAMES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION__BODY = FUN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION_FEATURE_COUNT = FUN_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION___GET_CONTEXT = FUN_DEFINITION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Complex Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FUNCTION_OPERATION_COUNT = FUN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ParameterImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SYMBOL__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.FunParam <em>Fun Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.FunParam
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParam()
	 * @generated
	 */
	int FUN_PARAM = 8;

	/**
	 * The number of structural features of the '<em>Fun Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fun Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.StatementImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = CONSTRUCT_WITH_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___GET_CONTEXT = CONSTRUCT_WITH_CONTEXT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = CONSTRUCT_WITH_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.Expression
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 18;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.FunCallImpl <em>Fun Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.FunCallImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunCall()
	 * @generated
	 */
	int FUN_CALL = 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.VariableImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXPRESSION = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_CONTEXT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.AssignmentImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNEE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.PrintExpressionImpl <em>Print Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.PrintExpressionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getPrintExpression()
	 * @generated
	 */
	int PRINT_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_EXPRESSION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_EXPRESSION___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Print Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.LoopImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ConditionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IFZ = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSEZ = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ReturnImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.BreakLoopImpl <em>Break Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.BreakLoopImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBreakLoop()
	 * @generated
	 */
	int BREAK_LOOP = 17;

	/**
	 * The number of structural features of the '<em>Break Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_LOOP___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Break Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayExpressionImpl <em>Array Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayExpressionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayExpression()
	 * @generated
	 */
	int ARRAY_EXPRESSION = 19;

	/**
	 * The number of structural features of the '<em>Array Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EXPRESSION___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayStatementImpl <em>Array Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayStatementImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayStatement()
	 * @generated
	 */
	int ARRAY_STATEMENT = 20;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STATEMENT__ARRAY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STATEMENT___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayNewImpl <em>Array New</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayNewImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayNew()
	 * @generated
	 */
	int ARRAY_NEW = 21;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NEW__DIMENSION = ARRAY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NEW_FEATURE_COUNT = ARRAY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NEW___GET_CONTEXT = ARRAY_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NEW_OPERATION_COUNT = ARRAY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayLengthImpl <em>Array Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayLengthImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayLength()
	 * @generated
	 */
	int ARRAY_LENGTH = 22;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH__ARRAY = ARRAY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_FEATURE_COUNT = ARRAY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH___GET_CONTEXT = ARRAY_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_OPERATION_COUNT = ARRAY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayGetImpl <em>Array Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayGetImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayGet()
	 * @generated
	 */
	int ARRAY_GET = 23;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_GET__ARRAY = ARRAY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_GET__INDEX = ARRAY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_GET_FEATURE_COUNT = ARRAY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_GET___GET_CONTEXT = ARRAY_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_GET_OPERATION_COUNT = ARRAY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArraySetImpl <em>Array Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArraySetImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArraySet()
	 * @generated
	 */
	int ARRAY_SET = 24;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET__ARRAY = ARRAY_STATEMENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET__INDEX = ARRAY_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET__VALUE = ARRAY_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET_FEATURE_COUNT = ARRAY_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET___GET_CONTEXT = ARRAY_STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SET_OPERATION_COUNT = ARRAY_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayAddImpl <em>Array Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayAddImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayAdd()
	 * @generated
	 */
	int ARRAY_ADD = 25;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD__ARRAY = ARRAY_STATEMENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Value Or Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD__VALUE_OR_INDEX = ARRAY_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD__INDEXED_VALUE = ARRAY_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD_FEATURE_COUNT = ARRAY_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD___GET_CONTEXT = ARRAY_STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ADD_OPERATION_COUNT = ARRAY_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.ArrayRemoveImpl <em>Array Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.ArrayRemoveImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayRemove()
	 * @generated
	 */
	int ARRAY_REMOVE = 26;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REMOVE__ARRAY = ARRAY_STATEMENT__ARRAY;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REMOVE__INDEX = ARRAY_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REMOVE_FEATURE_COUNT = ARRAY_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REMOVE___GET_CONTEXT = ARRAY_STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Array Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REMOVE_OPERATION_COUNT = ARRAY_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathExpressionImpl <em>Math Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathExpressionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathExpression()
	 * @generated
	 */
	int MATH_EXPRESSION = 27;

	/**
	 * The number of structural features of the '<em>Math Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_EXPRESSION___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathSqrtImpl <em>Math Sqrt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathSqrtImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathSqrt()
	 * @generated
	 */
	int MATH_SQRT = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SQRT__EXPRESSION = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SQRT_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SQRT___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SQRT_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathPowImpl <em>Math Pow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathPowImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathPow()
	 * @generated
	 */
	int MATH_POW = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_POW__VALUE = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exponant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_POW__EXPONANT = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Math Pow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_POW_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_POW___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Pow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_POW_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathSinImpl <em>Math Sin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathSinImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathSin()
	 * @generated
	 */
	int MATH_SIN = 30;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SIN__EXPRESSION = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SIN_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SIN___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_SIN_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathCosImpl <em>Math Cos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathCosImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathCos()
	 * @generated
	 */
	int MATH_COS = 31;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_COS__EXPRESSION = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math Cos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_COS_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_COS___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Cos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_COS_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathAbsImpl <em>Math Abs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathAbsImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathAbs()
	 * @generated
	 */
	int MATH_ABS = 32;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ABS__EXPRESSION = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ABS_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ABS___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ABS_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MathModuloImpl <em>Math Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MathModuloImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathModulo()
	 * @generated
	 */
	int MATH_MODULO = 33;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_MODULO__LHS = MATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_MODULO__RHS = MATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Math Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_MODULO_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_MODULO___GET_CONTEXT = MATH_EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Math Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_MODULO_OPERATION_COUNT = MATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.EffectorImpl <em>Effector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.EffectorImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getEffector()
	 * @generated
	 */
	int EFFECTOR = 34;

	/**
	 * The number of structural features of the '<em>Effector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Effector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTOR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MoveImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 35;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DISTANCE = EFFECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = EFFECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE___GET_CONTEXT = EFFECTOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = EFFECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MoveForwardImpl <em>Move Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MoveForwardImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMoveForward()
	 * @generated
	 */
	int MOVE_FORWARD = 36;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD__DISTANCE = MOVE__DISTANCE;

	/**
	 * The number of structural features of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD___GET_CONTEXT = MOVE___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MoveBackwardImpl <em>Move Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MoveBackwardImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMoveBackward()
	 * @generated
	 */
	int MOVE_BACKWARD = 37;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_BACKWARD__DISTANCE = MOVE__DISTANCE;

	/**
	 * The number of structural features of the '<em>Move Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_BACKWARD_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_BACKWARD___GET_CONTEXT = MOVE___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Move Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_BACKWARD_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.TurnImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 38;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = EFFECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = EFFECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN___GET_CONTEXT = EFFECTOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = EFFECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.TurnLeftImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 39;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__ANGLE = TURN__ANGLE;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT___GET_CONTEXT = TURN___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.TurnRightImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 40;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__ANGLE = TURN__ANGLE;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT___GET_CONTEXT = TURN___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SpeedImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 41;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = EFFECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED___GET_CONTEXT = EFFECTOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = EFFECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SetNominalSpeedImpl <em>Set Nominal Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SetNominalSpeedImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSetNominalSpeed()
	 * @generated
	 */
	int SET_NOMINAL_SPEED = 42;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_NOMINAL_SPEED__SPEED = SPEED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Nominal Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_NOMINAL_SPEED_FEATURE_COUNT = SPEED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_NOMINAL_SPEED___GET_CONTEXT = SPEED___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Set Nominal Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_NOMINAL_SPEED_OPERATION_COUNT = SPEED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.GetMaxSpeedImpl <em>Get Max Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.GetMaxSpeedImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGetMaxSpeed()
	 * @generated
	 */
	int GET_MAX_SPEED = 43;

	/**
	 * The number of structural features of the '<em>Get Max Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAX_SPEED_FEATURE_COUNT = SPEED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAX_SPEED___GET_CONTEXT = SPEED___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Get Max Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_MAX_SPEED_OPERATION_COUNT = SPEED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SensorImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 44;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SenseTimeImpl <em>Sense Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SenseTimeImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseTime()
	 * @generated
	 */
	int SENSE_TIME = 45;

	/**
	 * The number of structural features of the '<em>Sense Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_TIME_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_TIME___GET_CONTEXT = SENSOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sense Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_TIME_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SenseBatteryImpl <em>Sense Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SenseBatteryImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseBattery()
	 * @generated
	 */
	int SENSE_BATTERY = 46;

	/**
	 * The number of structural features of the '<em>Sense Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_BATTERY_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_BATTERY___GET_CONTEXT = SENSOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sense Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_BATTERY_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SensePositionImpl <em>Sense Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SensePositionImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSensePosition()
	 * @generated
	 */
	int SENSE_POSITION = 47;

	/**
	 * The number of structural features of the '<em>Sense Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION___GET_CONTEXT = SENSOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sense Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_POSITION_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SenseDistanceImpl <em>Sense Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SenseDistanceImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseDistance()
	 * @generated
	 */
	int SENSE_DISTANCE = 48;

	/**
	 * The feature id for the '<em><b>Sensor Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_DISTANCE__SENSOR_INDEX = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sense Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_DISTANCE_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_DISTANCE___GET_CONTEXT = SENSOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sense Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_DISTANCE_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SenseCompassImpl <em>Sense Compass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SenseCompassImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseCompass()
	 * @generated
	 */
	int SENSE_COMPASS = 49;

	/**
	 * The number of structural features of the '<em>Sense Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_COMPASS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_COMPASS___GET_CONTEXT = SENSOR___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Sense Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_COMPASS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.TradeOffImpl <em>Trade Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.TradeOffImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTradeOff()
	 * @generated
	 */
	int TRADE_OFF = 50;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF__PROPERTIES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF__VALUES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trade Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF___GET_CONTEXT = STATEMENT___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Trade Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.FunParamExpImpl <em>Fun Param Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.FunParamExpImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParamExp()
	 * @generated
	 */
	int FUN_PARAM_EXP = 51;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP__EXPR = FUN_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fun Param Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fun Param Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_EXP_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.FunParamCaptureImpl <em>Fun Param Capture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.FunParamCaptureImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParamCapture()
	 * @generated
	 */
	int FUN_PARAM_CAPTURE = 52;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE__VARIABLE = FUN_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fun Param Capture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE_FEATURE_COUNT = FUN_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fun Param Capture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_PARAM_CAPTURE_OPERATION_COUNT = FUN_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.OrImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getOr()
	 * @generated
	 */
	int OR = 53;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.AndImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 54;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.EqualityImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 55;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.InequalityImpl <em>Inequality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.InequalityImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getInequality()
	 * @generated
	 */
	int INEQUALITY = 56;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.GreaterEqImpl <em>Greater Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.GreaterEqImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGreaterEq()
	 * @generated
	 */
	int GREATER_EQ = 57;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Greater Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.LessEqImpl <em>Less Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.LessEqImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLessEq()
	 * @generated
	 */
	int LESS_EQ = 58;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Less Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.GreaterImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 59;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.LessImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 60;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.PlusImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 61;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MinusImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 62;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.MultiplyImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 63;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.DivideImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 64;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.NotImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 65;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.IntConstantImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.DoubleConstantImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getDoubleConstant()
	 * @generated
	 */
	int DOUBLE_CONSTANT = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Double Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.StringConstantImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.BoolConstantImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.impl.SymbolRefImpl
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSymbolRef()
	 * @generated
	 */
	int SYMBOL_REF = 70;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.BinOp <em>Bin Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.BinOp
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBinOp()
	 * @generated
	 */
	int BIN_OP = 71;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP___GET_CONTEXT = EXPRESSION___GET_CONTEXT;

	/**
	 * The number of operations of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robLANG_ASOS.BasicType <em>Basic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robLANG_ASOS.BasicType
	 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 73;

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see robLANG_ASOS.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robLANG_ASOS.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Robot#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see robLANG_ASOS.Robot#getMain()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link robLANG_ASOS.Robot#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see robLANG_ASOS.Robot#getFunctions()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Functions();

	/**
	 * Returns the meta object for the reference '{@link robLANG_ASOS.Robot#getExecutioncontext <em>Executioncontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executioncontext</em>'.
	 * @see robLANG_ASOS.Robot#getExecutioncontext()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Executioncontext();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see robLANG_ASOS.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link robLANG_ASOS.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see robLANG_ASOS.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see robLANG_ASOS.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robLANG_ASOS.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.Type#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see robLANG_ASOS.Type#getDimension()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Dimension();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see robLANG_ASOS.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Symbol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see robLANG_ASOS.Symbol#getType()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Type();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.Symbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robLANG_ASOS.Symbol#getName()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Name();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.FunDefinition <em>Fun Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Definition</em>'.
	 * @see robLANG_ASOS.FunDefinition
	 * @generated
	 */
	EClass getFunDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.FunDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see robLANG_ASOS.FunDefinition#getType()
	 * @see #getFunDefinition()
	 * @generated
	 */
	EReference getFunDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.FunDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robLANG_ASOS.FunDefinition#getName()
	 * @see #getFunDefinition()
	 * @generated
	 */
	EAttribute getFunDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robLANG_ASOS.FunDefinition#getVarNames <em>Var Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Names</em>'.
	 * @see robLANG_ASOS.FunDefinition#getVarNames()
	 * @see #getFunDefinition()
	 * @generated
	 */
	EReference getFunDefinition_VarNames();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.InlineFunction <em>Inline Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Function</em>'.
	 * @see robLANG_ASOS.InlineFunction
	 * @generated
	 */
	EClass getInlineFunction();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.InlineFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.InlineFunction#getExpression()
	 * @see #getInlineFunction()
	 * @generated
	 */
	EReference getInlineFunction_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ComplexFunction <em>Complex Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Function</em>'.
	 * @see robLANG_ASOS.ComplexFunction
	 * @generated
	 */
	EClass getComplexFunction();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ComplexFunction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see robLANG_ASOS.ComplexFunction#getBody()
	 * @see #getComplexFunction()
	 * @generated
	 */
	EReference getComplexFunction_Body();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see robLANG_ASOS.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.FunParam <em>Fun Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param</em>'.
	 * @see robLANG_ASOS.FunParam
	 * @generated
	 */
	EClass getFunParam();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Call</em>'.
	 * @see robLANG_ASOS.FunCall
	 * @generated
	 */
	EClass getFunCall();

	/**
	 * Returns the meta object for the reference '{@link robLANG_ASOS.FunCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see robLANG_ASOS.FunCall#getFunction()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link robLANG_ASOS.FunCall#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see robLANG_ASOS.FunCall#getParams()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Params();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see robLANG_ASOS.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see robLANG_ASOS.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Variable#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Variable#getExpression()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see robLANG_ASOS.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link robLANG_ASOS.Assignment#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see robLANG_ASOS.Assignment#getAssignee()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Assignee();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.PrintExpression <em>Print Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Expression</em>'.
	 * @see robLANG_ASOS.PrintExpression
	 * @generated
	 */
	EClass getPrintExpression();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.PrintExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.PrintExpression#getExpression()
	 * @see #getPrintExpression()
	 * @generated
	 */
	EReference getPrintExpression_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see robLANG_ASOS.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Loop#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Loop#getExpression()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see robLANG_ASOS.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see robLANG_ASOS.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Condition#getIfz <em>Ifz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifz</em>'.
	 * @see robLANG_ASOS.Condition#getIfz()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Ifz();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Condition#getElsez <em>Elsez</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsez</em>'.
	 * @see robLANG_ASOS.Condition#getElsez()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Elsez();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see robLANG_ASOS.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Return#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Return#getExpression()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.BreakLoop <em>Break Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Loop</em>'.
	 * @see robLANG_ASOS.BreakLoop
	 * @generated
	 */
	EClass getBreakLoop();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robLANG_ASOS.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayExpression <em>Array Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Expression</em>'.
	 * @see robLANG_ASOS.ArrayExpression
	 * @generated
	 */
	EClass getArrayExpression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayStatement <em>Array Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Statement</em>'.
	 * @see robLANG_ASOS.ArrayStatement
	 * @generated
	 */
	EClass getArrayStatement();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayStatement#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see robLANG_ASOS.ArrayStatement#getArray()
	 * @see #getArrayStatement()
	 * @generated
	 */
	EReference getArrayStatement_Array();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayNew <em>Array New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array New</em>'.
	 * @see robLANG_ASOS.ArrayNew
	 * @generated
	 */
	EClass getArrayNew();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.ArrayNew#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see robLANG_ASOS.ArrayNew#getDimension()
	 * @see #getArrayNew()
	 * @generated
	 */
	EAttribute getArrayNew_Dimension();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayLength <em>Array Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Length</em>'.
	 * @see robLANG_ASOS.ArrayLength
	 * @generated
	 */
	EClass getArrayLength();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayLength#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see robLANG_ASOS.ArrayLength#getArray()
	 * @see #getArrayLength()
	 * @generated
	 */
	EReference getArrayLength_Array();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayGet <em>Array Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Get</em>'.
	 * @see robLANG_ASOS.ArrayGet
	 * @generated
	 */
	EClass getArrayGet();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayGet#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see robLANG_ASOS.ArrayGet#getArray()
	 * @see #getArrayGet()
	 * @generated
	 */
	EReference getArrayGet_Array();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayGet#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see robLANG_ASOS.ArrayGet#getIndex()
	 * @see #getArrayGet()
	 * @generated
	 */
	EReference getArrayGet_Index();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArraySet <em>Array Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Set</em>'.
	 * @see robLANG_ASOS.ArraySet
	 * @generated
	 */
	EClass getArraySet();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArraySet#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see robLANG_ASOS.ArraySet#getIndex()
	 * @see #getArraySet()
	 * @generated
	 */
	EReference getArraySet_Index();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArraySet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see robLANG_ASOS.ArraySet#getValue()
	 * @see #getArraySet()
	 * @generated
	 */
	EReference getArraySet_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayAdd <em>Array Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Add</em>'.
	 * @see robLANG_ASOS.ArrayAdd
	 * @generated
	 */
	EClass getArrayAdd();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayAdd#getValueOrIndex <em>Value Or Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Or Index</em>'.
	 * @see robLANG_ASOS.ArrayAdd#getValueOrIndex()
	 * @see #getArrayAdd()
	 * @generated
	 */
	EReference getArrayAdd_ValueOrIndex();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayAdd#getIndexedValue <em>Indexed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexed Value</em>'.
	 * @see robLANG_ASOS.ArrayAdd#getIndexedValue()
	 * @see #getArrayAdd()
	 * @generated
	 */
	EReference getArrayAdd_IndexedValue();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ArrayRemove <em>Array Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Remove</em>'.
	 * @see robLANG_ASOS.ArrayRemove
	 * @generated
	 */
	EClass getArrayRemove();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.ArrayRemove#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see robLANG_ASOS.ArrayRemove#getIndex()
	 * @see #getArrayRemove()
	 * @generated
	 */
	EReference getArrayRemove_Index();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathExpression <em>Math Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Expression</em>'.
	 * @see robLANG_ASOS.MathExpression
	 * @generated
	 */
	EClass getMathExpression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathSqrt <em>Math Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Sqrt</em>'.
	 * @see robLANG_ASOS.MathSqrt
	 * @generated
	 */
	EClass getMathSqrt();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathSqrt#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.MathSqrt#getExpression()
	 * @see #getMathSqrt()
	 * @generated
	 */
	EReference getMathSqrt_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathPow <em>Math Pow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Pow</em>'.
	 * @see robLANG_ASOS.MathPow
	 * @generated
	 */
	EClass getMathPow();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathPow#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see robLANG_ASOS.MathPow#getValue()
	 * @see #getMathPow()
	 * @generated
	 */
	EReference getMathPow_Value();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathPow#getExponant <em>Exponant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exponant</em>'.
	 * @see robLANG_ASOS.MathPow#getExponant()
	 * @see #getMathPow()
	 * @generated
	 */
	EReference getMathPow_Exponant();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathSin <em>Math Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Sin</em>'.
	 * @see robLANG_ASOS.MathSin
	 * @generated
	 */
	EClass getMathSin();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathSin#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.MathSin#getExpression()
	 * @see #getMathSin()
	 * @generated
	 */
	EReference getMathSin_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathCos <em>Math Cos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Cos</em>'.
	 * @see robLANG_ASOS.MathCos
	 * @generated
	 */
	EClass getMathCos();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathCos#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.MathCos#getExpression()
	 * @see #getMathCos()
	 * @generated
	 */
	EReference getMathCos_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathAbs <em>Math Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Abs</em>'.
	 * @see robLANG_ASOS.MathAbs
	 * @generated
	 */
	EClass getMathAbs();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathAbs#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.MathAbs#getExpression()
	 * @see #getMathAbs()
	 * @generated
	 */
	EReference getMathAbs_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MathModulo <em>Math Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Modulo</em>'.
	 * @see robLANG_ASOS.MathModulo
	 * @generated
	 */
	EClass getMathModulo();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathModulo#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see robLANG_ASOS.MathModulo#getLhs()
	 * @see #getMathModulo()
	 * @generated
	 */
	EReference getMathModulo_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.MathModulo#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see robLANG_ASOS.MathModulo#getRhs()
	 * @see #getMathModulo()
	 * @generated
	 */
	EReference getMathModulo_Rhs();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Effector <em>Effector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effector</em>'.
	 * @see robLANG_ASOS.Effector
	 * @generated
	 */
	EClass getEffector();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see robLANG_ASOS.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Move#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see robLANG_ASOS.Move#getDistance()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Distance();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Forward</em>'.
	 * @see robLANG_ASOS.MoveForward
	 * @generated
	 */
	EClass getMoveForward();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.MoveBackward <em>Move Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Backward</em>'.
	 * @see robLANG_ASOS.MoveBackward
	 * @generated
	 */
	EClass getMoveBackward();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see robLANG_ASOS.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Turn#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see robLANG_ASOS.Turn#getAngle()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Angle();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see robLANG_ASOS.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see robLANG_ASOS.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed</em>'.
	 * @see robLANG_ASOS.Speed
	 * @generated
	 */
	EClass getSpeed();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SetNominalSpeed <em>Set Nominal Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Nominal Speed</em>'.
	 * @see robLANG_ASOS.SetNominalSpeed
	 * @generated
	 */
	EClass getSetNominalSpeed();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.SetNominalSpeed#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see robLANG_ASOS.SetNominalSpeed#getSpeed()
	 * @see #getSetNominalSpeed()
	 * @generated
	 */
	EReference getSetNominalSpeed_Speed();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.GetMaxSpeed <em>Get Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Max Speed</em>'.
	 * @see robLANG_ASOS.GetMaxSpeed
	 * @generated
	 */
	EClass getGetMaxSpeed();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see robLANG_ASOS.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SenseTime <em>Sense Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Time</em>'.
	 * @see robLANG_ASOS.SenseTime
	 * @generated
	 */
	EClass getSenseTime();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SenseBattery <em>Sense Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Battery</em>'.
	 * @see robLANG_ASOS.SenseBattery
	 * @generated
	 */
	EClass getSenseBattery();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SensePosition <em>Sense Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Position</em>'.
	 * @see robLANG_ASOS.SensePosition
	 * @generated
	 */
	EClass getSensePosition();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SenseDistance <em>Sense Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Distance</em>'.
	 * @see robLANG_ASOS.SenseDistance
	 * @generated
	 */
	EClass getSenseDistance();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.SenseDistance#getSensorIndex <em>Sensor Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Index</em>'.
	 * @see robLANG_ASOS.SenseDistance#getSensorIndex()
	 * @see #getSenseDistance()
	 * @generated
	 */
	EAttribute getSenseDistance_SensorIndex();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SenseCompass <em>Sense Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Compass</em>'.
	 * @see robLANG_ASOS.SenseCompass
	 * @generated
	 */
	EClass getSenseCompass();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.TradeOff <em>Trade Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Off</em>'.
	 * @see robLANG_ASOS.TradeOff
	 * @generated
	 */
	EClass getTradeOff();

	/**
	 * Returns the meta object for the attribute list '{@link robLANG_ASOS.TradeOff#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see robLANG_ASOS.TradeOff#getProperties()
	 * @see #getTradeOff()
	 * @generated
	 */
	EAttribute getTradeOff_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link robLANG_ASOS.TradeOff#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see robLANG_ASOS.TradeOff#getValues()
	 * @see #getTradeOff()
	 * @generated
	 */
	EReference getTradeOff_Values();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.FunParamExp <em>Fun Param Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param Exp</em>'.
	 * @see robLANG_ASOS.FunParamExp
	 * @generated
	 */
	EClass getFunParamExp();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.FunParamExp#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see robLANG_ASOS.FunParamExp#getExpr()
	 * @see #getFunParamExp()
	 * @generated
	 */
	EReference getFunParamExp_Expr();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.FunParamCapture <em>Fun Param Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Param Capture</em>'.
	 * @see robLANG_ASOS.FunParamCapture
	 * @generated
	 */
	EClass getFunParamCapture();

	/**
	 * Returns the meta object for the reference '{@link robLANG_ASOS.FunParamCapture#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see robLANG_ASOS.FunParamCapture#getVariable()
	 * @see #getFunParamCapture()
	 * @generated
	 */
	EReference getFunParamCapture_Variable();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robLANG_ASOS.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see robLANG_ASOS.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see robLANG_ASOS.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality</em>'.
	 * @see robLANG_ASOS.Inequality
	 * @generated
	 */
	EClass getInequality();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.GreaterEq <em>Greater Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Eq</em>'.
	 * @see robLANG_ASOS.GreaterEq
	 * @generated
	 */
	EClass getGreaterEq();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.LessEq <em>Less Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Eq</em>'.
	 * @see robLANG_ASOS.LessEq
	 * @generated
	 */
	EClass getLessEq();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see robLANG_ASOS.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see robLANG_ASOS.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see robLANG_ASOS.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see robLANG_ASOS.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see robLANG_ASOS.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see robLANG_ASOS.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see robLANG_ASOS.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see robLANG_ASOS.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see robLANG_ASOS.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.DoubleConstant <em>Double Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Constant</em>'.
	 * @see robLANG_ASOS.DoubleConstant
	 * @generated
	 */
	EClass getDoubleConstant();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.DoubleConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.DoubleConstant#getValue()
	 * @see #getDoubleConstant()
	 * @generated
	 */
	EAttribute getDoubleConstant_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see robLANG_ASOS.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see robLANG_ASOS.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link robLANG_ASOS.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robLANG_ASOS.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Ref</em>'.
	 * @see robLANG_ASOS.SymbolRef
	 * @generated
	 */
	EClass getSymbolRef();

	/**
	 * Returns the meta object for the reference '{@link robLANG_ASOS.SymbolRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see robLANG_ASOS.SymbolRef#getVariable()
	 * @see #getSymbolRef()
	 * @generated
	 */
	EReference getSymbolRef_Variable();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op</em>'.
	 * @see robLANG_ASOS.BinOp
	 * @generated
	 */
	EClass getBinOp();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.BinOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see robLANG_ASOS.BinOp#getLeft()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Left();

	/**
	 * Returns the meta object for the containment reference '{@link robLANG_ASOS.BinOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see robLANG_ASOS.BinOp#getRight()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Right();

	/**
	 * Returns the meta object for class '{@link robLANG_ASOS.ConstructWithContext <em>Construct With Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct With Context</em>'.
	 * @see robLANG_ASOS.ConstructWithContext
	 * @generated
	 */
	EClass getConstructWithContext();

	/**
	 * Returns the meta object for the '{@link robLANG_ASOS.ConstructWithContext#getContext() <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context</em>' operation.
	 * @see robLANG_ASOS.ConstructWithContext#getContext()
	 * @generated
	 */
	EOperation getConstructWithContext__GetContext();

	/**
	 * Returns the meta object for enum '{@link robLANG_ASOS.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Type</em>'.
	 * @see robLANG_ASOS.BasicType
	 * @generated
	 */
	EEnum getBasicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobLANG_ASOSFactory getRobLANG_ASOSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.RobotImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MAIN = eINSTANCE.getRobot_Main();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__FUNCTIONS = eINSTANCE.getRobot_Functions();

		/**
		 * The meta object literal for the '<em><b>Executioncontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__EXECUTIONCONTEXT = eINSTANCE.getRobot_Executioncontext();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.BlockImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.TypeImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__DIMENSION = eINSTANCE.getType_Dimension();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.Symbol <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.Symbol
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__TYPE = eINSTANCE.getSymbol_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.FunDefinition <em>Fun Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.FunDefinition
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunDefinition()
		 * @generated
		 */
		EClass FUN_DEFINITION = eINSTANCE.getFunDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_DEFINITION__TYPE = eINSTANCE.getFunDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN_DEFINITION__NAME = eINSTANCE.getFunDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Var Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_DEFINITION__VAR_NAMES = eINSTANCE.getFunDefinition_VarNames();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.InlineFunctionImpl <em>Inline Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.InlineFunctionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getInlineFunction()
		 * @generated
		 */
		EClass INLINE_FUNCTION = eINSTANCE.getInlineFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_FUNCTION__EXPRESSION = eINSTANCE.getInlineFunction_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ComplexFunctionImpl <em>Complex Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ComplexFunctionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getComplexFunction()
		 * @generated
		 */
		EClass COMPLEX_FUNCTION = eINSTANCE.getComplexFunction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_FUNCTION__BODY = eINSTANCE.getComplexFunction_Body();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ParameterImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.FunParam <em>Fun Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.FunParam
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParam()
		 * @generated
		 */
		EClass FUN_PARAM = eINSTANCE.getFunParam();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.FunCallImpl <em>Fun Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.FunCallImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunCall()
		 * @generated
		 */
		EClass FUN_CALL = eINSTANCE.getFunCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__FUNCTION = eINSTANCE.getFunCall_Function();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__PARAMS = eINSTANCE.getFunCall_Params();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.StatementImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.VariableImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__EXPRESSION = eINSTANCE.getVariable_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.AssignmentImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNEE = eINSTANCE.getAssignment_Assignee();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.PrintExpressionImpl <em>Print Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.PrintExpressionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getPrintExpression()
		 * @generated
		 */
		EClass PRINT_EXPRESSION = eINSTANCE.getPrintExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT_EXPRESSION__EXPRESSION = eINSTANCE.getPrintExpression_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.LoopImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__EXPRESSION = eINSTANCE.getLoop_Expression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ConditionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Ifz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__IFZ = eINSTANCE.getCondition_Ifz();

		/**
		 * The meta object literal for the '<em><b>Elsez</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSEZ = eINSTANCE.getCondition_Elsez();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ReturnImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__EXPRESSION = eINSTANCE.getReturn_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.BreakLoopImpl <em>Break Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.BreakLoopImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBreakLoop()
		 * @generated
		 */
		EClass BREAK_LOOP = eINSTANCE.getBreakLoop();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.Expression
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayExpressionImpl <em>Array Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayExpressionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayExpression()
		 * @generated
		 */
		EClass ARRAY_EXPRESSION = eINSTANCE.getArrayExpression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayStatementImpl <em>Array Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayStatementImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayStatement()
		 * @generated
		 */
		EClass ARRAY_STATEMENT = eINSTANCE.getArrayStatement();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_STATEMENT__ARRAY = eINSTANCE.getArrayStatement_Array();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayNewImpl <em>Array New</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayNewImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayNew()
		 * @generated
		 */
		EClass ARRAY_NEW = eINSTANCE.getArrayNew();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_NEW__DIMENSION = eINSTANCE.getArrayNew_Dimension();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayLengthImpl <em>Array Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayLengthImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayLength()
		 * @generated
		 */
		EClass ARRAY_LENGTH = eINSTANCE.getArrayLength();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_LENGTH__ARRAY = eINSTANCE.getArrayLength_Array();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayGetImpl <em>Array Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayGetImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayGet()
		 * @generated
		 */
		EClass ARRAY_GET = eINSTANCE.getArrayGet();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_GET__ARRAY = eINSTANCE.getArrayGet_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_GET__INDEX = eINSTANCE.getArrayGet_Index();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArraySetImpl <em>Array Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArraySetImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArraySet()
		 * @generated
		 */
		EClass ARRAY_SET = eINSTANCE.getArraySet();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SET__INDEX = eINSTANCE.getArraySet_Index();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SET__VALUE = eINSTANCE.getArraySet_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayAddImpl <em>Array Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayAddImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayAdd()
		 * @generated
		 */
		EClass ARRAY_ADD = eINSTANCE.getArrayAdd();

		/**
		 * The meta object literal for the '<em><b>Value Or Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ADD__VALUE_OR_INDEX = eINSTANCE.getArrayAdd_ValueOrIndex();

		/**
		 * The meta object literal for the '<em><b>Indexed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ADD__INDEXED_VALUE = eINSTANCE.getArrayAdd_IndexedValue();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ArrayRemoveImpl <em>Array Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ArrayRemoveImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getArrayRemove()
		 * @generated
		 */
		EClass ARRAY_REMOVE = eINSTANCE.getArrayRemove();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_REMOVE__INDEX = eINSTANCE.getArrayRemove_Index();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathExpressionImpl <em>Math Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathExpressionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathExpression()
		 * @generated
		 */
		EClass MATH_EXPRESSION = eINSTANCE.getMathExpression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathSqrtImpl <em>Math Sqrt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathSqrtImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathSqrt()
		 * @generated
		 */
		EClass MATH_SQRT = eINSTANCE.getMathSqrt();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_SQRT__EXPRESSION = eINSTANCE.getMathSqrt_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathPowImpl <em>Math Pow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathPowImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathPow()
		 * @generated
		 */
		EClass MATH_POW = eINSTANCE.getMathPow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_POW__VALUE = eINSTANCE.getMathPow_Value();

		/**
		 * The meta object literal for the '<em><b>Exponant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_POW__EXPONANT = eINSTANCE.getMathPow_Exponant();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathSinImpl <em>Math Sin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathSinImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathSin()
		 * @generated
		 */
		EClass MATH_SIN = eINSTANCE.getMathSin();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_SIN__EXPRESSION = eINSTANCE.getMathSin_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathCosImpl <em>Math Cos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathCosImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathCos()
		 * @generated
		 */
		EClass MATH_COS = eINSTANCE.getMathCos();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_COS__EXPRESSION = eINSTANCE.getMathCos_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathAbsImpl <em>Math Abs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathAbsImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathAbs()
		 * @generated
		 */
		EClass MATH_ABS = eINSTANCE.getMathAbs();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_ABS__EXPRESSION = eINSTANCE.getMathAbs_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MathModuloImpl <em>Math Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MathModuloImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMathModulo()
		 * @generated
		 */
		EClass MATH_MODULO = eINSTANCE.getMathModulo();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_MODULO__LHS = eINSTANCE.getMathModulo_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_MODULO__RHS = eINSTANCE.getMathModulo_Rhs();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.EffectorImpl <em>Effector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.EffectorImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getEffector()
		 * @generated
		 */
		EClass EFFECTOR = eINSTANCE.getEffector();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MoveImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__DISTANCE = eINSTANCE.getMove_Distance();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MoveForwardImpl <em>Move Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MoveForwardImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMoveForward()
		 * @generated
		 */
		EClass MOVE_FORWARD = eINSTANCE.getMoveForward();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MoveBackwardImpl <em>Move Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MoveBackwardImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMoveBackward()
		 * @generated
		 */
		EClass MOVE_BACKWARD = eINSTANCE.getMoveBackward();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.TurnImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__ANGLE = eINSTANCE.getTurn_Angle();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.TurnLeftImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.TurnRightImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SpeedImpl <em>Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SpeedImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSpeed()
		 * @generated
		 */
		EClass SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SetNominalSpeedImpl <em>Set Nominal Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SetNominalSpeedImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSetNominalSpeed()
		 * @generated
		 */
		EClass SET_NOMINAL_SPEED = eINSTANCE.getSetNominalSpeed();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_NOMINAL_SPEED__SPEED = eINSTANCE.getSetNominalSpeed_Speed();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.GetMaxSpeedImpl <em>Get Max Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.GetMaxSpeedImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGetMaxSpeed()
		 * @generated
		 */
		EClass GET_MAX_SPEED = eINSTANCE.getGetMaxSpeed();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SensorImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SenseTimeImpl <em>Sense Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SenseTimeImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseTime()
		 * @generated
		 */
		EClass SENSE_TIME = eINSTANCE.getSenseTime();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SenseBatteryImpl <em>Sense Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SenseBatteryImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseBattery()
		 * @generated
		 */
		EClass SENSE_BATTERY = eINSTANCE.getSenseBattery();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SensePositionImpl <em>Sense Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SensePositionImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSensePosition()
		 * @generated
		 */
		EClass SENSE_POSITION = eINSTANCE.getSensePosition();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SenseDistanceImpl <em>Sense Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SenseDistanceImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseDistance()
		 * @generated
		 */
		EClass SENSE_DISTANCE = eINSTANCE.getSenseDistance();

		/**
		 * The meta object literal for the '<em><b>Sensor Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_DISTANCE__SENSOR_INDEX = eINSTANCE.getSenseDistance_SensorIndex();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SenseCompassImpl <em>Sense Compass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SenseCompassImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSenseCompass()
		 * @generated
		 */
		EClass SENSE_COMPASS = eINSTANCE.getSenseCompass();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.TradeOffImpl <em>Trade Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.TradeOffImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getTradeOff()
		 * @generated
		 */
		EClass TRADE_OFF = eINSTANCE.getTradeOff();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_OFF__PROPERTIES = eINSTANCE.getTradeOff_Properties();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_OFF__VALUES = eINSTANCE.getTradeOff_Values();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.FunParamExpImpl <em>Fun Param Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.FunParamExpImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParamExp()
		 * @generated
		 */
		EClass FUN_PARAM_EXP = eINSTANCE.getFunParamExp();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_PARAM_EXP__EXPR = eINSTANCE.getFunParamExp_Expr();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.FunParamCaptureImpl <em>Fun Param Capture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.FunParamCaptureImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getFunParamCapture()
		 * @generated
		 */
		EClass FUN_PARAM_CAPTURE = eINSTANCE.getFunParamCapture();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_PARAM_CAPTURE__VARIABLE = eINSTANCE.getFunParamCapture_Variable();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.OrImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.AndImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.EqualityImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.InequalityImpl <em>Inequality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.InequalityImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getInequality()
		 * @generated
		 */
		EClass INEQUALITY = eINSTANCE.getInequality();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.GreaterEqImpl <em>Greater Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.GreaterEqImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGreaterEq()
		 * @generated
		 */
		EClass GREATER_EQ = eINSTANCE.getGreaterEq();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.LessEqImpl <em>Less Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.LessEqImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLessEq()
		 * @generated
		 */
		EClass LESS_EQ = eINSTANCE.getLessEq();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.GreaterImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.LessImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.PlusImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MinusImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.MultiplyImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.DivideImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.NotImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.IntConstantImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.DoubleConstantImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getDoubleConstant()
		 * @generated
		 */
		EClass DOUBLE_CONSTANT = eINSTANCE.getDoubleConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_CONSTANT__VALUE = eINSTANCE.getDoubleConstant_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.StringConstantImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.BoolConstantImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.SymbolRefImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getSymbolRef()
		 * @generated
		 */
		EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_REF__VARIABLE = eINSTANCE.getSymbolRef_Variable();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.BinOp <em>Bin Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.BinOp
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBinOp()
		 * @generated
		 */
		EClass BIN_OP = eINSTANCE.getBinOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__LEFT = eINSTANCE.getBinOp_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__RIGHT = eINSTANCE.getBinOp_Right();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.impl.ConstructWithContextImpl <em>Construct With Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.impl.ConstructWithContextImpl
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getConstructWithContext()
		 * @generated
		 */
		EClass CONSTRUCT_WITH_CONTEXT = eINSTANCE.getConstructWithContext();

		/**
		 * The meta object literal for the '<em><b>Get Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRUCT_WITH_CONTEXT___GET_CONTEXT = eINSTANCE.getConstructWithContext__GetContext();

		/**
		 * The meta object literal for the '{@link robLANG_ASOS.BasicType <em>Basic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robLANG_ASOS.BasicType
		 * @see robLANG_ASOS.impl.RobLANG_ASOSPackageImpl#getBasicType()
		 * @generated
		 */
		EEnum BASIC_TYPE = eINSTANCE.getBasicType();

	}

} //RobLANG_ASOSPackage
