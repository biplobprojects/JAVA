class MoneyException extends Exception{
    MoneyException(String stringString ){
        super();
    }
}
class Test{
    public static void main(String[] args) throws MoneyException {
        int amount = 400;
        if(amount >=600){
            System.out.println("Go to Movie");
        }
        else{
            throw new MoneyException("Go to PG, Sleep");
        }
    }
}