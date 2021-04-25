package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] box = new int[100];
        for (int i = 0; i < box.length; i++) {
            box[i] = rnd.nextInt(1000);
        }
        int max = 0;
        int min = 1000;
        int number0 = 0;
        int sum0 = 0;
        for (int number : box) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 10 == 0) {
                number0++;
                sum0 = sum0 + number;
            }
        }
        System.out.println(Arrays.toString(box));
        System.out.println("наибольший элемент массива "+max);
        System.out.println("наименьший элемент массива "+min);
        System.out.println("количество элементов массива, оканчивающихся на 0 "+number0);
        System.out.println("сумма элементов массива, оканчивающихся на 0 "+sum0);
    }
}
