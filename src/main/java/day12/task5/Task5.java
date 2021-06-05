package day12.task5;

import java.util.ArrayList;
import java.util.List;

import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Агнета Фельтског", 23));
        members1.add(new MusicArtist("Бьорн Ульвеус", 25));
        members1.add(new MusicArtist("Анни-Фрид Лингстад", 23));
        members1.add(new MusicArtist("Бенни Андерссон", 27));

        MusicBand musicBand1 = new MusicBand("ABBA", 1970, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Пол Маккартни", 30));
        members2.add(new MusicArtist("Джон Леннон", 29));
        members2.add(new MusicArtist("Джордж Харрисон", 31));
        members2.add(new MusicArtist("Ринго Старр", 28));

        MusicBand musicBand2 = new MusicBand("The Beatles", 1960, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}

