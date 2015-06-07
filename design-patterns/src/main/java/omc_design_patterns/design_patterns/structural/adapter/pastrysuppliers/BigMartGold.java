package omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.adapter.pastries.Pastry;

public class BigMartGold implements BigMart{
	private Deque<Pastry> pastries;
	
	public BigMartGold(){
		this.pastries = new LinkedList<>();
	}
	@Override
	public Pastry supplyPastry() {

		return pastries.pop();
	}
	public Deque<Pastry> getPastries() {
		return pastries;
	}
	public void setPastries(Deque<Pastry> pastries) {
		this.pastries = pastries;
	}

}
