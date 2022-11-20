import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, muzik;

        Scanner oku = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz= ");
        mat = oku.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }

        System.out.print("Fizik notunuzu giriniz= ");
        fizik = oku.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }

        System.out.print("Kimya notunuzu giriniz= ");
        kimya = oku.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }

        System.out.print("Türkçe notunuzu giriniz= ");
        turkce = oku.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }

        System.out.print("Müzik notunuzu giriniz= ");
        muzik = oku.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        double ort = (mat + fizik + kimya + turkce + muzik) / 5;

        if (ort < 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere !");
        } else {
            System.out.println("Sınıfı geçtiniz. Tebrikler... ");
        }

        System.out.println("Not ortalamanız= " + ort);

    }
}
