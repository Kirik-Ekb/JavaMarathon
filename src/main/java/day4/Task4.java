package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] box = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < box.length; i++) {
            box[i] = rnd.nextInt(10000);
        }
        int num = 0;
        int summ = 0;
        int s = 0;
        for (int i = 0; i < (box.length - 2); i++) {
            for (int n = i; n < (i + 3); n++) {
                s = s + box[n];
            }
            if (summ < s) {
                summ = s;
                num = i;
            }
            s = 0;
        }
        System.out.println(summ);
        System.out.println(num);
    }
}
