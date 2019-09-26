package com.alokcontactmail.generics;

public class GenExtendsNonGen<T> extends NonGen {
	T ob;
	public GenExtendsNonGen(T o,int i) {
		super(i);
		ob = o;
		// TODO Auto-generated constructor stub
	}
	T getOb() {
		return ob;
	}
}
