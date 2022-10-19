package PredefinedFunctionalInterface.predicateFunction;

//write a predicate to check whether the given integer is greater than 100 or not:
public class Test {

    public boolean test(Integer i){
        if(i>100){
            return true;
        }else{
        return false;
        }

    }

    public static void main(String[] args) {
        Test t =new Test();
        System.out.println(t.test(88));
    }
}
