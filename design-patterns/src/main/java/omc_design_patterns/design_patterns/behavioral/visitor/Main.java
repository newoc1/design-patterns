package omc_design_patterns.design_patterns.behavioral.visitor;

import omc_design_patterns.design_patterns.behavioral.visitor.power_givers.BlessingOfStrength;
import omc_design_patterns.design_patterns.behavioral.visitor.power_givers.Fireball;
import omc_design_patterns.design_patterns.behavioral.visitor.power_givers.HealingWave;

public class Main {

	public static void main(String[] args) {
		Humanoid human = new Human(200, 100, 10);
		Humanoid orc = new Orc(300, 50, 15);
		PowerGiver blessingOfStrength = new BlessingOfStrength();
		PowerGiver fireball = new Fireball();
		PowerGiver healingWave = new HealingWave();
		
		human.target(orc);
		orc.target(human);
		human.attack();
		orc.attack();
		human.getStatus();
		orc.getStatus();
		
		human.usePower(healingWave);
		orc.usePower(blessingOfStrength);
		human.attack();
		orc.attack();
		human.getStatus();
		orc.getStatus();
		
		human.usePower(fireball);
		orc.usePower(healingWave);
		human.attack();
		orc.attack();
		human.getStatus();
		orc.getStatus();
	}

}
