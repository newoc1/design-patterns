package omc_design_patterns.design_patterns.creational.abstr.factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Miner {

	private GemCreator gemCreator;
	private String name;
	private Random randomGenerator;
	public Miner(String name, GemCreator gemCreator){
		this.name = name;
		this.gemCreator = gemCreator;
		randomGenerator = new Random();
	}
	
	public List<RedGem> findRedGems(){
		List<RedGem> redGems = new LinkedList<>();
		Integer randomInt = randomGenerator.nextInt(10);
		for(int i = 0; i < randomInt; i++){
			redGems.add(gemCreator.mineRedGem());
		}
		return redGems;
	}
	
	public List<BlueGem> findBlueGems(){
		List<BlueGem> blueGems = new LinkedList<>();
		Integer randomInt = randomGenerator.nextInt(10);
		for(int i = 0; i < randomInt; i++){
			blueGems.add(gemCreator.mineBlueGem());
		}
		return blueGems;
	}
	
	public String getName(){
		return name;
	}
}
