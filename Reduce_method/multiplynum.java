
import java.util.*;

public class multiplynum {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        Integer ans = num.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(ans);
    }
}
