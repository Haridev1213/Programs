import java.util.Scanner;
class Circle{
	double r;
	double area;
	double perimeter;
	public Circle(double area,double perimeter)
	{
		this.area=area;
		this.perimeter=perimeter;
		System.out.println("area="+area+"\n"+"perimeter="+perimeter);
	}
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
    System.out.println("enter the radius");
    double radius=input.nextDouble();
    double are;
	double pre;
	are=3.14*radius*radius;
	pre=2*3.14*radius;
	Circle obj=new Circle(are,pre);
	obj.area=are;
	obj.perimeter=pre;
}	
}
