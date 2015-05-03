package omc_design_patterns.design_patterns.creational.abstr.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.creational.abstr.factory.major.MajorGemCreator;
import omc_design_patterns.design_patterns.creational.abstr.factory.minor.MinorGemCreator;

public class MineRun {
	private static Random random;
	public static int NUM_GEM_CREATORS = 2;
	public static int NUM_MINERS = 16;
	
	public static void main(String[] args){
		random = new Random();
		List<String> minerNames = new ArrayList<>();
		minerNames.add("Bob"); //1
		minerNames.add("James"); //2
		minerNames.add("Fred"); //3
		minerNames.add("Richard"); //4
		minerNames.add("Jill"); //5
		minerNames.add("Jane"); //6
		minerNames.add("Caleb"); //7
		minerNames.add("Darren"); //8
		minerNames.add("Michael"); //9
		minerNames.add("Zane"); //10
		minerNames.add("Dylan"); //11
		minerNames.add("Beth"); //12
		minerNames.add("Ken"); //13
		minerNames.add("Susan"); //14
		minerNames.add("Henry"); //15
		minerNames.add("Emily"); //16==NUM_MINERS
		List<Miner>miners = new ArrayList<>();
		for(int i = 0 ; i <NUM_MINERS; i++ ){
			int gemCreatorSwitch = random.nextInt(NUM_GEM_CREATORS);
			GemCreator gemCreator = determineGemCreator(gemCreatorSwitch);
			miners.add(new Miner(minerNames.get(i), gemCreator));
		}
		for(Miner miner: miners){
			mineRun(miner);
		}
		
	}
	
	public static void mineRun(Miner miner){
		List<RedGem> foundRedGems = miner.findRedGems();
		List<BlueGem> foundBlueGems = miner.findBlueGems();
		for(RedGem redGem: foundRedGems){
			System.out.println("Miner "+miner.getName()+" found a Red Gem! Name: "+redGem.getName()+" with hardness: "+redGem.getHardness()+" and with health restoration: "+redGem.getHealthRestoration());;
		}
		for(BlueGem blueGem: foundBlueGems){
			System.out.println("Miner "+miner.getName()+" found a Blue Gem! Name: "+blueGem.getName()+" with hardness: "+blueGem.getHardness()+" and with mana restoration: "+blueGem.getManaRestoration());;
		}
	}
	
	public static GemCreator determineGemCreator(int gemCreatorSwitch){
		GemCreator gemCreator;
		switch(gemCreatorSwitch){
		case 0:
			gemCreator = new MinorGemCreator();
			break;
		case 1: 
			gemCreator = new MajorGemCreator();
			break;
		default:
			throw new RuntimeException("The gem creator switch number exceeded the number of possible cases for creation of gem creators.");	
		}
		return gemCreator;
	}
}
