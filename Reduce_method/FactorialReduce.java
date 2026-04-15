import java.util.stream.IntStream;

public class FactorialReduce {

    public static void main(String[] args) {
        int n = 6;
        int factorial = IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);

        System.out.println(factorial);
    }
}
