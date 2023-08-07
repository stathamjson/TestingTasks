import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _333 {
    public static void main(String[] args) {
        System.out.println(4^0);
        System.out.println(4^1);
        System.out.println(4^2);
        System.out.println(Math.pow(4,0));
        System.out.println(Math.pow(4,1));
        System.out.println(Math.pow(4,2));

       List list = new ArrayList(2);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
        System.out.println(list.size());

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        System.out.println(i1 + i2);

        int k = 0;
        for (int i = 0; i < 10; i++) {
            k = k++;
        }
        System.out.println(k);

        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
        for (String number : numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }
}
