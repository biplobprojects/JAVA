abstract class Test
{
                                            //ABSTRACT MODIFIER:
   public abstract void m1();
   public abstract void m2();


    
}

class A extends Test{

    //Override
    public void m1(){
        System.out.println("hello a");
    }

    //Override
    public void m2(){
        System.out.println("hello bb");
    }
}

class B extends Test{

    //overide
    public void m1(){
        System.out.println("hello b");
    }
    public void m2(){
        System.out.println("hello bb");
    }

}

class Main{

    public static void main(String[] args) {
        A gc = new A();
        gc.m1(); gc.m2();  //calling method m1 by object of A:

        B bc = new B();
        bc.m1();  bc.m2();  //calling method m1 by object of B:

    }
}