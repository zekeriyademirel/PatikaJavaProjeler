
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int yil;

        Scanner oku = new Scanner(System.in);
        System.out.print("Yıl Giriniz= ");
        yil = oku.nextInt();

        if (yil % 4 == 0) {
            System.out.print(yil + " bir artık yıldır !");
        } else {
            System.out.print(yil + " bir artık yıl değildir !");
        }
    }
}