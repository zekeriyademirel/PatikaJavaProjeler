import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {
    static int UsluSayi(int a, int b) {

        if (a != 0 && b == 0) {
            return 1;
        } else {
            if (a == 1) {
                return 1;
            } else {
                return a * UsluSayi(a, b - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısı= ");
        int a = scan.nextInt();
        System.out.print("Us sayısı= ");
        int b = scan.nextInt();

        System.out.print(UsluSayi(a, b));

    }

}

