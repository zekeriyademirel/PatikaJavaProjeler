package Insurance_Management_System.Helper;

import Insurance_Management_System.Account.Account;

import java.util.Scanner;

public class Management {
    Helper helper = new Helper();
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            System.out.println(
                    "***** Insurance Management System *****\n" +
                            "    1 - Add User (Individual or Enterprise)\n" +
                            "    2 - Login\n" +
                            "    3 - Show List Accounts\n" +
                            "    0 - Exit");
            System.out.print("Choice = ");
            choice = scanInt.nextInt();

            switch (choice) {
                case 1: {
                    createUser();
                    break;
                }
                case 2: {
                    userLogin();
                    break;
                }
                case 3: {
                    helper.listAccounts();
                    break;
                }
                case 0: {
                    System.out.println("Exiting the system !");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again !");
                    break;
                }
            }
        } while (choice != 0);
    }

    public void createUser() {
        System.out.println("User type (Individual or Enterprise)(I/E) = ");
        String userType = scanStr.nextLine();
        System.out.println("User name = ");
        String userName = scanStr.nextLine();
        System.out.println("User surname = ");
        String userSurname = scanStr.nextLine();
        System.out.println("User email = ");
        String userEmail = scanStr.nextLine();
        System.out.println("User password = ");
        String userPassword = scanStr.nextLine();
        System.out.println("User profession = ");
        String userProfession = scanStr.nextLine();
        System.out.println("User age = ");
        int userAge = scanInt.nextInt();

        String userCompanyName = null;
        if (userType.equalsIgnoreCase("E")) {
            System.out.println("User company name = ");
            userCompanyName = scanStr.nextLine();
        }
        helper.addUser(userType, userName, userSurname, userEmail, userPassword, userProfession, userAge, userCompanyName);
    }

    public void userLogin() {
        System.out.print("User email = ");
        String userEmail = scanStr.nextLine();
        System.out.print("User password = ");
        String userPassword = scanStr.nextLine();
        Account account = helper.login(userEmail, userPassword);

        if (account == null) {
            if (helper.isHaveAccount()) {
                System.out.println("No accounts found in the system");
                System.out.println("Please add a user first.");
                 createUser();
            }
        } else {
            System.out.println("Login successful !");
            helper.afterLoginMenu();
        }
    }

}
