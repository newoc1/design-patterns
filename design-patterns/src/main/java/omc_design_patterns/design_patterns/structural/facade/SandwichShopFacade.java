package omc_design_patterns.design_patterns.structural.facade;

import omc_design_patterns.design_patterns.structural.facade.employee.bread.Baker;
import omc_design_patterns.design_patterns.structural.facade.employee.cheese.Fromager;
import omc_design_patterns.design_patterns.structural.facade.employee.cook.SousChef;
import omc_design_patterns.design_patterns.structural.facade.employee.meat.Butcher;
import omc_design_patterns.design_patterns.structural.facade.employee.sandwichAssembler.Assembler;
import omc_design_patterns.design_patterns.structural.facade.employee.vegetable.Gardener;
import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.BaconCheddarJalapeno;
import omc_design_patterns.design_patterns.structural.facade.ingredients.bread.WholeWheat;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.PepperJack;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cheese.Provolone;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Bacon;
import omc_design_patterns.design_patterns.structural.facade.ingredients.cooked_meat.Meatballs;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Beef;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Pork;
import omc_design_patterns.design_patterns.structural.facade.ingredients.meat.Turkey;
import omc_design_patterns.design_patterns.structural.facade.ingredients.sauce.Marinara;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Basil;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Lettuce;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Olive;
import omc_design_patterns.design_patterns.structural.facade.ingredients.vegetables.Tomato;
import omc_design_patterns.design_patterns.structural.facade.sandwich.Sandwich;

public class SandwichShopFacade {
	private SousChef chef;
	private Gardener gardener;
	private Butcher butcher;
	private Fromager fromager;
	private Baker baker;
	private Assembler assembler;
	
	public SandwichShopFacade(SousChef chef, Gardener gardener, Butcher butcher, Fromager fromager, Baker baker, Assembler assembler){
		this.chef = chef;
		this.gardener = gardener;
		this.butcher = butcher;
		this.fromager = fromager;
		this.baker = baker;
		this.assembler = assembler;
	}
	public Sandwich orderMeatballSub(){
		butcher.butcherBeef();
		Beef beef = butcher.getBeefStock().remove(0);
		baker.bakeBaconCheddarJalapenoBread();
		BaconCheddarJalapeno bread = baker.getBaconCheddarJalapenoStock().remove(0);
		fromager.makeProvolone();
		Provolone provolone = fromager.getProvoloneStock().remove(0);
		gardener.pickBasil();
		gardener.pickTomatoes();
		Basil basil = gardener.getBasilStock().remove(0);
		Tomato tomato = gardener.getTomatoStock().remove(0);
		chef.cookMeatballs(beef);
		chef.makeMarinara(tomato, basil);
		Meatballs meatballs = chef.getMeatballs().remove(0);
		Marinara marinara = chef.getMarinara().remove(0);
		return assembler.makeMeatballSub(meatballs,marinara, bread, provolone);
	}
	
	public Sandwich orderVeggieSandwich(){
		fromager.makePepperJack();
		PepperJack pepperJack = fromager.getPepperJackStock().remove(0);
		gardener.pickLettuce();
		gardener.pickTomatoes();
		gardener.pickOlives();
		Lettuce lettuce = gardener.getLettuceStock().remove(0);
		Tomato tomato = gardener.getTomatoStock().remove(0);
		Olive olive = gardener.getOliveStock().remove(0);
		baker.bakeWholeWheatBread();
		WholeWheat bread = baker.getWholeWheatStock().remove(0);
		return assembler.makeVeggieSandwich(tomato, olive, lettuce, pepperJack,bread);
	}
	
	public Sandwich orderTurkeyClub(){
		fromager.makeProvolone();
		gardener.pickLettuce();
		gardener.pickTomatoes();
		butcher.butcherTurkey();
		butcher.butcherPork();
		baker.bakeWholeWheatBread();
		Pork pork = butcher.getPorkStock().remove(0);
		chef.makeBacon(pork);
		Tomato tomato = gardener.getTomatoStock().remove(0);
		WholeWheat bread = baker.getWholeWheatStock().remove(0);
		Lettuce lettuce = gardener.getLettuceStock().remove(0);
		Turkey turkey = butcher.getTurkeyStock().remove(0);
		Bacon bacon = chef.getBacon().remove(0);
		Provolone provolone = fromager.getProvoloneStock().remove(0);
		
		return assembler.makeTurkeyClub(tomato, bread, lettuce, turkey, bacon, provolone);
	}
	public SousChef getChef() {
		return chef;
	}
	public Gardener getGardener() {
		return gardener;
	}
	public Butcher getButcher() {
		return butcher;
	}
	public Fromager getFromager() {
		return fromager;
	}
	public Baker getBaker() {
		return baker;
	}
	public Assembler getAssembler() {
		return assembler;
	}
}
