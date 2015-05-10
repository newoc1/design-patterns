package omc_design_patterns.design_patterns.creational.builder.actors.wizards;

import java.util.Random;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.SpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_1.MinorSpell;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spells.level_2.MajorSpell;
import omc_design_patterns.design_patterns.creational.builder.attributes.LifeLeech;

public class WizardApprentice implements Wizard {
	private int health;
	private Random rand;

	public WizardApprentice() {
		rand = new Random();
		health = 500;
	}

	@Override
	public void takeDamage(int damage) {
		health -= damage;
		System.out.println("wizard took: " + damage + " damage!");
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void hitEnemyWithSpell(Enemy enemy, SpellBuilder spellBuilder) {
		if (spellBuilder.getSpellLevel() > 2) {
			System.out
					.println("Wizard is not high enough level to use these spells.");
		}
		Integer spellChain = rand.nextInt(8);
		spellBuilder.beginIncantation();
		for (int i = spellChain; i > 0; i--) {
			chooseRandomElement(spellBuilder);
		}

		if (spellBuilder.getSpellLevel() == 1) {
			LifeLeech lifeLeech = enemy
					.hitByMinorSpell((MinorSpell) spellBuilder.endIncantation());
			gainHealth(lifeLeech.getLifeLeech());

		} else {
			enemy.hitByMajorSpell((MajorSpell) spellBuilder.endIncantation());
		}
	}

	private void chooseRandomElement(SpellBuilder spellBuilder) {
		Integer element = rand.nextInt(4);
		switch (element) {
		case 0:
			spellBuilder.castFire();
			break;
		case 1:
			spellBuilder.castWater();
			break;
		case 2:
			spellBuilder.castAir();
			break;
		case 3:
			spellBuilder.castEarth();
			break;
		}
	}

	@Override
	public void gainHealth(int health) {

		System.out.println("wizard leeched " + health + " health!");
		health += health;
	}

}
