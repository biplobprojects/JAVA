//WAP TO PRINT (1.INPUT:ABDEF, OUTPUT:GFECB)

class que1{

    public static void main(String[] args) {
        
        String s ="ABDEF";

        for(int i =s.length()-1;i>=0;i--){

            char s1=  (char)(s.charAt(i)+1);
            System.out.print(s1);
        }
    }
}