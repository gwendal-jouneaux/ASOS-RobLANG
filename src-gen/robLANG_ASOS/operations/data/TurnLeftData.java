package robLANG_ASOS.operations.data;

public class TurnLeftData {
	private Object computed_angle = null;
	public void setcomputed_angle(Object o){this.computed_angle = o;}
	public Object getcomputed_angle(){return this.computed_angle;}
	
	public TurnLeftData(Object object) {
		if(object != null && object instanceof TurnLeftData) {
			TurnLeftData other = ((TurnLeftData) object);
			this.computed_angle = other.computed_angle;
		}
	}
	
	public TurnLeftData() {}
}
