interface AutoCars{
    void bmw();
    void audi();

}



class A implements AutoCars{
    public void bmw(){
        System.out.println("BMW HAVE GOOD TORQUE");

    }
    public void audi(){
        System.out.println("AUDI HAVE GOOD DESIGN");

    }
} 


    
    class Main{
        public static void main(String[] args) {
            
        
            A sc = new A();
            sc.bmw();
            sc.audi();
            
            
           

        }
    }
    


