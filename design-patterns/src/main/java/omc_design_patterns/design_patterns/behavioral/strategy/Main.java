package omc_design_patterns.design_patterns.behavioral.strategy;

import java.util.Random;


public class Main {

	public static void main(String[] args){
		WeaponStrategy laserWeapon = new LaserGun(25);
		WeaponStrategy machineGun = new MachineGun(5);
		Weaponized soldier = new SuperSoldier(laserWeapon, new Random());
		Weaponized soldier2 = new SuperSoldier(machineGun, new Random());
		
		System.out.println("Soldier one shoots his laser gun and then checks his weapon.");
		soldier.shoot();
		soldier.checkWeapon();
		System.out.println("Soldier two shoots his machine gun and then checks his weapon.");
		soldier2.shoot();
		soldier2.checkWeapon();
		
		
	}
}
