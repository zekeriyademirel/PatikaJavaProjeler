package Insurance_Management_System.Insurance;

import java.time.LocalDate;
import java.util.List;

public class TravelInsurance extends Insurance{
    private List<String> coveredCountries;
    private int duration;

    public TravelInsurance(List<String> coveredCountries, int duration) {
        super("Travel Insurance", 1500, LocalDate.now(), LocalDate.now().plusMonths(2));
        this.coveredCountries = coveredCountries;
        this.duration = duration;
    }

    public List<String> getCoveredCountries() {
        return coveredCountries;
    }

    public void setCoveredCountries(List<String> coveredCountries) {
        this.coveredCountries = coveredCountries;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void calculate() {
        double basePrice = getPrice();
        int duration = getDuration();
        int numberOfCountries = getCoveredCountries().size();
        // calculate the premium based on the base price, duration, and number of
        // covered countries
        double premium = basePrice + (basePrice * 0.1 * duration) + (basePrice * 0.05 * numberOfCountries);
        setPrice(premium);
    }

}
