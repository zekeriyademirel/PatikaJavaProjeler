import java.util.Scanner;

public class DortveBesKuvvetleri {
    public static void main(String[] args) {
        int n, m;

        Scanner input = new Scanner(System.in);

        System.out.print("4 için sınır değer giriniz= ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("5 için sınır değer giriniz= ");
        m = input.nextInt();

        for (int j = 1; j <= m; j *= 5) {
            System.out.print(j + " ");
        }

    }

}

// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
