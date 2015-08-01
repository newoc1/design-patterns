package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.citizen;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters.HeadQuarters;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.RequestOrder;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.Skill;

public class CitizenImpl implements Citizen {
	private Set<Skill> skillSet;
	private Order order;
	public CitizenImpl(Skill skill) {
		skillSet = new HashSet<>();
		skillSet.add(skill);
	}
	@Override
	public void requestOrderFromHQ(HeadQuarters HQ) {
		RequestOrder requestOrder = new RequestOrder();
		requestOrder.setSkillset(skillSet);
		order = HQ.requestOrder(requestOrder);
	}
	@Override
	public void executeOrder() {
		if(this.order == null){
			System.out.println("No order. Citizen must request an order from HQ first.");
		}
		else{
			order.carryOutOrder();
		}
		
	}

	
}
