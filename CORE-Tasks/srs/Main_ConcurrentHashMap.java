import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main_ConcurrentHashMap {
    public static void main(String[] args) {
        Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap<>());
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            set.add("ddd");
            System.out.println(s);
        }

        Set<String> setTwo = Collections.newSetFromMap(new ConcurrentHashMap<>());
        setTwo.add("aaa");
        setTwo.add("bbb");

        System.out.println();

        for (String s : setTwo) {
            setTwo.add("ccc");
            System.out.println(s);
        }
    }
}
