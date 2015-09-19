package omc_design_patterns.design_patterns.behavioral.visitor.power_givers;

import omc_design_patterns.design_patterns.behavioral.visitor.Human;
import omc_design_patterns.design_patterns.behavioral.visitor.Orc;
import omc_design_patterns.design_patterns.behavioral.visitor.PowerGiver;

public class HealingWave implements PowerGiver {

	@Override
	public void usePower(Orc orc) {
		System.out
				.println("Orcs are bound by their blood oath to not using healing magicks.");
	}

	@Override
	public void usePower(Human human) {
		System.out.println("The blood of the human mends broken bones and closes wounds.");
		human.setHealth(human.getHealth()+15);
	}

}
