package robLANG_ASOS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import robLANG_ASOS.sd.Array;
import robLANG_ASOS.sd.SdFactory;
import robLANG_ASOS.sd.Value;
import robLANG_ASOS.sd.ValueBool;
import robLANG_ASOS.sd.ValueDouble;
import robLANG_ASOS.sd.ValueInt;
import robLANG_ASOS.sd.ValueString;
import robLANG_ASOS.sd.impl.ExecutionContextImpl;

public class StandaloneContext extends ExecutionContextImpl{
	private Map<String, Double> tradeoff;
	public boolean switches;
	private int switchesIndex;
	private Deque<Map<String, Object>> contexts;
	private Deque<Object> params;
	//private Map<String, Deque<Bounds>> constraints;
	private double battery;
	private double speed;
	private double angle;
	private double time;
	private double[] position;
	private double[] distance;
	private double nominalSpeed;
	
	private final double MOTOR_POWER = 14;
	
	public StandaloneContext() {
		this.tradeoff = new HashMap<String, Double>();
		tradeoff.put("Time", 1.0);
		tradeoff.put("Energy", 0.0);
		this.switches = false;
		this.switchesIndex = 0;
		this.contexts = new ArrayDeque<Map<String, Object>>();
		this.contexts.add(new HashMap<>());
		//this.constraints = new HashMap<>();
		this.angle = 0;
		this.battery = 1000000;
		this.speed = 10;
		this.angle = 0;
		this.time = 0;
		this.position = new double[] {0.0, 0.0};
		this.distance = new double[] {0.0, 0.0};
		this.nominalSpeed = 10;
	}
	
	public void invertTO() {
		double time = tradeoff.get("Time");
		double energy = tradeoff.get("Energy");
		this.tradeoff = new HashMap<String, Double>();
		this.tradeoff.put("Time", energy);
		this.tradeoff.put("Energy", time);
	}

	// Context
	
	@Override
	public void putSymbol(Symbol varName, Object value) {
		contexts.peek().put(varName.getName(), value);
	}
	
	@Override
	public void put(String varName, Object value) {
		contexts.peek().put(varName, value);
	}

	@Override
	public Object get(Variable var) {
		return contexts.peek().get(var.getName());
	}

	@Override
	public void addAll(Map<?, ?> vars) {
		contexts.peek().putAll((Map<String, Object>) vars);
	}

	@Override
	public void pushContext(Map<?, ?> vars) {
		contexts.push((Map<String, Object>) vars);
	}
	
	@Override
	public void pushContext() {
		contexts.push(new HashMap<>());
	}
	
	@Override
	public void popContext() {
		contexts.pop();
	}
	
	@Override
	public void pushArg(Value arg) {
		params.add(arg);
	}
	
	@Override
	public void setParam(String param) {
		Object value = params.poll();
		contexts.peek().put(param, value);
	}
	
	@Override
	public void println(Value expr) {
		if (expr instanceof ValueInt) {
			System.out.println(((ValueInt) expr).getValue());
		}
		if (expr instanceof ValueDouble) {
			System.out.println(((ValueDouble) expr).getValue());	
		}
		if (expr instanceof ValueString) {
			System.out.println(((ValueString) expr).getValue());
		}
		if (expr instanceof ValueBool) {
			System.out.println(((ValueBool) expr).getValue());
		}
	}
	
	private void motorConsumption(double time) {
		double percentage = this.speed / this.nominalSpeed;
		double watt = Math.pow(percentage, 3) * MOTOR_POWER;
		battery -= (2 * watt) / 1000 * time;
		this.time += time;
		if(battery < 0) {
			System.err.println("Battery depletted after : " + time + " s simulated");
			System.exit(0);
		}
	}
	private void cpuConsumption() {
		battery -= 0.00029;
		this.time++;
		if(battery < 0) {
			System.err.println("Battery depletted after : " + time + " s simulated");
			System.exit(0);
		}
	}
	
	// Effectors

	@Override
	public void moveRobot(Double dist) {
		this.position[0] += Math.cos(Math.toRadians(this.angle-90)) * dist;
		this.position[1] += Math.sin(Math.toRadians(this.angle-90)) * dist;
		double duration = dist / this.speed * 1000;
		battery -= 0.00029 * duration;
		motorConsumption(duration);
	}

	@Override
	public void turnRobot(Double angle) {
		this.angle += angle%360;
		if(this.angle < 0) this.angle += 360;
		if(this.angle > 360) this.angle -= 360;
		double duration = Math.toRadians(angle) / this.speed * 1000;
		battery -= 0.00029 * duration;
		motorConsumption(duration);
	}
	
	@Override
	public void setNominalSpeed(Double speed) {
		this.nominalSpeed = speed;
		cpuConsumption();
	}
	
	@Override
	public void setSpeed(Double speed) {
		this.speed = speed;
		cpuConsumption();
	}
	
	
	
	
	// Sensors

	@Override
	public ValueDouble getBattery() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.battery);
		return out;
	}

	@Override
	public Array getPosition() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		//out.setValue(this.position);
		return null;
	}

	@Override
	public ValueDouble getDistance(Integer index) {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.distance[index]);
		return out;
	}

	@Override
	public ValueDouble getCompass() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.angle);
		return out;
	}
	
	@Override
	public ValueDouble getSpeed() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.speed);
		return out;
	}
	
	@Override
	public ValueDouble getNominalSpeed() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.nominalSpeed);
		return out;
	}
	
	@Override
	public ValueDouble getTime() {
		cpuConsumption();
		ValueDouble out = SdFactory.eINSTANCE.createValueDouble();
		out.setValue(this.time);
		return out;
	}

	public Map<String, Double> getTradeoff() {
		if(switches && switchesIndex > 100) {
			invertTO();
			switchesIndex = 0;
		}
		switchesIndex++;
		return tradeoff;
	}

	public void addToTradeoff(String property, Double value) {
		this.tradeoff.put(property, value);
	}
}
