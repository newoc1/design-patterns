package omc_design_patterns.design_patterns.behavioral.observer;

import java.util.Random;

import omc_design_patterns.design_patterns.behavioral.observer.map.OrganicMap;

public class Main {

	public static void main(String[] args){
		
		Observer primaryBrain = new Brain(30);
		Observer secondaryBrain = new Brain(50);
		
		Subject touchSensor = new TouchSense(0, 0, new Random());
		touchSensor.attach(primaryBrain);
		touchSensor.attach(secondaryBrain);
		
		
		OrganicMap organicMap = new OrganicMap();
		organicMap.initializeMap(100);
		
		while(true){
		touchSensor.explore(organicMap);
		}
		
	}
}
