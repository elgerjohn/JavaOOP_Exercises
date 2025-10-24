package BankAccount;


public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("5050", "LESTER", 1000.0);
        System.out.println("Account Holder: " + ba.getHolderName());
        System.out.println("Initial Balance: " + ba.checkBalance());
        
        ba.deposit(500.0);
        System.out.println("After deposit: " + ba.checkBalance());
        
        ba.withdraw(200.0);
        System.out.println("After withdrawal: " + ba.checkBalance());
        
        SavingsAccount sa = new SavingsAccount("1010", "NICOLE", 2000.0, 5.0);
        System.out.println("Savings Account Holder: " + sa.getHolderName());
        System.out.println("Initial Balance: " + sa.checkBalance());
        System.out.println("Interest Rate: " + sa.getInterestRate() + "%");
        
        sa.applyInterest();
        System.out.println("After applying interest: " + sa.checkBalance());
    }
}
