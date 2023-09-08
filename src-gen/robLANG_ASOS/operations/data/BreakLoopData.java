package robLANG_ASOS.operations.data;

public class BreakLoopData {
	
	public BreakLoopData(Object object) {
		if(object != null && object instanceof BreakLoopData) {
			BreakLoopData other = ((BreakLoopData) object);
		}
	}
	
	public BreakLoopData() {}
}
