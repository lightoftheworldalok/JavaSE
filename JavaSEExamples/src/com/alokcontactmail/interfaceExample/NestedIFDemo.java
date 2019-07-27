/**
 * 
 */
package com.alokcontactmail.interfaceExample;

/**
 * @author alokkumar
 *
 */
public class NestedIFDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NestedInterfaceA.NestedIF nif = new NestedInterfaceB();
		if(nif.isNotNegative(10)) {
			System.out.println("10 is not negative ");
		}
		if(nif.isNotNegative(-12)) {
			System.out.println("this won't be displayed ");
		}
	}

}
