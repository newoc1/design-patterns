package omc_design_patterns.design_patterns.structural.decorator;

public class AlienInfestation {

	public static void main(String[] args) {
		//Intrepid space marines
		SpaceMarine jeb = new SpaceMarine("Jeb",200, 20);
		SpaceMarine bob = new SpaceMarine("Bob",300,20);
		
		//Factory for decorating aliens
		AlienEvolutionChamber chamber = new AlienEvolutionChamber();
		//Aliens
		Alien alienGrub = new AlienImpl(100, 10);
		Alien evolvedAlien = new AlienImpl(120, 10);
		evolvedAlien = chamber.noxiousGasEvolution(evolvedAlien);
		evolvedAlien = chamber.spikeEvolution(evolvedAlien);
		
		alienGrub.attack(jeb);
		
		alienGrub.defend();
		alienGrub.run();
		System.out.println("Jeb says, \"Getting too old for this\"");
		System.out.println("Bob says, \"Shh, I hear something coming.\"");
		evolvedAlien.attack(jeb);
		evolvedAlien.defend();
		bob.shoot(evolvedAlien);
		jeb.shoot(evolvedAlien);
		evolvedAlien.attack(jeb);
		evolvedAlien.run();
		
		System.out.println("Jeb says, \"I need a medic\"");
		System.out.println("Bob says, \"I'll cover you, lets roll.\"");
		

	}

}
