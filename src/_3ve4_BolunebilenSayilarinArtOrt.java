import java.util.Scanner;

public class _3ve4_BolunebilenSayilarinArtOrt {
    public static void main(String[] args) {
        int ortalama, toplam = 0, sayac = 0, k;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;

        System.out.println("Sayıların Toplamı= " + toplam);
        System.out.println("Sayı adedi= " + sayac);
        System.out.println("Sayıların Ortalaması= " + ortalama);

    }
}


