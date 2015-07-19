package omc_design_patterns.design_patterns.structural.flyweight.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.structural.flyweight.environments.EnvironmentBlockFactory;
import omc_design_patterns.design_patterns.structural.flyweight.environments.EnvironmentType;

public class Starter {

	public static void main(String[] args) {
		
		EnvironmentBlockFactory environmentBlockFactory = new EnvironmentBlockFactory();
		environmentBlockFactory.createEnvironmentBlocks();
		List<Tile> tiles = new ArrayList<>();
		Random random = new Random();
		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.BRUSH)));
		}
		
		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.DESERT)));
		}
		
		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.GRASS)));
		}
		
		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.SNOW)));
		}
		
		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.TREE)));
		}

		for(int i = 0 ; i < 100000; i++){
			tiles.add(new Tile(random.nextInt(10000), random.nextInt(10000),environmentBlockFactory.getEnvironmentBlock(EnvironmentType.WATER)));
		}
		System.out.println("Generated "+tiles.size()+" tiles of various environments!");
	}

}
