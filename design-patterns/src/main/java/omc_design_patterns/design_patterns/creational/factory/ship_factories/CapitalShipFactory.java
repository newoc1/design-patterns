package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import java.util.LinkedList;
import java.util.List;

import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Laser;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Minigun;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.MissileLauncher;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.Railgun;
import omc_design_patterns.design_patterns.creational.factory.ship_weapons.ShipWeapon;
import omc_design_patterns.design_patterns.creational.factory.ships.CapitalShip;

public class CapitalShipFactory implements ShipCreator<CapitalShip>{

	@Override
	public CapitalShip createShip() {
		CapitalShip capitalShip = new CapitalShip();
		capitalShip.setHull(1000);
		capitalShip.setShields(2000);
		//outfit with weapons
		List<ShipWeapon> capitalShipWeapons = new LinkedList<>();
		capitalShipWeapons.add(new Laser());
		capitalShipWeapons.add(new Laser());
		capitalShipWeapons.add(new Laser());
		capitalShipWeapons.add(new Minigun("Hyper Minigun", 20,10));
		capitalShipWeapons.add(new Minigun("Hyper Minigun", 20,10));
		capitalShipWeapons.add(new MissileLauncher());
		capitalShipWeapons.add(new MissileLauncher());
		capitalShipWeapons.add(new Railgun());
		capitalShipWeapons.add(new Railgun());
		capitalShipWeapons.add(new Railgun());
		capitalShip.setShipWeapons(capitalShipWeapons);
		return capitalShip;
	}

}
