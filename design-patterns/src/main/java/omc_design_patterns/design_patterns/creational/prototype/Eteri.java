package omc_design_patterns.design_patterns.creational.prototype;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SourceEteri.class)
public abstract class Eteri {
	private String id;
	protected String name;
	private List<EteriAttribute> attributes;

	Eteri() {
	}

	public Eteri(String id, List<EteriAttribute> attributes) {
		this.id = id;
		this.attributes = attributes;
	}

	public abstract Eteri clone(EteriAttribute eteriAttribute);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<EteriAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<EteriAttribute> attributes) {
		this.attributes = attributes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
