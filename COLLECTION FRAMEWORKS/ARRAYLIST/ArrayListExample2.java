package ARRAYLIST;

import java.util.*;
 class ArrayListExample2 {
    public static void main(String[] args) {
        
    //ALLOWED ALL DATA TYPES:
    ArrayList l1 =new ArrayList(); 

    //ALLOWED ONLY STRING DATATYPES:
    ArrayList<String>  l2 = new ArrayList<String>();

    //FOR ADDING ELEMENTS:
    l1.add(3);
    l1.add(456);
    l1.add(3443);
    // l1.add("kikj");

    System.out.println(l1);

    //TO RETURN THE SIZE OF ARRAY LIST:
    System.out.println(l1.size());

    // TO CHECK IF A ELEMENT EXISTS OR NOT:
    System.out.println(l1.contains(67));

    //TO CHECK IF LISTS IS EMPTY OR NOT:
    System.out.println(l1.isEmpty());
    }
    
    

   


    
}
