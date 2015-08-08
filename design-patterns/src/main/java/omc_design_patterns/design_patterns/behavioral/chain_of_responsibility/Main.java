package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility;

import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.citizen.Citizen;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.citizen.CitizenImpl;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters.HeadQuarters;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters.HeadQuartersCreator;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.headquarters.HeadQuartersImpl;
import omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order.Skill;

public class Main {

	public static void main(String[] args){
		Citizen soldier = new CitizenImpl(Skill.SOLDIERING);
		Citizen constructionWorker = new CitizenImpl(Skill.CONSTRUCTION);
		
		HeadQuarters HQ = HeadQuartersCreator.establishHQ();
		
		soldier.requestOrderFromHQ(HQ);
		soldier.executeOrder();
		constructionWorker.requestOrderFromHQ(HQ);
		constructionWorker.executeOrder();
	}
}
