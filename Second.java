// 2. Create a class Car with attributes model, year, price.
//  Initialize them using a constructor. 
// Display data using a method.

public class Second {
    String model;
    int year;
    double price;

    // Constructor to initialize the attributes
    Second(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an object of the Car class using the constructor
        Second car1 = new Second("Toyota Camry", 2020, 24000.00);

        // Displaying the details of the car
        car1.displayDetails();
    }
}