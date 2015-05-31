package omc_design_patterns.design_patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GremlinPizzaParty {

	public static void main(String[] args){
		Random rand = new Random();
		List<Gremlin> gremlins = new ArrayList<>();
		Gremlin torken = new Gremlin();
		Gremlin borken = new Gremlin();
		Gremlin shagdret = new Gremlin();
		gremlins.add(torken);
		gremlins.add(borken);
		gremlins.add(shagdret);
		boolean gremlinsDoneEatingPizza = torken.isReturnedToNetherworld() && borken.isReturnedToNetherworld() && shagdret.isReturnedToNetherworld();
		for(Gremlin gremlin: gremlins){
			gremlin.queueForPizza();
		}
		while(!gremlinsDoneEatingPizza){
			for(Gremlin gremlin: gremlins){
				gremlin.eatPizza();
				if(rand.nextBoolean() == true){
					gremlin.returnToTheNetherworld();
				}
			}
			gremlinsDoneEatingPizza = torken.isReturnedToNetherworld() && borken.isReturnedToNetherworld() && shagdret.isReturnedToNetherworld();
		}
		System.out.println("The pizza makers may now rest.");
	}
}
