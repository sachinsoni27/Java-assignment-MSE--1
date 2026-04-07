// Create classes Person and Employee.Use parameterized constructor in both classes.
// In Employee constructor, use super(name, age) to pass values to Person.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);   // calling Person constructor
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployee() {
        display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Employee e = new Employee("Sakshi", 22, 101, 50000);

        e.displayEmployee();
    }
}

