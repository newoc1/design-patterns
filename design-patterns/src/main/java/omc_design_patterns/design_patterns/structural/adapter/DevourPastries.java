package omc_design_patterns.design_patterns.structural.adapter;

import omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers.BigMart;
import omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers.BigMartFactory;
import omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers.BigMartFactoryImpl;

public class DevourPastries {
	public static int DEFAULT_HEALTH = 80;
	public static void main(String[] args) {
		//use factory to create a big mart
		BigMartFactory bigMartFactory = new BigMartFactoryImpl();
		BigMart bigMart = bigMartFactory.createBigMart();
		//let hungryMan know where to go to get pastries
		HungryPerson hungryMan = new HungryMan(bigMart, DEFAULT_HEALTH);
		while(bigMart.getPastries().size() > 0){
			System.out.println("current health: "+hungryMan.getHealth());
			hungryMan.eatSomething();
			System.out.println("health after eating something: "+hungryMan.getHealth());
		}
	}

}
