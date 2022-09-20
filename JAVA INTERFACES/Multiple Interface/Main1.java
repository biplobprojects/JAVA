interface Account{
    void sbi();
    void axis();

}

interface Account2{
    void icici();
    void central();
}

class SubBank implements Account{
    public void sbi(){
        System.out.println("SBI IS STATE BANK OF INDIA");
    }

    public void axis(){
        System.out.println("AXIS IS A PRIVATE BANK");
    }
}

class SubBank2 implements Account,Account2{
    public void sbi(){
        System.out.println("SBI IS STATE BANK OF INDIA");
    }

    public void axis(){
        System.out.println("AXIS IS A PRIVATE BANK");
    }

    public void icici(){
        System.out.println("icici is high maintenance");
    }

    public void central(){
        System.out.println("central is government sector");
    }
}



class Main1{
    public static void main(String[] args) {
        SubBank sc = new SubBank();
        SubBank2 bc = new SubBank2();

        sc.sbi();
        sc.axis();

        bc.icici();
        bc.central();
       
    
    }


}
