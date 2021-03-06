package omc_design_patterns.design_patterns.creational.builder.actors.wizards;

import java.util.Map;

import omc_design_patterns.design_patterns.creational.builder.actors.Actor;
import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.SpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.Spell;

public interface Wizard extends Actor {
	
	void castSpells(Enemy enemy);
	
	void gainHealth(int health);
	
	<T extends SpellBuilder> T buildSpell(T spellBuilder);
}
