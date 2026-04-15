import java.util.*;

public class ProductOfSquares {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer productOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(1, (a, b) -> a * b);

        System.out.println(productOfSquares);
    }
}
