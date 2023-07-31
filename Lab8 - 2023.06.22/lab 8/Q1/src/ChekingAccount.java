public class ChekingAccount extends BankAccount{
    private double Interest = 0.02;
    public ChekingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest(){
        System.out.println("Your interest is: "+getBalance()*Interest);
    }
}
