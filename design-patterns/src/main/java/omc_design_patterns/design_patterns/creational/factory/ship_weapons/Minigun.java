package omc_design_patterns.design_patterns.creational.factory.ship_weapons;

public class Minigun extends ShipWeapon {

	public Minigun(){
		name = "standard minigun";
		damage = 10;
		energyCost = 3;
	}
	
	public Minigun(String name, int damage, int energyCost){
		this.name = name;
		this.damage = damage;
		this.energyCost = energyCost;
	}

}
