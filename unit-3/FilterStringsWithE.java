// Given a list of strings, filter strings that contain the letter 'e'.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsWithE {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        List<String> filtered = strings.stream()
                .filter(s -> s.contains("e"))
                .collect(Collectors.toList());

        System.out.println("Original list: " + strings);
        System.out.println("Filtered (containing 'e'): " + filtered);
    }
}
