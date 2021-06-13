package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file = new File(path + "people.txt");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pers = line.split(" ");
                if (Integer.parseInt(pers[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person currentPerson = new Person(pers[0], Integer.parseInt(pers[1]));
                people.add(currentPerson);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
