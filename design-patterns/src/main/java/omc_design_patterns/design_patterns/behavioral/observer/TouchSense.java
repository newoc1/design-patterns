package omc_design_patterns.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.behavioral.observer.map.DangerZone;
import omc_design_patterns.design_patterns.behavioral.observer.map.OrganicMap;

public class TouchSense implements Subject{
	private List<Observer> observers;
	private int dangerLevel;
	private int x, y;
	private Random random;
	
	public TouchSense(int x, int y, Random random){
		this.x = x;
		this.y = y;
		this.random = random;
		observers = new ArrayList<>();
	}
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		observer.setSubject(this);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		observer.setSubject(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers){
			System.out.println("updating observer.");
			observer.update();
		}
	}
	
	public void explore(OrganicMap organicMap){
		move(random.nextInt(10), random.nextInt(10));
		int key = organicMap.getKey(x, y);
		DangerZone dangerZone = organicMap.getDangerZones().get(key);
		if(dangerZone != null){
			System.out.println("Hit dangerzone.");
			dangerLevel = dangerZone.getDangerLevel();
			notifyObservers();
		}
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}
	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}
	

}
