package omc_design_patterns.design_patterns.structural.bridge.navigator;

import java.util.HashSet;
import java.util.Set;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.Vehicle;

public abstract class AbstractNavigator {

	private Vehicle vehicle;
	protected Location currentLocation;
	protected Location destination;
	protected Set<Location> availableDestinations;
	
	public AbstractNavigator(Vehicle vehicle){
		this.vehicle = vehicle;
		availableDestinations = new HashSet<>();
	}
	
	public abstract void guideTraveler(Traveler traveler);
	
	public Location getCurrentLocation(){
		return currentLocation;
	}
	public void setCurrentLocation(Location location){
		this.currentLocation = location;
	}
	
	public Location getDestination(){
		return destination;
	}
	
	public void setDestination(Location newDestination){
		this.destination = newDestination;
	}

	public Set<Location> getAvailableDestinations() {
		return availableDestinations;
	}

	public void setAvailableDestinations(Set<Location> availableDestinations) {
		this.availableDestinations = availableDestinations;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

}
