// Given a list of names, filter names ending with "n".

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesEndingWithN {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Ann", "Mike", "Karen", "Tom", "Susan");

        List<String> filtered = names.stream()
                .filter(name -> name.endsWith("n"))
                .collect(Collectors.toList());

        System.out.println("Original list: " + names);
        System.out.println("Filtered (ending with 'n'): " + filtered);
    }
}
