package robLANG_ASOS.operations.data;

public class PrintExpressionData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public PrintExpressionData(Object object) {
		if(object != null && object instanceof PrintExpressionData) {
			PrintExpressionData other = ((PrintExpressionData) object);
			this.computed_expression = other.computed_expression;
		}
	}
	
	public PrintExpressionData() {}
}
