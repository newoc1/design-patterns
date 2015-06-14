package omc_design_patterns.design_patterns.structural.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.navigator.NavigatorCreator;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;
import omc_design_patterns.design_patterns.structural.bridge.traveler.TravelerImpl;

public class Voyage {

	public static void main(String[] args) {
		NavigatorCreator navCreator = new NavigatorCreator();

		Traveler traveler1 = new TravelerImpl(navCreator.getDriver());

		Traveler traveler2 = new TravelerImpl(navCreator.getSailor());
		Traveler traveler3 = new TravelerImpl(navCreator.getStarshipCaptain());
		List<Traveler> travelers = new ArrayList<>(Arrays.asList(traveler1,
				traveler2, traveler3));

		for (Traveler traveler : travelers) {
			boolean destinationSet = false;
			Set<Location> travelerLocations = traveler.getAvailableDestinations();
			while (travelerLocations.iterator().hasNext() && !destinationSet) {
				Location newDestination = travelerLocations.iterator().next();
				if (newDestination != traveler.getNavigator()
						.getCurrentLocation()) {
					traveler.setDestination(newDestination);
					destinationSet = true;
				}
			}
			
			traveler.travel();
			traveler.captainsLog();
		}

	}

}
