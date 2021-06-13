package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File fileIn = new File(path + "shoes.csv");
        File fileOut = new File(path + "shoes.txt");

        Task1.nomenclatureZero(fileIn, fileOut);
    }

    public static void nomenclatureZero (File fileIn, File fileOut) {
        try {
            PrintWriter printWriter = new PrintWriter(fileOut);
            Scanner scanner = new Scanner(fileIn);
            while (scanner.hasNextLine()){
                String[] lineList = scanner.nextLine().split(";");
                if (Integer.parseInt(lineList[2]) == 0){
                   printWriter.println(lineList[0] + ", " + lineList[1] + ", " + lineList[2]);
                }
            }
            printWriter.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
