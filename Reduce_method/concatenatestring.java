import java.util.*;
import java.util.stream.*;
public class concatenatestring {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Sachin", " ", "Shivang", " " ,"Friend" );
        String ans = str.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(ans);
    }
}
