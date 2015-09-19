package omc_design_patterns.design_patterns.behavioral.visitor.power_givers;

import omc_design_patterns.design_patterns.behavioral.visitor.Human;
import omc_design_patterns.design_patterns.behavioral.visitor.Orc;
import omc_design_patterns.design_patterns.behavioral.visitor.PowerGiver;

public class BlessingOfStrength implements PowerGiver{

	@Override
	public void usePower(Orc orc) {
		System.out.println("The orc's muscle embiggen. Attack power increases by 10.");
		orc.alterAttackPower(-10);
	}

	@Override
	public void usePower(Human human) {
		System.out.println("The human's vitality increases! Health increased by 30 attack power increased by 2.");
		human.setHealth(human.getHealth()+50);
		human.alterAttackPower(-2);
	}

}
