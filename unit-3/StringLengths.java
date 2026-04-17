
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringLengths {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Java", "Stream", "API"));
        ArrayList<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + words);
        System.out.println("Output: " + lengths);
    }
}
