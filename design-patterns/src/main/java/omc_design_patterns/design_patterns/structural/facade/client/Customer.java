package omc_design_patterns.design_patterns.structural.facade.client;

import omc_design_patterns.design_patterns.structural.facade.SandwichShopFacade;
import omc_design_patterns.design_patterns.structural.facade.sandwich.Sandwich;

public class Customer {

	private SandwichShopFacade sandwichMenu;
	private Sandwich sandwich;
	
	public Customer(SandwichShopFacade sandwichMenu){
		this.setSandwichMenu(sandwichMenu);
	}
	
	public void setSandwich(Sandwich sandwich){
		this.sandwich = sandwich;
	}
	public void eatSandwich(){
		if(sandwich == null){
			System.out.println("AHH man. No sandwich!");
		}
		else{
			System.out.println("That was a delish: "+sandwich.getName());
		}
	}
	
	public SandwichShopFacade getSandwichMenu() {
		return sandwichMenu;
	}

	public void setSandwichMenu(SandwichShopFacade sandwichMenu) {
		this.sandwichMenu = sandwichMenu;
	}
}
