import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        double a,b,c,u,alan;

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Kenarı giriniz= ");
        a=oku.nextDouble();

        System.out.print("2.Kenarı giriniz= ");
        b=oku.nextDouble();

        System.out.print("3.Kenarı giriniz= ");
        c=oku.nextDouble();

        u=(a+b+c)/2;

        alan=Math.sqrt(u * (u - a)*(u - b) * (u-c));

        System.out.println("Ucgenin alanı = " + alan);

    }
}
