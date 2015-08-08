package omc_design_patterns.design_patterns.behavioral.command.pet;

import omc_design_patterns.design_patterns.behavioral.command.pet_food.DogFood;
import omc_design_patterns.design_patterns.behavioral.command.pet_toy.DogToy;


public class Dog {

	public void eat(DogFood food){
		System.out.println("Dog ate: "+food.getName());
	}
	
	public void play(DogToy toy){
		System.out.println("Dog played with: "+toy.getName());
	}
	
	public void walk(){
		System.out.println("Dog went for a walk.");
	}

}
