 class Emp extends Person{

    Emp(int id, String name) {
        super(id, name);   //REUSING PARENT CONSTRUCTOR:
        
      
    }

    void display(){
        System.out.println(id+" "+name+" ");
    }
    

    
    
}
