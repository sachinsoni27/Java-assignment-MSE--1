
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + numbers);
        System.out.println("Output: " + squares);
    }
}
