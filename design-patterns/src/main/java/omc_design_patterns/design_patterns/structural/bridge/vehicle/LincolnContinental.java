package omc_design_patterns.design_patterns.structural.bridge.vehicle;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;

public class LincolnContinental implements Vehicle {

	@Override
	public Location navigate(Traveler traveler) {
		Location destination = traveler.getNavigator().getDestination();
		System.out.println("Full tank of gas and rolling out to: "+ destination.getName());
		return destination;
	}
	
	public void fillUpGas(){
		System.out.println("Long road ahead. Need to fill up on guzzlerine.");
	}

}
