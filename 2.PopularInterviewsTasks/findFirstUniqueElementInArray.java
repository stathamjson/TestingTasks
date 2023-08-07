import java.util.*;
import java.util.stream.Collectors;

/**
 * найти первый уникальный элемент в массиве
 */

public class findFirstUniqueElementInArray {

    static <T> Map<T, Long> countByClassicalLoop(List<T> inputlist) {
        Map<T, Long> resultMap = new LinkedHashMap<>();
        for (T element : inputlist) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1L);
            } else {
                resultMap.put(element, 1L);
            }
        }
        return resultMap;
    }

    static <T> Optional<T> findFirstDublicate(List<T> input) {
        Map<T,Long> result = new LinkedHashMap<>();
        input.stream()
                .forEach(e-> result.merge(e,1L,Long::sum));
        return result.entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    static <T> Optional<T> findFirstDublicate1(List<T> input) {
        Map<T,Long> result = new LinkedHashMap<>();
        return input.stream()
                .filter(element -> Collections.frequency(input,element)==1)
                .findFirst();
    }

 static <T> Optional<T> findFirstIn (Map<T,Long> map) {
        return map.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
}
     static <T> T findUniqueByFrequency(List<T> list) {
        return list.stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .findFirst().get();
    }



    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 4, 1, 7, 3, 4, 1);
        System.out.println(findUniqueByFrequency(input));


        Map  map = countByClassicalLoop(input);

        System.out.println(findFirstIn(map).get());

        System.out.println(findFirstDublicate(input).get());
    }
}
