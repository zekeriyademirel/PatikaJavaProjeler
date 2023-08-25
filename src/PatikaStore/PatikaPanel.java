package PatikaStore;

import java.util.Scanner;

public class PatikaPanel {
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    int secim;


    static {
        Brand.brands.add(new Brand("- Apple"));
        Brand.brands.add(new Brand("- Asus"));
        Brand.brands.add(new Brand("- Casper"));
        Brand.brands.add(new Brand("- HP"));
        Brand.brands.add(new Brand("- Huawei"));
        Brand.brands.add(new Brand("- Lenovo"));
        Brand.brands.add(new Brand("- Monster"));
        Brand.brands.add(new Brand("- Samsung"));
        Brand.brands.add(new Brand("- Xiaomi"));


        MobilePhone.mobilePhones.add(new MobilePhone("Samsung Galaxy A54", 16000, new Brand("Samsung"), 6.5, 16, 128, 5000, "Siyah"));
        MobilePhone.mobilePhones.add(new MobilePhone("iPhone 13 128 GB", 32450, new Brand("Apple"), 6.1, 16, 128, 4500, "Mavi"));
        MobilePhone.mobilePhones.add(new MobilePhone("Redmi Note 10 Pro 8GB", 4012, new Brand("Xiaomi"), 6.5, 12, 64, 4000, "Beyaz"));

        Notebook.notebooks.add(new Notebook("HUAWEI Matebook 14 ", 7000, new Brand("Huawei"), 14, 16, 512));
        Notebook.notebooks.add(new Notebook("LENOVO V14 IGL ", 3699, new Brand("Lenovo"), 14, 16, 1024));
        Notebook.notebooks.add(new Notebook("ASUS Tuf Gaming  ", 8199, new Brand("Asus"), 15, 16, 2048));

        Product.products.addAll(MobilePhone.mobilePhones);
        Product.products.addAll(Notebook.notebooks);

    }


    public void patikaStoreRun() {
        boolean status = true;
        while (status) {
            System.out.println("1 - Notebook İşlemleri \n" +
                    "2 - Cep Telefonu İşlemleri \n" +
                    "3 - Marka Listele \n" +
                    "0 - Çıkış Yap");
            System.out.print("Tercihiniz = ");
            secim = scanInt.nextInt();

            switch (secim) {
                case 1: {
                    listNotebook();
                    break;
                }

                case 2: {
                    listMobilePhone();
                    break;
                }

                case 3: {
                    listBrands();
                    break;
                }

                case 0: {
                    status = false;
                    break;
                }
                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz !");
            }

        }
    }

    public void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("---------------");
        for (Brand b : Brand.brands)
            System.out.println(b.getName());
    }

    public void listNotebook() {
        System.out.println();
        System.out.println("Notebook Listesi");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-11s%4s%15s%27s%15s%10s%15s%15s%15s%16s%n", "ID", "Ürün ", "Ürün Adı", "Fiyat", "İndirim Oranı", "Stok", "Ekran", "Marka", "RAM", "Depolama");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n : Notebook.notebooks) {
            System.out.printf("%-10s%-13s%-30s%-11s%-17s%-13s%-17s%-15s%-15s%-15s%n", n.getId(), n.getProductType(), n.getName(), n.getPrice(), n.getDiscountRate()
                    , n.getAmountStock(), n.getScreenSize(), n.getBrandInfo().getName(), n.getRam(), n.getStorage());

        }
    }

    public void listMobilePhone() {
        System.out.println("Cep Telefonu Listesi");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-11s%4s%15s%27s%11s%20s%10s%15s%15s%16s%n","ID","Ürün ","Ürün Adı","Fiyat","Marka","Depolama","Ekran","Pil","RAM","Renk");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone mp: MobilePhone.mobilePhones){
            System.out.printf("%-10s%-13s%-30s%-11s%-17s%-13s%-17s%-15s%-15s%-15s%n",mp.getId(),mp.getProductType(),mp.getName(),mp.getPrice(),mp.getBrandInfo().getName()
                    ,mp.getMemory(),mp.getScreenSize(),mp.getBatteryPower(),mp.getRam(),mp.getColor());
        }

    }
}




