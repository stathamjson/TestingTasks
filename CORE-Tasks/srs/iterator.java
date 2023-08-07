import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {

        final List<String> list = new ArrayList() {{
            add("1");
            add("2");
            add("3");
        }};
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals("2")) {
                iterator.remove();
            }
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("apple".compareTo("banana"));
        int a=1,b=0;
        int c = a/b;
        System.out.println(c);




    }
}
