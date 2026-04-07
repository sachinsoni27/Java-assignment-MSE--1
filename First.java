// 1.Write a Java program to create a class Student with data members name and age. 
// Create an object and display the values.

public class First {
    String name;
    int age;

    public static void main(String[] args) {
        First student = new First();
        student.name = "Rahul";
        student.age = 20;

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
    
}
