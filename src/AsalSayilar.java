public class AsalSayilar {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

