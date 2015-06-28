package omc_design_patterns.design_patterns.structural.decorator;

public class AlienImpl implements Alien {
	private int health;
	private int attackPower;

	public AlienImpl(int health, int attackPower) {
		this.health = health;
		this.attackPower = attackPower;
	}

	@Override
	public void attack(SpaceMarine spaceMarine) {
		System.out.println("Clawed space marine for: " + attackPower
				+ " damage.");
		spaceMarine.handleDamage(attackPower);
	}

	@Override
	public void defend() {
		System.out.println("Alien took defensive stance.");

	}

	@Override
	public void run() {
		System.out.println("Alien ran away.");
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public void handleDamage(int damage) {
		health -= damage;
	}

}
