// 5. Write a program where a class contains a method to input values 
// using Scanner and another method to display them.
import java.util.*;
public class Fifth {
    String name;
    int age;

    // Method to input values using Scanner
    void inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    // Method to display the values
    void displayValue() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Fifth student = new Fifth();
        student.inputValue();
        student.displayValue();
    }
}
