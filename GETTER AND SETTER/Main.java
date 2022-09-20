public class Main {

    public static void main(String[] args) {
        Student sc1 = new Student("biplob", 12,85);
        Student sc2 = new Student("BIJOY", 34, 77);

        
       sc1.setname("BIJOY");    //(TO ACCESS THE VARIABLES WE USE GET AND SET TO MODIFY IT WHEN THE PARENT CLASS VARIABLES ARE PRIVATE :)
       System.out.println(sc1.getname());


       sc1.setrollno(12346766);
        System.out.println(sc1.getrollno());


      
      
    }
    
}
