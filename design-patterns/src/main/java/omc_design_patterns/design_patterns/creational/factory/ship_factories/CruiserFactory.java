package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.MissileLauncher;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
import omc_design_patterns.design_patterns.creational.factory.ships.Cruiser;

public class CruiserFactory implements ShipCreator<Cruiser>{

	@Override
	public Cruiser createShip() {
		Cruiser cruiser = new Cruiser();
		cruiser.setHull(2000);
		cruiser.setShields(0);
		//outfit ship with weapons
		List<ShipWeapon> shipWeapons = new LinkedList<>();
		shipWeapons.add(new MissileLauncher("Big Boy", 60, 0));
		shipWeapons.add(new MissileLauncher("Big Boy", 60, 0));
		shipWeapons.add(new MissileLauncher("Big Boy", 60, 0));
		cruiser.setShipWeapons(shipWeapons);
		return cruiser;
	}

}
