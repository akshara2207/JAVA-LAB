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

class Results extends Sports,Student
{
 
void display()
{

