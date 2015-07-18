package omc_design_patterns.design_patterns.structural.facade.employee.meat;

import java.util.ArrayList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Beef;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Chicken;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Pork;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Turkey;

public class Butcher {
	private List<Turkey> turkeyStock;
	private List<Beef> beefStock;
	private List<Chicken> chickenStock;
	private List<Pork> porkStock;

	public Butcher() {
		turkeyStock = new ArrayList<>();
		beefStock = new ArrayList<>();
		chickenStock = new ArrayList<>();
		porkStock = new ArrayList<>();
	}

	public void butcherTurkey() {
		System.out.println("Butchering turkey");
		turkeyStock.add(new Turkey());
	}

	public void butcherBeef() {
		System.out.println("Butchering beef");
		beefStock.add(new Beef());
	}

	public void butcherChicken() {
		System.out.println("Butchering Chicken");
		chickenStock.add(new Chicken());
	}

	public void butcherPork() {
		System.out.println("Butchering Pork");
		porkStock.add(new Pork());
	}

	public List<Turkey> getTurkeyStock() {
		return turkeyStock;
	}

	public List<Beef> getBeefStock() {
		return beefStock;
	}

	public List<Chicken> getChickenStock() {
		return chickenStock;
	}

	public List<Pork> getPorkStock() {
		return porkStock;
	}
}