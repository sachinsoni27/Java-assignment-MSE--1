import java.util.*;
import java.util.stream.Stream;

public class MergeLists {

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(4, 5, 6);
        List<Integer> third = Arrays.asList(7, 8, 9);

        List<Integer> merged = Stream.of(first, second, third)
                .reduce(new ArrayList<>(), (acc, list) -> {
                    acc.addAll(list);
                    return acc;
                });

        System.out.println(merged);
    }
}
