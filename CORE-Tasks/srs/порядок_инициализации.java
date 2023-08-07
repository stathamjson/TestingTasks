class порядок_инициализации {
}

class TestA {
    {
        System.out.print("A1");
    }

    static {
        System.out.print("A2");
    }

    public TestA() {
        System.out.print("A3");
    }

}

class TestB extends TestA {

    {
        System.out.print("B1");
    }

    static {
        System.out.print("B2");
    }

    public TestB() {
        System.out.print("B3");
    }

}

class Scratch {
    public static void main(String[] args) {
        new TestB();

    }
}
