package ARRAYLIST;


import java.util.ArrayList;

public class ArrList3 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();

        enames.add("biplob");
        enames.add("laxmi");
        enames.add("kuku");
        enames.add("radha");
        enames.add("akon");

        System.out.println(enames);
        System.out.println(enames.size());
        

        //READ ALL ARRAY LISTS ELEMENTS:
       for( Object ename : enames)
        System.out.println(ename);

        //READ ELEMENT USING FOR LOOP:
        for(int i =0; i<=enames.size()-1;i++){
            System.out.println(enames.get(i));

        }
}
}
