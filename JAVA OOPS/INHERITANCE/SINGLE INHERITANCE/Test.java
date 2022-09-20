
                                   //BASE CLASS OR PARENT CLASS:
class Parent{
    int a=12;
    void m1(){
        System.out.println("parent");
    }
}
                                 
class child extends Parent{       //DERIVED OR CHILD CLASS:
    int b =145;
    void m2(){
        System.out.println("child");
    }
}

class Test{                         //MAIN CLASS:
    public static void main(String[] args) {
        child sc = new child();
        System.out.println(sc.b);
        sc.m2();

        
        System.out.println(sc.a);
        sc.m1();
    }
}