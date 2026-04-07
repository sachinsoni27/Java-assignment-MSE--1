
// 3. Write a program to demonstrate the use of default constructor and parameterized constructor.
public class Third {
    String name;
    int age;

    // Default constructor
    Third() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Third(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Third student1 = new Third(); // Using default constructor
        Third student2 = new Third("Rahul", 20); // Using parameterized constructor

        student1.display();
        student2.display();
    }

    
}
