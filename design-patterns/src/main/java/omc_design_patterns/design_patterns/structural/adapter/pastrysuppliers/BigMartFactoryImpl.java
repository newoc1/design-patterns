package omc_design_patterns.design_patterns.structural.adapter.pastrysuppliers;

import omc_design_patterns.design_patterns.structural.adapter.pastries.Cake;
import omc_design_patterns.design_patterns.structural.adapter.pastries.CakeAdapter;
import omc_design_patterns.design_patterns.structural.adapter.pastries.ChocolateCake;
import omc_design_patterns.design_patterns.structural.adapter.pastries.Croissant;
import omc_design_patterns.design_patterns.structural.adapter.pastries.Pastry;

public class BigMartFactoryImpl implements BigMartFactory{

	@Override
	public BigMart createBigMart() {
		BigMart bigMartGold = new BigMartGold();
		//create croissant
		Pastry croissant = new Croissant(20);
		bigMartGold.getPastries().add(croissant);
		//create cake
		Cake chocCake = new ChocolateCake(40);
		//need to adapt cake
		Pastry chocCakeAdapter = new CakeAdapter(chocCake);
		bigMartGold.getPastries().add(chocCakeAdapter);
		return bigMartGold;
		
	}

	
}
