import java.util.Scanner;
class Complex
{
public static void main(String arg[])
{
Scanner s=new Scanner (System.in);
int a,b,c,d;
System.out.println("enter 1st complex no");
a=s.nextInt();
b=s.nextInt();
System.out.println("the no is:"+a+"+"+b+"i");
System.out.println("enter 2nd complex no");
c=s.nextInt();
d=s.nextInt();
System.out.println("the no is:"+c+"+"+d+"i");
System.out.println("the sum is:"+(a+c)+"+"+(b+d)+"i");
}
}



