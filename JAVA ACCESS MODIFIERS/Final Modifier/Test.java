

 class Final{

                                                           //USING FINAL IN METHOD:
     void m1(){

     System.out.println("875578656");

    }
     void m2(){
        System.out.println("36464646");
    }

    
}
                                 //EXTENDS MEANS OVERIDING A CLASS
class Thief extends Final{ 
    @Override 
     void m1(){

        System.out.println("875578656");
   
       }
       @Override
     void m2(){
           System.out.println("36464646");
       }  


}
class Child{
    public static void main(String[] args) {
    Child lo = new Child();
    lo.m1(); lo.m2();

       
        
    }
}
