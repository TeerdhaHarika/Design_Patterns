package com.sample.StructualPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	Enumeration<E> enumeration;
	public EnumerationIterator( Enumeration<E> enumeration ) {
		this.enumeration = enumeration;
	}
	
	
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public E next() {
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}