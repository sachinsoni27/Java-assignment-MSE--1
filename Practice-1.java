
// Demonstrate multilevel inheritance using Person → Employee → Manager classes 
// with method overriding and additional properties.


class Person {
    String name;
    int age;

    void getPersonDetails(String name, int age) {
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

    void getEmployeeDetails(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // Method overriding
    @Override
    void display() {
        super.display(); // calling Person display method
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void getManagerDetails(String department) {
        this.department = department;
    }

    // Method overriding again
    @Override
    void display() {
        super.display(); // calling Employee display method
        System.out.println("Department: " + department);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.getPersonDetails("Sakshi", 22);
        m.getEmployeeDetails(101, 60000);
        m.getManagerDetails("IT");

        System.out.println("Manager Details:");
        m.display();
    }
}
