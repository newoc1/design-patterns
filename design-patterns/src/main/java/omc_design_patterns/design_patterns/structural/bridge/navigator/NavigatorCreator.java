package omc_design_patterns.design_patterns.structural.bridge.navigator;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.location.LocationImpl;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.GalaxyClassStarship;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.Galley;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.LincolnContinental;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.Vehicle;

public class NavigatorCreator {

	public AbstractNavigator getDriver(){
		LincolnContinental vehicle  = new LincolnContinental();
		Driver driver = new Driver(vehicle);
		Location currentLocation = new LocationImpl("Abilene",120,20,100);
		driver.getAvailableDestinations().add(new LocationImpl("Abilene",120,20,100));
		driver.getAvailableDestinations().add(new LocationImpl("NewJersey",400,100,110));
		driver.currentLocation = currentLocation;
		return driver;
	}
	
	public AbstractNavigator getSailor(){
		Galley vehicle = new Galley();
		ShipNavigator shipNavigator = new ShipNavigator(vehicle);
		Location currentLocation= new LocationImpl("NewJersey",400,100,110);
		shipNavigator.getAvailableDestinations().add(currentLocation);
		shipNavigator.getAvailableDestinations().add(new LocationImpl("Sydney", 1000, 10, 110));
		shipNavigator.currentLocation = currentLocation;
		return shipNavigator;
	}
	
	public AbstractNavigator getStarshipCaptain(){
		GalaxyClassStarship vehicle = new GalaxyClassStarship();
		StarshipCaptain starshipCaptain = new StarshipCaptain(vehicle);
		Location currentLocation= new LocationImpl("NewJersey",400,100,110);
		starshipCaptain.getAvailableDestinations().add(new LocationImpl("Abilene",120,20,100));
		starshipCaptain.getAvailableDestinations().add(currentLocation);
		starshipCaptain.getAvailableDestinations().add(new LocationImpl("Sydney", 1000, 10, 110));
		starshipCaptain.getAvailableDestinations().add(new LocationImpl("AlphaCentauri",1120,2000,10010));
		starshipCaptain.currentLocation = currentLocation;
		return starshipCaptain;
	}
}
