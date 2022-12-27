import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(list);
        int count = 0;
        int tempNumber = list[0];

        for (int i = 0; i < list.length; i++) {
            if (i == 0 || tempNumber != list[i]) {
                for (int arr : list) {
                    if (arr == list[i]) {
                        count++;
                        tempNumber = list[i];
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                count = 0;
            }
        }
    }
}
