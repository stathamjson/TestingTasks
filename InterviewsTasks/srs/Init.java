public class Init {

    static String value = "w";

    static { value += "q"; }

    { value += "a"; }

    private Init() {
        value += "b";
    }

    public Init(String s) {
        this();
        value += s;
    }

    public static void main(String []args){
        value += "h";
        Init init = new Init();
        init = new Init("f");
        System.out.println(init.value); // wqahbs
    }
}
