
public class SM {

    public static void main(String[] args) {

        String s = new String("BIPLOB BORBORUAH");
        String s2 = new String("LOVES PROGRAMMING");

        System.out.println(s.charAt(0)); // charAt():return the character located at specified index:

        System.out.println(s.length());        // length():returns the number of characters in the string:

        System.out.println(s.substring(2, 5)); // substring(): return the substring from the beginning index to the end
                                               // index:

        System.out.println(s.concat(s2));      //concat(): concatenates specified string to the end of the string:

        System.out.println(s2.indexOf("G"));
        System.out.println(s.indexOf("BORBORUAH")); //indexOf(): returns the index value:

        System.out.println(s.equals(s2));  //equals(): IN STRING CLASS IT IS USED TO COMPARE THE CONTENT OF THE OBJECTS.
                                                   //IN OBJECT CLASS IT IS USED TO COMPARE THE REFERENCE VALUE OF THE OBJECTS.
        System.out.println(s==s2);

        


    }

}
