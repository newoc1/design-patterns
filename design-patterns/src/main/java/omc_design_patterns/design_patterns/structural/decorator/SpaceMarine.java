package omc_design_patterns.design_patterns.structural.decorator;

public class SpaceMarine {
	private int health;
	private int rifleDamage;
	private String name;
	public SpaceMarine(String name, int health, int rifleDamage){
		this.name = name;
		this.health = health;
		this.rifleDamage = rifleDamage;
	}
	
	public void shoot(Alien alien){
		System.out.println(name+" shoots at alien. Does :"+rifleDamage);
		alien.handleDamage(rifleDamage);
	}
	
	public void handleDamage(int damageTaken){
		health -= damageTaken;
		System.out.println(name+" says, \"AAAAAH\"");
	}

	public int getHealth() {
		return health;
	}
}
