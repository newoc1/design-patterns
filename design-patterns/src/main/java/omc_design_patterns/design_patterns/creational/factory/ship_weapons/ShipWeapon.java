package omc_design_patterns.design_patterns.creational.factory.ship_weapons;

public abstract class ShipWeapon {
	protected String name;
	protected int damage;
	protected int energyCost;
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getEnergyCost() {
		return energyCost;
	}
	public void setEnergyCost(int energyCost) {
		this.energyCost = energyCost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
