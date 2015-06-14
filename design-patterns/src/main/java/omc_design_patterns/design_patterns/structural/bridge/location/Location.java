package omc_design_patterns.design_patterns.structural.bridge.location;

public interface Location {

	int getXCoordinate();
	
	int getYCoordinate();
	int getZCoordinate();
	
	int distanceToLocation(Location location);
	
	String getName();
}
