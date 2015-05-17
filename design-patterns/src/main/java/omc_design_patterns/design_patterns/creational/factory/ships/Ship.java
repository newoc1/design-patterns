package omc_design_patterns.design_patterns.creational.factory.ships;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

public interface Ship {

	void fireAt(Ship ship);

	
	void sail(String direction);
	
	void takeDamage(ShipWeapon shipWeapon);
	
	 boolean isSunk();
	
}
