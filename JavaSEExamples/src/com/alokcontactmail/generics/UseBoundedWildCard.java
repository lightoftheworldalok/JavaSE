package com.alokcontactmail.generics;

public class UseBoundedWildCard {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		GenBoundedWildcsrds<A> w = new GenBoundedWildcsrds<A>(a);
		GenBoundedWildcsrds<B> x = new GenBoundedWildcsrds<B>(b);
		GenBoundedWildcsrds<C> y = new GenBoundedWildcsrds<C>(c);
		GenBoundedWildcsrds<D> z = new GenBoundedWildcsrds<D>(d);
		test(y);
		test(x);
		test(w);
		// test(z);
	}
	public static void test(GenBoundedWildcsrds<? extends A>o) {
		System.out.println("Sub class of A ");
	}
}
