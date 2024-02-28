package lab6;
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.deposit(1000);
        account.withdraw(500);
    }
}
