package com.alokcontactmail.generics;

public class MyClass<T> implements Containment<T> {
	T[] arrayRef;
	
	public MyClass(T[] o) {
		arrayRef = o;
	}
	
	@Override
	public boolean contains(T o) {
		for (T x : arrayRef) {
			if(x.equals(o)) {
				return true;
			}
		}
		return false;
	}
	
}
