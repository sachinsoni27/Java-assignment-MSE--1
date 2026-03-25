import  java.util.*;
import java.util.stream.*;
public class SumofEvennum{
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,98,88,3,5, 4, 88, 96);
        Integer ans = num.stream()
       .filter(n -> n % 2 == 0)
       .reduce(0, (a, b) -> a + b);
        System.out.println(ans);
    }
}