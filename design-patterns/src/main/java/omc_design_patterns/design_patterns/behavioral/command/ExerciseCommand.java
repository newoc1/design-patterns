package omc_design_patterns.design_patterns.behavioral.command;

import omc_design_patterns.design_patterns.behavioral.command.pet.Dog;
import omc_design_patterns.design_patterns.behavioral.command.pet_toy.DogToy;

public class ExerciseCommand implements PetCommand {
	private Dog dog;

	public ExerciseCommand(Dog dog) {
		this.dog = dog;
	}

	@Override
	public void execute() {
		DogToy dogToy = new DogToy();
		dogToy.setName("Squeaky toy");
		dog.play(dogToy);
		dog.walk();
	}
}