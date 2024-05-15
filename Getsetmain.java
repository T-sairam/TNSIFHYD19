package pack;

public class Getsetmain {
	public static void main(String[] args) {
		
   Getset obj = new Getset();
   System.out.println("before setting values");
   System.out.println(obj.getRuns());
   System.out.println(obj.getBalls());
   System.out.println(obj.getStrikerate());
   if (obj.getStrikerate() > 180)
   {
	   System.out.println("power striker");
   }
   else {
	   System.out.println(" anchor player");
   }
   System.out.println("-----------------------");
   obj.setRuns(100);
   obj.setBalls(50);
   System.out.println("after setting values");
   System.out.println(obj.getRuns());
   System.out.println(obj.getBalls());
   System.out.println(obj.getStrikerate());
   if (obj.getStrikerate()  > 180)
   {
	   System.out.println("power striker");
   }
   else
   {
	   System.out.println(" anchor palyer");
   }
   }
}
