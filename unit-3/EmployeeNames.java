
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EmployeeNames {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Ankit"), new Employee("Rahul")));
        ArrayList<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + employees);
        System.out.println("Output: " + employeeNames);
    }

    static class Employee {

        private final String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
