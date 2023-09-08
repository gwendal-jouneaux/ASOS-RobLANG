package robLANG_ASOS.ASOS;

public class Termination {
	private final Object boxed;
	
	public Termination(Object boxed) {
		this.boxed = boxed;
	}
	
	public Object unbox() {
		return boxed;
	}
}
