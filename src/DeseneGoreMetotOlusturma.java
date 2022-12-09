import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void Desen(int sayi, boolean d, int n) {

        if (d && sayi > 0 && sayi <= n) {
            System.out.print(sayi + " ");
            sayi -= 5;
            Desen(sayi, true, n);
            if (sayi <= 0) {
                Desen(sayi, false, n);
            }
        } else if (!d && sayi <= n) {
            System.out.print(sayi + " ");
            sayi += 5;
            Desen(sayi, false, n);
        }
    }

    public static void main(String[] args) {
        int sayi, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        sayi = scan.nextInt();
        n = sayi;

        Desen(sayi, true, n);
    }
}
