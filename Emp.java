
package com.sairam;

public class Emp {
	int sal =50000;
	static int age = 33;
	void display()
	{
		System.out.println("instance method contents");
	}
	 static String display1()
	{
		return("static as ");
	}
public static void main(String[] args) {
		Emp e1 = new Emp();
		System.out.println(e1.sal);
		e1.display();
		System.out.println(e1.age);
		e1.display1();
		//System.out.println(Emp.sal);
		System.out.println(Emp.age);
	   //System.out.println(Emp.display());
	    System.out.println(Emp.display1());
	}
}