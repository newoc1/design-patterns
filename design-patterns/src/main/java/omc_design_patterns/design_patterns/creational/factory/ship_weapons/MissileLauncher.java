package omc_design_patterns.design_patterns.creational.factory.ship_weapons;

public class MissileLauncher extends ShipWeapon {

	public MissileLauncher(){
		name = "standard missile launcher";
		damage = 20;
		energyCost = 6;
	}
	
	public MissileLauncher(String name, int damage, int energyCost){
		this.name = name;
		this.damage = damage;
		this.energyCost = energyCost;
	}

}
