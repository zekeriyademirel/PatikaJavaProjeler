
   import java.util.Scanner;

   public class ManavKasaProgram {
    public static void main(String[] args) {
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double armut=2.14, elma=3.67,domates=1.11,muz=0.95,patlican=5, total;

        Scanner oku=new Scanner(System.in);
        System.out.print("Armut kac kilo= ");
        armutKg=oku.nextInt();
        System.out.print("Elma kac kilo= ");
        elmaKg=oku.nextInt();
        System.out.print("Domates kac kilo= ");
        domatesKg=oku.nextInt();
        System.out.print("Muz kac kilo= ");
        muzKg=oku.nextInt();
        System.out.print("Patlıcan kac kilo= ");
        patlicanKg=oku.nextInt();

        total=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);

        System.out.println("Toplam Tutar = " + total);

    }

}
