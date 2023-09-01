package Insurance_Management_System.Account;

import Insurance_Management_System.Address.IAddress;
import Insurance_Management_System.Insurance.Insurance;


import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    private User user;
    private AuthenticationStatus status;
    protected ArrayList<Insurance> insurances;

    public abstract void addInsurance(Insurance insurance);

    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Account(User user) {
        this.user = user;
        this.status = AuthenticationStatus.FAIL;
        this.insurances = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            this.status = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password !");
        }
    }

    public void addAddress(IAddress address) {
        if (status == AuthenticationStatus.SUCCESS) {
            user.addAddress(address);
        }
    }

    public void removeAddress(IAddress address) {
        if (status == AuthenticationStatus.SUCCESS) {
            user.removeAddress(address);
        }
    }

    public final void showUserInfo() {

        System.out.println("Name = " + user.getName());
        System.out.println("Surname = " + user.getSurname());
        System.out.println("Email = " + user.getEmail());
        System.out.println("Password = " + user.getPassword());
        System.out.println("Profession = " + user.getProfession());
        System.out.println("Age = " + user.getAge());
        System.out.println("Address = " + user.getAddress());
        System.out.println();
        user.updateLastLogin();
        System.out.println("Last login data = " + user.getLastLogin());
        System.out.println("-----------------------------------");
        System.out.println("Insurance = ");
        for (Insurance i : insurances) {
            System.out.println(i);
        }
    }

    public int hashCode() {
        return user.getEmail().hashCode();
    }

    @Override
    public int compareTo(Account o) {
        return this.user.getEmail().compareTo(o.user.getEmail());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Account)) {
            return false;
        }

        Account other = (Account) obj;

        return this.user.getEmail().equals(other.user.getEmail());
    }

    public AuthenticationStatus getStatus() {
        return status;
    }
}
