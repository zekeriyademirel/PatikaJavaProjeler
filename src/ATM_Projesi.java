import java.util.Scanner;

public class ATM_Projesi {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        Scanner input = new Scanner(System.in);
        int select;
        int balance = 15000;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Paralonız : ");
            password = input.nextLine();

            if (userName.equals("Java") && password.equals("java123")) {
                System.out.println("Merhaba, Java Bankasına Hoş Geldiniz !");

                do {
                    System.out.println("1- Para Yatırma \n" +
                            "2- Para Çekme \n" +
                            "3- Bakiye Sorgulama \n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz !");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. İyi günler !");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz !");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
