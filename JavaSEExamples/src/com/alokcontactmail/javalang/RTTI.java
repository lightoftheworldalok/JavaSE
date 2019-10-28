package com.alokcontactmail.javalang;

public class RTTI {

	public static void main(String[] args) throws ClassNotFoundException {
		X x = new X();
		Y y = new Y();
		Class<?> clObj;
		Class<?> d = X.class;
		// Class<?> e = x.class();
		clObj = x.getClass();
		System.out.println("x is object of type : "+ clObj.getName());
		clObj = y.getClass();
		System.out.println("y is object of type : "+ clObj.getName());
		clObj = clObj.getSuperclass();
		System.out.println("Y's superclasss is : "+clObj.getName());
		System.out.println("Y's superclasss is : "+d.getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Class<?> c1 = Class.forName("java.lang.String"); 
        Class<?> c2 = int.class; 
        Class<?> c3 = void.class; 
        
        System.out.println("Class represented by c1: "+c1.toString());
        System.out.println("Class represented by c2: "+c2.toString());
        System.out.println("Class represented by c3: "+c3.toString());
        
        System.out.println("++++++++++++++++++++++++Class<?> forName(String className)++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Class<?> c = Class.forName("java.lang.String"); 
        System.out.print("Class represented by c : " + c.toString());
        
        System.out.println("++++++++++++++++++++Class<?> forName(String className,boolean initialize, ClassLoader loader)++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        // returns the Class object for this class 
        Class<?> myClass = Class.forName("com.alokcontactmail.javalang.RTTI"); 
        ClassLoader loader = myClass.getClassLoader(); 
        Class<?> c4 = Class.forName("java.lang.String",true,loader); 
        System.out.println("Class represented by c4 : " + c4.toString());
        
        System.out.println("+++++++++++++++++++++++++++boolean isInstance(Object obj)+++++++++++++++++++++++++++++++++++++++++++++");
        
        String s = "GeeksForGeeks"; 
        int i = 10; 
        boolean b1 = c.isInstance(s); 
        boolean b2 = c.isInstance(i); 
        System.out.println("is s instance of String : " + b1); 
        System.out.println("is i instance of String : " + b2);
        
        System.out.println("++++++++++++++++++++++++++++boolean isAssignableFrom(Class<?> cls) ++++++++++++++++++++++++++++++++++++++++++++");
        
     // returns the Class object for the class  
        // with the specified name  
        Class<?> c11 = Class.forName("java.lang.Thread"); 
        Class<?> c22 = Class.forName("java.lang.String"); 
          
       // isAssignableFrom method on c1 
       // it checks whether Thread class is assignable from Test 
       boolean b11 = c11.isAssignableFrom(myClass); 
         
       // isAssignableFrom method on c2 
       // it checks whether String class is assignable from Test 
       boolean b22 = c22.isAssignableFrom(myClass); 
         
       System.out.println("is Thread class Assignable from Test : " + b1); 
       System.out.println("is String class Assignable from Test : " + b2); 
        
        System.out.println("+++++++++++++++++++++++++boolean isInterface()+++++++++++++++++++++++++++++++++++++++++++++++");
        
        // returns the Class object for the class  
        // with the specified name  
        Class c12 = Class.forName("java.lang.String"); 
        Class c21 = Class.forName("java.lang.Runnable"); 
          
        // checking for interface type 
  
        // isInterface method on c1 
        boolean b12 = c1.isInterface(); 
  
        // is Interface method on c2 
        boolean b21 = c2.isInterface(); 
          
        System.out.println("is java.lang.String an interface : " + b12); 
        System.out.println("is java.lang.Runnable an interface : " + b21);
        
        System.out.println("++++++++++++++++++++++++++boolean isPrimitive() :++++++++++++++++++++++++++++++++++++++++++++++");
        
        boolean isPrimitive = c2.isPrimitive();
        boolean disPrimitive = d.isPrimitive();
        System.out.println("is "+c2.toString()+" primitive "+isPrimitive);
        System.out.println("is "+d.toString()+" primitive "+disPrimitive);
        System.out.println("++++++++++++++++++++++++++++++boolean isArray() ++++++++++++++++++++++++++++++++++++++++++");
        
        int a[] = new int[2];
        Class<? extends int[]> arrayClass = a.getClass();
        boolean isAArray = arrayClass.isArray();
        boolean isDArray = d.isArray();
        
        System.out.println("is "+arrayClass.toString()+" an array : " + isAArray);
        System.out.println("is "+d.toString()+" an array : " + isDArray);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
	}

}

class X{
	int a;
	float b;
}
class Y extends X{
	double c;
}