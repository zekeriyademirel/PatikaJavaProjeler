package Insurance_Management_System.Address;

public interface IAddress {

    //Street         Sokak
    //Bourhood       Mahalle
    //City           Şehir
    //Country        Ülke
    //PostalCode    Posta Kodu

    public String getStreet();
    public void setStreet(String street);

    String getBourhood();
    void setBourhood(String bourhood);

    String getCity();
    void setCity(String city);

    String getCountry();
    void setCountry(String country);

    int getPostalCode();
    void setPostalCode(int postalCode);

}
