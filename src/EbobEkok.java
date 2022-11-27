import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, k = 1, ebob = 1, ekok = 1, enk, enb;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayı= ");
        n1 = input.nextInt();

        System.out.print("İkinci sayı= ");
        n2 = input.nextInt();

        if (n1 <= n2) {
            enk = n1;
            enb = n2;
        } else {
            enk = n2;
            enb = n1;
        }

        while (k <= enk) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
            }
            k++;
        }
        System.out.println("EBOB= " + ebob);

        while (enb <= (n1 * n2)) {
            if (enb % n1 == 0 && enb % n2 == 0) {
                ekok = enb;
                break;
            }
            enb++;
        }
        System.out.println("EKOK= " + ekok);

    }

}

