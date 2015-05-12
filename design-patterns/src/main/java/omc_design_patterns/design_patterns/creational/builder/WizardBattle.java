package omc_design_patterns.design_patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Enemy;
import omc_design_patterns.design_patterns.creational.builder.actors.enemies.Goblin;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.Wizard;
import omc_design_patterns.design_patterns.creational.builder.actors.wizards.WizardApprentice;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.SpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.level_1.MinorSpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.arcane_arts.spell_builders.level_2.MajorSpellBuilder;
import omc_design_patterns.design_patterns.creational.builder.weapons.Mace;
import omc_design_patterns.design_patterns.creational.builder.weapons.Sword;

public class WizardBattle {

	public static void main(String[] args) {
		Wizard wizard = new WizardApprentice();
		Enemy goblin = new Goblin(new Mace());
		Enemy goblin2 = new Goblin(new Sword());
		List<Enemy> enemies = new ArrayList<>();
		enemies.add(goblin);
		enemies.add(goblin2);
		int enemiesToKill = 2;
		Random rand = new Random();
		String message = "";
		while (wizard.getHealth() > 0 && enemiesToKill > 0) {
			
			for (Enemy enemy : enemies) {
					wizard.castSpells(enemy);
				if (rand.nextInt(6) > 3) {
					enemy.hitWizardWithWeapon(wizard);
				} else {
					System.out.println("Goblin missed!");
				}
				enemy.takeDamageOverTime();
				if (enemy.getHealth() < 0) {
					enemiesToKill--;
				}

			}
		}
		if (wizard.getHealth() <= 0) {
			message = "Wizard has died";
		} else if (enemiesToKill == 0) {
			message = "Goblins are dead. The wizard lives to fight another day. With "+wizard.getHealth()+" health remaining.";
		}
		System.out.println(message);

	}
}
