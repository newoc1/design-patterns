package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.MilitaryContract;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.RequestOrder;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.Skill;

public class ArmyCommander implements Commander{

	@Override
	public Order giveCommand(RequestOrder requestOrder) {
		Order order;
		if(requestOrder.getSkillset().contains(Skill.SOLDIERING)){
			order = new MilitaryContract();
		}
		else {
			order = null;
		}
		return order;
	}

}
