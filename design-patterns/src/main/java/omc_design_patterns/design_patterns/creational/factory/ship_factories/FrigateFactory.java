package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Minigun;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.MissileLauncher;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
import omc_design_patterns.design_patterns.creational.factory.ships.Frigate;

public class FrigateFactory implements ShipCreator<Frigate> {

	@Override
	public Frigate createShip() {
		Frigate frigate = new Frigate();
		frigate.setHull(1000);
		frigate.setShields(1000);
		//outfit ship with weapons
		List<ShipWeapon> shipWeapons = new LinkedList<>();
		shipWeapons.add(new Laser());
		shipWeapons.add(new Laser());
		shipWeapons.add(new Laser());
		shipWeapons.add(new Minigun());
		shipWeapons.add(new Minigun());
		shipWeapons.add(new MissileLauncher());
		frigate.setShipWeapons(shipWeapons);
		return frigate;
	}

}
