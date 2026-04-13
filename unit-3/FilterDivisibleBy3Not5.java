// Given a list of integers, filter numbers divisible by 3 but not by 5.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDivisibleBy3Not5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 10, 12, 15, 18, 20, 21, 25, 27, 30);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 != 0)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered (divisible by 3 but not by 5): " + filtered);
    }
}
