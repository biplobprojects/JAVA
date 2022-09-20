                                     //BASE CLASS OR PARENT CLASS X:
class X {
    int a = 12;

    void m1() {
        System.out.println("parent");
    }
    
}

class Y extends X {               // FIRST DERIVED OR CHILD CLASS OF PARENT CLASS X:
    int b = 145;

    void m2() {
        System.out.println("child");
    }
}

class Z extends X {             //SECOND DERIVED CLASS OF PARENT CLASS X:
    
    int c =45;
    void m3(){
        System.out.println("second child");
    }
    }

    class Main1{
        public static void main(String[] args) {
            Z objz = new Z();
        objz.m1();
          System.out.println(objz.a);

          Y objy =new Y();
          objy.m2();
          System.out.println(objy.a);
            
        }
        
    }
