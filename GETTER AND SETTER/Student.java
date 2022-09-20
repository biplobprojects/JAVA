class Student {

    private String name;
    private int rollno;
    private int percent;

    public Student(String name, int rollno, int percent) {          // CONSTRUCTOR:

        this.setname(name);
        this.setrollno(rollno);
        this.setpercent(percent);
    }

    // SETTER METHOD:
    public void setname(String name) {

        if (name.equals("BIPLOB") || name.equals("BIJOY")) {
            this.name = name;

        } else {
            this.name = "NA";
        }
    }
  

      //GETTERMETHOD:
    public String getname(){
        return name;
    }
     

    //SETTER:
    public void setrollno(int rollno) {
        this.rollno = rollno;
    }
     

    //GETTER:
    public int getrollno(){
        return rollno;
    }
       


    //SETTER:
    public void setpercent(int percent) {
        this.percent = percent;
    }

    //GETTER:
    public int getpercent(){
        return percent;
    }

}
