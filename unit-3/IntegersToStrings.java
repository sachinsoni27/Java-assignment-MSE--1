
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IntegersToStrings {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<String> strings = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + numbers);
        System.out.println("Output: " + strings);
    }
}
