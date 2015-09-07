package omc_design_patterns.design_patterns.behavioral.observer;

public interface Observer {

	void update();
	
	void setSubject(Subject subject);
}
