//program name :"Hello world Hello" To print a el how many times are comes in the array and print their times
package InterviewQuestions;

public class CheckingCharacter {

public static void main(String[] args) {
	String arr="Hello world Hello Hello";
	int i,j,count=0;
	int length=arr.length();
	char array[]=arr.toCharArray();
	for(i=0;i<length;i++)
	{

		if(array[i]=='e'&&array[i+1]=='l')
		{
			count=count+1;
			
		}
	}
	System.out.println("no of times el present in the array="+count);
	}
 }

