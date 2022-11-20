import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int x,y,select;

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz= ");
        x=oku.nextInt();
        System.out.print("2.Sayıyı giriniz= ");
        y=oku.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz= ");
        select=oku.nextInt();

        switch (select){
            case 1 :
                System.out.print("Toplam= " + (x+y));
                break;
            case 2 :
                System.out.print("Çıkarma= " +(x-y));
                break;
            case 3:
                System.out.print("Çarpma= " +(x*y));
                break;
            case 4 :
                if (y!=0){
                    System.out.print("Bölme= " + (x / y));
                    break;
                }else {
                    System.out.print("Bir sayı sfıra(0) bölünemez !");
                    break;
                }
            default:
                System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz !");
        }
    }
}
