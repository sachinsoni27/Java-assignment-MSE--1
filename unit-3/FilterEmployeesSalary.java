// Given a list of Employees (salary), filter employees with salary > 50,000.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class FilterEmployeesSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 45000),
                new Employee("Bob", 55000),
                new Employee("Charlie", 60000),
                new Employee("David", 40000),
                new Employee("Eve", 70000)
        );

        List<Employee> filtered = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.toList());

        System.out.println("Original employees: " + employees);
        System.out.println("Filtered (salary > 50,000): " + filtered);
    }
}
