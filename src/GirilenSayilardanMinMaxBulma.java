import java.util.Scanner;

public class GirilenSayilardanMinMaxBulma {
    public static void main(String[] args) {
        int enk = 0, enb = 0, m, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz= ");
        m = input.nextInt();

        if (0 < m) {
            for (int i = 1; i <= m; i++) {
                System.out.print(i + ". sayıyı giriniz= ");
                n = input.nextInt();

                if (i == 1) {
                    enk = n;
                    enb = n;
                }

                if (n < enk)
                    enk = n;

                if (n > enb)
                    enb = n;
            }
            System.out.println("En küçük sayı = " + enk);
            System.out.println("En büyük sayı = " + enb);
        } else {
            System.out.println("Hatalı sayı girdiniz !");
        }
    }
}
