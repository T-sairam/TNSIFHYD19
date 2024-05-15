package com.sairam;

public class Assignment2 {
	int a=10;
	static int b=15;
	void display()
	{
		System.out.println("this is instance method");
		
	}
	 static String display1()
	{
		return(" this is static method");
	}

	public static void main(String[] args) {
		Assignment2 n1 = new Assignment2();
		System.out.println(n1.a);
		n1.display();
		System.out.println(Assignment2.b);
		System.out.println(Assignment2.display1());
	}

}
