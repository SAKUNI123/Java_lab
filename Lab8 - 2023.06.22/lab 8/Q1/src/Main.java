public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(126024, 20000000);
        ChekingAccount chekingAccount = new ChekingAccount(221341, 1000000);

        savingsAccount.calculateInterest();
        chekingAccount.calculateInterest();
    }
}