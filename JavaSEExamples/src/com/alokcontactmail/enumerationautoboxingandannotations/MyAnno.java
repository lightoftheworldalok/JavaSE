package com.alokcontactmail.enumerationautoboxingandannotations;

public @interface MyAnno {
	String str();
	int val() default 42;
	
}
// @MyAnno(str = "Annotation Example", val = 100)
/*
 * public @interface MyAnno { int value();}
 * @MySingle(100)
 */
