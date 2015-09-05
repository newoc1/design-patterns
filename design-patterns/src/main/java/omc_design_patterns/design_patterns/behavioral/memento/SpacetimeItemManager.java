package omc_design_patterns.design_patterns.behavioral.memento;

import java.util.Random;

/**
 * The {@link SpacetimeItemManager} is used by the {@link TimeTraveler} in order to restore his {@link Inventory} to a prior state. We keep
 * a reference to all states of the traveler's inventory via an {@link InventoryMemento} for each {@link Inventory inventory's state}.
 * The {@link SpacetimeItemManager} cannot directly access an {@link Inventory}.
 *
 */
public class SpacetimeItemManager {
	private SpacetimeItemManager prevSpacetimeItemManager;
	private InventoryMemento inventoryMemento;
	
	public SpacetimeItemManager getPrevSpacetimeItemManager() {
		return prevSpacetimeItemManager;
	}

	public void setPrevSpacetimeItemManager(
			SpacetimeItemManager prevSpacetimeItemManager) {
		this.prevSpacetimeItemManager = prevSpacetimeItemManager;
	}

	public InventoryMemento getInventoryMemento() {
		return inventoryMemento;
	}

	public void setInventoryMemento(InventoryMemento inventoryMemento) {
		this.inventoryMemento = inventoryMemento;
	}
	
	public Item getRandomItem(Random random){
		int randomInt = random.nextInt(3);
		Item item;
		if(randomInt == 0){
			item = new Item("horse");
		}
		else if(randomInt == 1){
			item = new Item("legendarySword");
		}
		else if(randomInt == 2){
			item = new Item("hookshot");
		}
		else{
			item = new Item("junkItem");
		}
		return item;
	}

	
}
