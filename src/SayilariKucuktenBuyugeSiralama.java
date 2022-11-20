import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner oku = new Scanner(System.in);
        System.out.print("a Sayısı= ");
        a = oku.nextInt();

        System.out.print("b Sayısı= ");
        b = oku.nextInt();

        System.out.print("c Sayısı= ");
        c = oku.nextInt();

        if (b < a && c < a) {
            if (c < b) {
                System.out.print("c<b<a");
            } else {
                System.out.print("b<c<a");
            }
        }

        if (a < b && c < b) {
            if (c < a) {
                System.out.print("c<a<b");
            } else {
                System.out.print("a<c<b");
            }
        }

        if (a < c && b < c) {
            if (a < b) {
                System.out.print("a<b<c");
            } else {
                System.out.print("b<a<c");
            }
        }
    }
}
