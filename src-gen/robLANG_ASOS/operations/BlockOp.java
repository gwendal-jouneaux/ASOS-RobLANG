package robLANG_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import robLANG_ASOS.operations.data.BlockData;
import robLANG_ASOS.ASOS.Termination;
import robLANG_ASOS.*;
import robLANG_ASOS.RobLANG_ASOSFactory;
import robLANG_ASOS.interfaces.robLANG_ASOSInterface;
import robLANG_ASOS.sd.*;

@Operationalize(node = Block.class, visitor = "robLANG_ASOS.interpreter.RobLANG_ASOSVisitor")
public class BlockOp extends AdaptiveOperation<Block, robLANG_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Block node, Object execCtx, robLANG_ASOSInterface config) {
		Object result = null;
		
		BlockData data = new BlockData();
		
		while(true){
			Object termination = null;
			BlockData local_data = new BlockData();
		
			boolean validPatternInput217 = true && (node.getStatements() instanceof List && node.getStatements().size() > data.getindex_statements());
			if(validPatternInput217)
			{
				if(data.getcomputed_statements() == null){
					local_data.setcomputed_statements(((Node) node.getStatements().get(data.getindex_statements())).accept(vis, execCtx));
					if(!(local_data.getcomputed_statements() instanceof Termination)){
						if(config.before_block_eval() != null){
							config.before_block_eval().adapt(vis, node, data, config);
						}
						
						if(config.specialize_block_eval() != null){
							config.specialize_block_eval().adapt(vis, node, data, config);
						} else {
							data.setcomputed_statements(local_data.getcomputed_statements());
						}
						
						if(config.after_block_eval() != null){
							if(result == null){
								config.after_block_eval().adapt(vis, node, data, config);
							} else {
								config.after_block_eval().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
					else {
						termination = local_data.getcomputed_statements();
					}
				}
			}
			boolean validPatternInput218 = true && (node.getStatements() instanceof List && node.getStatements().size() > data.getindex_statements()) && (node.getStatements().get(data.getindex_statements()) instanceof NilValue);
			if(validPatternInput218)
			{
				if(config.before_block_iter() != null){
					config.before_block_iter().adapt(vis, node, data, config);
				}
				
				if(config.specialize_block_iter() != null){
					config.specialize_block_iter().adapt(vis, node, data, config);
				} else {
					data.incindex_statements();
					data.setcomputed_statements(null);
				}
				
				if(config.after_block_iter() != null){
					if(result == null){
						config.after_block_iter().adapt(vis, node, data, config);
					} else {
						config.after_block_iter().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
			boolean validPatternInput219 = true && (node.getStatements() instanceof List && node.getStatements().size() <= data.getindex_statements());
			if(validPatternInput219)
			{
				if(config.before_block_end() != null){
					config.before_block_end().adapt(vis, node, data, config);
				}
				
				if(config.specialize_block_end() != null){
					config.specialize_block_end().adapt(vis, node, data, config);
				} else {
					NilValue nilValue1 = RobLANG_ASOSFactory.eINSTANCE.createNilValue();
					NilValue out = nilValue1;
					result = out;
				}
				
				if(config.after_block_end() != null){
					if(result == null){
						config.after_block_end().adapt(vis, node, data, config);
					} else {
						config.after_block_end().adapt(vis, ((AdaptableNode<robLANG_ASOSInterface>) result), null, config);
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
