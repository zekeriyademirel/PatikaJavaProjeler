import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        int number, basValue, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        number = input.nextInt();

        while (number != 0) {
            basValue = number % 10;
            toplam += basValue;
            number /= 10;
        }
        System.out.println("Basamak Sayılarının Toplamı = " + toplam);

    }
}
