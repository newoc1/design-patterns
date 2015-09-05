package omc_design_patterns.design_patterns.behavioral.memento;

import java.util.Random;
import java.util.Set;

/**
 * The {@link TimeTraveler time traveler} is tasked with finding all of the ancient relics scattered throughout the world in order
 * to prevent an apocalypse.
 *
 */
public class TimeTraveler {
	private SpacetimeItemManager spacetimeItemManager;
	private Inventory inventory;
	private Random random;
	public TimeTraveler(SpacetimeItemManager spacetimeItemManager, Inventory inventory){
		this.spacetimeItemManager = spacetimeItemManager;
		this.inventory = inventory;
		this.random = new Random();
	}
	/**
	 * Each relic is hidden by a monster and may have already been moved by the time the Traveler gets to the monster. The monster must be defeated in order to find a relic.
	 * However, there is always a guarantee that a monster will drop an item. 
	 */
	public void searchForRelics(){
		boolean defeatedMonster = false;
		if(random.nextBoolean()){
			defeatedMonster = true;
			Item item = spacetimeItemManager.getRandomItem(random);
			if(item.getItemName().equals("legendarySword")){
				if(inventory.getLegendarySword() != null){
					inventory.setLegendarySword(item);
				}
			}
			else if(item.getItemName().equals("hookshot")){
				if(inventory.getHookshot() != null){
					inventory.setHookshot(item);
				}
			}
			else if(item.getItemName().equals("horse")){
				if(inventory.getHorse() != null){
					inventory.setHorse(item);
				}
			}
			if(item.getItemName().equals("junkItem")){
				System.out.println("Sold junk item for 10gp");
				inventory.setMoney(inventory.getMoney()+10);
			}
		}
		if(inventory.getRelics().size() != 12){
			if(random.nextBoolean() && defeatedMonster){
				inventory.getRelics().add(new Relic());
			}
		}
	}
	
	/**
	 * Checks if all relics are found. 
	 * @return true if all relics have been found
	 */
	public boolean checkRelics(){
		boolean allRelicsFound = false;
		System.out.println("You have: "+inventory.getRelics().size()+" relics!");
		if(inventory.getRelics().size() == Relic.NUMBER_OF_ANCIENT_RELICS){
			allRelicsFound = true;
			System.out.println("All relics found.");
		}
		return allRelicsFound;
	}
	
	/**Save an {@link InventoryMemento}, which holds the current inventory state, to the next {@link SpacetimeItemManager} which will store it.
	 * 
	 */
	public void saveInventory(){
		SpacetimeItemManager nextSpacetimeItemManager = new SpacetimeItemManager();
		nextSpacetimeItemManager.setInventoryMemento(new InventoryMemento(inventory));
		nextSpacetimeItemManager.setPrevSpacetimeItemManager(spacetimeItemManager);
		setSpacetimeItemManager(nextSpacetimeItemManager);
	}
	
	/**
	 * We must restore the Traveler's inventory to a prior state, but keep the {@link Relic relics} as they are not affected by time travel.
	 * This happens by retrieving previous space time managers and then finally using the memento to restore the inventory state. Afterwards, we 
	 * reset the relics to what the hero had before time travel.
	 * @param numberOfYears
	 */
	public void goBackInTime(int numberOfYears){
		Set<Relic> relics = inventory.getRelics();
		for(int i = numberOfYears; i > 0; i--){
			System.out.println("going back in time");
			if(spacetimeItemManager.getPrevSpacetimeItemManager() != null){
				spacetimeItemManager = spacetimeItemManager.getPrevSpacetimeItemManager();
			}
		}
		spacetimeItemManager.getInventoryMemento().provideInventory(this);
		inventory.setRelics(relics);
	}
	public SpacetimeItemManager getSpacetimeItemManager() {
		return spacetimeItemManager;
	}
	public void setSpacetimeItemManager(SpacetimeItemManager spacetimeItemManager) {
		this.spacetimeItemManager = spacetimeItemManager;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
