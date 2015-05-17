package omc_design_patterns.design_patterns.creational.factory.ship_weapons;

public class Laser extends ShipWeapon {

	public Laser(){
		name = "standard laser";
		damage = 5;
		energyCost = 1;
	}
	
	public Laser(String name, int damage, int energyCost){
		this.name = name;
		this.damage = damage;
		this.energyCost = energyCost;
	}

}
