import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : " + Arrays.toString(list));
    }
}
