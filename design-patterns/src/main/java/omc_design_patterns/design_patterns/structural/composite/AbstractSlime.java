package omc_design_patterns.design_patterns.structural.composite;

import java.util.List;

public abstract class AbstractSlime {
	protected int size;
	private SlimeGroup parent;
	public abstract void add(AbstractSlime slime);

	public abstract void remove(AbstractSlime slime);

	public abstract void devour(AbstractSlime slime);
	
	public abstract List<AbstractSlime> split();

	public SlimeGroup getParent() {
		return parent;
	}

	public void setParent(SlimeGroup parent) {
		this.parent = parent;
	}
	
	public abstract List<AbstractSlime> getSlimes();

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
