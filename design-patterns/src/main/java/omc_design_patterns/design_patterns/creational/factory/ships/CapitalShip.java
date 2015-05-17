package omc_design_patterns.design_patterns.creational.factory.ships;

import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Minigun;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.MissileLauncher;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

/**
 * Huge ship that is representative of the naval power of a sovereignty. State
 * of the art shields and layered alloys give this ship a large shield and hull
 * score. When this ship fires it unleashes a devastating arsenal of weapons on
 * enemies at the cost of shield energy.
 * 
 * @author Owen
 *
 */
public class CapitalShip extends AbstractShip implements Ship {

	@Override
	public void fireAt(Ship ship) {
		System.out.println("Capital ship unleashing arsenal upon the enemy!");
		for (ShipWeapon shipWeapon : shipWeapons) {
			if (shields - shipWeapon.getEnergyCost() >= 0) {
				shields -= shipWeapon.getEnergyCost();
				System.out.println("Fired " + shipWeapon.getName() + ". Cost: "
						+ shipWeapon.getEnergyCost()
						+ " of ship's shields leaving shields at: " + shields);
				ship.takeDamage(shipWeapon);
			}
		}
	}

	@Override
	public void sail(String direction) {
		System.out.println("Capital Ship is sailing " + direction);

	}

	@Override
	public void takeDamage(ShipWeapon shipWeapon) {
		System.out.println("Capital ship took " + shipWeapon.getDamage()
				+ " from " + shipWeapon.getName());
		if (shields - shipWeapon.getDamage() >= 0) {
			shields -= shipWeapon.getDamage();
		} else {
			if (hull > 0) {
				hull -= shipWeapon.getDamage();
			} else {
				System.out.println("Capital ship sunk.");
			}
		}
	}

}
