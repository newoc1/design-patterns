package omc_design_patterns.design_patterns.behavioral.iterator;

public interface LRUIterator {

	LRUIterator next();
	
	LRUItem getItem();
}
