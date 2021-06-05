package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Агнета Фельтског");
        members1.add("Бьорн Ульвеус");
        members1.add("Анни-Фрид Лингстад");
        members1.add("Бенни Андерссон");

        MusicBand musicBand1 = new MusicBand("ABBA", 1970, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Пол Маккартни");
        members2.add("Джон Леннон");
        members2.add("Джордж Харрисон");
        members2.add("Ринго Старр");

        MusicBand musicBand2 = new MusicBand("The Beatles", 1960, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
