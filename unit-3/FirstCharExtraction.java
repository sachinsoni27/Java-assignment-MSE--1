
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstCharExtraction {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "C"));
        ArrayList<Character> firstChars = languages.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + languages);
        System.out.println("Output: " + firstChars);
    }
}
