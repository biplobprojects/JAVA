class A{

    //(OVERRIDDEN METHOD: IT MEANS WE CAN IMPLEMENT OR MODIFY VARIABLES IN CHILD CLASS OF THE PARENT CLASS)
    public void m1(){
        System.out.println("this is parent class");
    }
}



class B extends A{
    
    //OVERRIDING METHOD:
    public void m1(){
        System.out.println("this is child class");
    }
}


class Or{
    public static void main(String[] args) {
        A a =new A();        //(CREATING OBJECT FOR PARENT CLASS:)
        a.m1();

        B b = new B();       //(CREATING OBJECT FOR CHILD CLASS:)
        b.m1();

        A a1 =new B();    //(BY TAKING PARENT CLASS REFERENCE WE CAN OVERRIDE THE CHILD CLASS:)
        a1.m1();
    }
}