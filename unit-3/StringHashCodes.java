
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringHashCodes {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<Integer> hashCodes = words.stream()
                .map(String::hashCode)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + words);
        System.out.println("Output: " + hashCodes);
    }
}
