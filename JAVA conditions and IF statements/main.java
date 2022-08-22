public class A{
    int a =23;
    int b;
    static int c= 30;
    static int d;


    public static void main(String[] args){
        int e = 40;
        int f;
        A v = new A();
        System.out.println(v.a); //10
        System.out.println(v.b);//0
        System.out.println(A.c);//30
        System.out.println(v.d);//0
        System.out.println(c);//30
        System.out.println(e);//4

    }
}
