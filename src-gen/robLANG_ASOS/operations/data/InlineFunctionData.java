package robLANG_ASOS.operations.data;

public class InlineFunctionData {
	private Object computed_type = null;
	public void setcomputed_type(Object o){this.computed_type = o;}
	public Object getcomputed_type(){return this.computed_type;}
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private Object computed_varNames = null;
	public void setcomputed_varNames(Object o){this.computed_varNames = o;}
	public Object getcomputed_varNames(){return this.computed_varNames;}
	private int index_varNames = 0;
	public void setindex_varNames(int i){this.index_varNames = i;}
	public void incindex_varNames(){this.index_varNames += 1;}
	public int getindex_varNames(){return this.index_varNames;}
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public InlineFunctionData(Object object) {
		if(object != null && object instanceof InlineFunctionData) {
			InlineFunctionData other = ((InlineFunctionData) object);
			this.computed_type = other.computed_type;
			this.computed_name = other.computed_name;
			this.computed_varNames = other.computed_varNames;
			this.index_varNames = other.index_varNames;
			this.computed_expression = other.computed_expression;
		}
	}
	
	public InlineFunctionData() {}
}
