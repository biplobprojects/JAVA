import java.util.PriorityQueue;

public class QuequeDemo {

    public static void main(String[] args) {
        PriorityQueue q1 = new PriorityQueue();

        // ADDING ELEMENTS:
        q1.add("biplob");
        q1.add("bijoy");
        q1.offer("mesh");
        System.out.println(q1);  //INSERTION ORDER ALLOWED AND DUPLICATES ALSO ALLOWED:

        //READING ELEMENTS:
        System.out.println(q1.element());
        System.out.println(q1.peek());

        //DELETING ELEMENTS:
        System.out.println(q1.remove());
        System.out.println(q1);

        System.out.println(q1.poll());
        System.out.println(q1);

        



    }

    private static char[] remove() {
        return null;
    }

}
