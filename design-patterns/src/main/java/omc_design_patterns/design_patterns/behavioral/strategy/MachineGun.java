package omc_design_patterns.design_patterns.behavioral.strategy;

public class MachineGun implements WeaponStrategy {
	private int bulletsLeft;
	private int numMags;

	public MachineGun(int numMags) {
		this.numMags = numMags;
	}

	@Override
	public void fire(int timesToFire) {
		
		if (numMags > 0) {
			if (bulletsLeft == 0 ) {
				reload();
			}
			for (int i = 0; i < timesToFire && bulletsLeft > 0; i++) {
				System.out.println("Bullet shot.");
				bulletsLeft--;
			}
		} else {
			System.out.println("Out of mags.");
		}
	}

	@Override
	public void reload() {
		if(bulletsLeft == 0){
		System.out.println("Weapons system reloaded.");
		bulletsLeft = 30;
		numMags--;
		System.out.println("Mags left: "+numMags);
		}
		else{
			System.out.println("Your machine gun appears to be alright and loaded with: "+bulletsLeft);
		}
	}

}
