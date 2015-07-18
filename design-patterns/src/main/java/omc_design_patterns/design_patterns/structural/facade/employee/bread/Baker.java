package omc_design_patterns.design_patterns.structural.facade.employee.bread;

import java.util.ArrayList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.BaconCheddarJalapeno;
import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.Bread;
import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.WholeWheat;

public class Baker {
	private List<BaconCheddarJalapeno> baconCheddarJalapenoStock;
	private List<WholeWheat> wholeWheatStock;
	public Baker(){
		baconCheddarJalapenoStock = new ArrayList<>();
		wholeWheatStock = new ArrayList<>();
	}
	public void bakeBaconCheddarJalapenoBread(){
		System.out.println("Baking Bacon Cheddar Jalapeno Bread");
		baconCheddarJalapenoStock.add(new BaconCheddarJalapeno());
	}
	
	public void bakeWholeWheatBread(){
		System.out.println("Baking Whole Wheat Bread");
		wholeWheatStock.add(new WholeWheat());
	}
	public List<BaconCheddarJalapeno> getBaconCheddarJalapenoStock() {
		return baconCheddarJalapenoStock;
	}
	public List<WholeWheat> getWholeWheatStock() {
		return wholeWheatStock;
	}
}
