// 8. Write a program to show how one constructor calls another constructor using this().

public class Eight {
    private String name;
    private int age;

    // Default constructor
    public Eight() {
        this("Unknown", 0);
    }

    // Constructor with two parameters
    public Eight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Eight person1 = new Eight(); // Calls default constructor
        Eight person2 = new Eight("Alice", 25); // Calls constructor with two parameters

        person1.display();
        person2.display();
    }
}
