package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.SymbolRefData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = SymbolRef.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class SymbolRefOp extends AdaptiveOperation<SymbolRef, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SymbolRef node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		SymbolRefData data = new SymbolRefData();
		
		while(true){
			Object termination = null;
			SymbolRefData local_data = new SymbolRefData();
		
			boolean validPatternInput220 = true;
			if(validPatternInput220)
			{
				if(config.before_symbol_ref() != null){
					config.before_symbol_ref().adapt(vis, node, data, config);
				}
				
				if(config.specialize_symbol_ref() != null){
					config.specialize_symbol_ref().adapt(vis, node, data, config);
				} else {
					 // prelude
					Object ctx = ((ConstructWithContext) node).getContext();
					 // prelude
					Object n = ((ExecutionContext) ctx).get((Variable) (data.getcomputed_variable() == null ? node.getVariable() : data.getcomputed_variable()));
					result = n;
				}
				
				if(config.after_symbol_ref() != null){
					if(result == null){
						config.after_symbol_ref().adapt(vis, node, data, config);
					} else {
						config.after_symbol_ref().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
					}
				}
				
				if(result != null){
					if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
						return ((Node) result).accept(vis, execCtx);
					} else {
						return result;
					}
				} else {
					continue;
				}
			}
		
			return termination;
		}
	}
}
