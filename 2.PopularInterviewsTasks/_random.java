import java.util.Random;

public class _random {
    public static void main(String[] args) {
        (new Random())
                .ints()
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        (new Random())
                .ints(0,100)
                .limit(10)
                .sorted()
                .peek(System.out::println)
                .forEach(x->{});

    }
}
