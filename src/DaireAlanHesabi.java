
    import java.util.Scanner;

     public class DaireAlanHesabi {
     public static void main(String[] args) {
        int r, derece;
        double alan, pi=3.14;

        Scanner oku=new Scanner(System.in);
        System.out.print("Dairenin yarıcapını giriniz= ");
        r=oku.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz= ");
        derece=oku.nextInt();

        alan=(pi*r*r*derece)/360;

        System.out.println("Daire diliminin alanı= " +alan);


    }
}
