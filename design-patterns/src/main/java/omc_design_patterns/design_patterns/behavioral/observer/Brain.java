package omc_design_patterns.design_patterns.behavioral.observer;

public class Brain implements Observer
{
	private int dangerLevel;
	private int maxDangerLevelBeforeMoving;
	private Subject subject;
	
	public Brain(int maxDangerLevelBeforeMoving){
		this.maxDangerLevelBeforeMoving = maxDangerLevelBeforeMoving;
	}
	
	@Override
	public void update() {
		this.dangerLevel = subject.getDangerLevel();
		if(dangerLevel >= maxDangerLevelBeforeMoving){
			System.out.println("Danger danger! Moving subject away.");
			subject.move(-10, -10);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Subject getSubject() {
		return subject;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}
}
