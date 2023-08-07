import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class isStringsAnagrams {
    public static void main(String[] args) {
        String one = "мошкара";
        String two = "ромашка";
        Stack stack = new Stack();
        Deque deque = new ArrayDeque();
        System.out.println(isTheyAnagrams(one, two));
        System.out.println(isTheyAnagramsByStreams(one, two));


        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("one and a half");
        stringList.add("two");
        stringList.add("two and a half");
        stringList.add("three and a half");

        System.out.println("Before " + stringList);
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (next.equals("two and a half")) {
                stringList.add("three");
            }
        }

        System.out.println("After " + stringList);


    }

    private static boolean isTheyAnagrams(String one, String two) {

        if (one.length() != two.length()) return false;

        List<String> str1 = Arrays.asList(one.toLowerCase().split(""));
        Collections.sort(str1);
     //   List<String> sorted1 = str1.stream().sorted().collect(Collectors.toList());
        List<String> str2 = Arrays.asList(two.toLowerCase().split(""));
        Collections.sort(str2);
       // List<String> sorted2 = str2.stream().sorted().collect(Collectors.toList());
        return str1.equals(str2);
    }

    private static boolean isTheyAnagramsByStreams(String one, String two) {
        List<String> str1 = Arrays.asList(one.toLowerCase().split(""));
        Collections.sort(str1);
        List<String> str2 = Arrays.asList(two.toLowerCase().split(""));
        Collections.sort(str2);
        return IntStream.range(0, str1.size() - 1)
                .allMatch(e -> str1.get(e).equals(str2.get(e)));

    }

    private static boolean CharsArray(String one, String two) {
        return Arrays.equals(one.chars().sorted().toArray(), two.chars().sorted().toArray());
    }


}
