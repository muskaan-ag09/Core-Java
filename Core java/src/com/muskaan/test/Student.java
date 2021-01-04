package com.muskaan.test;

public class Student {
	int age; // Default access modifier- accessible only within the same package.
	public int rollno;	//accessible from everywhere in the program.
	private String name="Muskaan";	//private access modifier-  accessible only within the class in which they are declared.
	protected int marks;	//accessible within the same package or subclasses in different packages.
}
