package omc_design_patterns.design_patterns.creational.factory.ships;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
/**
 * Workhorse of the navy. Standard weapons, hull, and shields.
 * @author Owen
 *
 */
public class Frigate extends AbstractShip implements Ship{

	@Override
	public void fireAt(Ship ship) {
		System.out.println("Frigate is firing weapons!");
		for(ShipWeapon shipWeapon: shipWeapons){
			if(shields-shipWeapon.getDamage() >=0){
				shields-=shipWeapon.getDamage();
				ship.takeDamage(shipWeapon);
			}
		}
	}

	@Override
	public void sail(String direction) {
	System.out.println("Frigate is sailing "+direction);
		
	}

	@Override
	public void takeDamage(ShipWeapon shipWeapon) {
		if(shields - shipWeapon.getDamage() >=0){
			shields -= shipWeapon.getDamage();
			System.out.println("Corvette's shields took "+shipWeapon.getDamage()+" damage");
		}
		else{
			hull -= shipWeapon.getDamage();
			System.out.println("Corvette's hull took "+shipWeapon.getDamage()+" damage");
			if(hull <=0){
				System.out.println("Frigate sunk");
			}
		}
		
	}



}
