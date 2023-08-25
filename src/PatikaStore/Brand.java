package PatikaStore;

import java.util.ArrayList;

public class Brand implements Comparable<Brand> {
    private static int id;
    private String name;
    int sayac = 0;

   public static ArrayList<Brand> brands = new ArrayList<>();

    public Brand() {
    }

    public Brand(String name) {
        this.id = ++sayac;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printBrand() {
        for (Brand b : brands)
            System.out.println(b.getName());

    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
