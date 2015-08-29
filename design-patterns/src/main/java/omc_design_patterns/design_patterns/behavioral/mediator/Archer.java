package omc_design_patterns.design_patterns.behavioral.mediator;

public class Archer {
	private Mediator mediator;
	private Enemy enemy;
	private Vector position;
	public Archer(Vector position){
		this.position = position;
	}
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Vector aim(Enemy enemy){
		this.enemy = enemy;
		int x = enemy.getPosition().getX() - position.getX();
		int y = enemy.getPosition().getY() - position.getY();
		int z = enemy.getPosition().getZ() - position.getZ();
		return new Vector(x, y, z);
	}

	public Enemy getEnemy() {
		return enemy;
	}
	public Vector getVector() {
		return position;
	}
	public void setVector(Vector vector) {
		this.position = vector;
	}
}
