import java.util.Scanner;
class OverLoad
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class OverLoadArea
{ 
     public static void main(String args[]) 
	{
	   OverLoad ob = new OverLoad();
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the side  ");
 	  float a=sc.nextFloat();
	   ob.area(a);
	System.out.println("Enter the length and width  ");
 	  float l=sc.nextFloat();
	  float b=sc.nextFloat();
	   ob.area(l,b);
	System.out.println("Enter the radius ");
 	  double r=sc.nextFloat();
	   ob.area(r);
	   
        }
}
