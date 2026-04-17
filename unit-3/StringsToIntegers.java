
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringsToIntegers {

    public static void main(String[] args) {
        ArrayList<String> stringNumbers = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayList<Integer> intNumbers = stringNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + stringNumbers);
        System.out.println("Output: " + intNumbers);
    }
}
