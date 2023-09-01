package Insurance_Management_System.Account;

import Insurance_Management_System.Insurance.Insurance;

public class EnterpriseAccount extends Account {

    private String companyName;

    public EnterpriseAccount(User user, String companyName) {
        super(user);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.3;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }

}
