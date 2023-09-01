package PatikaStore;

import java.util.ArrayList;

public class MobilePhone extends Product {
    private int id;
    private int memory;
    private double batteryPower;
    private String color;
    private String productType;
   static int sayac = 0;

    public static ArrayList<MobilePhone> mobilePhones = new ArrayList();

    public MobilePhone(String name, double price, Brand brandInfo, double screenSize, int ram, int memory, double batteryPower, String color) {
        super(name, price, brandInfo, screenSize, ram);
        this.id = ++sayac;
        this.memory = memory;
        this.batteryPower = batteryPower;
        this.color = color;
        this.productType = "Mobile Phone";
    }

    @Override
    public int getId() {
        return id;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductType() {
        return productType;
    }

}
