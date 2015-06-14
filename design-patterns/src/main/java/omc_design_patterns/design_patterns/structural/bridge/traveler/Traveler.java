package omc_design_patterns.design_patterns.structural.bridge.traveler;

import java.util.Set;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.navigator.AbstractNavigator;

public interface Traveler {

	Set<Location> getAvailableDestinations();
	void setDestination( Location destination);
	void travel();
	AbstractNavigator getNavigator();
	void captainsLog();
}
