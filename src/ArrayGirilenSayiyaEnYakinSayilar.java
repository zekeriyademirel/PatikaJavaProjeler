import java.util.Arrays;
import java.util.Scanner;

public class ArrayGirilenSayiyaEnYakinSayilar {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi = input.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (sayi < list[i]) {
                System.out.println("Girilen sayıdan küçük en yakın sayı= " + list[i - 1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı= " + list[i]);
                break;
            }
        }
    }
}
