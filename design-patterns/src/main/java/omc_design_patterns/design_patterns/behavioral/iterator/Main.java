package omc_design_patterns.design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<LRUItem> items = new ArrayList<>();
		items.add(new LRUItem("blue"));
		items.add(new LRUItem("green"));
		items.add(new LRUItem("red"));
		items.add(new LRUItem("orange"));
		items.add(new LRUItem("purple"));
		items.add(new LRUItem("yellow"));
		LRU lru = new LRUImpl(items);
		Random random = new Random();
		for(int i = 0; i < 100000; i++){
			LRUItem nextItem = lru.getIterator().next().getItem();
			nextItem.use();
			if(random.nextBoolean()){
				nextItem.use();
			}
		}
		for(LRUItem item : items){
			System.out.println("Item with color: "+item.getColor()+" was used: "+item.getTotalTimesUsed()+" times.");
		}
	}
}
