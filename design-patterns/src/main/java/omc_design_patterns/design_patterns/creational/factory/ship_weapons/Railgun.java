package omc_design_patterns.design_patterns.creational.factory.ship_weapons;

public class Railgun extends ShipWeapon {


	public Railgun(){
		name = "standard railgun";
		damage = 50;
		energyCost = 12;
	}
	
	public Railgun(String name, int damage, int energyCost){
		this.name = name;
		this.damage = damage;
		this.energyCost = energyCost;
	}
}
