import java.util.Scanner;
class Positiveinteger{
    public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number\n");
		int value=input.nextInt();
		if(value>0)
		{
		for(int number=1;number<=10;number++)
			{
				int ans=number*value;
				System.out.println(ans+"\n");
			}	
		}
		else
		{
			System.out.println("there is a negative value");
		}	
	}	
	
	
}	