package Insurance_Management_System.Address;

public class BusinessAddress implements IAddress {

    private String street;        // Sokak
    private String bourhood;      // Mahalle
    private String city;          // Şehir
    private String country;       // Ülke
    private int postalCode;       // Posta Kodu
    private String companyName;   // Firma Adı

    public BusinessAddress(String street, String bourhood, String city, String country, int postalCode, String companyName) {
        setStreet(street);
        setBourhood(bourhood);
        setCity(city);
        setCountry(country);
        setPostalCode(postalCode);
        setCompanyName(companyName);
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getBourhood() {
        return this.bourhood;
    }

    @Override
    public void setBourhood(String bourhood) {
        this.bourhood = bourhood;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int getPostalCode() {
        return this.postalCode;
    }

    @Override
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessAddress{" +
                "street='" + street + '\'' +
                ", bourhood='" + bourhood + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode=" + postalCode +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
