/**
 * 
 */
package com.alokcontactmail.interfaceExample;

/**
 * @author alokkumar
 *
 */
public interface NestedInterfaceA {
	boolean methodOfNestedInterfaceA();
	
	public interface NestedIF{
		boolean isNotNegative(int x);
	}
	
	void doSomething();
}
