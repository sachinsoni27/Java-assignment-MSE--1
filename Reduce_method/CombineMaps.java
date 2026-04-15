import java.util.*;

public class CombineMaps {

    public static void main(String[] args) {
        List<Map<String, Integer>> maps = Arrays.asList(
                new HashMap<>() {{ put("a", 1); put("b", 2); }},
                new HashMap<>() {{ put("b", 3); put("c", 4); }},
                new HashMap<>() {{ put("a", 5); put("c", 1); }}
        );

        Map<String, Integer> combined = maps.stream()
                .reduce(new HashMap<>(), (acc, map) -> {
                    map.forEach((key, value) -> acc.merge(key, value, Integer::sum));
                    return acc;
                });

        System.out.println(combined);
    }
}
