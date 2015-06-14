package omc_design_patterns.design_patterns.structural.bridge.vehicle;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;

public class GalaxyClassStarship implements Vehicle {

	@Override
	public Location navigate(Traveler traveler) {
		Location destination = traveler.getNavigator().getDestination();
		System.out.println("warping to destination: "+destination.getName());
		return destination;
	}
	
	public void checkDilithiumCrystals(){
		System.out.println("Checking dilithium crystals.");
	}

}
