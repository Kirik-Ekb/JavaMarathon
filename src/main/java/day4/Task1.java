package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Random randomNumber = new Random();
        int n = number.nextInt();
        int[] tbl = new int[n];
        int n8 = 0;
        int n1 = 0;
        int nCh = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            tbl[i] = randomNumber.nextInt(11);
            if (tbl[i] > 8) {
                n8++;
            }
            if (tbl[i] % 2 != 0) {
                nCh++;
                if (tbl[i] == 1) {
                    n1++;
                }
            }
            sum = sum + tbl[i];
        }
        System.out.println(Arrays.toString(tbl));
        System.out.println("Длина массива " + tbl.length);
        System.out.println("Количестве чисел больше 8 " + n8);
        System.out.println("Количестве чисел равных 1 " + n1);
        System.out.println("Количестве четных чисел " + (tbl.length - nCh));
        System.out.println("Количестве нечетных чисел " + nCh);
        System.out.println("Сумме всех элементов массива " + sum);
    }
}
