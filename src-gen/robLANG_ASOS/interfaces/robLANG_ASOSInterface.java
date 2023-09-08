package robLANG_ASOS.interfaces;

import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import robLANG_ASOS.ASOS.AdaptationRule;

public class robLANG_ASOSInterface implements SemanticsAdaptationInterface {
	private AdaptationRule before_loop_false;
	private AdaptationRule specialize_loop_false;
	private AdaptationRule after_loop_false;
	private AdaptationRule before_loop_true_break;
	private AdaptationRule specialize_loop_true_break;
	private AdaptationRule after_loop_true_break;
	private AdaptationRule before_loop_true_done;
	private AdaptationRule specialize_loop_true_done;
	private AdaptationRule after_loop_true_done;
	private AdaptationRule before_loop_true_exec;
	private AdaptationRule specialize_loop_true_exec;
	private AdaptationRule after_loop_true_exec;
	private AdaptationRule before_loop_cond;
	private AdaptationRule specialize_loop_cond;
	private AdaptationRule after_loop_cond;
	private AdaptationRule before_if_false;
	private AdaptationRule specialize_if_false;
	private AdaptationRule after_if_false;
	private AdaptationRule before_if_true;
	private AdaptationRule specialize_if_true;
	private AdaptationRule after_if_true;
	private AdaptationRule before_if_cond;
	private AdaptationRule specialize_if_cond;
	private AdaptationRule after_if_cond;
	private AdaptationRule before_print_send;
	private AdaptationRule specialize_print_send;
	private AdaptationRule after_print_send;
	private AdaptationRule before_print_expr;
	private AdaptationRule specialize_print_expr;
	private AdaptationRule after_print_expr;
	private AdaptationRule before_symbol_name;
	private AdaptationRule specialize_symbol_name;
	private AdaptationRule after_symbol_name;
	private AdaptationRule before_assign_set;
	private AdaptationRule specialize_assign_set;
	private AdaptationRule after_assign_set;
	private AdaptationRule before_assign_expr;
	private AdaptationRule specialize_assign_expr;
	private AdaptationRule after_assign_expr;
	private AdaptationRule before_var_set;
	private AdaptationRule specialize_var_set;
	private AdaptationRule after_var_set;
	private AdaptationRule before_var_expr;
	private AdaptationRule specialize_var_expr;
	private AdaptationRule after_var_expr;
	private AdaptationRule before_speed_act;
	private AdaptationRule specialize_speed_act;
	private AdaptationRule after_speed_act;
	private AdaptationRule before_speed_expr;
	private AdaptationRule specialize_speed_expr;
	private AdaptationRule after_speed_expr;
	private AdaptationRule before_right_act;
	private AdaptationRule specialize_right_act;
	private AdaptationRule after_right_act;
	private AdaptationRule before_right_expr;
	private AdaptationRule specialize_right_expr;
	private AdaptationRule after_right_expr;
	private AdaptationRule before_left_act;
	private AdaptationRule specialize_left_act;
	private AdaptationRule after_left_act;
	private AdaptationRule before_left_expr;
	private AdaptationRule specialize_left_expr;
	private AdaptationRule after_left_expr;
	private AdaptationRule before_backward_act;
	private AdaptationRule specialize_backward_act;
	private AdaptationRule after_backward_act;
	private AdaptationRule before_backward_expr;
	private AdaptationRule specialize_backward_expr;
	private AdaptationRule after_backward_expr;
	private AdaptationRule before_forward_act;
	private AdaptationRule specialize_forward_act;
	private AdaptationRule after_forward_act;
	private AdaptationRule before_forward_expr;
	private AdaptationRule specialize_forward_expr;
	private AdaptationRule after_forward_expr;
	private AdaptationRule before_compass;
	private AdaptationRule specialize_compass;
	private AdaptationRule after_compass;
	private AdaptationRule before_dist;
	private AdaptationRule specialize_dist;
	private AdaptationRule after_dist;
	private AdaptationRule before_position;
	private AdaptationRule specialize_position;
	private AdaptationRule after_position;
	private AdaptationRule before_battery;
	private AdaptationRule specialize_battery;
	private AdaptationRule after_battery;
	private AdaptationRule before_time;
	private AdaptationRule specialize_time;
	private AdaptationRule after_time;
	private AdaptationRule before_return_end;
	private AdaptationRule specialize_return_end;
	private AdaptationRule after_return_end;
	private AdaptationRule before_return_expr;
	private AdaptationRule specialize_return_expr;
	private AdaptationRule after_return_expr;
	private AdaptationRule before_break;
	private AdaptationRule specialize_break;
	private AdaptationRule after_break;
	private AdaptationRule before_block_end;
	private AdaptationRule specialize_block_end;
	private AdaptationRule after_block_end;
	private AdaptationRule before_block_iter;
	private AdaptationRule specialize_block_iter;
	private AdaptationRule after_block_iter;
	private AdaptationRule before_block_eval;
	private AdaptationRule specialize_block_eval;
	private AdaptationRule after_block_eval;
	private AdaptationRule before_inline_return;
	private AdaptationRule specialize_inline_return;
	private AdaptationRule after_inline_return;
	private AdaptationRule before_inline_call;
	private AdaptationRule specialize_inline_call;
	private AdaptationRule after_inline_call;
	private AdaptationRule before_complex_end;
	private AdaptationRule specialize_complex_end;
	private AdaptationRule after_complex_end;
	private AdaptationRule before_complex_return;
	private AdaptationRule specialize_complex_return;
	private AdaptationRule after_complex_return;
	private AdaptationRule before_complex_call;
	private AdaptationRule specialize_complex_call;
	private AdaptationRule after_complex_call;
	private AdaptationRule before_fundef_vars;
	private AdaptationRule specialize_fundef_vars;
	private AdaptationRule after_fundef_vars;
	private AdaptationRule before_funcall_call;
	private AdaptationRule specialize_funcall_call;
	private AdaptationRule after_funcall_call;
	private AdaptationRule before_funcall_value;
	private AdaptationRule specialize_funcall_value;
	private AdaptationRule after_funcall_value;
	private AdaptationRule before_funcall_param;
	private AdaptationRule specialize_funcall_param;
	private AdaptationRule after_funcall_param;
	private AdaptationRule before_symbol_ref;
	private AdaptationRule specialize_symbol_ref;
	private AdaptationRule after_symbol_ref;
	private AdaptationRule before_less;
	private AdaptationRule specialize_less;
	private AdaptationRule after_less;
	private AdaptationRule before_less_eq;
	private AdaptationRule specialize_less_eq;
	private AdaptationRule after_less_eq;
	private AdaptationRule before_great_double;
	private AdaptationRule specialize_great_double;
	private AdaptationRule after_great_double;
	private AdaptationRule before_great;
	private AdaptationRule specialize_great;
	private AdaptationRule after_great;
	private AdaptationRule before_great_eq;
	private AdaptationRule specialize_great_eq;
	private AdaptationRule after_great_eq;
	private AdaptationRule before_inequal;
	private AdaptationRule specialize_inequal;
	private AdaptationRule after_inequal;
	private AdaptationRule before_equal;
	private AdaptationRule specialize_equal;
	private AdaptationRule after_equal;
	private AdaptationRule before_and;
	private AdaptationRule specialize_and;
	private AdaptationRule after_and;
	private AdaptationRule before_or;
	private AdaptationRule specialize_or;
	private AdaptationRule after_or;
	private AdaptationRule before_not_done;
	private AdaptationRule specialize_not_done;
	private AdaptationRule after_not_done;
	private AdaptationRule before_not_expr;
	private AdaptationRule specialize_not_expr;
	private AdaptationRule after_not_expr;
	private AdaptationRule before_div_double_error;
	private AdaptationRule specialize_div_double_error;
	private AdaptationRule after_div_double_error;
	private AdaptationRule before_div_double;
	private AdaptationRule specialize_div_double;
	private AdaptationRule after_div_double;
	private AdaptationRule before_mult_double;
	private AdaptationRule specialize_mult_double;
	private AdaptationRule after_mult_double;
	private AdaptationRule before_minus_double;
	private AdaptationRule specialize_minus_double;
	private AdaptationRule after_minus_double;
	private AdaptationRule before_plus_double;
	private AdaptationRule specialize_plus_double;
	private AdaptationRule after_plus_double;
	private AdaptationRule before_div_int_error;
	private AdaptationRule specialize_div_int_error;
	private AdaptationRule after_div_int_error;
	private AdaptationRule before_div_int;
	private AdaptationRule specialize_div_int;
	private AdaptationRule after_div_int;
	private AdaptationRule before_mult_int;
	private AdaptationRule specialize_mult_int;
	private AdaptationRule after_mult_int;
	private AdaptationRule before_minus_int;
	private AdaptationRule specialize_minus_int;
	private AdaptationRule after_minus_int;
	private AdaptationRule before_plus_int;
	private AdaptationRule specialize_plus_int;
	private AdaptationRule after_plus_int;
	private AdaptationRule before_plus_string;
	private AdaptationRule specialize_plus_string;
	private AdaptationRule after_plus_string;
	private AdaptationRule before_BinOp_rhs;
	private AdaptationRule specialize_BinOp_rhs;
	private AdaptationRule after_BinOp_rhs;
	private AdaptationRule before_BinOp_lhs;
	private AdaptationRule specialize_BinOp_lhs;
	private AdaptationRule after_BinOp_lhs;
	private AdaptationRule before_DoubleConst;
	private AdaptationRule specialize_DoubleConst;
	private AdaptationRule after_DoubleConst;
	private AdaptationRule before_StringConst;
	private AdaptationRule specialize_StringConst;
	private AdaptationRule after_StringConst;
	private AdaptationRule before_BoolConst;
	private AdaptationRule specialize_BoolConst;
	private AdaptationRule after_BoolConst;
	private AdaptationRule before_IntConst;
	private AdaptationRule specialize_IntConst;
	private AdaptationRule after_IntConst;
	private AdaptationRule before_robot_main;
	private AdaptationRule specialize_robot_main;
	private AdaptationRule after_robot_main;
	public void add_before_robot_main(AdaptationRule adapt){
		adapt.chain(before_robot_main);
		before_robot_main = adapt;
	}
	public void add_specialize_robot_main(AdaptationRule adapt){
		adapt.chain(specialize_robot_main);
		specialize_robot_main = adapt;
	}
	public void add_after_robot_main(AdaptationRule adapt){
		adapt.chain(after_robot_main);
		after_robot_main = adapt;
	}
	public AdaptationRule before_robot_main(){return before_robot_main;}
	public AdaptationRule specialize_robot_main(){return specialize_robot_main;}
	public AdaptationRule after_robot_main(){return after_robot_main;}
	public void add_before_IntConst(AdaptationRule adapt){
		adapt.chain(before_IntConst);
		before_IntConst = adapt;
	}
	public void add_specialize_IntConst(AdaptationRule adapt){
		adapt.chain(specialize_IntConst);
		specialize_IntConst = adapt;
	}
	public void add_after_IntConst(AdaptationRule adapt){
		adapt.chain(after_IntConst);
		after_IntConst = adapt;
	}
	public AdaptationRule before_IntConst(){return before_IntConst;}
	public AdaptationRule specialize_IntConst(){return specialize_IntConst;}
	public AdaptationRule after_IntConst(){return after_IntConst;}
	public void add_before_BoolConst(AdaptationRule adapt){
		adapt.chain(before_BoolConst);
		before_BoolConst = adapt;
	}
	public void add_specialize_BoolConst(AdaptationRule adapt){
		adapt.chain(specialize_BoolConst);
		specialize_BoolConst = adapt;
	}
	public void add_after_BoolConst(AdaptationRule adapt){
		adapt.chain(after_BoolConst);
		after_BoolConst = adapt;
	}
	public AdaptationRule before_BoolConst(){return before_BoolConst;}
	public AdaptationRule specialize_BoolConst(){return specialize_BoolConst;}
	public AdaptationRule after_BoolConst(){return after_BoolConst;}
	public void add_before_StringConst(AdaptationRule adapt){
		adapt.chain(before_StringConst);
		before_StringConst = adapt;
	}
	public void add_specialize_StringConst(AdaptationRule adapt){
		adapt.chain(specialize_StringConst);
		specialize_StringConst = adapt;
	}
	public void add_after_StringConst(AdaptationRule adapt){
		adapt.chain(after_StringConst);
		after_StringConst = adapt;
	}
	public AdaptationRule before_StringConst(){return before_StringConst;}
	public AdaptationRule specialize_StringConst(){return specialize_StringConst;}
	public AdaptationRule after_StringConst(){return after_StringConst;}
	public void add_before_DoubleConst(AdaptationRule adapt){
		adapt.chain(before_DoubleConst);
		before_DoubleConst = adapt;
	}
	public void add_specialize_DoubleConst(AdaptationRule adapt){
		adapt.chain(specialize_DoubleConst);
		specialize_DoubleConst = adapt;
	}
	public void add_after_DoubleConst(AdaptationRule adapt){
		adapt.chain(after_DoubleConst);
		after_DoubleConst = adapt;
	}
	public AdaptationRule before_DoubleConst(){return before_DoubleConst;}
	public AdaptationRule specialize_DoubleConst(){return specialize_DoubleConst;}
	public AdaptationRule after_DoubleConst(){return after_DoubleConst;}
	public void add_before_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(before_BinOp_lhs);
		before_BinOp_lhs = adapt;
	}
	public void add_specialize_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(specialize_BinOp_lhs);
		specialize_BinOp_lhs = adapt;
	}
	public void add_after_BinOp_lhs(AdaptationRule adapt){
		adapt.chain(after_BinOp_lhs);
		after_BinOp_lhs = adapt;
	}
	public AdaptationRule before_BinOp_lhs(){return before_BinOp_lhs;}
	public AdaptationRule specialize_BinOp_lhs(){return specialize_BinOp_lhs;}
	public AdaptationRule after_BinOp_lhs(){return after_BinOp_lhs;}
	public void add_before_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(before_BinOp_rhs);
		before_BinOp_rhs = adapt;
	}
	public void add_specialize_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(specialize_BinOp_rhs);
		specialize_BinOp_rhs = adapt;
	}
	public void add_after_BinOp_rhs(AdaptationRule adapt){
		adapt.chain(after_BinOp_rhs);
		after_BinOp_rhs = adapt;
	}
	public AdaptationRule before_BinOp_rhs(){return before_BinOp_rhs;}
	public AdaptationRule specialize_BinOp_rhs(){return specialize_BinOp_rhs;}
	public AdaptationRule after_BinOp_rhs(){return after_BinOp_rhs;}
	public void add_before_plus_string(AdaptationRule adapt){
		adapt.chain(before_plus_string);
		before_plus_string = adapt;
	}
	public void add_specialize_plus_string(AdaptationRule adapt){
		adapt.chain(specialize_plus_string);
		specialize_plus_string = adapt;
	}
	public void add_after_plus_string(AdaptationRule adapt){
		adapt.chain(after_plus_string);
		after_plus_string = adapt;
	}
	public AdaptationRule before_plus_string(){return before_plus_string;}
	public AdaptationRule specialize_plus_string(){return specialize_plus_string;}
	public AdaptationRule after_plus_string(){return after_plus_string;}
	public void add_before_plus_int(AdaptationRule adapt){
		adapt.chain(before_plus_int);
		before_plus_int = adapt;
	}
	public void add_specialize_plus_int(AdaptationRule adapt){
		adapt.chain(specialize_plus_int);
		specialize_plus_int = adapt;
	}
	public void add_after_plus_int(AdaptationRule adapt){
		adapt.chain(after_plus_int);
		after_plus_int = adapt;
	}
	public AdaptationRule before_plus_int(){return before_plus_int;}
	public AdaptationRule specialize_plus_int(){return specialize_plus_int;}
	public AdaptationRule after_plus_int(){return after_plus_int;}
	public void add_before_minus_int(AdaptationRule adapt){
		adapt.chain(before_minus_int);
		before_minus_int = adapt;
	}
	public void add_specialize_minus_int(AdaptationRule adapt){
		adapt.chain(specialize_minus_int);
		specialize_minus_int = adapt;
	}
	public void add_after_minus_int(AdaptationRule adapt){
		adapt.chain(after_minus_int);
		after_minus_int = adapt;
	}
	public AdaptationRule before_minus_int(){return before_minus_int;}
	public AdaptationRule specialize_minus_int(){return specialize_minus_int;}
	public AdaptationRule after_minus_int(){return after_minus_int;}
	public void add_before_mult_int(AdaptationRule adapt){
		adapt.chain(before_mult_int);
		before_mult_int = adapt;
	}
	public void add_specialize_mult_int(AdaptationRule adapt){
		adapt.chain(specialize_mult_int);
		specialize_mult_int = adapt;
	}
	public void add_after_mult_int(AdaptationRule adapt){
		adapt.chain(after_mult_int);
		after_mult_int = adapt;
	}
	public AdaptationRule before_mult_int(){return before_mult_int;}
	public AdaptationRule specialize_mult_int(){return specialize_mult_int;}
	public AdaptationRule after_mult_int(){return after_mult_int;}
	public void add_before_div_int(AdaptationRule adapt){
		adapt.chain(before_div_int);
		before_div_int = adapt;
	}
	public void add_specialize_div_int(AdaptationRule adapt){
		adapt.chain(specialize_div_int);
		specialize_div_int = adapt;
	}
	public void add_after_div_int(AdaptationRule adapt){
		adapt.chain(after_div_int);
		after_div_int = adapt;
	}
	public AdaptationRule before_div_int(){return before_div_int;}
	public AdaptationRule specialize_div_int(){return specialize_div_int;}
	public AdaptationRule after_div_int(){return after_div_int;}
	public void add_before_div_int_error(AdaptationRule adapt){
		adapt.chain(before_div_int_error);
		before_div_int_error = adapt;
	}
	public void add_specialize_div_int_error(AdaptationRule adapt){
		adapt.chain(specialize_div_int_error);
		specialize_div_int_error = adapt;
	}
	public void add_after_div_int_error(AdaptationRule adapt){
		adapt.chain(after_div_int_error);
		after_div_int_error = adapt;
	}
	public AdaptationRule before_div_int_error(){return before_div_int_error;}
	public AdaptationRule specialize_div_int_error(){return specialize_div_int_error;}
	public AdaptationRule after_div_int_error(){return after_div_int_error;}
	public void add_before_plus_double(AdaptationRule adapt){
		adapt.chain(before_plus_double);
		before_plus_double = adapt;
	}
	public void add_specialize_plus_double(AdaptationRule adapt){
		adapt.chain(specialize_plus_double);
		specialize_plus_double = adapt;
	}
	public void add_after_plus_double(AdaptationRule adapt){
		adapt.chain(after_plus_double);
		after_plus_double = adapt;
	}
	public AdaptationRule before_plus_double(){return before_plus_double;}
	public AdaptationRule specialize_plus_double(){return specialize_plus_double;}
	public AdaptationRule after_plus_double(){return after_plus_double;}
	public void add_before_minus_double(AdaptationRule adapt){
		adapt.chain(before_minus_double);
		before_minus_double = adapt;
	}
	public void add_specialize_minus_double(AdaptationRule adapt){
		adapt.chain(specialize_minus_double);
		specialize_minus_double = adapt;
	}
	public void add_after_minus_double(AdaptationRule adapt){
		adapt.chain(after_minus_double);
		after_minus_double = adapt;
	}
	public AdaptationRule before_minus_double(){return before_minus_double;}
	public AdaptationRule specialize_minus_double(){return specialize_minus_double;}
	public AdaptationRule after_minus_double(){return after_minus_double;}
	public void add_before_mult_double(AdaptationRule adapt){
		adapt.chain(before_mult_double);
		before_mult_double = adapt;
	}
	public void add_specialize_mult_double(AdaptationRule adapt){
		adapt.chain(specialize_mult_double);
		specialize_mult_double = adapt;
	}
	public void add_after_mult_double(AdaptationRule adapt){
		adapt.chain(after_mult_double);
		after_mult_double = adapt;
	}
	public AdaptationRule before_mult_double(){return before_mult_double;}
	public AdaptationRule specialize_mult_double(){return specialize_mult_double;}
	public AdaptationRule after_mult_double(){return after_mult_double;}
	public void add_before_div_double(AdaptationRule adapt){
		adapt.chain(before_div_double);
		before_div_double = adapt;
	}
	public void add_specialize_div_double(AdaptationRule adapt){
		adapt.chain(specialize_div_double);
		specialize_div_double = adapt;
	}
	public void add_after_div_double(AdaptationRule adapt){
		adapt.chain(after_div_double);
		after_div_double = adapt;
	}
	public AdaptationRule before_div_double(){return before_div_double;}
	public AdaptationRule specialize_div_double(){return specialize_div_double;}
	public AdaptationRule after_div_double(){return after_div_double;}
	public void add_before_div_double_error(AdaptationRule adapt){
		adapt.chain(before_div_double_error);
		before_div_double_error = adapt;
	}
	public void add_specialize_div_double_error(AdaptationRule adapt){
		adapt.chain(specialize_div_double_error);
		specialize_div_double_error = adapt;
	}
	public void add_after_div_double_error(AdaptationRule adapt){
		adapt.chain(after_div_double_error);
		after_div_double_error = adapt;
	}
	public AdaptationRule before_div_double_error(){return before_div_double_error;}
	public AdaptationRule specialize_div_double_error(){return specialize_div_double_error;}
	public AdaptationRule after_div_double_error(){return after_div_double_error;}
	public void add_before_not_expr(AdaptationRule adapt){
		adapt.chain(before_not_expr);
		before_not_expr = adapt;
	}
	public void add_specialize_not_expr(AdaptationRule adapt){
		adapt.chain(specialize_not_expr);
		specialize_not_expr = adapt;
	}
	public void add_after_not_expr(AdaptationRule adapt){
		adapt.chain(after_not_expr);
		after_not_expr = adapt;
	}
	public AdaptationRule before_not_expr(){return before_not_expr;}
	public AdaptationRule specialize_not_expr(){return specialize_not_expr;}
	public AdaptationRule after_not_expr(){return after_not_expr;}
	public void add_before_not_done(AdaptationRule adapt){
		adapt.chain(before_not_done);
		before_not_done = adapt;
	}
	public void add_specialize_not_done(AdaptationRule adapt){
		adapt.chain(specialize_not_done);
		specialize_not_done = adapt;
	}
	public void add_after_not_done(AdaptationRule adapt){
		adapt.chain(after_not_done);
		after_not_done = adapt;
	}
	public AdaptationRule before_not_done(){return before_not_done;}
	public AdaptationRule specialize_not_done(){return specialize_not_done;}
	public AdaptationRule after_not_done(){return after_not_done;}
	public void add_before_or(AdaptationRule adapt){
		adapt.chain(before_or);
		before_or = adapt;
	}
	public void add_specialize_or(AdaptationRule adapt){
		adapt.chain(specialize_or);
		specialize_or = adapt;
	}
	public void add_after_or(AdaptationRule adapt){
		adapt.chain(after_or);
		after_or = adapt;
	}
	public AdaptationRule before_or(){return before_or;}
	public AdaptationRule specialize_or(){return specialize_or;}
	public AdaptationRule after_or(){return after_or;}
	public void add_before_and(AdaptationRule adapt){
		adapt.chain(before_and);
		before_and = adapt;
	}
	public void add_specialize_and(AdaptationRule adapt){
		adapt.chain(specialize_and);
		specialize_and = adapt;
	}
	public void add_after_and(AdaptationRule adapt){
		adapt.chain(after_and);
		after_and = adapt;
	}
	public AdaptationRule before_and(){return before_and;}
	public AdaptationRule specialize_and(){return specialize_and;}
	public AdaptationRule after_and(){return after_and;}
	public void add_before_equal(AdaptationRule adapt){
		adapt.chain(before_equal);
		before_equal = adapt;
	}
	public void add_specialize_equal(AdaptationRule adapt){
		adapt.chain(specialize_equal);
		specialize_equal = adapt;
	}
	public void add_after_equal(AdaptationRule adapt){
		adapt.chain(after_equal);
		after_equal = adapt;
	}
	public AdaptationRule before_equal(){return before_equal;}
	public AdaptationRule specialize_equal(){return specialize_equal;}
	public AdaptationRule after_equal(){return after_equal;}
	public void add_before_inequal(AdaptationRule adapt){
		adapt.chain(before_inequal);
		before_inequal = adapt;
	}
	public void add_specialize_inequal(AdaptationRule adapt){
		adapt.chain(specialize_inequal);
		specialize_inequal = adapt;
	}
	public void add_after_inequal(AdaptationRule adapt){
		adapt.chain(after_inequal);
		after_inequal = adapt;
	}
	public AdaptationRule before_inequal(){return before_inequal;}
	public AdaptationRule specialize_inequal(){return specialize_inequal;}
	public AdaptationRule after_inequal(){return after_inequal;}
	public void add_before_great_eq(AdaptationRule adapt){
		adapt.chain(before_great_eq);
		before_great_eq = adapt;
	}
	public void add_specialize_great_eq(AdaptationRule adapt){
		adapt.chain(specialize_great_eq);
		specialize_great_eq = adapt;
	}
	public void add_after_great_eq(AdaptationRule adapt){
		adapt.chain(after_great_eq);
		after_great_eq = adapt;
	}
	public AdaptationRule before_great_eq(){return before_great_eq;}
	public AdaptationRule specialize_great_eq(){return specialize_great_eq;}
	public AdaptationRule after_great_eq(){return after_great_eq;}
	public void add_before_great(AdaptationRule adapt){
		adapt.chain(before_great);
		before_great = adapt;
	}
	public void add_specialize_great(AdaptationRule adapt){
		adapt.chain(specialize_great);
		specialize_great = adapt;
	}
	public void add_after_great(AdaptationRule adapt){
		adapt.chain(after_great);
		after_great = adapt;
	}
	public AdaptationRule before_great(){return before_great;}
	public AdaptationRule specialize_great(){return specialize_great;}
	public AdaptationRule after_great(){return after_great;}
	public void add_before_great_double(AdaptationRule adapt){
		adapt.chain(before_great_double);
		before_great_double = adapt;
	}
	public void add_specialize_great_double(AdaptationRule adapt){
		adapt.chain(specialize_great_double);
		specialize_great_double = adapt;
	}
	public void add_after_great_double(AdaptationRule adapt){
		adapt.chain(after_great_double);
		after_great_double = adapt;
	}
	public AdaptationRule before_great_double(){return before_great_double;}
	public AdaptationRule specialize_great_double(){return specialize_great_double;}
	public AdaptationRule after_great_double(){return after_great_double;}
	public void add_before_less_eq(AdaptationRule adapt){
		adapt.chain(before_less_eq);
		before_less_eq = adapt;
	}
	public void add_specialize_less_eq(AdaptationRule adapt){
		adapt.chain(specialize_less_eq);
		specialize_less_eq = adapt;
	}
	public void add_after_less_eq(AdaptationRule adapt){
		adapt.chain(after_less_eq);
		after_less_eq = adapt;
	}
	public AdaptationRule before_less_eq(){return before_less_eq;}
	public AdaptationRule specialize_less_eq(){return specialize_less_eq;}
	public AdaptationRule after_less_eq(){return after_less_eq;}
	public void add_before_less(AdaptationRule adapt){
		adapt.chain(before_less);
		before_less = adapt;
	}
	public void add_specialize_less(AdaptationRule adapt){
		adapt.chain(specialize_less);
		specialize_less = adapt;
	}
	public void add_after_less(AdaptationRule adapt){
		adapt.chain(after_less);
		after_less = adapt;
	}
	public AdaptationRule before_less(){return before_less;}
	public AdaptationRule specialize_less(){return specialize_less;}
	public AdaptationRule after_less(){return after_less;}
	public void add_before_symbol_ref(AdaptationRule adapt){
		adapt.chain(before_symbol_ref);
		before_symbol_ref = adapt;
	}
	public void add_specialize_symbol_ref(AdaptationRule adapt){
		adapt.chain(specialize_symbol_ref);
		specialize_symbol_ref = adapt;
	}
	public void add_after_symbol_ref(AdaptationRule adapt){
		adapt.chain(after_symbol_ref);
		after_symbol_ref = adapt;
	}
	public AdaptationRule before_symbol_ref(){return before_symbol_ref;}
	public AdaptationRule specialize_symbol_ref(){return specialize_symbol_ref;}
	public AdaptationRule after_symbol_ref(){return after_symbol_ref;}
	public void add_before_funcall_param(AdaptationRule adapt){
		adapt.chain(before_funcall_param);
		before_funcall_param = adapt;
	}
	public void add_specialize_funcall_param(AdaptationRule adapt){
		adapt.chain(specialize_funcall_param);
		specialize_funcall_param = adapt;
	}
	public void add_after_funcall_param(AdaptationRule adapt){
		adapt.chain(after_funcall_param);
		after_funcall_param = adapt;
	}
	public AdaptationRule before_funcall_param(){return before_funcall_param;}
	public AdaptationRule specialize_funcall_param(){return specialize_funcall_param;}
	public AdaptationRule after_funcall_param(){return after_funcall_param;}
	public void add_before_funcall_value(AdaptationRule adapt){
		adapt.chain(before_funcall_value);
		before_funcall_value = adapt;
	}
	public void add_specialize_funcall_value(AdaptationRule adapt){
		adapt.chain(specialize_funcall_value);
		specialize_funcall_value = adapt;
	}
	public void add_after_funcall_value(AdaptationRule adapt){
		adapt.chain(after_funcall_value);
		after_funcall_value = adapt;
	}
	public AdaptationRule before_funcall_value(){return before_funcall_value;}
	public AdaptationRule specialize_funcall_value(){return specialize_funcall_value;}
	public AdaptationRule after_funcall_value(){return after_funcall_value;}
	public void add_before_funcall_call(AdaptationRule adapt){
		adapt.chain(before_funcall_call);
		before_funcall_call = adapt;
	}
	public void add_specialize_funcall_call(AdaptationRule adapt){
		adapt.chain(specialize_funcall_call);
		specialize_funcall_call = adapt;
	}
	public void add_after_funcall_call(AdaptationRule adapt){
		adapt.chain(after_funcall_call);
		after_funcall_call = adapt;
	}
	public AdaptationRule before_funcall_call(){return before_funcall_call;}
	public AdaptationRule specialize_funcall_call(){return specialize_funcall_call;}
	public AdaptationRule after_funcall_call(){return after_funcall_call;}
	public void add_before_fundef_vars(AdaptationRule adapt){
		adapt.chain(before_fundef_vars);
		before_fundef_vars = adapt;
	}
	public void add_specialize_fundef_vars(AdaptationRule adapt){
		adapt.chain(specialize_fundef_vars);
		specialize_fundef_vars = adapt;
	}
	public void add_after_fundef_vars(AdaptationRule adapt){
		adapt.chain(after_fundef_vars);
		after_fundef_vars = adapt;
	}
	public AdaptationRule before_fundef_vars(){return before_fundef_vars;}
	public AdaptationRule specialize_fundef_vars(){return specialize_fundef_vars;}
	public AdaptationRule after_fundef_vars(){return after_fundef_vars;}
	public void add_before_complex_call(AdaptationRule adapt){
		adapt.chain(before_complex_call);
		before_complex_call = adapt;
	}
	public void add_specialize_complex_call(AdaptationRule adapt){
		adapt.chain(specialize_complex_call);
		specialize_complex_call = adapt;
	}
	public void add_after_complex_call(AdaptationRule adapt){
		adapt.chain(after_complex_call);
		after_complex_call = adapt;
	}
	public AdaptationRule before_complex_call(){return before_complex_call;}
	public AdaptationRule specialize_complex_call(){return specialize_complex_call;}
	public AdaptationRule after_complex_call(){return after_complex_call;}
	public void add_before_complex_return(AdaptationRule adapt){
		adapt.chain(before_complex_return);
		before_complex_return = adapt;
	}
	public void add_specialize_complex_return(AdaptationRule adapt){
		adapt.chain(specialize_complex_return);
		specialize_complex_return = adapt;
	}
	public void add_after_complex_return(AdaptationRule adapt){
		adapt.chain(after_complex_return);
		after_complex_return = adapt;
	}
	public AdaptationRule before_complex_return(){return before_complex_return;}
	public AdaptationRule specialize_complex_return(){return specialize_complex_return;}
	public AdaptationRule after_complex_return(){return after_complex_return;}
	public void add_before_complex_end(AdaptationRule adapt){
		adapt.chain(before_complex_end);
		before_complex_end = adapt;
	}
	public void add_specialize_complex_end(AdaptationRule adapt){
		adapt.chain(specialize_complex_end);
		specialize_complex_end = adapt;
	}
	public void add_after_complex_end(AdaptationRule adapt){
		adapt.chain(after_complex_end);
		after_complex_end = adapt;
	}
	public AdaptationRule before_complex_end(){return before_complex_end;}
	public AdaptationRule specialize_complex_end(){return specialize_complex_end;}
	public AdaptationRule after_complex_end(){return after_complex_end;}
	public void add_before_inline_call(AdaptationRule adapt){
		adapt.chain(before_inline_call);
		before_inline_call = adapt;
	}
	public void add_specialize_inline_call(AdaptationRule adapt){
		adapt.chain(specialize_inline_call);
		specialize_inline_call = adapt;
	}
	public void add_after_inline_call(AdaptationRule adapt){
		adapt.chain(after_inline_call);
		after_inline_call = adapt;
	}
	public AdaptationRule before_inline_call(){return before_inline_call;}
	public AdaptationRule specialize_inline_call(){return specialize_inline_call;}
	public AdaptationRule after_inline_call(){return after_inline_call;}
	public void add_before_inline_return(AdaptationRule adapt){
		adapt.chain(before_inline_return);
		before_inline_return = adapt;
	}
	public void add_specialize_inline_return(AdaptationRule adapt){
		adapt.chain(specialize_inline_return);
		specialize_inline_return = adapt;
	}
	public void add_after_inline_return(AdaptationRule adapt){
		adapt.chain(after_inline_return);
		after_inline_return = adapt;
	}
	public AdaptationRule before_inline_return(){return before_inline_return;}
	public AdaptationRule specialize_inline_return(){return specialize_inline_return;}
	public AdaptationRule after_inline_return(){return after_inline_return;}
	public void add_before_block_eval(AdaptationRule adapt){
		adapt.chain(before_block_eval);
		before_block_eval = adapt;
	}
	public void add_specialize_block_eval(AdaptationRule adapt){
		adapt.chain(specialize_block_eval);
		specialize_block_eval = adapt;
	}
	public void add_after_block_eval(AdaptationRule adapt){
		adapt.chain(after_block_eval);
		after_block_eval = adapt;
	}
	public AdaptationRule before_block_eval(){return before_block_eval;}
	public AdaptationRule specialize_block_eval(){return specialize_block_eval;}
	public AdaptationRule after_block_eval(){return after_block_eval;}
	public void add_before_block_iter(AdaptationRule adapt){
		adapt.chain(before_block_iter);
		before_block_iter = adapt;
	}
	public void add_specialize_block_iter(AdaptationRule adapt){
		adapt.chain(specialize_block_iter);
		specialize_block_iter = adapt;
	}
	public void add_after_block_iter(AdaptationRule adapt){
		adapt.chain(after_block_iter);
		after_block_iter = adapt;
	}
	public AdaptationRule before_block_iter(){return before_block_iter;}
	public AdaptationRule specialize_block_iter(){return specialize_block_iter;}
	public AdaptationRule after_block_iter(){return after_block_iter;}
	public void add_before_block_end(AdaptationRule adapt){
		adapt.chain(before_block_end);
		before_block_end = adapt;
	}
	public void add_specialize_block_end(AdaptationRule adapt){
		adapt.chain(specialize_block_end);
		specialize_block_end = adapt;
	}
	public void add_after_block_end(AdaptationRule adapt){
		adapt.chain(after_block_end);
		after_block_end = adapt;
	}
	public AdaptationRule before_block_end(){return before_block_end;}
	public AdaptationRule specialize_block_end(){return specialize_block_end;}
	public AdaptationRule after_block_end(){return after_block_end;}
	public void add_before_break(AdaptationRule adapt){
		adapt.chain(before_break);
		before_break = adapt;
	}
	public void add_specialize_break(AdaptationRule adapt){
		adapt.chain(specialize_break);
		specialize_break = adapt;
	}
	public void add_after_break(AdaptationRule adapt){
		adapt.chain(after_break);
		after_break = adapt;
	}
	public AdaptationRule before_break(){return before_break;}
	public AdaptationRule specialize_break(){return specialize_break;}
	public AdaptationRule after_break(){return after_break;}
	public void add_before_return_expr(AdaptationRule adapt){
		adapt.chain(before_return_expr);
		before_return_expr = adapt;
	}
	public void add_specialize_return_expr(AdaptationRule adapt){
		adapt.chain(specialize_return_expr);
		specialize_return_expr = adapt;
	}
	public void add_after_return_expr(AdaptationRule adapt){
		adapt.chain(after_return_expr);
		after_return_expr = adapt;
	}
	public AdaptationRule before_return_expr(){return before_return_expr;}
	public AdaptationRule specialize_return_expr(){return specialize_return_expr;}
	public AdaptationRule after_return_expr(){return after_return_expr;}
	public void add_before_return_end(AdaptationRule adapt){
		adapt.chain(before_return_end);
		before_return_end = adapt;
	}
	public void add_specialize_return_end(AdaptationRule adapt){
		adapt.chain(specialize_return_end);
		specialize_return_end = adapt;
	}
	public void add_after_return_end(AdaptationRule adapt){
		adapt.chain(after_return_end);
		after_return_end = adapt;
	}
	public AdaptationRule before_return_end(){return before_return_end;}
	public AdaptationRule specialize_return_end(){return specialize_return_end;}
	public AdaptationRule after_return_end(){return after_return_end;}
	public void add_before_time(AdaptationRule adapt){
		adapt.chain(before_time);
		before_time = adapt;
	}
	public void add_specialize_time(AdaptationRule adapt){
		adapt.chain(specialize_time);
		specialize_time = adapt;
	}
	public void add_after_time(AdaptationRule adapt){
		adapt.chain(after_time);
		after_time = adapt;
	}
	public AdaptationRule before_time(){return before_time;}
	public AdaptationRule specialize_time(){return specialize_time;}
	public AdaptationRule after_time(){return after_time;}
	public void add_before_battery(AdaptationRule adapt){
		adapt.chain(before_battery);
		before_battery = adapt;
	}
	public void add_specialize_battery(AdaptationRule adapt){
		adapt.chain(specialize_battery);
		specialize_battery = adapt;
	}
	public void add_after_battery(AdaptationRule adapt){
		adapt.chain(after_battery);
		after_battery = adapt;
	}
	public AdaptationRule before_battery(){return before_battery;}
	public AdaptationRule specialize_battery(){return specialize_battery;}
	public AdaptationRule after_battery(){return after_battery;}
	public void add_before_position(AdaptationRule adapt){
		adapt.chain(before_position);
		before_position = adapt;
	}
	public void add_specialize_position(AdaptationRule adapt){
		adapt.chain(specialize_position);
		specialize_position = adapt;
	}
	public void add_after_position(AdaptationRule adapt){
		adapt.chain(after_position);
		after_position = adapt;
	}
	public AdaptationRule before_position(){return before_position;}
	public AdaptationRule specialize_position(){return specialize_position;}
	public AdaptationRule after_position(){return after_position;}
	public void add_before_dist(AdaptationRule adapt){
		adapt.chain(before_dist);
		before_dist = adapt;
	}
	public void add_specialize_dist(AdaptationRule adapt){
		adapt.chain(specialize_dist);
		specialize_dist = adapt;
	}
	public void add_after_dist(AdaptationRule adapt){
		adapt.chain(after_dist);
		after_dist = adapt;
	}
	public AdaptationRule before_dist(){return before_dist;}
	public AdaptationRule specialize_dist(){return specialize_dist;}
	public AdaptationRule after_dist(){return after_dist;}
	public void add_before_compass(AdaptationRule adapt){
		adapt.chain(before_compass);
		before_compass = adapt;
	}
	public void add_specialize_compass(AdaptationRule adapt){
		adapt.chain(specialize_compass);
		specialize_compass = adapt;
	}
	public void add_after_compass(AdaptationRule adapt){
		adapt.chain(after_compass);
		after_compass = adapt;
	}
	public AdaptationRule before_compass(){return before_compass;}
	public AdaptationRule specialize_compass(){return specialize_compass;}
	public AdaptationRule after_compass(){return after_compass;}
	public void add_before_forward_expr(AdaptationRule adapt){
		adapt.chain(before_forward_expr);
		before_forward_expr = adapt;
	}
	public void add_specialize_forward_expr(AdaptationRule adapt){
		adapt.chain(specialize_forward_expr);
		specialize_forward_expr = adapt;
	}
	public void add_after_forward_expr(AdaptationRule adapt){
		adapt.chain(after_forward_expr);
		after_forward_expr = adapt;
	}
	public AdaptationRule before_forward_expr(){return before_forward_expr;}
	public AdaptationRule specialize_forward_expr(){return specialize_forward_expr;}
	public AdaptationRule after_forward_expr(){return after_forward_expr;}
	public void add_before_forward_act(AdaptationRule adapt){
		adapt.chain(before_forward_act);
		before_forward_act = adapt;
	}
	public void add_specialize_forward_act(AdaptationRule adapt){
		adapt.chain(specialize_forward_act);
		specialize_forward_act = adapt;
	}
	public void add_after_forward_act(AdaptationRule adapt){
		adapt.chain(after_forward_act);
		after_forward_act = adapt;
	}
	public AdaptationRule before_forward_act(){return before_forward_act;}
	public AdaptationRule specialize_forward_act(){return specialize_forward_act;}
	public AdaptationRule after_forward_act(){return after_forward_act;}
	public void add_before_backward_expr(AdaptationRule adapt){
		adapt.chain(before_backward_expr);
		before_backward_expr = adapt;
	}
	public void add_specialize_backward_expr(AdaptationRule adapt){
		adapt.chain(specialize_backward_expr);
		specialize_backward_expr = adapt;
	}
	public void add_after_backward_expr(AdaptationRule adapt){
		adapt.chain(after_backward_expr);
		after_backward_expr = adapt;
	}
	public AdaptationRule before_backward_expr(){return before_backward_expr;}
	public AdaptationRule specialize_backward_expr(){return specialize_backward_expr;}
	public AdaptationRule after_backward_expr(){return after_backward_expr;}
	public void add_before_backward_act(AdaptationRule adapt){
		adapt.chain(before_backward_act);
		before_backward_act = adapt;
	}
	public void add_specialize_backward_act(AdaptationRule adapt){
		adapt.chain(specialize_backward_act);
		specialize_backward_act = adapt;
	}
	public void add_after_backward_act(AdaptationRule adapt){
		adapt.chain(after_backward_act);
		after_backward_act = adapt;
	}
	public AdaptationRule before_backward_act(){return before_backward_act;}
	public AdaptationRule specialize_backward_act(){return specialize_backward_act;}
	public AdaptationRule after_backward_act(){return after_backward_act;}
	public void add_before_left_expr(AdaptationRule adapt){
		adapt.chain(before_left_expr);
		before_left_expr = adapt;
	}
	public void add_specialize_left_expr(AdaptationRule adapt){
		adapt.chain(specialize_left_expr);
		specialize_left_expr = adapt;
	}
	public void add_after_left_expr(AdaptationRule adapt){
		adapt.chain(after_left_expr);
		after_left_expr = adapt;
	}
	public AdaptationRule before_left_expr(){return before_left_expr;}
	public AdaptationRule specialize_left_expr(){return specialize_left_expr;}
	public AdaptationRule after_left_expr(){return after_left_expr;}
	public void add_before_left_act(AdaptationRule adapt){
		adapt.chain(before_left_act);
		before_left_act = adapt;
	}
	public void add_specialize_left_act(AdaptationRule adapt){
		adapt.chain(specialize_left_act);
		specialize_left_act = adapt;
	}
	public void add_after_left_act(AdaptationRule adapt){
		adapt.chain(after_left_act);
		after_left_act = adapt;
	}
	public AdaptationRule before_left_act(){return before_left_act;}
	public AdaptationRule specialize_left_act(){return specialize_left_act;}
	public AdaptationRule after_left_act(){return after_left_act;}
	public void add_before_right_expr(AdaptationRule adapt){
		adapt.chain(before_right_expr);
		before_right_expr = adapt;
	}
	public void add_specialize_right_expr(AdaptationRule adapt){
		adapt.chain(specialize_right_expr);
		specialize_right_expr = adapt;
	}
	public void add_after_right_expr(AdaptationRule adapt){
		adapt.chain(after_right_expr);
		after_right_expr = adapt;
	}
	public AdaptationRule before_right_expr(){return before_right_expr;}
	public AdaptationRule specialize_right_expr(){return specialize_right_expr;}
	public AdaptationRule after_right_expr(){return after_right_expr;}
	public void add_before_right_act(AdaptationRule adapt){
		adapt.chain(before_right_act);
		before_right_act = adapt;
	}
	public void add_specialize_right_act(AdaptationRule adapt){
		adapt.chain(specialize_right_act);
		specialize_right_act = adapt;
	}
	public void add_after_right_act(AdaptationRule adapt){
		adapt.chain(after_right_act);
		after_right_act = adapt;
	}
	public AdaptationRule before_right_act(){return before_right_act;}
	public AdaptationRule specialize_right_act(){return specialize_right_act;}
	public AdaptationRule after_right_act(){return after_right_act;}
	public void add_before_speed_expr(AdaptationRule adapt){
		adapt.chain(before_speed_expr);
		before_speed_expr = adapt;
	}
	public void add_specialize_speed_expr(AdaptationRule adapt){
		adapt.chain(specialize_speed_expr);
		specialize_speed_expr = adapt;
	}
	public void add_after_speed_expr(AdaptationRule adapt){
		adapt.chain(after_speed_expr);
		after_speed_expr = adapt;
	}
	public AdaptationRule before_speed_expr(){return before_speed_expr;}
	public AdaptationRule specialize_speed_expr(){return specialize_speed_expr;}
	public AdaptationRule after_speed_expr(){return after_speed_expr;}
	public void add_before_speed_act(AdaptationRule adapt){
		adapt.chain(before_speed_act);
		before_speed_act = adapt;
	}
	public void add_specialize_speed_act(AdaptationRule adapt){
		adapt.chain(specialize_speed_act);
		specialize_speed_act = adapt;
	}
	public void add_after_speed_act(AdaptationRule adapt){
		adapt.chain(after_speed_act);
		after_speed_act = adapt;
	}
	public AdaptationRule before_speed_act(){return before_speed_act;}
	public AdaptationRule specialize_speed_act(){return specialize_speed_act;}
	public AdaptationRule after_speed_act(){return after_speed_act;}
	public void add_before_var_expr(AdaptationRule adapt){
		adapt.chain(before_var_expr);
		before_var_expr = adapt;
	}
	public void add_specialize_var_expr(AdaptationRule adapt){
		adapt.chain(specialize_var_expr);
		specialize_var_expr = adapt;
	}
	public void add_after_var_expr(AdaptationRule adapt){
		adapt.chain(after_var_expr);
		after_var_expr = adapt;
	}
	public AdaptationRule before_var_expr(){return before_var_expr;}
	public AdaptationRule specialize_var_expr(){return specialize_var_expr;}
	public AdaptationRule after_var_expr(){return after_var_expr;}
	public void add_before_var_set(AdaptationRule adapt){
		adapt.chain(before_var_set);
		before_var_set = adapt;
	}
	public void add_specialize_var_set(AdaptationRule adapt){
		adapt.chain(specialize_var_set);
		specialize_var_set = adapt;
	}
	public void add_after_var_set(AdaptationRule adapt){
		adapt.chain(after_var_set);
		after_var_set = adapt;
	}
	public AdaptationRule before_var_set(){return before_var_set;}
	public AdaptationRule specialize_var_set(){return specialize_var_set;}
	public AdaptationRule after_var_set(){return after_var_set;}
	public void add_before_assign_expr(AdaptationRule adapt){
		adapt.chain(before_assign_expr);
		before_assign_expr = adapt;
	}
	public void add_specialize_assign_expr(AdaptationRule adapt){
		adapt.chain(specialize_assign_expr);
		specialize_assign_expr = adapt;
	}
	public void add_after_assign_expr(AdaptationRule adapt){
		adapt.chain(after_assign_expr);
		after_assign_expr = adapt;
	}
	public AdaptationRule before_assign_expr(){return before_assign_expr;}
	public AdaptationRule specialize_assign_expr(){return specialize_assign_expr;}
	public AdaptationRule after_assign_expr(){return after_assign_expr;}
	public void add_before_assign_set(AdaptationRule adapt){
		adapt.chain(before_assign_set);
		before_assign_set = adapt;
	}
	public void add_specialize_assign_set(AdaptationRule adapt){
		adapt.chain(specialize_assign_set);
		specialize_assign_set = adapt;
	}
	public void add_after_assign_set(AdaptationRule adapt){
		adapt.chain(after_assign_set);
		after_assign_set = adapt;
	}
	public AdaptationRule before_assign_set(){return before_assign_set;}
	public AdaptationRule specialize_assign_set(){return specialize_assign_set;}
	public AdaptationRule after_assign_set(){return after_assign_set;}
	public void add_before_symbol_name(AdaptationRule adapt){
		adapt.chain(before_symbol_name);
		before_symbol_name = adapt;
	}
	public void add_specialize_symbol_name(AdaptationRule adapt){
		adapt.chain(specialize_symbol_name);
		specialize_symbol_name = adapt;
	}
	public void add_after_symbol_name(AdaptationRule adapt){
		adapt.chain(after_symbol_name);
		after_symbol_name = adapt;
	}
	public AdaptationRule before_symbol_name(){return before_symbol_name;}
	public AdaptationRule specialize_symbol_name(){return specialize_symbol_name;}
	public AdaptationRule after_symbol_name(){return after_symbol_name;}
	public void add_before_print_expr(AdaptationRule adapt){
		adapt.chain(before_print_expr);
		before_print_expr = adapt;
	}
	public void add_specialize_print_expr(AdaptationRule adapt){
		adapt.chain(specialize_print_expr);
		specialize_print_expr = adapt;
	}
	public void add_after_print_expr(AdaptationRule adapt){
		adapt.chain(after_print_expr);
		after_print_expr = adapt;
	}
	public AdaptationRule before_print_expr(){return before_print_expr;}
	public AdaptationRule specialize_print_expr(){return specialize_print_expr;}
	public AdaptationRule after_print_expr(){return after_print_expr;}
	public void add_before_print_send(AdaptationRule adapt){
		adapt.chain(before_print_send);
		before_print_send = adapt;
	}
	public void add_specialize_print_send(AdaptationRule adapt){
		adapt.chain(specialize_print_send);
		specialize_print_send = adapt;
	}
	public void add_after_print_send(AdaptationRule adapt){
		adapt.chain(after_print_send);
		after_print_send = adapt;
	}
	public AdaptationRule before_print_send(){return before_print_send;}
	public AdaptationRule specialize_print_send(){return specialize_print_send;}
	public AdaptationRule after_print_send(){return after_print_send;}
	public void add_before_if_cond(AdaptationRule adapt){
		adapt.chain(before_if_cond);
		before_if_cond = adapt;
	}
	public void add_specialize_if_cond(AdaptationRule adapt){
		adapt.chain(specialize_if_cond);
		specialize_if_cond = adapt;
	}
	public void add_after_if_cond(AdaptationRule adapt){
		adapt.chain(after_if_cond);
		after_if_cond = adapt;
	}
	public AdaptationRule before_if_cond(){return before_if_cond;}
	public AdaptationRule specialize_if_cond(){return specialize_if_cond;}
	public AdaptationRule after_if_cond(){return after_if_cond;}
	public void add_before_if_true(AdaptationRule adapt){
		adapt.chain(before_if_true);
		before_if_true = adapt;
	}
	public void add_specialize_if_true(AdaptationRule adapt){
		adapt.chain(specialize_if_true);
		specialize_if_true = adapt;
	}
	public void add_after_if_true(AdaptationRule adapt){
		adapt.chain(after_if_true);
		after_if_true = adapt;
	}
	public AdaptationRule before_if_true(){return before_if_true;}
	public AdaptationRule specialize_if_true(){return specialize_if_true;}
	public AdaptationRule after_if_true(){return after_if_true;}
	public void add_before_if_false(AdaptationRule adapt){
		adapt.chain(before_if_false);
		before_if_false = adapt;
	}
	public void add_specialize_if_false(AdaptationRule adapt){
		adapt.chain(specialize_if_false);
		specialize_if_false = adapt;
	}
	public void add_after_if_false(AdaptationRule adapt){
		adapt.chain(after_if_false);
		after_if_false = adapt;
	}
	public AdaptationRule before_if_false(){return before_if_false;}
	public AdaptationRule specialize_if_false(){return specialize_if_false;}
	public AdaptationRule after_if_false(){return after_if_false;}
	public void add_before_loop_cond(AdaptationRule adapt){
		adapt.chain(before_loop_cond);
		before_loop_cond = adapt;
	}
	public void add_specialize_loop_cond(AdaptationRule adapt){
		adapt.chain(specialize_loop_cond);
		specialize_loop_cond = adapt;
	}
	public void add_after_loop_cond(AdaptationRule adapt){
		adapt.chain(after_loop_cond);
		after_loop_cond = adapt;
	}
	public AdaptationRule before_loop_cond(){return before_loop_cond;}
	public AdaptationRule specialize_loop_cond(){return specialize_loop_cond;}
	public AdaptationRule after_loop_cond(){return after_loop_cond;}
	public void add_before_loop_true_exec(AdaptationRule adapt){
		adapt.chain(before_loop_true_exec);
		before_loop_true_exec = adapt;
	}
	public void add_specialize_loop_true_exec(AdaptationRule adapt){
		adapt.chain(specialize_loop_true_exec);
		specialize_loop_true_exec = adapt;
	}
	public void add_after_loop_true_exec(AdaptationRule adapt){
		adapt.chain(after_loop_true_exec);
		after_loop_true_exec = adapt;
	}
	public AdaptationRule before_loop_true_exec(){return before_loop_true_exec;}
	public AdaptationRule specialize_loop_true_exec(){return specialize_loop_true_exec;}
	public AdaptationRule after_loop_true_exec(){return after_loop_true_exec;}
	public void add_before_loop_true_done(AdaptationRule adapt){
		adapt.chain(before_loop_true_done);
		before_loop_true_done = adapt;
	}
	public void add_specialize_loop_true_done(AdaptationRule adapt){
		adapt.chain(specialize_loop_true_done);
		specialize_loop_true_done = adapt;
	}
	public void add_after_loop_true_done(AdaptationRule adapt){
		adapt.chain(after_loop_true_done);
		after_loop_true_done = adapt;
	}
	public AdaptationRule before_loop_true_done(){return before_loop_true_done;}
	public AdaptationRule specialize_loop_true_done(){return specialize_loop_true_done;}
	public AdaptationRule after_loop_true_done(){return after_loop_true_done;}
	public void add_before_loop_true_break(AdaptationRule adapt){
		adapt.chain(before_loop_true_break);
		before_loop_true_break = adapt;
	}
	public void add_specialize_loop_true_break(AdaptationRule adapt){
		adapt.chain(specialize_loop_true_break);
		specialize_loop_true_break = adapt;
	}
	public void add_after_loop_true_break(AdaptationRule adapt){
		adapt.chain(after_loop_true_break);
		after_loop_true_break = adapt;
	}
	public AdaptationRule before_loop_true_break(){return before_loop_true_break;}
	public AdaptationRule specialize_loop_true_break(){return specialize_loop_true_break;}
	public AdaptationRule after_loop_true_break(){return after_loop_true_break;}
	public void add_before_loop_false(AdaptationRule adapt){
		adapt.chain(before_loop_false);
		before_loop_false = adapt;
	}
	public void add_specialize_loop_false(AdaptationRule adapt){
		adapt.chain(specialize_loop_false);
		specialize_loop_false = adapt;
	}
	public void add_after_loop_false(AdaptationRule adapt){
		adapt.chain(after_loop_false);
		after_loop_false = adapt;
	}
	public AdaptationRule before_loop_false(){return before_loop_false;}
	public AdaptationRule specialize_loop_false(){return specialize_loop_false;}
	public AdaptationRule after_loop_false(){return after_loop_false;}
}
