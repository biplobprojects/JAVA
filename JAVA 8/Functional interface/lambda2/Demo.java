package lambda2;

import java.util.function.Function;
import java.util.function.Function;

public class Demo {
 


    //predefined functional interface:
    // static Function<Integer,Integer> f =(int n)->{return n*n};
     static Function<Integer, Integer> f = n -> n*n;
    public static void main(String[] args) {
        
        System.out.println(f.apply(4));
    }
}
