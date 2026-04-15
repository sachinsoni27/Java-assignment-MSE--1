import java.util.*;

public class JoinStringsWithCommas {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String joined = words.stream()
                .reduce((a, b) -> a + "," + b)
                .orElse("");

        System.out.println(joined);
    }
}
