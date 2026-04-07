// 10. Demonstrate how reference variables store objects and
//  how multiple references can point to the same object.
class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class Ten{
    public static void main(String[] args) {

        // Creating an object
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Sakshi";

        // Another reference variable pointing to the same object
        Student s2 = s1;

        System.out.println("Using reference s1:");
        s1.display();

        System.out.println("Using reference s2:");
        s2.display();

        // Changing value using s2
        s2.name = "Riya";

        System.out.println("\nAfter modifying using s2:");

        System.out.println("s1 reference:");
        s1.display();

        System.out.println("s2 reference:");
        s2.display();
    }
}