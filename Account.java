import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
    private String accountID;
    private String accountType;
    private double balance;
    private User accountHolder;
    private List<Transaction> transactions;

    public Account(String accountType, User accountHolder, Bank bank) {
        this.accountID = UUID.randomUUID().toString();
        this.accountType = accountType;
        this.balance = 0;
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
    }

    public String getUUID() {
        return this.accountID;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addTransaction(double amount, String memo) {
        this.balance += amount;
        this.transactions.add(new Transaction(amount, memo));
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account: " + this.accountID);
        for (Transaction t : this.transactions) {
            System.out.println(t);
        }
    }
}
