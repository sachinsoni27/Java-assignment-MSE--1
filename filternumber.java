import java.util.*;
import java.util.stream.*;

public class filternumber {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(0);
        num.add(3);
        num.add(5);
        num.add(9);
        num.add(10);
        num.add(15);

        List<Integer> ans = num.stream()
                .filter(n -> n % 3 == 0 && n % 5 != 0)
                .collect(Collectors.toList());

        ans.forEach(System.out::println);
    }
}