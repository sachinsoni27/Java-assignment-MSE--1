// Write a program demonstrating Person → Employee → Manager. 
// Employee uses super to call Person constructor. 
// Manager overrides a method and calls parent version using super.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int age, int empId) {
        super(name, age);   // calling Person constructor
        this.empId = empId;
    }

    void show() {
        super.show();       // calling parent method
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, String department) {
        super(name, age, empId);
        this.department = department;
    }

    // Method overriding
    void show() {
        super.show();       // calling Employee version
        System.out.println("Department: " + department);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Manager m = new Manager("Sakshi", 23, 201, "IT");

        m.show();
    }
}
