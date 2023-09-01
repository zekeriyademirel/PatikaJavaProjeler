package Insurance_Management_System.Account;

import Insurance_Management_System.Insurance.Insurance;

public class IndividualAccount extends Account{
    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.05;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }
}
