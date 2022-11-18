import java.util.Scanner;

public class KDV_Hesap_Programi {
    public static void main(String[] args) {
        double tutar, kdvOranYuzdeSekiz = 0.08, kdvOranYuzdeOnSekiz=0.18,
                toplam,TutarYuzdeSekiz,TutarYuzdeOnSekiz;

        Scanner oku=new Scanner(System.in);
        System.out.print("Ucret tutarını giriniz= ");
        tutar= oku.nextDouble();

       TutarYuzdeSekiz=tutar+tutar*kdvOranYuzdeSekiz;
       TutarYuzdeOnSekiz= tutar+tutar*kdvOranYuzdeOnSekiz;

        toplam= tutar >=1000 ? TutarYuzdeSekiz : TutarYuzdeOnSekiz;

        System.out.println("KDV' siz Tutar = " + tutar);
        System.out.println("Toplam KDV' li Tutar = " + toplam);
    }
}
