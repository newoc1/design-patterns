package omc_design_patterns.design_patterns.behavioral.strategy;

public class LaserGun implements WeaponStrategy {
	private int heatCapacity;
	private boolean notOverHeated;
	
	public LaserGun(int heatCapacity){
		this.heatCapacity = heatCapacity;
		this.notOverHeated = true;
	}
	@Override
	public void reload() {
		System.out.println("Laser gun does not need to reload.");
		if(notOverHeated == false){
			System.out.println("However your laser gun has overheated. Cooling weapon.");
			notOverHeated = true;
		}
	}

	@Override
	public void fire(int timesToFire) {
		int heat = 0;
		for (int i = 0; i < timesToFire && notOverHeated; i++){
			System.out.println("Laser gun fired.");
			heat++;
			if(heat >= heatCapacity){
				notOverHeated = false;
				System.out.println("Laser gun overheated.");
			}
		}

	}

}
