package oopsinterviewquestions;
import java.util.*;
public class CurrentTime {

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the hour, min ,sec");
	int hour=input.nextInt();
	int minute=input.nextInt();
	int second=input.nextInt();
	CheckTimeFormat obj=new CheckTimeFormat(hour,minute,second);
	System.out.println(obj.Checkformat());
 }
}
