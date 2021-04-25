package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        int a = 5;
        while (a != 0) {
            a--;
            double d1 = del.nextDouble();
            double d2 = del.nextDouble();
            if (d2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(d1 / d2);
        }
    }
}
