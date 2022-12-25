public class PalindromikKelimler {

    static boolean isPalindromik(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindromik("abba"));
    }
}
