

public class Test2 {
    public static void main(String[] args) {
        int[][] a = {{12,13,14,15,16},{56,57,58}};
        // for (int i = 0; i<=a.length-1; i++){
        //    for(int j =0; j <=a[i].length-1; j++){

        //     System.out.println(a[i][j]);
        //    }
        // }


        for(int[] i :a){
           for(int b: i){
            System.out.println(b);
           }
        }



    }

    
}

