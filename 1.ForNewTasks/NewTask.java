public class NewTask {
}

class X {
    void action(){}
}
class Y extends X {
    static void action(int i){
        new X().action();
    }
}
