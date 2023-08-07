
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * найти повторяющиеся буквы в слове.
 */
public class reapitingLetters {
    public static void main(String[] args) {
        String input = "какая то длинная фраза с большим количеством букв";
        List<Integer> list = Arrays.asList(3, 4, 5, 5, 4, 3, 2, 5, 6, 8, 9, 5);

        List<String> inputCh = Arrays.asList(input.split(""));
        //  Stream.of(countAll(inputCh)).sorted().forEach(System.out::println);
        Stream.of(countByWithForEachLoop(list)).forEach(System.out::println);


    }



    private static <T> Map<T, Long> countAll(List<T> input) {
        Map<T, Long> resultMap = new HashMap<>();
        for (T element : input) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1L);
            } else {
                resultMap.put(element, 1L);
            }
        }
        return resultMap;
    }

    private static <T> Map<T, Long> countByWithForEachLoop(List<T> list) {
        Map<T, Long> resultMap = new HashMap<>();
        list.forEach(e -> resultMap.put(e, resultMap.getOrDefault(e, 0L) + 1L));
        return resultMap;
    }

    private static <T> Map<T, Long> countWithMapCompute(List<T> list) {
        Map<T, Long> resultMap = new HashMap<>();
        list.forEach(e -> resultMap.compute(e, (k, v) -> v == null ? 1L : v + 1L));
        return resultMap;
    }

    private static <T> Map<T, Long> countWithMapMerge(List<T> list) {
        Map<T, Long> resultMap = new HashMap<>();
        list.forEach(e -> resultMap.merge(e, 1L, Long::sum));
        return resultMap;

    }

    private static <T> Map<T, Long> countByStreams(List<T> list) {
        return list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }


}
