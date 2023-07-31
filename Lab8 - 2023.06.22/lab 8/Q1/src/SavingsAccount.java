public class SavingsAccount extends BankAccount{
    private double Interest = 0.12;
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest(){
        System.out.println("Your interest is: "+getBalance()*Interest);
    }
}
