package code.LeedCode;

import java.util.*;
import java.util.stream.Stream;

public class _17 {
    public static void main(String[] args) {
        String string = "23";
        System.out.println(letterCombinations(string));

    }
    static List<String> letterCombinations(String digits) {

        Map<Integer,List<String>> list = new HashMap<>();
        List<String> l2 = Arrays.asList ("a","b","c");
        List<String> l3 = Arrays.asList ("d","e","f");
        List<String> l4 = Arrays.asList ("g","h","i");
        List<String> l5 = Arrays.asList ("j","k","l");
        List<String> l6 = Arrays.asList ("m","n","o");
        List<String> l7 = Arrays.asList ("p","q","r","s");
        List<String> l8 = Arrays.asList ("t","u","v");
        List<String> l9 = Arrays.asList ("w","x","y","z");
        list.put(2, l2);
        list.put(3, l3);
        list.put(4, l4);
        list.put(5, l5);
        list.put(6, l6);
        list.put(7, l7);
        list.put(8, l8);
        list.put(9, l9);

        String[] arr = digits.split("");
        List<String> input = Arrays.asList(arr);

 Stack<String> stack = new Stack<>();
 stack.pop();


        return new ArrayList<>();

    }
}
