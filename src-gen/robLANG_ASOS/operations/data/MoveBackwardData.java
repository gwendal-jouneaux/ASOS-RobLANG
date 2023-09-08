package robLANG_ASOS.operations.data;

public class MoveBackwardData {
	private Object computed_distance = null;
	public void setcomputed_distance(Object o){this.computed_distance = o;}
	public Object getcomputed_distance(){return this.computed_distance;}
	
	public MoveBackwardData(Object object) {
		if(object != null && object instanceof MoveBackwardData) {
			MoveBackwardData other = ((MoveBackwardData) object);
			this.computed_distance = other.computed_distance;
		}
	}
	
	public MoveBackwardData() {}
}
