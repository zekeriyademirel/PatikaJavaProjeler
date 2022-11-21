import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double normalUcret, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplamTutar, ucret = 0.10;

        Scanner oku = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz= ");
        km = oku.nextInt();

        System.out.print("Yaşınızı giriniz= ");
        yas = oku.nextInt();

        System.out.print("Yolculuk tipini giriniz(1-Tek Yön, 2-Gidiş Dönüş)= ");
        yolculukTipi = oku.nextInt();

        normalUcret = km * ucret;

        if (0 < km && 0 < yas && ((yolculukTipi == 1) || (yolculukTipi == 2))) {

            if (yolculukTipi == 1) {
                if (yas < 12) {
                    yasIndirimi = normalUcret * 0.50;
                    toplamTutar = normalUcret - yasIndirimi;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (yas < 24) {
                    yasIndirimi = normalUcret * 0.10;
                    toplamTutar = normalUcret - yasIndirimi;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (yas < 65) {
                    toplamTutar = normalUcret;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (65 < yas) {
                    yasIndirimi = normalUcret * 0.30;
                    toplamTutar = normalUcret - yasIndirimi;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                }

            } else {

                if (yas < 12) {
                    yasIndirimi = normalUcret * 0.50;
                    indirimliTutar = normalUcret - yasIndirimi;
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (yas < 24) {
                    yasIndirimi = normalUcret * 0.10;
                    indirimliTutar = normalUcret - yasIndirimi;
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (yas < 65) {
                    gidisDonusIndirimi = normalUcret * 0.20;
                    toplamTutar = (normalUcret - gidisDonusIndirimi) * 2;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                } else if (65 < yas) {
                    yasIndirimi = normalUcret * 0.30;
                    indirimliTutar = normalUcret - yasIndirimi;
                    gidisDonusIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    System.out.println("Toplam Tutar = " + toplamTutar);
                }
            }

        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}
