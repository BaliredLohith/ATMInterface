import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String firstName;
    private String lastName;
    private String pin;
    private String userID;
    private Bank bank;
    private List<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.bank = bank;
        this.userID = UUID.randomUUID().toString();
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUUID() {
        return this.userID;
    }

    public boolean validatePin(String aPin) {
        return aPin.equals(this.pin);
    }

    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }

    public void printAccountSummary() {
        System.out.println("Accounts Summary for " + this.firstName + " " + this.lastName);
        for (int i = 0; i < this.accounts.size(); i++) {
            System.out.println((i + 1) + ". " + this.accounts.get(i).getAccountType());
        }
        System.out.println();
    }

    public int numAccounts() {
        return this.accounts.size();
    }

    public double getAccountBalance(int acctIdx) {
        return this.accounts.get(acctIdx).getBalance();
    }

    public String getActUUID(int acctIdx) {
        return this.accounts.get(acctIdx).getUUID();
    }

    public void addActTransaction(int acctIdx, double amount, String memo) {
        this.accounts.get(acctIdx).addTransaction(amount, memo);
    }

    public void printActTransHistory(int acctIdx) {
        this.accounts.get(acctIdx).printTransactionHistory();
    }
}
