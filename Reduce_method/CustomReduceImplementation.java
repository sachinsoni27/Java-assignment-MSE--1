import java.util.*;
import java.util.function.BiFunction;

public class CustomReduceImplementation {

    public static <T, U> U customReduce(List<T> list, U identity, BiFunction<U, T, U> accumulator) {
        U result = identity;
        for (T item : list) {
            result = accumulator.apply(result, item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sum = customReduce(numbers, 0, Integer::sum);
        System.out.println(sum);
    }
}
