import java.util.Scanner;

public class CiftveDortunKatiToplami {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz= ");
            n = scan.nextInt();

            if ( n % 4 == 0) {
                total += n;
            }

        } while (n % 2 == 0);
        System.out.println("Çift ve 4'ün katları olan sayıların toplamı = " + total);
    }
}
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.