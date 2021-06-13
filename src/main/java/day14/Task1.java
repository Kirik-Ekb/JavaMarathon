package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file = new File(path + "number.txt");

        Task1.printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String stringLine = scanner.nextLine();
            String[] stringList = stringLine.split(" ");
            if (stringList.length != 10) {
                throw new NumberFormatException();
            }
            int sum = 0;
            for (int i = 0; i < stringList.length; i++){
                sum += Integer.parseInt(stringList[i]);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный файл");
        }
    }
}
