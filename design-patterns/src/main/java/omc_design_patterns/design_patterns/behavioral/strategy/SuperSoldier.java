package omc_design_patterns.design_patterns.behavioral.strategy;

import java.util.Random;

public class SuperSoldier implements Weaponized{
	private WeaponStrategy weapon;
	private Random random;
	public SuperSoldier(WeaponStrategy weapon, Random random){
		this.weapon = weapon;
		this.random = random;
	}
	
	@Override
	public void shoot() {
		weapon.fire(random.nextInt(30));
	}

	@Override
	public void checkWeapon() {
		weapon.reload();
		
	}
}
