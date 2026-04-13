
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStringLength {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "stream", "code");

        List<Integer> lengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Input: " + strings);
        System.out.println("Output: " + lengths);
    }
}
