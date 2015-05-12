package omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders;

import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.Spell;




public interface SpellBuilder {
	int getSpellLevel();
	
	void beginIncantation();
	
	void castFire();
	
	void castWater();
	
	void castAir();
	
	void castEarth();
}
