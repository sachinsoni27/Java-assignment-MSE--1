
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleEachValue {

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(5, 10, 15));
        ArrayList<Integer> doubled = values.stream()
                .map(n -> n * 2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + values);
        System.out.println("Output: " + doubled);
    }
}
