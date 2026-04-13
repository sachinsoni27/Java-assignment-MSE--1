// Given a list of numbers, filter only prime numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPrimeNumbers {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> filtered = numbers.stream()
                .filter(FilterPrimeNumbers::isPrime)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered (prime numbers): " + filtered);
    }
}
