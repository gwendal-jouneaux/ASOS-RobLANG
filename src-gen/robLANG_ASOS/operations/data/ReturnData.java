package robLANG_ASOS.operations.data;

public class ReturnData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public ReturnData(Object object) {
		if(object != null && object instanceof ReturnData) {
			ReturnData other = ((ReturnData) object);
			this.computed_expression = other.computed_expression;
		}
	}
	
	public ReturnData() {}
}
