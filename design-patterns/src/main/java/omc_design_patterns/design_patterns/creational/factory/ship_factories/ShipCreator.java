package omc_design_patterns.design_patterns.creational.factory.ship_factories;

import omc_design_patterns.design_patterns.creational.factory.ships.Ship;

public interface ShipCreator<T extends Ship> {

	T createShip();
}
