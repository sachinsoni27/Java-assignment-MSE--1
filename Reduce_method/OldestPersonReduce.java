import java.util.*;

public class OldestPersonReduce {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 28),
                new Person("Bob", 35),
                new Person("Carla", 32)
        );

        Person oldest = people.stream()
                .reduce((p1, p2) -> p1.age >= p2.age ? p1 : p2)
                .orElse(null);

        System.out.println(oldest);
    }
}
