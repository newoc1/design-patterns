package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders;

public class MilitaryContract implements Order {

	@Override
	public void carryOutOrder() {
		System.out.println("I'm shooting the bad guys.");

	}

}
