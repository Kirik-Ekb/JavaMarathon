package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        if (b < a) {
            System.out.println("Некорректный ввод");
        }
        while (a < b) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}