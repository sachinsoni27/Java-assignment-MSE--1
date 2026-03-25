
import java.util.*;
import java.util.stream.*;
public class highestNumberOfVowel {
    public static void main (String[]args){
        List<String> str = Arrays.asList("Sachin", "Shivang","madhav");
        String ans = str.stream()
                .reduce("", (a, b) -> {
                    int countA = (int) a.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
                    int countB = (int) b.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
                    return countA > countB ? a : b;
                });
        System.out.println(ans);
    }
}
