package omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers;

import java.util.Deque;

import omc_design_patterns.design_patterns.structural.adapter.pastries.Pastry;

public interface BigMart {

	Pastry supplyPastry();
	
	Deque<Pastry> getPastries();
}
