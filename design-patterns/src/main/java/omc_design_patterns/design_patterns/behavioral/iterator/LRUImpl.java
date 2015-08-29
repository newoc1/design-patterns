package omc_design_patterns.design_patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class LRUImpl implements LRU {
	private List<LRUItem> items;
	private LRUIterator iterator;
		
	public LRUImpl(List<LRUItem> items){
		this.items = items;
		iterator = new LRUIteratorImpl(items);
	}
	@Override
	public LRUIterator getIterator() {
		return iterator;
	}
}
