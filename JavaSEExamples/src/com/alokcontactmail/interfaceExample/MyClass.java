/**
 * 
 */
package com.alokcontactmail.interfaceExample;

/**
 * @author alokkumar
 *
 */
public class MyClass implements IfA, IfB {

	@Override
	public void doSomethingsElse() {
		System.out.println("Doing something");

	}

	@Override
	public void doSomethings() {
		System.out.println("Doing something else.");

	}

}
