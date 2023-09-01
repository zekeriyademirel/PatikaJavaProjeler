package Insurance_Management_System.Helper;

import Insurance_Management_System.Account.*;
import Insurance_Management_System.Address.AddressManager;
import Insurance_Management_System.Address.BusinessAddress;
import Insurance_Management_System.Address.HomeAddress;
import Insurance_Management_System.Address.IAddress;
import Insurance_Management_System.Insurance.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Helper {
    Account account;

    private AccountManager accountManager;

    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);

    public Helper() {
        this.accountManager = new AccountManager();
    }

    public void addUser(String userType, String name, String surname, String email, String password,
                        String profession, int age, String companyName) {
        User user = new User(name, surname, email, password, profession, age);

        if (userType.equalsIgnoreCase("I")) {
            Account account = new IndividualAccount(user);
            accountManager.addAccount(account);
            System.out.println("User added successfully !");
        } else if (userType.equalsIgnoreCase("E")) {
            Account account = new EnterpriseAccount(user, companyName);
            accountManager.addAccount(account);
            System.out.println("User added successfully !");
        } else {
            System.out.println("Invalid user type,Please try again!");
        }

    }

    public Account login(String email, String password) {
        Account account = accountManager.login(email, password);
        if (account != null) {
            account.showUserInfo();
        }
        return account;
    }

    public void afterLoginMenu() {
        int option = -1;
        while (option != 0) {

            System.out.println("***** Insurance Management System *****\n" +
                    "    1 - Add address\n" +
                    "    2 - Add insurance\n" +
                    "    3 - Show user info\n" +
                    "    0 - Exit");
            System.out.print("Choice = ");
            option = scanInt.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("1 - Home Address");
                    System.out.println("2 - Business Address");
                    System.out.print("Choice = ");
                    int addressChoice = scanInt.nextInt();

                    System.out.print("Street = ");
                    String street = scanStr.nextLine();
                    System.out.print("Bourhood = ");
                    String bourhood = scanStr.nextLine();
                    System.out.print("City = ");
                    String city = scanStr.nextLine();
                    System.out.print("Country = ");
                    String country = scanStr.nextLine();
                    System.out.print("postalCode = ");
                    int postalCode = scanInt.nextInt();

                    if (addressChoice == 1) {
                        addHomeAddress(account.getUser(), street, bourhood, city, country, postalCode);
                    } else if (addressChoice == 2) {
                        System.out.print("Company name = ");
                        String companyName = scanStr.nextLine();
                        addBusinessAddress(account.getUser(), street, bourhood, city, country, postalCode, companyName);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("1 - Car Insurance");
                    System.out.println("2 - Health Insurance");
                    System.out.println("3 - Residence Insurance");
                    System.out.println("4 - Travel Insurance");
                    System.out.print("Choice = ");
                    int insuranceChoice = scanInt.nextInt();

                    if (insuranceChoice == 1) {

                        System.out.print("Car name = ");
                        String carMake = scanStr.nextLine();
                        System.out.print("Car model = ");
                        String carModel = scanStr.nextLine();
                        System.out.print("Car age: ");
                        int carAge = scanInt.nextInt();
                        System.out.print("Enter true or false that if coverage for drivers (T/F) = ");
                        String answer = scanStr.nextLine();

                        boolean coverageForDrivers;

                        if (answer.equalsIgnoreCase("T")) {
                            coverageForDrivers = true;
                        } else if (answer.equalsIgnoreCase("F")) {
                            coverageForDrivers = false;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                            break;
                        }

                        System.out.print("Enter true or false that if coverage for passengers (T/F): ");
                        answer = scanStr.nextLine();

                        boolean coverageForPassengers;

                        if (answer.equalsIgnoreCase("T")) {
                            coverageForPassengers = true;
                        } else if (answer.equalsIgnoreCase("F")) {
                            coverageForPassengers = false;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                            break;
                        }
                        account.addInsurance(new CarInsurance(carMake, carModel, carAge, coverageForDrivers, coverageForPassengers));
                    }

                    else if (insuranceChoice == 2) {
                        System.out.print("Health condition = ");
                        String healthCondition = scanStr.nextLine();
                        System.out.print("Coverage limit = ");
                        double coverageLimit = scanInt.nextDouble();
                        System.out.print("Enter true or false that if coverage for pre existing condition (T/F): ");
                        String answer = scanStr.nextLine();
                        boolean coverageForPreExistingCondition;
                        if (answer.equalsIgnoreCase("T")) {
                            coverageForPreExistingCondition = true;
                        } else if (answer.equalsIgnoreCase("F")) {
                            coverageForPreExistingCondition = false;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                            break;
                        }
                        account.addInsurance(new HealthInsurance(healthCondition, coverageForPreExistingCondition, coverageLimit));
                    } else if (insuranceChoice == 3) {

                        System.out.print("Building value = ");
                        double buildingValue = scanInt.nextDouble();
                        System.out.print("Enter content value = ");
                        double contentValue = scanInt.nextDouble();
                        account.addInsurance(new ResidenceInsurance(buildingValue, contentValue));
                    } else if (insuranceChoice == 4) {
                        List<String> coveredCountries = new ArrayList<>();
                        System.out.println("Enter countries = ");
                        while (scanStr.hasNextLine()) {
                            String item = scanStr.nextLine();
                            if (item.isEmpty()) {
                                break;
                            }
                            coveredCountries.add(item);
                        }
                        System.out.print("Enter duration = ");
                        int duration = scanInt.nextInt();
                        account.addInsurance(new TravelInsurance(coveredCountries,duration));
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }

                    break;
                }
                case 3:
                    showUserInfo(account);
                    break;
                case 0:
                    account = null;
                    System.out.println("You're exiting!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
                    break;
            }
        }
    }


    public void addHomeAddress(User user, String street, String bourhood, String city, String country, int postalCode) {
        IAddress homeAddress = new HomeAddress(street, bourhood, city, country, postalCode);
        AddressManager.addAddress(user, homeAddress);
        System.out.println("Successfully added home address!");
    }

    public void addBusinessAddress(User user, String street, String bourhood, String city, String country, int postalCode, String companyName) {
        IAddress businessAddress = new BusinessAddress(street, bourhood, city, country, postalCode, companyName);
        AddressManager.addAddress(user, businessAddress);
        System.out.println("Successfully added home address!");
    }

    public void showUserInfo(Account account) {
        account.showUserInfo();
    }

    public void listAccounts() {
        TreeSet<Account> accountList = accountManager.getAccountList();
        if (accountList.isEmpty()) {
            System.out.println("No accounts found in the system");
            return;
        }
        String format = "| %-15s | %-15s | %-25s |%-15s | %-20s | %-8s | %-25s | %-15s |\n";
        System.out.format(format, "Name", "Surname", "Email", "Password", "Profession", "Age", "Last login date",
                "Type");
        for (Account a : accountList) {
            System.out.format(format, a.getUser().getName(), a.getUser().getSurname(), a.getUser().getEmail(),
                    a.getUser().getPassword(), a.getUser().getProfession(), a.getUser().getAge(),
                    a.getUser().getLastLogin(), a.getClass().getSimpleName());
        }
    }

    public boolean isHaveAccount() {
        return accountManager.getAccountList().isEmpty();
    }
}
