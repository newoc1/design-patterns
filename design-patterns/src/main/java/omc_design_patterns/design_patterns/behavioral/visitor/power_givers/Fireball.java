package omc_design_patterns.design_patterns.behavioral.visitor.power_givers;

import omc_design_patterns.design_patterns.behavioral.visitor.Human;
import omc_design_patterns.design_patterns.behavioral.visitor.Orc;
import omc_design_patterns.design_patterns.behavioral.visitor.PowerGiver;

public class Fireball implements PowerGiver{

	@Override
	public void usePower(Orc orc) {
		System.out.println("The fireball is imbued with chaos magic inherent to orcs. It does 20 damage.");
		orc.getCurrentTarget().takeDamage(20);
	}

	@Override
	public void usePower(Human human) {
		System.out.println("The cleverness of humans allows the fireball to weaken their enemies. It does 10 damage and subtracts 10 attack power.");
		human.getCurrentTarget().takeDamage(10);
		human.getCurrentTarget().alterAttackPower(10);
	}

}
