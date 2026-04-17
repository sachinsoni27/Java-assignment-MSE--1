
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PrefixItem {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> prefixed = items.stream()
                .map(s -> "Item-" + s)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Input: " + items);
        System.out.println("Output: " + prefixed);
    }
}
