import java.util.Scanner;
public class Subtractioncorrectorwrong {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number1 and number 2 and ans");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int ans=input.nextInt();
       int result=number1-number2;
       if(result==ans)
       {
           System.out.println(number1+"-"+number2+"="+result);
           System.out.println("your ans is correct");
           
       }
       else
       {
           System.out.println(number1+"-"+number2+"should be \t"+result);
           System.out.println("your ans is wrong");
       }    
               
    }
    
}