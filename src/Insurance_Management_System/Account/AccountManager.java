package Insurance_Management_System.Account;

import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountList;

    public AccountManager() {
        this.accountList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public Account login(String email, String password) {
        for (Account a : accountList) {
            try {
                a.login(email, password);
                if (a.getStatus() == Account.AuthenticationStatus.SUCCESS) {
                    return a;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }


    public TreeSet<Account> getAccountList() {
        return accountList;
    }
}
