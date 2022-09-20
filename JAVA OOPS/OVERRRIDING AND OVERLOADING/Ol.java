public class Ol {
    public static int m1(int a, int b){
        return a+b;
        
    }

    //METHOD SIGNATURE:METHOD NAME(m1) + ARGUMENT TYPE(int) 



    public static double m1(double a, double b, double c){
              return a+b+c;
    }


    
}

class main{
    public static void main(String[] args) {
        System.out.println(Ol.m1(12,15));
        System.out.println(Ol.m1(13,14,14));
    }
}
