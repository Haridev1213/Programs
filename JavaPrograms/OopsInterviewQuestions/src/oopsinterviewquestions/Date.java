package oopsinterviewquestions;
import java.util.Scanner;
public class Date {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the day , month , year");
		int da=input.nextInt();
		int mon=input.nextInt();
		int yea=input.nextInt();
		TodayDate obj=new TodayDate(da,mon,yea);
		System.out.println(obj.displayDate());	
	}
}
