package omc_design_patterns.design_patterns.behavioral.mediator;

public class Main {

	public static void main(String[] args){
		Enemy enemy = new Enemy();
		enemy.setPosition(new Vector(3,3,3));
		Archer archer = new Archer(new Vector(1,1,1));
		Bow bow = new Bow(60, 20, 10);
		Arrow arrow = new Arrow();
		Mediator mediator = new Mediator(archer, bow, arrow);
		mediator.shootArrow(enemy);
	}
}
