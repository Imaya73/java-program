class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

enum ACCOUNT_TYPE {
    SAVINGS,
    CURRENT
}

class BankAccount {
    private double balance;
    protected String accountHolderName;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        ACCOUNT_TYPE type = ACCOUNT_TYPE.SAVINGS;
        System.out.println("Account Type: " + type);

        BankAccount account = new BankAccount("Imaya", 5000);

        try {
            account.deposit(1000);
            account.withdraw(2000);
            account.withdraw(5000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Account Holder: " + account.accountHolderName);
        account.showBalance();
    }
}