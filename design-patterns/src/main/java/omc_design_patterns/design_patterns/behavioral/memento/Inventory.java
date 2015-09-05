package omc_design_patterns.design_patterns.behavioral.memento;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@link Inventory} of the hero
 *
 */
public class Inventory {
	private int money;
	private Item hookshot;
	private Item legendarySword;
	private Item horse;
	private Set<Relic> relics;
	public Inventory(){
		relics = new HashSet<>();
	}
	public Item getHookshot() {
		return hookshot;
	}
	public void setHookshot(Item hookshot) {
		this.hookshot = hookshot;
	}
	public Item getLegendarySword() {
		return legendarySword;
	}
	public void setLegendarySword(Item legendarySword) {
		this.legendarySword = legendarySword;
	}
	public Item getHorse() {
		return horse;
	}
	public void setHorse(Item horse) {
		this.horse = horse;
	}
	public Set<Relic> getRelics() {
		return relics;
	}
	
	public void addRelic(Relic relic){
		relics.add(relic);
	}
	public void setRelics(Set<Relic> relics) {
		this.relics = relics;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
