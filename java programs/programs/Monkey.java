import java.util.Scanner;
 class Monkey{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the a and b values");
		Boolean a=input.nextBoolean();
		Boolean b=input.nextBoolean();
		check(a,b);
	}
	public static void check(Boolean a,Boolean b)
	{
		if((a==true&&b==true)||(a==false&&b==false))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}	
		
			
	}
}	