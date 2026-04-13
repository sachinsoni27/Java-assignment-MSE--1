
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToUppercase {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "java", "stream", "processing");

        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Input: " + strings);
        System.out.println("Output: " + uppercaseStrings);
    }
}
