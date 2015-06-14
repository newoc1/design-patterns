package omc_design_patterns.design_patterns.structural.bridge.navigator;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.LincolnContinental;

public class Driver extends AbstractNavigator {

	public Driver(LincolnContinental vehicle){
		super(vehicle);
	}
	@Override
	public void guideTraveler(Traveler traveler) {
		LincolnContinental car = (LincolnContinental)this.getVehicle();
		car.fillUpGas();
		Location location = car.navigate(traveler);
		currentLocation = location;

	}

}
