package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file = new File(path + "people.txt");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> nameAge = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                nameAge.add(line);
            }
            return nameAge;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
        }
        return null;
    }
}
