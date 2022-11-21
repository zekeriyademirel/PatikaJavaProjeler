import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;

        Scanner oku=new Scanner(System.in);
        System.out.print("Doğduğunuz ay= ");
        month=oku.nextInt();

        System.out.print("Doğduğunuz gün= ");
        day=oku.nextInt();

       if (month==1){
           if (1<=day && day<=31){
               if (day<22){
                   burc="Oğlak";
               }else {
                   burc="Kova";
               }
           }else {
               isError = true;
           }
       }

        if (month==2){
            if (1<=day && day<=28){
                if (day<20){
                    burc="Kova";
                }else {
                    burc="Balık";
                }
            }else {
                isError = true;
            }
        }

        if (month==3){
            if (1<=day && day<=31){
                if (day<21){
                    burc="Balık";
                }else {
                    burc="Koç";
                }
            }else {
                isError = true;
            }
        }

        if (month==4){
            if (1<=day && day<=30){
                if (day<21){
                    burc="Koç";
                }else {
                    burc="Boğa";
                }
            }else {
                isError = true;
            }
        }

        if (month==5){
            if (1<=day && day<=31){
                if (day<22){
                    burc="Boğa";
                }else {
                    burc="İkizler";
                }
            }else {
                isError = true;
            }
        }

        if (month==6){
            if (1<=day && day<=30){
                if (day<23){
                    burc="İkizler";
                }else {
                    burc="Yengeç";
                }
            }else {
                isError = true;
            }
        }

        if (month==7){
            if (1<=day && day<=31){
                if (day<23){
                    burc="Yengeç";
                }else {
                    burc="Aslan";
                }
            }else {
                isError = true;
            }
        }

        if (month==8){
            if (1<=day && day<=31){
                if (day<23){
                    burc="Aslan";
                }else {
                    burc="Başak";
                }
            }else {
                isError = true;
            }
        }

        if (month==9){
            if (1<=day && day<=30){
                if (day<23){
                    burc="Başak";
                }else {
                    burc="Terazi";
                }
            }else {
                isError = true;
            }
        }

        if (month==10){
            if (1<=day && day<=31){
                if (day<23){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }else {
                isError = true;
            }
        }

        if (month==11){
            if (1<=day && day<=30){
                if (day<23){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else {
                isError = true;
            }
        }

        if (month==12){
            if (1<=day && day<=31){
                if (day<23){
                    burc="Yay";
                }else {
                    burc="Oğlak";
                }
            }else {
                isError = true;
            }
        }

       if (isError){
           System.out.print("Hatalı giriş yaptınız, tekrar deneyiniz.");
       }else {
           System.out.print("Burcunuz= " + burc);
       }
    }
}
