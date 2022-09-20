import java.util.ArrayList;
import java.util.Collections;

public class ArrList4 {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Rajni");
		enames.add("Nayana");
		enames.add("Sha");
		enames.add("Bhanu");
       
        //FOR SORTING:
        // Collections.sort(enames);
        // System.out.println(enames);

        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);

        //FOR SHUFFLE:
        Collections.shuffle(enames);
        System.out.println(enames);
        
    }
}
