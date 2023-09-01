package Insurance_Management_System.Insurance;

import java.time.LocalDate;

public abstract class Insurance {

    private String name;
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;

    public abstract void calculate();

    public Insurance(String name, double price, LocalDate startDate, LocalDate endDate) {
        setName(name);
        setPrice(price);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
