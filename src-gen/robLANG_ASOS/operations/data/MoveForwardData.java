package robLANG_ASOS.operations.data;

public class MoveForwardData {
	private Object computed_distance = null;
	public void setcomputed_distance(Object o){this.computed_distance = o;}
	public Object getcomputed_distance(){return this.computed_distance;}
	
	public MoveForwardData(Object object) {
		if(object != null && object instanceof MoveForwardData) {
			MoveForwardData other = ((MoveForwardData) object);
			this.computed_distance = other.computed_distance;
		}
	}
	
	public MoveForwardData() {}
}
