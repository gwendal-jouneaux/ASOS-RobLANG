package robLANG_ASOS.operations.data;

public class TurnRightData {
	private Object computed_angle = null;
	public void setcomputed_angle(Object o){this.computed_angle = o;}
	public Object getcomputed_angle(){return this.computed_angle;}
	
	public TurnRightData(Object object) {
		if(object != null && object instanceof TurnRightData) {
			TurnRightData other = ((TurnRightData) object);
			this.computed_angle = other.computed_angle;
		}
	}
	
	public TurnRightData() {}
}
