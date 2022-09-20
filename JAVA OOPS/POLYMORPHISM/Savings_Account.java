public class Savings_Account extends Account {

    

    private double min_Bal();

    // getter:
    public double getmin_Bal() {
        return min_Bal;
    }

    // setter:
    public void setmin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;

    }

    public void cal_Bal(){
       double balance= getamount();
       balance = balance - getmin_Bal();
       System.out.println("Account balance is:" + balance);
    }

}
