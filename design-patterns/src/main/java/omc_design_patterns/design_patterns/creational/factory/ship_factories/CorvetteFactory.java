package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
import omc_design_patterns.design_patterns.creational.factory.ships.Corvette;

public class CorvetteFactory implements ShipCreator<Corvette>{

	@Override
	public Corvette createShip() {
		Corvette corvette = new Corvette();
		corvette.setHull(250);
		corvette.setShields(1000);
		corvette.setEnergyReservoir(750);
		//outfit with weapons
		List<ShipWeapon> corvetteWeapons = new LinkedList<>();
		corvetteWeapons.add(new Laser("Vaporizer XII", 60, 50));
		corvette.setShipWeapons(corvetteWeapons);
		return corvette;
	}

}
