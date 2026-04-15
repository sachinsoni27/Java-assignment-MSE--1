import java.util.*;

public class JoinIntegersFormattedString {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String formatted = numbers.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + " -> " + b)
                .orElse("");

        System.out.println(formatted);
    }
}
