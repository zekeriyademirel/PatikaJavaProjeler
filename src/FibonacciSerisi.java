import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int a = -1, b = 1, c, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısı= ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
