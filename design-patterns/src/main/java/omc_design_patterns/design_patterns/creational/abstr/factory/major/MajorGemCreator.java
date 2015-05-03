package omc_design_patterns.design_patterns.creational.abstr.factory.major;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;
import omc_design_patterns.design_patterns.creational.abstr.factory.GemCreator;
import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;

public class MajorGemCreator implements GemCreator {
	public static int MAX_RED_GEMS = 100;
	public static int MAX_BLUE_GEMS = 100;
	private Map<Integer, RedGem> redGemMap;
	private Integer numRedGems;
	private Map<Integer, BlueGem> blueGemMap;
	private Integer numBlueGems;
	private Random randomGen;
	/**
	 * Set up the state for this gem creator. Make the random generator and then populate the red and blue gem maps.
	 */
	public MajorGemCreator(){
		randomGen = new Random();
		redGemMap = new HashMap<>();
		populateRedGems();
		blueGemMap = new HashMap<>();
		populateBlueGems();
	}
	/**
	 * Pick a random number and go into the map. Since the map does not guarantee we will find a non-null value,have a back up plan.
	 */
	@Override
	public RedGem mineRedGem() {
		RedGem redGem = redGemMap.get(randomGen.nextInt(numRedGems));
		if(redGem == null){
			redGem = new Ruby("SuperRuby", 10, 100);
		}
		return redGem;
	}

	/**
	 * Pick a random number and go into the map. Since the map does not guarantee we will find a non-null value,have a back up plan.
	 */
	@Override
	public BlueGem mineBlueGem() {
		BlueGem blueGem =  blueGemMap.get(randomGen.nextInt(numBlueGems));
		if(blueGem == null){
			blueGem = new Sapphire("UltraSapphire", 9, 125);
		}
		return blueGem;
	}
	
	/**
	 * Calculates the total possible number of red gems and iterates over that number. Each iteration we check if the current index value can be neatly divided by two which decides the gem construction.
	 */
	private void populateRedGems(){
		numRedGems = randomGen.nextInt(MAX_RED_GEMS);
		for(int i = 0; i < numRedGems; i++){
			if( i %2 == 0){
				redGemMap.put(i, new ImperialTopaz());
			}
			else{
				redGemMap.put(i, new Ruby());
			}
		}
	}
	
	/**
	 * Calculates the total possible number of red gems and iterates over that number. Each iteration we check if the current index value can be neatly divided by two which decides the gem construction.
	 */
	private void populateBlueGems(){
		numBlueGems = randomGen.nextInt(MAX_BLUE_GEMS);
		for(int i = 0; i < numBlueGems; i++){
			if( i %2 == 0){
				blueGemMap.put(i, new Sapphire());
			}
			else{
				blueGemMap.put(i, new Kyanite());
			}
		}
	}

}
