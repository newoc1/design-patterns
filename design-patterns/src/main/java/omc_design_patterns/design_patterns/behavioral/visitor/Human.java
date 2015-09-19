package omc_design_patterns.design_patterns.behavioral.visitor;

public class Human implements Humanoid{
	private int health;
	private int mana;
	private Humanoid currentTarget;
	private int attackPower;
	
	public Human(int health, int mana, int attackPower){
		this.health = health;
		this.mana = mana;
		this.attackPower = attackPower;
	}
	public void target(Humanoid humanoid){
		this.currentTarget = humanoid;
	}
	
	public void attack(){
		System.out.println("Human attacks.");
		currentTarget.takeDamage(attackPower);
	}
	@Override
	public void takeDamage(int attackPower) {
		this.health -= attackPower;
	}
	@Override
	public void usePower(PowerGiver powerGiver) {
		powerGiver.usePower(this);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public Humanoid getCurrentTarget() {
		return currentTarget;
	}

	public void setCurrentTarget(Humanoid currentTarget) {
		this.currentTarget = currentTarget;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public void alterAttackPower(int numberToLowerBy) {
	this.attackPower -= numberToLowerBy;
		
	}
	@Override
	public void getStatus() {
		System.out.println("Human has:"+health+" and attackPower:"+attackPower);
		
	}

}
