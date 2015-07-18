package omc_design_patterns.design_patterns.structural.facade;

import omc_design_patterns.design_patterns.structural.facade.client.Customer;
import omc_design_patterns.design_patterns.structural.facade.employee.bread.Baker;
import omc_design_patterns.design_patterns.structural.facade.employee.cheese.Fromager;
import omc_design_patterns.design_patterns.structural.facade.employee.cook.SousChef;
import omc_design_patterns.design_patterns.structural.facade.employee.meat.Butcher;
import omc_design_patterns.design_patterns.structural.facade.employee.sandwichAssembler.Assembler;
import omc_design_patterns.design_patterns.structural.facade.employee.vegetable.Gardener;

public class SandwichShop {

	public static void main (String[] args){
		Gardener gardener = new Gardener();
		Butcher butcher = new Butcher();
		Assembler assembler = new Assembler();
		Fromager fromager = new Fromager();
		Baker baker = new Baker();
		SousChef chef = new SousChef();
		
		SandwichShopFacade sandwichMenu = new SandwichShopFacade(chef, gardener, butcher, fromager, baker, assembler);
		Customer customer = new Customer(sandwichMenu);
		
		customer.setSandwich(customer.getSandwichMenu().orderMeatballSub());
		
		customer.eatSandwich();
		
		customer.setSandwich(customer.getSandwichMenu().orderTurkeyClub());
		customer.eatSandwich();
	}
}
