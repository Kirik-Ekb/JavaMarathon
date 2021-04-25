package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] box = new int[12][8];
        Random rnd = new Random();
        for (int m = 0; m < box.length; m++) {
            for (int n = 0; n < box[m].length; n++) {
                box[m][n] = rnd.nextInt(50);
            }
        }
        int mStr = 0;
        int s = 0;
        int summ = 0;
        for (int m = 0; m < box.length; m++) {
            for (int n = 0; n < box[m].length; n++) {
                s = s + box[m][n];
            }
            if (summ < s) {
                summ = s;
                mStr = m;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна " + mStr);
    }
}
