package com.sairam;

public class Cricket {
int a = 45;
int b = 47;
int c = 56;
int average =  (a+b+c)/3;
void display()
{
	if(a>b&&a>c)
	{
		System.out.println("a");
	}
	else if(b>a&&b>c)
	{
		System.out.println("b");
	}
	else {
		System.out.println("c");
	}
}
void display1()
{
	if(a>b&&a>c)
	{
		System.out.println(a);
	}
	else if(b>a&&b>c)
	{
		System.out.println(b);
	}
	else {
		System.out.println(c);
	}
}
public static void main(String[] args) {
	 Cricket n1 = new  Cricket();
	System.out.println(n1.average);
	System.out.println("most runs scored by a player is ");
	 n1.display1(); 
	 System.out.println("and that player is ");
	n1.display();
	}
}

    