package com.alokcontactmail.datatypes;
//relational and logical operator
public class RelLogOps {

	public static void main(String[] args) {
		int i,j;
		boolean b1,b2;
		
		i= 10;
		j = 11;
		if(i<j)System.out.println("i < j");
		if(i<=j)System.out.println("i < j");
		if(i!=j)System.out.println("i < j");
		if(i==j)System.out.println("i==j");
		if(i>=j)System.out.println("i>=j");
		if(i>j)System.out.println("i>j");
		
		b1 = true;
		b2 = false;
		if(b1 & b2 )System.out.println("this won't execute");
		if(!(b1 & b2))System.out.println("!(b1 & b2) is true");
		if(b1 | b2 )System.out.println("b1 | b2 is true "); // let understand this using string .toString method
		if(b1 ^ b2)System.out.println("b1 ^ b2 is true");//xor 
		
		/* p		q		p^q
		 * false 	false 	false 
		 * true		false	true
		 * false	true	true
		 * true		true	false
		 * 
		 * short-circuit OR ||
		 * short-circuit AND &&
		 * 
		 * */
	}

}
