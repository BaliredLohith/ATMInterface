import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<User> users;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public User addUser(String firstName, String lastName, String pin) {
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);

        // Print User ID and PIN for testing purposes
        System.out.println("User created with ID: " + newUser.getUUID() + ", PIN: " + pin);
        return newUser;
    }

    public User userLogin(String userID, String pin) {
        for (User u : this.users) {
            if (u.getUUID().equals(userID) && u.validatePin(pin)) {
                return u;
            }
        }
        return null;
    }

    public void addAccount(Account newAccount) {
        this.accounts.add(newAccount);
    }
}
