package robLANG_ASOS.operations.data;

public class SenseDistanceData {
	private Object computed_sensorIndex = null;
	public void setcomputed_sensorIndex(Object o){this.computed_sensorIndex = o;}
	public Object getcomputed_sensorIndex(){return this.computed_sensorIndex;}
	
	public SenseDistanceData(Object object) {
		if(object != null && object instanceof SenseDistanceData) {
			SenseDistanceData other = ((SenseDistanceData) object);
			this.computed_sensorIndex = other.computed_sensorIndex;
		}
	}
	
	public SenseDistanceData() {}
}
