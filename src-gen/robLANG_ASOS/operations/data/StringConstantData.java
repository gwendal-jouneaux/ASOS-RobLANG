package robLANG_ASOS.operations.data;

public class StringConstantData {
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	
	public StringConstantData(Object object) {
		if(object != null && object instanceof StringConstantData) {
			StringConstantData other = ((StringConstantData) object);
			this.computed_value = other.computed_value;
		}
	}
	
	public StringConstantData() {}
}
