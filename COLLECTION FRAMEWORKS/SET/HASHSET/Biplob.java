package HASHSET;

import java.util.HashSet;

class   Biplob{
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        HashSet hs2 = new HashSet();

        hs1.add("rahul");
        hs1.add(null);
        hs1.add("b");
        System.out.println(hs1);

        System.out.println(hs1.size());
        System.out.println(hs1.contains(null));



    }
}