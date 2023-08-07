import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class wrappers {
    public static void main(String[] args) {
//        int y = 1;
//        int x = 1;
//        System.out.println(x++);
//        System.out.println(++y);

        Integer a = new Integer(128);
        int b = 128;
        System.out.println(a == b);
        System.out.println(b == Integer.valueOf(128));
        ;
        String test1 = "test";
        String test2 = "test";
        System.out.println(" строки через кавычки " + (test1 == test2));
        assertEquals(test1 == test2, true);
        assertSame(test1 == test2, true);// true or false

        String test3 = new String("one");
        String test4 = new String("one");
        System.out.println(" строки через оператор new " + (test3 == test4)); // false
        assertSame(false,test3 == test4);

//        Integer i = 1;
//        Integer j = 1;
//        System.out.println(i == j); // false
//        assertSame("ожидалось ", test1 == test2,true);
//        ++j;
//        System.out.println(j);

//        Integer i1 = new Integer(128);
//        Integer j1 = new Integer(128);
//        System.out.println(i1 == j1); //false
//        assertSame("ожидалось ", false,i1 == j1);
//
//        Integer i2 = 12;
//        Integer j2 = Integer.valueOf(12);
//        System.out.println(i2 == j2); // true
//        assertSame("ожидалось  из пула интов ",true, i2 == j2);
//
//        Integer i3 = Integer.valueOf(128);
//        Integer j3 = Integer.valueOf(128);
//        System.out.println("ожидалось " + false + " фактически " + (i3 == j3)); // false
//        assertSame("ожидалось ", false, i3 == j3);

//
//        int k = 1;            //1
//        k = -+(10 + 2 + k);   //2
//        k--;                //3
//        System.out.println(k);
//
//        int x = Integer.MIN_VALUE;
//        int y = -x;
//        System.out.println(x + " == " + y + " " + (y == x));
//
//        Integer i5 = 1000;
//        Integer i6 = 1000;
//        System.out.println(i5 == i6);
//        System.out.println(i5 == 1000);
//
//        int i = 0;
//        System.out.println(++i == i++);
//        System.out.println(i++ == i++);

//        int x = 0;
//        System.out.print(++x == x++);

//     int x = 0;
//     System.out.print(x++==++x);

//        System.out.println(MAX_VALUE);

        System.out.println(010>9);

        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);


        int data = 100;
        System.out.println( data + " " );
        processData(data);
        System.out.print( data);
    }

    private static void processData(int data) {
        data=data * 2;
    }





}
