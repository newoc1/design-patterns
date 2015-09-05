package omc_design_patterns.design_patterns.behavioral.memento;

public class Item {
	private String itemName;
	public Item(String itemName){
		this.itemName = itemName;
	}
	
	public void useItem(){
		System.out.println("used: "+itemName);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
