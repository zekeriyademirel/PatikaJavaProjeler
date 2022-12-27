public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] matris = {{2, 3, 4}, {5, 6, 4}};
        int[][] matrisTranspoz = new int[matris.length + 1][matris.length];

        System.out.println("Matris : ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transpoze : ");

        for (int i = 0; i < matrisTranspoz.length; i++) {
            for (int j = 0; j < matrisTranspoz[i].length; j++) {
                matrisTranspoz[i][j] = matris[j][i];
            }
        }

        for (int i = 0; i < matrisTranspoz.length; i++) {
            for (int j = 0; j < matrisTranspoz[i].length; j++) {
                System.out.print(matrisTranspoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
