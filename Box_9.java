// 9. ---> Create a class Box with height, width, depth. Create multiple objects and calculate volume of each.
public class Box9{
    double height;
    double width;
    double depth;

    // Constructor to initialize the dimensions
    Box9(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Method to calculate volume
    double calculateVolume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        // Create multiple objects of the Box class
        Box9 box1 = new Box9(5.0, 3.0, 2.0);
        Box9 box2 = new Box9(10.0, 8.0, 6.0);
        Box9 box3 = new Box9(7.0, 4.0, 3.0);

        // Calculate and display the volume of each box
        System.out.println("Volume of box1: " + box1.calculateVolume());
        System.out.println("Volume of box2: " + box2.calculateVolume());
        System.out.println("Volume of box3: " + box3.calculateVolume());
    }
}
