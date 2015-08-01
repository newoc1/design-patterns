package omc_design_patterns.design_patterns.behavioral.chain_of_responsibility.request_order;

import java.util.Set;

public class RequestOrder {
	private Set<Skill> skillset;

	public Set<Skill> getSkillset() {
		return skillset;
	}

	public void setSkillset(Set<Skill> skillset) {
		this.skillset = skillset;
	}
}
