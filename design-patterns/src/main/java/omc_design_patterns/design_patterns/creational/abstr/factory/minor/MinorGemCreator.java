package omc_design_patterns.design_patterns.creational.abstr.factory.minor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.creational.abstr.factory.BlueGem;
import omc_design_patterns.design_patterns.creational.abstr.factory.GemCreator;
import omc_design_patterns.design_patterns.creational.abstr.factory.RedGem;


public class MinorGemCreator implements GemCreator {
	public static int MAX_RED_GEMS = 100;
	public static int MAX_BLUE_GEMS = 100;
	private List<RedGem> redGems;
	private List<BlueGem> blueGems;
	
	private Random randomGen;
	public MinorGemCreator(){
		randomGen = new Random();
		redGems = new ArrayList<>(MAX_RED_GEMS);
		populateRedGems();
		blueGems = new ArrayList<>(MAX_BLUE_GEMS);
		populateBlueGems();
		
	}
	@Override
	public RedGem mineRedGem() {
		return redGems.get(randomGen.nextInt(MAX_RED_GEMS-1));
	}

	@Override
	public BlueGem mineBlueGem() {
		return blueGems.get(randomGen.nextInt(MAX_BLUE_GEMS-1));
	}
	
	private void populateRedGems(){
		for(int i = 0; i <MAX_RED_GEMS; i++){
			if( i % 3 == 0){
				redGems.add(new Garnet());
			}
			else{
				redGems.add(new BloodTourmaline());
			}
		}
	}

	private void populateBlueGems(){
		for(int i = 0; i <MAX_BLUE_GEMS; i++){
			if( i % 5 == 0){
				blueGems.add(new LapizLazuli());
			}
			else{
				blueGems.add(new Aquamarine());
			}
		}
	}
}
