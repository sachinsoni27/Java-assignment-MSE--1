import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6)
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}