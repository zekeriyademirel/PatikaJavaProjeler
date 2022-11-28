import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int toplam = 0, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " Mükemmel sayıdır");
        } else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}
