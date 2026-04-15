import java.util.*;

public class SecondLargestReduce {

    static class Pair {
        final int first;
        final int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7, 9, 8);

        Pair result = numbers.stream()
                .distinct()
                .reduce(new Pair(Integer.MIN_VALUE, Integer.MIN_VALUE),
                        (acc, value) -> {
                            if (value > acc.first) {
                                return new Pair(value, acc.first);
                            }
                            if (value > acc.second) {
                                return new Pair(acc.first, value);
                            }
                            return acc;
                        },
                        (left, right) -> {
                            int[] values = {left.first, left.second, right.first, right.second};
                            Arrays.sort(values);
                            int largest = values[3];
                            int secondLargest = Integer.MIN_VALUE;
                            for (int i = 2; i >= 0; i--) {
                                if (values[i] != largest) {
                                    secondLargest = values[i];
                                    break;
                                }
                            }
                            return new Pair(largest, secondLargest);
                        });

        System.out.println(result.second);
    }
}
