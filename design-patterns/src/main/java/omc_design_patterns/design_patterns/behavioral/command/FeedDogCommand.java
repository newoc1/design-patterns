package omc_design_patterns.design_patterns.behavioral.command;

import omc_design_patterns.design_patterns.behavioral.command.pet.Dog;
import omc_design_patterns.design_patterns.behavioral.command.pet_food.DogFood;

public class FeedDogCommand implements PetCommand{
	private Dog dog;
	public FeedDogCommand(Dog dog){
		this.dog = dog;
	}
	@Override
	public void execute() {
		DogFood dogFood = new DogFood();
		dogFood.setName("Liver lovers.");
		dog.eat(dogFood);
		
	}

}
