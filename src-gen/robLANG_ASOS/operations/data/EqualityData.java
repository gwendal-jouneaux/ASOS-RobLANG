package robLANG_ASOS.operations.data;

public class EqualityData {
	private Object computed_left = null;
	public void setcomputed_left(Object o){this.computed_left = o;}
	public Object getcomputed_left(){return this.computed_left;}
	private Object computed_right = null;
	public void setcomputed_right(Object o){this.computed_right = o;}
	public Object getcomputed_right(){return this.computed_right;}
	
	public EqualityData(Object object) {
		if(object != null && object instanceof EqualityData) {
			EqualityData other = ((EqualityData) object);
			this.computed_left = other.computed_left;
			this.computed_right = other.computed_right;
		}
	}
	
	public EqualityData() {}
}
