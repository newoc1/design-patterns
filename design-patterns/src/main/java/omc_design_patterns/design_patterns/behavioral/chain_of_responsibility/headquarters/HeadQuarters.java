package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.orders.Order;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.RequestOrder;

public interface HeadQuarters {
	public Order requestOrder(RequestOrder requestOrder);
}
