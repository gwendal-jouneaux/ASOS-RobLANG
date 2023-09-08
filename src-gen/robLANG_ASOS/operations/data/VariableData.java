package robLANG_ASOS.operations.data;

public class VariableData {
	private Object computed_type = null;
	public void setcomputed_type(Object o){this.computed_type = o;}
	public Object getcomputed_type(){return this.computed_type;}
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public VariableData(Object object) {
		if(object != null && object instanceof VariableData) {
			VariableData other = ((VariableData) object);
			this.computed_type = other.computed_type;
			this.computed_name = other.computed_name;
			this.computed_expression = other.computed_expression;
		}
	}
	
	public VariableData() {}
}
