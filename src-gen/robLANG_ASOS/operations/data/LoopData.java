package robLANG_ASOS.operations.data;

public class LoopData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	private Object computed_body = null;
	public void setcomputed_body(Object o){this.computed_body = o;}
	public Object getcomputed_body(){return this.computed_body;}
	
	public LoopData(Object object) {
		if(object != null && object instanceof LoopData) {
			LoopData other = ((LoopData) object);
			this.computed_expression = other.computed_expression;
			this.computed_body = other.computed_body;
		}
	}
	
	public LoopData() {}
}
