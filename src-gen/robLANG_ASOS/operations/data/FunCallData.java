package robLANG_ASOS.operations.data;

public class FunCallData {
	private Object computed_function = null;
	public void setcomputed_function(Object o){this.computed_function = o;}
	public Object getcomputed_function(){return this.computed_function;}
	private Object computed_params = null;
	public void setcomputed_params(Object o){this.computed_params = o;}
	public Object getcomputed_params(){return this.computed_params;}
	private int index_params = 0;
	public void setindex_params(int i){this.index_params = i;}
	public void incindex_params(){this.index_params += 1;}
	public int getindex_params(){return this.index_params;}
	
	public FunCallData(Object object) {
		if(object != null && object instanceof FunCallData) {
			FunCallData other = ((FunCallData) object);
			this.computed_function = other.computed_function;
			this.computed_params = other.computed_params;
			this.index_params = other.index_params;
		}
	}
	
	public FunCallData() {}
}
