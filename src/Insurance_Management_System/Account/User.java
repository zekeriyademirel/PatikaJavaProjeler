package Insurance_Management_System.Account;

import Insurance_Management_System.Address.IAddress;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
   private String name;
   private String surname;
   private String email;
   private String password;
   private String profession;
   private int age;
   private ArrayList<IAddress> address;
   private LocalDate lastLogin;

    public User(String name, String surname, String email, String password, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.address = new ArrayList<>();
        this.lastLogin = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<IAddress> address) {
        this.address = address;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void addAddress(IAddress address){
        this.address.add(address);
    }

    public void removeAddress(IAddress address){
        this.address.remove(address);
    }

    public void updateLastLogin(){
        this.lastLogin=LocalDate.now();
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }

}
