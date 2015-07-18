package omc_design_patterns.design_patterns.structural.facade.employee.vegetable;

import java.util.ArrayList;
import java.util.List;

import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Basil;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Lettuce;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Olive;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Onion;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;

public class Gardener {

	private List<Tomato> tomatoStock;
	private List<Olive> oliveStock;
	private List<Onion> onionStock;
	private List<Lettuce> lettuceStock;
	private List<Basil> basilStock;
	
	public Gardener(){
		tomatoStock = new ArrayList<>();
		oliveStock = new ArrayList<>();
		onionStock = new ArrayList<>();
		lettuceStock = new ArrayList<>();
		basilStock = new ArrayList<>();
	}
	
	public void pickTomatoes(){
		tomatoStock.add(new Tomato());
	}
	
	public void pickOlives(){
		oliveStock.add(new Olive());
	}
	
	public void pickOnions(){
		onionStock.add(new Onion());
	}
	
	public void pickLettuce(){
		lettuceStock.add(new Lettuce());
	}
	
	public void pickBasil(){
		basilStock.add(new Basil());
	}

	public List<Tomato> getTomatoStock() {
		return tomatoStock;
	}

	public List<Olive> getOliveStock() {
		return oliveStock;
	}

	public List<Onion> getOnionStock() {
		return onionStock;
	}

	public List<Lettuce> getLettuceStock() {
		return lettuceStock;
	}

	public List<Basil> getBasilStock() {
		return basilStock;
	}
}
