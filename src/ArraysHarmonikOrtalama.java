public class ArraysHarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {1,6,8,4};
        double sum = 0.0;
        for (double v : list) {
            sum += 1 / v;
        }
        double harOrt = list.length / sum;

        System.out.println("Harmonik Ortalama = " + harOrt);
    }
}
