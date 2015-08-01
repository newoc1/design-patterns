package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.ArmyCommander;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.ArmyLeadEngineer;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.Commander;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.RequestOrder;

public class HeadQuartersImpl implements HeadQuarters {
	private Commander commander;

	protected HeadQuartersImpl(Commander commander){
		this.commander = commander;
	}
	public Order requestOrder(RequestOrder requestOrder) {
		Order order = null;
		order = commander.giveCommand(requestOrder);
		if (order == null) {
			System.out.println("Your request was denied.");
		}
		return order;
	}

	public void setCommander(Commander commander) {
		this.commander = commander;
	}

}
