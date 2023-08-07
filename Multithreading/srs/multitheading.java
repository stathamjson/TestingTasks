import junit.textui.TestRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class multitheading {


    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        List list = new ArrayList(1);
        list.add(1);
        list.add(2);
        list.add(3);

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        System.out.println(i1 + i2);
        thread.start();

        int k = 0;
        for (int i = 0; i < 10; i++) {
            k = k++;
            System.out.println(k);
        }
        System.out.println(k);

//        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
//        for (String number : numbers) {
//            if ("third".equals(number)) {
//                numbers.add("fourth");
//            }
//        }
//        System.out.println(numbers.size());
    }


}
