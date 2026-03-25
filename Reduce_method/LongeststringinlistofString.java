import java.util.*;
import java.util.stream.*;
public class LongeststringinlistofString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Sachin", "Shivang", "madhav", "Vishal", "Satvik");
        String ans = str.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(ans);
    }
}
