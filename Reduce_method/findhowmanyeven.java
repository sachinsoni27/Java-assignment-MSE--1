import java.util.*;
import java.util.stream.*;

public class findhowmanyeven {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 48, 89, 6, 7, 8, 78, 10};
        long count = java.util.Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);
    }
}
