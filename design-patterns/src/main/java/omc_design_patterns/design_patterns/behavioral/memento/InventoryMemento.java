package omc_design_patterns.design_patterns.behavioral.memento;

/**
 * No public accessor method is available beyond passing in the {@link TimeTraveler timeTraveler} who uses the {@link Inventory}
 *
 */
public class InventoryMemento {
	private Inventory inventory;

	public InventoryMemento(Inventory inventory){
		this.inventory = inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void provideInventory(TimeTraveler timeTraveler){
		timeTraveler.setInventory(inventory);
	}

}
