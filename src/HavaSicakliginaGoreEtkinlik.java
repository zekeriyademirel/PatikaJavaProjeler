import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner oku = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz= ");
        heat = oku.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinema gidebilirsiniz.");
            System.out.println("Piknik gidebilirsiniz");
        } else if (heat < 25) {
            System.out.println("Piknik gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
