package robLANG_ASOS.operations.data;

public class SymbolRefData {
	private Object computed_variable = null;
	public void setcomputed_variable(Object o){this.computed_variable = o;}
	public Object getcomputed_variable(){return this.computed_variable;}
	
	public SymbolRefData(Object object) {
		if(object != null && object instanceof SymbolRefData) {
			SymbolRefData other = ((SymbolRefData) object);
			this.computed_variable = other.computed_variable;
		}
	}
	
	public SymbolRefData() {}
}
