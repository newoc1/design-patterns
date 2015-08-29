package omc_design_patterns.design_patterns.behavioral.mediator;

public class Archer {
	private Mediator mediator;
	private Vector position;
	public Archer(Vector position){
		this.position = position;
	}

	public Vector aim(Enemy enemy){
		int x = enemy.getPosition().getX() - position.getX();
		int y = enemy.getPosition().getY() - position.getY();
		int z = enemy.getPosition().getZ() - position.getZ();
		return new Vector(x, y, z);
	}
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public Vector getVector() {
		return position;
	}
	public void setVector(Vector vector) {
		this.position = vector;
	}
}
