package omc_design_patterns.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SlimeGroup extends AbstractSlime {
	private List<AbstractSlime> slimes;

	public SlimeGroup() {
		slimes = new ArrayList<>();
	}

	@Override
	public void add(AbstractSlime slime) {
		slime.setParent(this);
		slimes.add(slime);

	}

	@Override
	public void remove(AbstractSlime slime) {
		slime.setParent(null);
		slimes.remove(slime);

	}

	@Override
	public void devour(AbstractSlime slime) {
			for (AbstractSlime mySlime : slimes) {
				mySlime.devour(slime);
			}
	}

	@Override
	public List<AbstractSlime> getSlimes() {
		List<AbstractSlime> totalSlimes = new ArrayList<>();
		for (AbstractSlime slime : slimes) {
			if (slime.getSlimes() != null) {
				totalSlimes.addAll(slime.getSlimes());
			} else {
				totalSlimes.add(slime);
			}

		}
		return totalSlimes;
	}

	@Override
	public List<AbstractSlime> split() {
		List<AbstractSlime> slimesToAdd = new ArrayList<>();
		for(AbstractSlime mySlime: slimes){
			slimesToAdd.addAll(mySlime.split());
		}
		for(AbstractSlime slimeToAdd: slimesToAdd){
			add(slimeToAdd);
		}
		return slimesToAdd;
	}

}
