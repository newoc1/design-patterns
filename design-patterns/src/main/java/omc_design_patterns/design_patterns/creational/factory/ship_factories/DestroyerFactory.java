package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Railgun;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
import omc_design_patterns.design_patterns.creational.factory.ships.Destroyer;

public class DestroyerFactory implements ShipCreator<Destroyer>{

	@Override
	public Destroyer createShip() {
		Destroyer destroyer = new Destroyer();
		destroyer.setHull(1000);
		destroyer.setShields(1000);
		//outfit ship with weapons
		List<ShipWeapon> shipWeapons = new LinkedList<>();
		shipWeapons.add(new Laser("Mega Laser", 25, 25));
		shipWeapons.add(new Laser("Mega Laser", 25, 25));
		shipWeapons.add(new Railgun("Big Poppa", 200, 100));
		destroyer.setShipWeapons(shipWeapons);
		return destroyer;
	}

}
