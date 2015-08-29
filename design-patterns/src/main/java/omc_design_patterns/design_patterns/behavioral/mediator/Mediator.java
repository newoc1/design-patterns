package omc_design_patterns.design_patterns.behavioral.mediator;

public class Mediator {
	private Archer archer;
	private Bow bow;
	private Arrow arrow;
	
	public Mediator(Archer archer, Bow bow, Arrow arrow){
		this.archer = archer;
		this.bow = bow;
		this.arrow = arrow;
		archer.setMediator(this);
		bow.setMediator(this);
		arrow.setMediator(this);
	}
	
	public void shootArrow(Enemy enemy){
		Vector aimVector = archer.aim(enemy);
		bow.nockAndDraw(arrow);
		arrow.loose(bow.loose(), bow.getDrawLength()/bow.getSnappiness() , aimVector);
		double timeToHitEnemy = arrow.getDistance()/(double)arrow.getInitialVelocity();
		System.out.println("Archer shot an arrow from a bow which took: "+timeToHitEnemy+" seconds.");
	}
}
