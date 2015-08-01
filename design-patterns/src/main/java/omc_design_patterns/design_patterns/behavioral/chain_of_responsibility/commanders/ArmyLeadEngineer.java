package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.ConstructionOrder;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.RequestOrder;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.Skill;

public class ArmyLeadEngineer implements Commander {
	private Commander commander;

	public ArmyLeadEngineer(Commander commander){
		this.commander = commander;
	}
	@Override
	public Order giveCommand(RequestOrder requestOrder) {
		Order order;
		if (requestOrder.getSkillset().contains(Skill.CONSTRUCTION)) {
			order = new ConstructionOrder();
		} else {
			try {
				order = commander.giveCommand(requestOrder);
			} catch (NullPointerException npe) {
				order = null;
			}
		}
		return order;
	}

}
