package omc_design_patterns.design_patterns.structural.bridge.vehicle;

import java.util.Random;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;

public class Galley implements Vehicle {

	@Override
	public Location navigate(Traveler traveler) {
		Location currentLocation = traveler.getNavigator().getCurrentLocation();
		Location destination = traveler.getNavigator().getDestination();
		Location finalDestination;
		Random rand = new Random();
		if(rand.nextBoolean() == true){
			System.out.println("Stormy weather. This may take longer than expected.");
			finalDestination = currentLocation;
		}
		else{
			System.out.println("Sailing to : "+destination.getName());
			finalDestination = destination;
		}
		return finalDestination;
	}

}
