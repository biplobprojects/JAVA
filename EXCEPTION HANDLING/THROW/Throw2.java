public class Throw2 {

    public static void main(String[] args) {
        
    

    try{
        // String num= null;
        // System.out.println(num.length());

        throw new NullPointerException("this is my exception");
    }

    catch(Exception e){
        System.out.println(e);

        System.out.println("welcome back");
    }


    
}
    
}
