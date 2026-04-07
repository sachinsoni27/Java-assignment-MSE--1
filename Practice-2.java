
// Write a Java program to demonstrate single inheritance where class Student inherits from class Person.
//  Add methods to display details

class Person {
    String name;
    int age;

    void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void setStudent(int rollNo, String course) {
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        displayPerson();   // calling parent method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setPerson("Sakshi", 21);
        s.setStudent(101, "BCA");

        s.displayStudent();
    }
}