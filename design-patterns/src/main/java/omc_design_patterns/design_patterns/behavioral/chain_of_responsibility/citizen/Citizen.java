package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.citizen;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters.HeadQuarters;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;

public interface Citizen {

	void requestOrderFromHQ(HeadQuarters HQ);
	
	void executeOrder();
}
