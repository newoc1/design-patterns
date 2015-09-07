package omc_design_patterns.design_patterns.behavioral.observer.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OrganicMap {
	public static int NUMBER_OF_DANGER_ZONES = 10;
	private Map<Integer,DangerZone> dangerZones;

	public Map<Integer, DangerZone> getDangerZones() {
		return dangerZones;
	}

	public void setDangerZones(Map<Integer, DangerZone> dangerZones) {
		this.dangerZones = dangerZones;
	}
	
	public int getKey(int x, int y){
		return (1/2)*(x+y)*(x+y+1)+y;
	}
	
	public void initializeMap(int maxDangerLevel){
		dangerZones = new HashMap<>();
		Random random = new Random();
		for(int i = 0; i < NUMBER_OF_DANGER_ZONES; i++){
			int x = random.nextInt(50);
			int y = random.nextInt(50);
			int key = getKey(x,y);
			dangerZones.put(key, new DangerZone(x,y,random.nextInt(maxDangerLevel)));
		}
	}

	
}
