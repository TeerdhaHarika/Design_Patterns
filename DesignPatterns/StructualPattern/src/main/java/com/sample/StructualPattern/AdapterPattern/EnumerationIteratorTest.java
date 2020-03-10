package com.sample.StructualPattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {

	public static void main(String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Iterator<String> iterator = new EnumerationIterator<String>(v.elements());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}