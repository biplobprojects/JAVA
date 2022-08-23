class Test{
    public static void main(String[] args){
        //int[] marks ={35,36,37,38,39,40};

       // ARRAY USING FOR LOOP:
        // for(int a=0; a<=marks.length-1; a++){
        //     System.out.println(marks[a]);
        // }

        // USING FOR- EACH LOOP:
        // int[] marks ={35,36,37,38,39,40};
        // for(int a : marks){
        //     System.out.println(a);
        // }


       
        //2D ARRAY BY USING FOR LOOP: 

        int[][] num ={{13,14,15,16,54},{115,19}};
        for(int a=0; a<=num.length-1; a++){
            for(int b=0; b<=num[a].length-1; b++){
                System.out.println(num[a][b]);
            }
        }

        // 2D ARRAY USING FOR-EACH LOOP:
        // int[][] num ={{13,14,15,16,54},{115,19}};
        // for(int[] a : num){
        //     for(int b: a){
        //         System.out.println(b);
        //     }
        // }
        
    }
}