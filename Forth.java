// 4. Create a class Rectangle with length and breadth. 
// Calculate area using a method.
public class Forth {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Forth(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of the rectangle
    double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Forth rect = new Forth(5.0, 3.0);

        // Calculate and display the area
        double area = rect.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
