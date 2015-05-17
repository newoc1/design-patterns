package omc_design_patterns.design_patterns.creational.factory.ships;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;

/**
 * Small, fast ship that can regenerate shields while sailing and avoid low damage weapons like lasers and minigun fire. Weapons siphon energy from the energy reservoir first before
 * siphoning energy from the ship's shields.
 * @author Owen
 *
 */
public class Corvette extends AbstractShip implements Ship{
	public static int MAX_ENERGY_RESERVES;
	public static int ENERGY_REGEN = 20;
	private int energyReservoir;
	@Override
	public void fireAt(Ship ship) {
		System.out.println("Corvette is harassing the enemy!");
		for(ShipWeapon shipWeapon: shipWeapons){
			fireWeapon(ship, shipWeapon);
			ship.takeDamage(shipWeapon);
		}
	}

	@Override
	public void sail(String direction) {
		
		System.out.println("Corvette sailing "+direction);
		System.out.println("Activating energy regen");
		if(energyReservoir + ENERGY_REGEN > MAX_ENERGY_RESERVES){
			int shieldIncrease = ENERGY_REGEN - (MAX_ENERGY_RESERVES -energyReservoir);
			energyReservoir = MAX_ENERGY_RESERVES;
			shields += shieldIncrease;
		}
		else{
			energyReservoir += ENERGY_REGEN;
		}
		
	}

	@Override
	public void takeDamage(ShipWeapon shipWeapon) {
		if(shipWeapon.getDamage() > 10){
			if(shields-shipWeapon.getDamage() > 0){
				shields -= shipWeapon.getDamage();
				System.out.println("Corvette's shields took "+shipWeapon.getDamage()+" damage");
			}
			else{
				hull -= shipWeapon.getDamage();
				System.out.println("Corvette's hull took "+shipWeapon.getDamage()+" damage");
				if(hull <= 0){
					System.out.println("Corvette sunk.");
				}
			}
		}
		else{
			System.out.println("Corvette evaded enemy fire!");
		}
		
	}
	
	private void fireWeapon(Ship ship, ShipWeapon shipWeapon){
		
		boolean weaponFired = false;
		if(energyReservoir >0){
			System.out.println("Corvette fired weapon using its energy stores.");
			energyReservoir -=shipWeapon.getEnergyCost();
			weaponFired = true;
		}
		else if(shields > 0){
			System.out.println("Corvette fired weapon using its shields.");
			shields -= shipWeapon.getEnergyCost();
			weaponFired = true;
		}
		else{
			System.out.println("No energy for weapon.");
		}
		if(weaponFired){
			ship.takeDamage(shipWeapon);
		}
	}

	public int getEnergyReservoir() {
		return energyReservoir;
	}

	public void setEnergyReservoir(int energyReservoir) {
		this.energyReservoir = energyReservoir;
	}

	

}
