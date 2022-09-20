public class Test {
    

    public static void main(String[] args) {
        Savings_Account a =new Savings_Account();
        a.setid(12);
        a.setname("biplob");
        a.setamount(12000);

        a.setmin_Bal(1000);

        Current_Account b = new Current_Account();
        b.setid(43);
        b.setname("bijoy");
        b.setamount(78000);

        b.setmin_bal(500);


        AccountService.get_AccountService(a);
		AccountService.get_AccountService(b);
    }
}
