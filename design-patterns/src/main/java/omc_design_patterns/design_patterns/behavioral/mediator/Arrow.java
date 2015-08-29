package omc_design_patterns.design_patterns.behavioral.mediator;

public class Arrow {
	private Mediator mediator;
	private int mass;
	private int initialVelocity;
	private boolean loosed;
	private boolean nocked;
	private double distance;
	
	public Arrow(){
		this.loosed = false;
		this.mass = 10;
		this.nocked = false;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void loose(int force, int changeInTime, Vector normalizedPositionOfTarget){
		loosed = true;
		initialVelocity = (force * changeInTime)/mass;
		this.distance = Math.sqrt(Math.pow(normalizedPositionOfTarget.getX(),2)+Math.pow(normalizedPositionOfTarget.getY(),2)+Math.pow(normalizedPositionOfTarget.getZ(),2));
	}

	public boolean isLoosed() {
		return loosed;
	}

	public void setLoosed(boolean loosed) {
		this.loosed = loosed;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getInitialVelocity() {
		return initialVelocity;
	}

	public void setInitialVelocity(int initialVelocity) {
		this.initialVelocity = initialVelocity;
	}

	public boolean isNocked() {
		return nocked;
	}

	public void setNocked(boolean nocked) {
		this.nocked = nocked;
	}

	public double getDistance() {
		return distance;
	}
}
