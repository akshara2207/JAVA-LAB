import java.util.Scanner;
class strman
 {
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    StringBuffer sb=new StringBuffer("Hello...");
    sb.append("Everyone");
    String s=sc.nextLine();
    System.out.println("Enter another string : ");
    String s1=sc.nextLine();

    System.out.println("Concatenate : "+s1.concat(s));
    System.out.println("Length of first string : "+s.length());
    System.out.println("Length of second string : "+s1.length());
    System.out.println("UPPERCASE : "+s.toUpperCase());
    System.out.println("lower case : "+s.toLowerCase());
    System.out.println("Replace : "+s1.replace("e","@"));
    System.out.println("indexOf : "+s.indexOf("a")); 
    System.out.println("append : "+sb); 
    sb.insert(4,"Java"); 
    System.out.println("Insert : "+sb); 
    char[] ch = s.toCharArray();  
    System.out.println("toCharArray : ");
    for (int i = 0; i < ch.length; i++) 
     {  
       System.out.println(ch[i]); 
     }  
   }
 }
