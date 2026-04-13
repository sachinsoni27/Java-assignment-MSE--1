
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMultiplyBy2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> multipliedNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Input: " + numbers);
        System.out.println("Output: " + multipliedNumbers);
    }
}
