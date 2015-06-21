package omc_design_patterns.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BlueSlime extends AbstractSlime {

	@Override
	public void add(AbstractSlime slime) {
		System.out.println("Can't do that.");

	}

	@Override
	public void remove(AbstractSlime slime) {
		System.out.println("Can't do that.");

	}

	@Override
	public void devour(AbstractSlime slime) {
		if (slime.getSlimes() == null) {
			if (slime instanceof BlueSlime) {
				System.out.println("blue slime was able to devour blue slime.");
				size++;
				slime.getParent().remove(slime);
			}
		}
		else{
			for(AbstractSlime theirSlime: slime.getSlimes()){
				devour(theirSlime);
			}
		}
	}

	@Override
	public List<AbstractSlime> getSlimes() {
		return null;
	}

	@Override
	public List<AbstractSlime> split() {
		List<AbstractSlime> slimesToAdd = new ArrayList<>();
		while(size > 0){
			slimesToAdd.add(new BlueSlime());
			size--;
		}
		return slimesToAdd;
	}

}
