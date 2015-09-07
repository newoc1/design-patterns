package omc_design_patterns.design_patterns.behavioral.observer;

import omc_design_patterns.design_patterns.behavioral.observer.map.OrganicMap;

public interface Subject {

	void attach(Observer observer);
	
	void detach(Observer observer);
	
	void notifyObservers();
	
	void move(int x, int y);
	
	void explore(OrganicMap organicMap);
	
	int getDangerLevel();
}
