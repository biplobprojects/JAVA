package PredefinedFunctionalInterface.predicateFunction;

import java.util.function.Predicate;

public class withPredicate {
    static Predicate<Integer> t = i->i>100;

    public static void main(String[] args) {
        System.out.println(t.test(899));
    }
    
}
