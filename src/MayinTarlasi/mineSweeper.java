package MayinTarlasi;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class mineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    int rndRowNumber;
    int rndColNumber;
    int row;
    int col;
    String[][] gameMap;
    String[][] keyMap;

    mineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.gameMap = new String[rowNumber][colNumber];
        this.keyMap = new String[rowNumber][colNumber];
        this.mineNumber = (rowNumber * colNumber) / 4;
    }
    public void map() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] = "-");
            }
            System.out.println();
        }
    }
    public void produceMine() {
        Random rnd = new Random();

        for (int i = 0; i < mineNumber; i++) {
            rndRowNumber = rnd.nextInt(rowNumber);
            rndColNumber = rnd.nextInt(colNumber);
            if (!Objects.equals(this.keyMap[rndRowNumber][rndColNumber], "*")) {
                this.keyMap[rndRowNumber][rndColNumber] = "*";
            } else {
                i--;
            }
        }

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (!Objects.equals(this.keyMap[i][j], "*")) {
                    this.keyMap[i][j] = "-";
                }
            }
        }
    }

    void printKeyMap() {
        produceMine();
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(this.keyMap[i][j]);
            }
            System.out.println();
        }
    }

    void run() {
        System.out.println("Mayınların Konumu : ");
        printKeyMap();
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        map();
        Scanner input = new Scanner(System.in);
        int right = (this.rowNumber * this.colNumber) - this.mineNumber;

        while (right > 0) {
            System.out.print("Satır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            col = input.nextInt();

            if ((row < 0 || row >= this.rowNumber) || (col < 0 || col >= this.colNumber)) {
                System.out.println("Hatalı giriş yaptınız indis numarasını tekrar giriniz ! ");
                continue;
            }
            if (keyMap[row][col].equals("*")){
                System.out.println("Oyunu kaybettiniz !!!");
                break;
            }else {
                if (!this.keyMap[row][col].equals("-")){
                    System.out.println("Bu hamleyi yaptınız !");
                }else {
                    int point=0;
                    int lowRow = (row - 1), heighRow = (row + 1);
                    int lowCol = (col - 1), heighCol = (col + 1);
                    if ( (lowRow < 0) ){
                        lowRow = 0;
                    }
                    if (lowCol < 0){
                        lowCol = 0;
                    }
                    if(heighRow >= rowNumber){
                        heighRow = row;
                    }
                    if (heighCol >= colNumber){
                        heighCol = col;
                    }
                    for(int i = lowRow; i <= heighRow; i++){
                        for (int j = lowCol; j<= heighCol; j++){
                            if(this.keyMap[i][j].equals("*")){
                                point++;
                            }
                        }
                    }
                    String pointCounter =Integer.toString(point);
                    this.gameMap[row][col]=pointCounter;
                    right--;

                    for (String[] strings : gameMap) {
                        for (String string : strings) {
                            System.out.print(string);
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------");
                }
            }
        }
        if (right==0){
            System.out.println("Tebrikler oyunu kazandınız !!!");
        }
    }
}
