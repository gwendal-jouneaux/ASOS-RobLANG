package robLANG_ASOS.operations.data;

public class BlockData {
	private Object computed_statements = null;
	public void setcomputed_statements(Object o){this.computed_statements = o;}
	public Object getcomputed_statements(){return this.computed_statements;}
	private int index_statements = 0;
	public void setindex_statements(int i){this.index_statements = i;}
	public void incindex_statements(){this.index_statements += 1;}
	public int getindex_statements(){return this.index_statements;}
	
	public BlockData(Object object) {
		if(object != null && object instanceof BlockData) {
			BlockData other = ((BlockData) object);
			this.computed_statements = other.computed_statements;
			this.index_statements = other.index_statements;
		}
	}
	
	public BlockData() {}
}
