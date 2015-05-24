package omc_design_patterns.design_patterns.creational.prototype;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class SourceEteri extends Eteri {

	private SourceEteri() {

	}

	public SourceEteri(String name, List<EteriAttribute> attributes) {
		super(UUID.randomUUID().toString(), attributes);
		this.name = name;
	}

	public SourceEteri(List<EteriAttribute> attributes) {
		super(UUID.randomUUID().toString(), attributes);
	}

	@Override
	public Eteri clone(EteriAttribute eteriAttribute) {
		System.out.println("Cloning " + getName() + " with new attribute: "
				+ eteriAttribute.getName());
		List<EteriAttribute> clonedAttributes = new LinkedList<>();
		for (EteriAttribute attr : getAttributes()) {
			clonedAttributes.add(attr.clone());
		}
		clonedAttributes.add(eteriAttribute);
		return new SourceEteri(clonedAttributes);
	}

}