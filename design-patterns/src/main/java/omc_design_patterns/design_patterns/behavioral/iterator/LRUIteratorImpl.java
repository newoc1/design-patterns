package omc_design_patterns.design_patterns.behavioral.iterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
/**
 * Naive implementation of LRU algorithm
 *
 */
public class LRUIteratorImpl implements LRUIterator {
	private Deque<LRUItem> items;
	private int highestLevel;
	private LRUItem candidateNextItem;
	
	public LRUIteratorImpl(List<LRUItem> items){
		this.items = new ArrayDeque<>(items);
		highestLevel = 0;
	}
	
	@Override
	public LRUIterator next() {
		highestLevel = 0;
		candidateNextItem = null;
		for(int i = 0; i < items.size();i++){
			LRUItem itemInStack = items.pop();
			itemInStack.incrementLevel();
			if(itemInStack.getLevel() >= highestLevel){
				if(candidateNextItem != null){
					items.addLast(candidateNextItem);
				}
				candidateNextItem = itemInStack;
			}
			else{
				items.addLast(itemInStack);
			}
		}
		items.addLast(candidateNextItem);
		return this;
	}

	@Override
	public LRUItem getItem() {
		LRUItem item = candidateNextItem;
		candidateNextItem.decrementLevel();
		return item;
	}
}
