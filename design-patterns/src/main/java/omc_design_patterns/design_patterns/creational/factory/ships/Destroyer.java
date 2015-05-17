package omc_design_patterns.design_patterns.creational.factory.ships;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

/**
 * Medium sized ship that excels in eliminating high value targets. The Destroyer has advanced weapon systems that require high amounts of energy to operate. 
 * However the tradeoff is that the Destroyer's hull and shields are equivalent to a Frigate.
 * @author Owen
 *
 */
public class Destroyer extends AbstractShip implements Ship{

	@Override
	public void fireAt(Ship ship) {
		System.out.println("Destroyer is firing everything they've got!");
		for(ShipWeapon shipWeapon: shipWeapons){
			if(shields-shipWeapon.getDamage() >=0){
				shields-=shipWeapon.getDamage();
				ship.takeDamage(shipWeapon);
			}
		}
	}

	@Override
	public void sail(String direction) {
	System.out.println("Destroyer is sailing "+direction);
		
	}

	@Override
	public void takeDamage(ShipWeapon shipWeapon) {
		if(shields - shipWeapon.getDamage() >=0){
			shields -= shipWeapon.getDamage();
			System.out.println("Corvette's shields took "+shipWeapon.getDamage()+" damage");
		}
		else{
			hull -= shipWeapon.getDamage();
			System.out.println("Destroyer's hull took "+shipWeapon.getDamage()+" damage");
			if(hull <=0){
				System.out.println("Destroyer sunk");
			}
		}
		
	}
}
