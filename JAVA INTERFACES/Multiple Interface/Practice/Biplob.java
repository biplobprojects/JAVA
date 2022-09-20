interface Bip{
    void m1();
    void m2();
}

class A implements Bip{
   public void m1(){
   System.out.println("hello");
   }
   public void m2(){
    System.out.println("world");

   }
}

class Biplob{
  public static void main(String[] args) {
    A sc = new A();
    sc.m1();
    sc.m2();
  }
}




