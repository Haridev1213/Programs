import java.util.Scanner;
public class Mainmethod{
	public static void main(String[] args)
	{
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the day,month and year");
	   int d=input.nextInt();
	   int m=input.nextInt();
	   int y=input.nextInt();
	   Dateloc obj=new Dateloc(d,m,y);
	   obj.displayDate();
	
	}   

}	   