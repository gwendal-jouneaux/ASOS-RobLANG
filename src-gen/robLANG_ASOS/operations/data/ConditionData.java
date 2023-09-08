package robLANG_ASOS.operations.data;

public class ConditionData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	private Object computed_ifz = null;
	public void setcomputed_ifz(Object o){this.computed_ifz = o;}
	public Object getcomputed_ifz(){return this.computed_ifz;}
	private Object computed_elsez = null;
	public void setcomputed_elsez(Object o){this.computed_elsez = o;}
	public Object getcomputed_elsez(){return this.computed_elsez;}
	
	public ConditionData(Object object) {
		if(object != null && object instanceof ConditionData) {
			ConditionData other = ((ConditionData) object);
			this.computed_expression = other.computed_expression;
			this.computed_ifz = other.computed_ifz;
			this.computed_elsez = other.computed_elsez;
		}
	}
	
	public ConditionData() {}
}
