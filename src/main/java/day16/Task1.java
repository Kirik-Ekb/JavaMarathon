package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file = new File(path + "number.txt");

        Task1.printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            String[] numberList = scanner.nextLine().split(" ");
            scanner.close();
            for (String number : numberList) {
                sum += Integer.parseInt(number);
            }
            Double avgDouble = sum / (double)numberList.length;
            System.out.printf(avgDouble + " --> %.3f", avgDouble);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

