import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * вывести все неповторяющиеся элементы массива *
 */
public class massive {
    public static void main(String[] args) {
        Integer[] input = {10, 1, 2, 2, 3, 3, 5, 8, 9, 8, 7, 4, 6, 5, 6};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : input) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey()));
        System.out.println("============= через стрим ==================");


        List<Integer> list = Arrays.asList(input);
        Map<Integer, Integer> mapStream =  list.stream()
                        .collect(Collectors.toMap(Function.identity(),value->1,Integer::sum));
        System.out.println(mapStream);

        mapStream.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey()));


    }
}
