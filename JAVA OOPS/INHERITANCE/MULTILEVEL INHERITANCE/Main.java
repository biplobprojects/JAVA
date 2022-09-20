class P{
    int a=13;
    void m1(){
        System.out.println("BASE CLASS");
    }
}

class B extends P{
    int b=34;
    void m2(){
        System.out.println("DERIVED CLASS");
       
    }


}

class C extends B{
    int c=123;
    void m3(){
        System.out.println("GRAND CHILD CLASS");
    }
}

class Main{
    public static void main(String[] args) {
        C bc = new C();
        bc.m3();
        bc.m2();
        bc.m1();
        System.out.println(bc.c);
        System.out.println(bc.b);
        System.out.println(bc.a);

    }
}


