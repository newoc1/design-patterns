package omc_design_patterns.design_patterns.creational.singleton;

import java.util.Stack;

public enum GateKeeper {
	INSTANCE(new Gate());

	private Gate gate;
	private Stack<Gremlin> gremlins;

	private GateKeeper(Gate gate) {
		this.gate = gate;
		gremlins = new Stack<Gremlin>();
	}

	public void queueGremlin(Gremlin gremlin){
		gremlins.push(gremlin);
	}
	
	public void openGate(){
		gate.open();
		System.out.println("The gate is open.");
	}
	
	public void allowGremlinToPass(Gremlin gremlin){
		if(!gremlins.isEmpty() && gremlin.equals( gremlins.peek())){
			System.out.println("You may pass gremlin. Enjoy the Pizza of the Ancients.");
			Gremlin pizzaEatingGremlin = gremlins.pop();
			gate.close();
			pizzaEatingGremlin.setInPizzaHeaven(true);
			pizzaEatingGremlin.eatPizza();
		}
	}
	
	public boolean giveStatus(){
		return gate.isGateIsOpen();
	}
}
