import java.util.HashMap;

class mapInterface {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // ADDING :
        hm.put(102, "biplob");
        hm.put(109, "nagamin");
        hm.put(105, "arun");


        System.out.println(hm.containsKey(102)); // TO CHECK WHETHER A KEY IS PRESENT OR NOT:
        System.out.println(hm.get(102)); // GET THE VALUE OF THE KEY:
        System.out.println(hm);
        System.out.println(hm.containsValue("biplob")); //TO CHECK IF A VALUE IS PRESENT OR NOT:
        System.out.println(hm.keySet()); // TO GET ALL THE KEYS:
        System.out.println(hm.values()); //TO GET ALL THE VALUES:

       System.out.println(hm.entrySet());
       System.out.println(hm.remove(105));
       System.out.println(hm);


    }

}