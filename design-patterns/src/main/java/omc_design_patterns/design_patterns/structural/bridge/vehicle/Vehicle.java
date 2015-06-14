package omc_design_patterns.design_patterns.structural.bridge.vehicle;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;

public interface Vehicle {

	Location navigate(Traveler traveler);
}
