package omc_design_patterns.design_patterns.creational.prototype;

import java.util.LinkedList;
import java.util.List;

public class EteriAttribute {
	private String name;
	private int powerLevel;
	private List<Eteri> compatibleEteri;

	private EteriAttribute() {
		compatibleEteri = new LinkedList<>();
	}

	public EteriAttribute(String name, int powerLevel,
			List<Eteri> compatibleEteri) {
		this.name = name;
		this.powerLevel = powerLevel;
		this.compatibleEteri = compatibleEteri;
	}

	public EteriAttribute clone() {
		EteriAttribute clonedAttribute = new EteriAttribute();
		clonedAttribute.setName(getName());
		clonedAttribute.setPowerLevel(getPowerLevel());
		List<Eteri> clonedCompatibleEteria = new LinkedList<>();
		if (getCompatibleEteri() != null && !getCompatibleEteri().isEmpty()) {
			for (Eteri eteri : getCompatibleEteri()) {
				clonedCompatibleEteria.add(eteri);
			}
			clonedAttribute.setCompatibleEteri(clonedCompatibleEteria);
		}
		return clonedAttribute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Eteri> getCompatibleEteri() {
		return compatibleEteri;
	}

	public void setCompatibleEteri(List<Eteri> compatibleEteri) {
		this.compatibleEteri = compatibleEteri;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
}
