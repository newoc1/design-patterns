package omc_design_patterns.design_patterns.structural.bridge.navigator;

import omc_design_patterns.design_patterns.structural.bridge.location.Location;
import omc_design_patterns.design_patterns.structural.bridge.traveler.Traveler;
import omc_design_patterns.design_patterns.structural.bridge.vehicle.GalaxyClassStarship;

public class StarshipCaptain extends AbstractNavigator {

	public StarshipCaptain(GalaxyClassStarship starship){
		super(starship);
	}
	@Override
	public void guideTraveler(Traveler traveler) {
		GalaxyClassStarship starShip = (GalaxyClassStarship)this.getVehicle();
		starShip.checkDilithiumCrystals();
		Location location = starShip.navigate(traveler);
		System.out.println("We have arrived traveler. May the stars guide your path.");
	}

}
