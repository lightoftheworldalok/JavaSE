package com.alokcontactmail.javalang;

public class Test 
{ 
    public static void main(String[] args) 
                         throws ClassNotFoundException, InstantiationException, 
                         IllegalAccessException 
    { 
        // returns the Class object for this class 
        Class<?> myClass = Class.forName("com.alokcontactmail.javalang.Test"); 
          
        // creating new instance of this class 
        // newInstance method 
        Object obj = myClass.newInstance(); 
          
        // returns the runtime class of obj 
        System.out.println("Class of obj : " + obj.getClass()); 
    } 
} 