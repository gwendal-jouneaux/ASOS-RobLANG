package robLANG_ASOS.operations.data;

public class AssignmentData {
	private Object computed_assignee = null;
	public void setcomputed_assignee(Object o){this.computed_assignee = o;}
	public Object getcomputed_assignee(){return this.computed_assignee;}
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public AssignmentData(Object object) {
		if(object != null && object instanceof AssignmentData) {
			AssignmentData other = ((AssignmentData) object);
			this.computed_assignee = other.computed_assignee;
			this.computed_expression = other.computed_expression;
		}
	}
	
	public AssignmentData() {}
}
