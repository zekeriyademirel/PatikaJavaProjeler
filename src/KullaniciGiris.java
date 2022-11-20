
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz= ");
        userName = oku.nextLine();

        System.out.print("Şifrenizi giriniz= ");
        password = oku.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yalnış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? \n1-Evet\n2-Hayır\nGiriniz= ");
            select = oku.nextLine();

            if (select.equals("Evet")) {
                System.out.print("Yeni şifreyi giriniz= ");
                newPassword = oku.nextLine();

                if (newPassword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
            }else {
                System.out.print("Lütfen tekrar deneyiniz !");
            }
        }
    }
}
