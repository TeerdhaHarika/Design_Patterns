package com.sample.StructualPattern;

import java.util.Iterator;


public class CompositeNullIterator implements Iterator<MenuComponent>{
	
	public boolean hasNext() {
		return false;
	}

	public MenuComponent next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();		
	}
}
