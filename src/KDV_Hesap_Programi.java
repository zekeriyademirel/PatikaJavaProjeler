import java.util.Scanner;

public class KDV_Hesap_Programi {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.08, kdvOran2=0.18, toplam;

        Scanner oku=new Scanner(System.in);
        System.out.print("Ucret tutarını giriniz= ");
        tutar= oku.nextDouble();

        toplam= tutar >=1000 ? (tutar+tutar*kdvOran1) : (tutar+tutar*kdvOran2);

        System.out.println("KDV' siz Tutar = " + tutar);
        System.out.println("Toplam KDV' li Tutar = " + toplam);
    }
}
