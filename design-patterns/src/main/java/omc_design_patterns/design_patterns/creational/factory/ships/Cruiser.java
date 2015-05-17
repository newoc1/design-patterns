package omc_design_patterns.design_patterns.creational.factory.ships;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

/**
 * Large ships with hardened plateanium alloy hulls that mitigate fire. Shields are swapped for heavier modified weapons that require no energy to operate.
 * @author Owen
 *
 */
public class Cruiser extends AbstractShip implements Ship{
	public static int REPAIR_AMOUNT = 50;
	@Override
	public void fireAt(Ship ship) {
		System.out.println("Cruiser is firing its weapons!");
		for(ShipWeapon shipWeapon:shipWeapons){
			ship.takeDamage(shipWeapon);
		}
		
	}

	@Override
	public void sail(String direction) {
		System.out.println("Sailing "+direction);
		System.out.println("Repairmen can now repair the hull now that they are out of danger.");
		hull += REPAIR_AMOUNT;	
	}

	@Override
	public void takeDamage(ShipWeapon shipWeapon) {
		System.out.println("The hardened hull of the cruiser takes "+shipWeapon.getDamage()/2+" damage.");
		hull -= shipWeapon.getDamage()/2;
		if(hull <= 0){
			System.out.println("Cruiser sunk.");
		}
	}


}
