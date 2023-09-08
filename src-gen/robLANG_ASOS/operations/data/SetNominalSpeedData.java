package robLANG_ASOS.operations.data;

public class SetNominalSpeedData {
	private Object computed_speed = null;
	public void setcomputed_speed(Object o){this.computed_speed = o;}
	public Object getcomputed_speed(){return this.computed_speed;}
	
	public SetNominalSpeedData(Object object) {
		if(object != null && object instanceof SetNominalSpeedData) {
			SetNominalSpeedData other = ((SetNominalSpeedData) object);
			this.computed_speed = other.computed_speed;
		}
	}
	
	public SetNominalSpeedData() {}
}
