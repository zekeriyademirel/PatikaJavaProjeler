package PatikaStore;

import java.util.ArrayList;

public class Product implements Comparable<Product> {

    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int amountStock;
    Brand brandInfo;
    private double screenSize;
    private int ram;
    int sayac = 0;

   public static ArrayList<Product> products = new ArrayList<>();

    public Product(String name, double price, Brand brandInfo, double screenSize, int ram) {
        this.id = ++sayac;
        this.name = name;
        this.price = price;
        this.brandInfo = brandInfo;
        this.screenSize = screenSize;
        this.ram = ram;
        this.discountRate = 0;
        this.amountStock = 50;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        double discountNum;
        discountNum = this.discountRate / 100;
        discountNum = this.price * discountNum;
        this.price -= discountNum;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountStock() {
        return amountStock;
    }

    public void setAmountStock(int amountStock) {
        this.amountStock = amountStock;
    }

    public Brand getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(Brand brandInfo) {
        this.brandInfo = brandInfo;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Product o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else {
            if (o.getId() > this.getId()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
