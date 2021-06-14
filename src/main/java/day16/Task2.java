package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file1 = new File(path + "file1.txt");
        File file2 = new File(path + "file2.txt");
        PrintWriter printWriterFile1 = new PrintWriter(file1);
        Random rnd = new Random();

        for (int i = 0; i < 1000; i++) {
            printWriterFile1.println(rnd.nextInt(100));
        }
        printWriterFile1.close();

        Scanner scanner = new Scanner(file1);
        PrintWriter printWriterFile2 = new PrintWriter(file2);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;
            if (count == 20) {
                printWriterFile2.println(sum / 20.0);
                count = 0;
                sum = 0;
            }
        }
        printWriterFile2.close();
        scanner.close();

        Task2.printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
        }
        scanner.close();
        System.out.println((int)sum);
    }
}

