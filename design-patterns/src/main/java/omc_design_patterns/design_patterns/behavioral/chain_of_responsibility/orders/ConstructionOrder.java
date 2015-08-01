package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders;

public class ConstructionOrder implements Order{

	@Override
	public void carryOutOrder() {
		System.out.println("I'm working on the railroad. All the live long time.");
	}

}
