import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {

        int n, r, nFak = 1, rFak = 1, farkFak = 1, fark, kom;

        Scanner input = new Scanner(System.in);
        System.out.print("n sayısı= ");
        n = input.nextInt();
        System.out.print("r sayısı= ");
        r = input.nextInt();

        if (r <= n) {
            for (int i = 1; i <= n; i++) {
                nFak = nFak * i;
            }

            for (int j = 1; j <= r; j++) {
                rFak = rFak * j;
            }

            fark = n - r;
            for (int k = 1; k <= fark; k++) {
                farkFak = farkFak * k;
            }

            kom = nFak / (rFak * farkFak);

            System.out.println("n’ in r’ li kombinasyonu= " + kom);

        } else {
            System.out.print("n sayısı r den küçük olamaz !");
        }

    }
}
