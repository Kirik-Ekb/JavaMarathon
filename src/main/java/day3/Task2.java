package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        while (true) {
            double d1 = del.nextDouble();
            double d2 = del.nextDouble();
            if (d2 == 0) {
                break;
            }
            System.out.println(d1 / d2);
        }
    }
}
