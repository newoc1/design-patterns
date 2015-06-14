package omc_design_patterns.design_patterns.structural.bridge.navigator;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.Galley;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.Vehicle;

public class ShipNavigator extends AbstractNavigator {

	public ShipNavigator(Vehicle vehicle){
		super(vehicle);
	}
	@Override
	public void guideTraveler(Traveler traveler) {
		Galley galley = (Galley)this.getVehicle();
		while(getCurrentLocation() != getDestination()){
		Location location = galley.navigate(traveler);
		currentLocation = location;
		}
		System.out.println("We finally made it matey!");
	}

}
