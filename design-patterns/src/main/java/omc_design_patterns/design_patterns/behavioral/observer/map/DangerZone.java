package omc_design_patterns.design_patterns.behavioral.observer.map;

public class DangerZone {
	private int x, y;
	private int dangerLevel;

	public DangerZone(int x, int y, int dangerLevel){
		this.x = x;
		this.y = y;
		this.dangerLevel = dangerLevel;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
