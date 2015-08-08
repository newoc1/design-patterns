package omc_design_patterns.design_patterns.behavioral.command;

import omc_design_patterns.design_patterns.behavioral.command.pet.Dog;

public class PetOwner {
	
	public void callCommand(PetCommand command){
		command.execute();
	}
}
