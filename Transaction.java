public class Transaction {
    private double amount;
    private String memo;

    public Transaction(double amount, String memo) {
        this.amount = amount;
        this.memo = memo;
    }

    public String toString() {
        return "Amount: $" + this.amount + ", Memo: " + this.memo;
    }
}
