package omc_design_patterns.design_patterns.creational.factory.ship_factories;

public class Shipyard {
	public static ShipCreator capitalShipFactory = new CapitalShipFactory();;
	public static ShipCreator corvetteFactory = new CorvetteFactory();
	public static ShipCreator cruiserFactory = new CruiserFactory();
	public static ShipCreator destroyerFactory = new DestroyerFactory();
	public static ShipCreator frigateFactory = new FrigateFactory();

}
