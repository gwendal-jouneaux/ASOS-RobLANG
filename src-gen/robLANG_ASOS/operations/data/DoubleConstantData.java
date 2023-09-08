package robLANG_ASOS.operations.data;

public class DoubleConstantData {
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	
	public DoubleConstantData(Object object) {
		if(object != null && object instanceof DoubleConstantData) {
			DoubleConstantData other = ((DoubleConstantData) object);
			this.computed_value = other.computed_value;
		}
	}
	
	public DoubleConstantData() {}
}
