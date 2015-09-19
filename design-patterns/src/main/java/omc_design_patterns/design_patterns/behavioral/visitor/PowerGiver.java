package omc_design_patterns.design_patterns.behavioral.visitor;

public interface PowerGiver {

	void usePower(Orc orc);
	
	void usePower(Human human);
}
