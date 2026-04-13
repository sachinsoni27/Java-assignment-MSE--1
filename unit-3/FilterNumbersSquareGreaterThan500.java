// Given a list of integers, filter numbers whose square is greater than 500.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersSquareGreaterThan500 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n * n > 500)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered (square > 500): " + filtered);
    }
}
