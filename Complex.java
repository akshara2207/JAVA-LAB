public class Complex {
    private double real;
    private double imaginary;
    
    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Method to add two complex numbers
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }
    
    // Method to print the complex number
    public void print() {
        if (imaginary < 0) {
            System.out.println(real + " - " + (-imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
    
    public static void main(String[] args) {
        // Create two complex numbers
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, -5.0);
        
        // Add the complex numbers
        Complex sum = c1.add(c2);
        
        // Print the result
        System.out.print("The sum of ");
        c1.print();
        System.out.print(" and ");
        c2.print();
        System.out.print(" is ");
        sum.print();
    }
}
