import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;
import static java.util.stream.Collectors.joining;

public class innotex {

    @SneakyThrows
    public static void main(String[] args) {
        final Thread processor = new Thread(new Processor());
        processor.start();

        sleep(1000);

        System.out.println("Prepare to finish");
        processor.interrupt(); // 1
    }

    /// шв ыв?
    /**!
       ? */

    static class Processor
            implements Runnable {

        @Override
        public void run() {
            while (!currentThread().isInterrupted()) {    // 2
                System.out.println("Hello, world");
                try {
                    sleep(100);                            // 3
                } catch (InterruptedException exception) {
                    System.out.println("Sleep interrupted"); // 4
                }
            }
            System.out.println("Successfully exited thread");
        }
    }





//    interface BaseExecutor {
//        void execute();
//    }
//
//    @Service
//    class MainExecutor
//            implements BaseExecutor {
//        @Override
//        public void execute() {
//            System.out.println("Main");
//        }
//    }
//
//    @Service
//    class TestB
//            implements BaseExecutor {
//        @Override
//        public void execute() {
//            System.out.println("Secondary");
//        }
//    }
//
//    @Service
//    class MainClass {
//        @Autowired
//        private BaseExecutor executor;
//
//        public void doSomething() {
//            executor.execute();
//        }
//    }











//    public static void main(String[] args) {
//        final List<Rectangle> list = new ArrayList<Rectangle>(); // 1
//        update(list);
//        draw(list);
//    }
//
//    static void draw(List<? extends Shape> list) { // 2
//        list.forEach(Shape::draw);
//    }
//
//    static void update(List<? super Rectangle> list) { // 3
//        list.add(new Rectangle());
//        list.add(new Square());
//    }
//}
//
//interface Shape {
//    void draw();
//}
//
//class Rectangle
//        implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle");
//    }
//}
//
//class Square
//        extends Rectangle {
//
//    @Override
//    public void draw() {
//        System.out.println("Square");
//    }

















//    public static void main(String[] args) {
//        final String text = "Hello,\tworld\n";
//        final String printableText = prepare(text);
//        System.out.println(printableText);
//    }
//
//    static String prepare(String source) {
//        final StringBuilder builder = new StringBuilder();
//        try (var reader = new StringReader(source)) {
//            int chr;
//            while ((chr = reader.read()) != -1) {
//                if (chr == '\t') {
//                    builder.append(' ');
//                } else if (chr == '\n') {
//                    throw new IllegalArgumentException("New line char not permitted");
//                } else {
//                    builder.append((char) chr);
//                }
//            }
//        } catch (Exception exception) {
//            return "error";
//        } finally {
//            return builder.toString();
//        }
//    }







//    public static void main(String[] args) {
//        log(List.of("Hello", "world", "new", "program"));
//    }
//
//    static <T> void log(T... lines) {
//        final String text = Arrays.asList(lines).stream().map(Object::toString).collect(joining(";"));
//        System.out.println(text);
//    }



//    public void print(List<String> lines) {
//        System.out.println(String.join(";", lines));
//    }
//
//    public void print(List<Number> lines) {
//        final DecimalFormat formatter = new DecimalFormat("###.##");
//        System.out.println(lines.stream().map(formatter::format).collect(joining(";")));
//    }
//
//    public void print(List<Double> lines) {
//        System.out.println(lines.stream().map(Object::toString).collect(joining(";")));
//    }
//
//    public static void main(String[] args) {
//        final List<Double> numbers = List.of(1.0d, 2.0d, 3.0d);
//        new ConsolePrinter().print(numbers);
//    }
//        public static void main(String[] args) {
//            final Map<Integer, String> map = new HashMap<>();
//            map.put(1, "Alex");
//            map.put(2, "Max");
//            map.put(3, "Andrew");
//            for (Integer key : map.keySet()) {
//                final String name = map.get(key);
//                if (name.equals("Max")) {
//                    map.remove(key);
//                }
//            }
//            System.out.println(map);
//        }

}






//
//
//class TestA {
//    {
//        System.out.print("A1");
//    }
//
//    static {
//        System.out.print("A2");
//    }
//
//    public TestA() {
//        System.out.print("A3");
//    }
//}
//
//class TestB
//        extends TestA {
//    {
//        System.out.print("B1");
//    }
//
//    static {
//        System.out.print("B2");
//    }
//
//    public TestB() {
//        System.out.print("B3");
//    }
//}
