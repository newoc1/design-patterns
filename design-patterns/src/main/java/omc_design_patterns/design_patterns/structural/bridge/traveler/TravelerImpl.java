package omc_design_patterns.design_patterns.structural.bridge.traveler;

import java.util.Set;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.navigator.AbstractNavigator;

public class TravelerImpl implements Traveler {
	private AbstractNavigator navigator;
	public TravelerImpl(AbstractNavigator navigator){
		this.navigator = navigator;
	}
	@Override
	public void travel() {
		navigator.guideTraveler(this);
	}

	@Override
	public void captainsLog() {
		System.out.println("I have safely arrived at : "+navigator.getCurrentLocation().getName());

	}

	@Override
	public Set<Location> getAvailableDestinations() {
		return navigator.getAvailableDestinations();
	}

	@Override
	public void setDestination(Location destination) {
		if(navigator.getAvailableDestinations().contains(destination)){
			if(navigator.getCurrentLocation().equals(destination)){
				System.out.println("We're already here");
			}
			else{
				System.out.println("Setting course to: "+destination.getName());
				navigator.setDestination(destination);
			}
		}
		
	}
	@Override
	public AbstractNavigator getNavigator() {
		return navigator;
	}

}
