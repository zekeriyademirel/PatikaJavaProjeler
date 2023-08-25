package PatikaStore;

import java.util.ArrayList;

public class Notebook extends Product{
    private int id;
    private int storage;
    private String productType;
    int sayac=0;

   public static ArrayList<Notebook> notebooks=new ArrayList<>();
    public Notebook(String name, double price, Brand brandInfo, double screenSize, int ram,int storage) {
        super(name, price, brandInfo, screenSize, ram);
        this.id=++sayac;
        this.storage=storage;
        this.productType="Notebook";
    }

    @Override
    public int getId() {
        return id;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProductType() {
        return productType;
    }

}
