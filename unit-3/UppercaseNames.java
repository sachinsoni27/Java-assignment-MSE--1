
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UppercaseNames {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("sachin", "rahul", "amit"));
        ArrayList<String> uppercase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + names);
        System.out.println("Output: " + uppercase);
    }
}
