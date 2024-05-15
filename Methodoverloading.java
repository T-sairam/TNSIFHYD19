package com.sairam;

public class Methodoverloading {
	int display(int a,int b)
	{
		return(a+b);
	}
	static int display(int a,int b,int c)
	{
		return(a+b+c);
	}

	public static void main(String[] args)
{
	Methodoverloading a1 = new Methodoverloading();
	System.out.println(a1.display(20, 30));
	System.out.println(Methodoverloading.display(20,30,40));
}
}
