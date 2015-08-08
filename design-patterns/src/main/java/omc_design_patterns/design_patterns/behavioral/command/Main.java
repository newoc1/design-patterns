package omc_design_patterns.design_patterns.behavioral.command;

import omc_design_patterns.design_patterns.behavioral.command.pet.Dog;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		PetOwner owner = new PetOwner();
		PetCommand feedCommand = new FeedDogCommand(dog);
		PetCommand exerciseCommand = new ExerciseCommand(dog);
		owner.callCommand(feedCommand);
		owner.callCommand(exerciseCommand);

	}

}
