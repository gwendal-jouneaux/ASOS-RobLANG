package robLANG_ASOS.operations.data;

public class BoolConstantData {
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	
	public BoolConstantData(Object object) {
		if(object != null && object instanceof BoolConstantData) {
			BoolConstantData other = ((BoolConstantData) object);
			this.computed_value = other.computed_value;
		}
	}
	
	public BoolConstantData() {}
}
