public class StringReverse {
    public static void main(String[] args) {
        var input = "hello, Dolly!";
       // System.out.println(reverseString(input));
        System.out.println(reverseStringByArray(input));
    }

    static String reverseString(String string) {
        StringBuilder temp = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            temp = temp.append(string.charAt(i));
        }
        return temp.toString();
    }

    static String reverseStringByArray(String string) {
        StringBuilder temp = new StringBuilder();
        var str = string.toCharArray();
        for (int i = str.length - 1; i >= 0; i--) {
            temp = temp.append(str[i]);
        }
        return temp.toString();
    }

}
