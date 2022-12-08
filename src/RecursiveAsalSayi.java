import java.util.Scanner;

public class RecursiveAsalSayi {
    static int AsalSayi(int a, int b) {

        if (b == 1) {
            return 1;
        } else {
            {
                if (a % b == 0) {
                    return 0;
                } else {
                    return AsalSayi(a, b - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz= ");
        int a = scan.nextInt();
        if (a <= 0) {
            System.out.print("Hatalı sayı girdiniz. Lütfen tekrar deneyiniz !");
        } else {
            int c = AsalSayi(a, a / 2);

            if (c == 1) {
                System.out.println(a + " sayısı asal sayıdır.");
            } else {
                System.out.println(a + " sayısı asal değildir.");
            }
        }
    }
}

