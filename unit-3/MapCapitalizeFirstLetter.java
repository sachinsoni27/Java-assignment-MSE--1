
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapCapitalizeFirstLetter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "stream");

        List<String> capitalizedStrings = strings.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        System.out.println("Input: " + strings);
        System.out.println("Output: " + capitalizedStrings);
    }
}
