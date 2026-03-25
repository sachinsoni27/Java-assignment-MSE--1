import java.util.*;

public class MaiReverseTheStringn {
    public static void main(String[] args) {
        String str = "Hello";

        String reversed = Arrays.stream(str.split(""))
        .reduce("", (a, b) -> b + a);

        System.out.println("Reversed String: " + reversed);
    }
}
