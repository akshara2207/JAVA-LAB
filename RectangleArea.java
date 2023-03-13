class Rectangle 
 { 
       double length; 
       double breadth; 
      
       void setData(double l, double b) 
       {  
         length =l; 
         breadth=b; 
       } 
       
     double getArea() 
       { 
         double rectArea;
         rectArea = length * breadth;
         return rectArea; 
       } 
 } 
 
 class RectangleArea  
 { 
          public static void main(String[] args) 
      { 
           
            Rectangle firstRect = new Rectangle(); 
            firstRect.setData(12.48,13.0); 
 	    double len=firstRect.length;
 	    double bth=firstRect.breadth;
            System.out.println("length = "+ len); 
            System.out.println("breadth = "+ bth); 
            double result = firstRect.getArea(); 
            System.out.println("Area of Rectangle = "+ result); 
      } 
 } 
 

