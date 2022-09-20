class Test {
    // final modifier:(by applying final we cant overide a method)
    final void m1() {
        System.out.println("123");
    }

    final void m2() {
        System.out.println("1234567");
    }

}

class Thief extends Test {

    void m1() {
        System.out.println("123");
    }

    void m2() {
        System.out.println("1234567");
    }

}

class Final {
    public static void main(String[] args) {

        Thief t = new Thief();
        t.m1();
        t.m2();

    }

}
