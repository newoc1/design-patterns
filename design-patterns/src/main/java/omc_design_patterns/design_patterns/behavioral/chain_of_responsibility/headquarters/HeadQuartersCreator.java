package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.ArmyCommander;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.ArmyLeadEngineer;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.commanders.Commander;

public class HeadQuartersCreator {

	public static HeadQuarters establishHQ(){
		Commander armyCommander = new ArmyCommander();
		Commander armyLeadEngineer = new ArmyLeadEngineer(armyCommander);
		System.out.println("Chain of command will be: Army Lead Engineer -> Army Commander");
		return new HeadQuartersImpl(armyLeadEngineer);
	}
}
