// 6. Create a class Employee with attributes id, name, salary. Use constructor overloading for:
// •	default constructor
// •	constructor with 2 parameters
// •	constructor with 3 parameters

public class Sixth {
    int id;
    String name;
    double salary;

    // Default constructor
    Sixth() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Constructor with 2 parameters
    Sixth(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0; // default salary
    }

    // Constructor with 3 parameters
    Sixth(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        Sixth emp1 = new Sixth(); // Using default constructor
        Sixth emp2 = new Sixth(101, "Alice"); // Using constructor with 2 parameters
        Sixth emp3 = new Sixth(102, "Bob", 50000.00); // Using constructor with 3 parameters

        emp1.display();
        emp2.display();
        emp3.display();
    }
}