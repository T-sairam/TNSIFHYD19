package com.sairam;

public class Ipl {
	int jersey = 45;
	static String player = "klaseen";
	void display()
	{
		System.out.println(" klaseen wicket keeper batsman");
	}
	static String display1()
	{
		return("striking hurricane ");
	}
	public static void main(String[] args) {
		Ipl srh = new Ipl();
		System.out.println(srh.jersey);
		srh.display();
		System.out.println(Ipl.player);
		System.out.println(Ipl.display1());
		}
}
