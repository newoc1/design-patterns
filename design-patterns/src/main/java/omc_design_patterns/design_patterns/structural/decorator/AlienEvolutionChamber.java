package omc_design_patterns.design_patterns.structural.decorator;

public class AlienEvolutionChamber {

	public Alien noxiousGasEvolution(Alien alien){
		return new NoxiousGasEvolution(alien, 15);
	}
	
	public Alien spikeEvolution(Alien alien){
		return new SpikeEvolution(alien, 15);
	}
}
