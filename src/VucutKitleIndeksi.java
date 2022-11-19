
 import java.util.Scanner;

 public class VucutKitleIndeksi {
    public static void main(String[] args) {

        int kg;
        double boy, vucutKitleIndex;

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz= ");
        kg=oku.nextInt();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz= ");
        boy=oku.nextDouble();

        vucutKitleIndex= kg /(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz = " + vucutKitleIndex);


    }
}
