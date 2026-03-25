import java.util.*;
import java.util.stream.*;

public class maxiumvalue {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        Integer ans = num.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(ans);
    }
}
