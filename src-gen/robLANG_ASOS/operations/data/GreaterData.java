package robLANG_ASOS.operations.data;

public class GreaterData {
	private Object computed_left = null;
	public void setcomputed_left(Object o){this.computed_left = o;}
	public Object getcomputed_left(){return this.computed_left;}
	private Object computed_right = null;
	public void setcomputed_right(Object o){this.computed_right = o;}
	public Object getcomputed_right(){return this.computed_right;}
	
	public GreaterData(Object object) {
		if(object != null && object instanceof GreaterData) {
			GreaterData other = ((GreaterData) object);
			this.computed_left = other.computed_left;
			this.computed_right = other.computed_right;
		}
	}
	
	public GreaterData() {}
}
