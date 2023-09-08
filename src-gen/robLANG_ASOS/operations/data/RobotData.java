package robLANG_ASOS.operations.data;

public class RobotData {
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private Object computed_main = null;
	public void setcomputed_main(Object o){this.computed_main = o;}
	public Object getcomputed_main(){return this.computed_main;}
	private Object computed_functions = null;
	public void setcomputed_functions(Object o){this.computed_functions = o;}
	public Object getcomputed_functions(){return this.computed_functions;}
	private int index_functions = 0;
	public void setindex_functions(int i){this.index_functions = i;}
	public void incindex_functions(){this.index_functions += 1;}
	public int getindex_functions(){return this.index_functions;}
	private Object computed_executioncontext = null;
	public void setcomputed_executioncontext(Object o){this.computed_executioncontext = o;}
	public Object getcomputed_executioncontext(){return this.computed_executioncontext;}
	
	public RobotData(Object object) {
		if(object != null && object instanceof RobotData) {
			RobotData other = ((RobotData) object);
			this.computed_name = other.computed_name;
			this.computed_main = other.computed_main;
			this.computed_functions = other.computed_functions;
			this.index_functions = other.index_functions;
			this.computed_executioncontext = other.computed_executioncontext;
		}
	}
	
	public RobotData() {}
}
