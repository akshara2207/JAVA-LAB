import java.util.Scanner;
class Student{
	int rollno;
	String name;
	String std;

Student(int rl,String na,String sd)
{
	this.rollno=rl;
	this.name=na;
	this.std=sd;
}

}
class Sports 
{
	String item;
	String pos;
Sports(String it,String p)
{
	this.item=it;
	this.pos=p;
}
}

public class Results extends Sports,Student
{
	String res;
 Results(int rl,String na,String std,String it,String p,String r)
{
	super(rl,na,sd,it,p)
	this.res=r;
}
  void display(){
    System.out.println("Rollno: "+rollno);
    System.out.println("Name: "+name);
    System.out.println("Std: "+std);
    System.out.println("Sports Item: "+item);
    System.out.println("Position: "+pos);
    System.out.println("Result: "+res);
 }
public static void main(String[] args) {
    System.out.println("\nEnter the No. of Students");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Results arr[]=new Results[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter rollno: ");
        int rollno=sc.nextInt();
        System.out.println("\nEnter Name: ");
        String name=sc.next();
        System.out.println("\nEnter Standard: ");
        String std=sc.next();
        System.out.println("\nEnterSports item ");
        String item=sc.next();
        System.out.println("\nEnter position ");
        String pos=sc.next();
        System.out.println("\nEnter Result");
        String res=sc.next();
        arr[i]=new Results(rollno,name,std,item,pos,result);
    

    }
    System.out.println("Informations of all the students");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }

 }


