package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand musicBand2 = new MusicBand("ABBA", 1972);
        MusicBand musicBand3 = new MusicBand("Кино", 1989);
        MusicBand musicBand4 = new MusicBand("Queen", 1970);
        MusicBand musicBand5 = new MusicBand("Rammstein", 1994);
        MusicBand musicBand6 = new MusicBand("Metallica", 1981);
        MusicBand musicBand7 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand musicBand8 = new MusicBand("Hollywood Vampires", 2015);
        MusicBand musicBand9 = new MusicBand("Linkin Park", 2000);
        MusicBand musicBand10 = new MusicBand("Coldplay", 2000);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        Collections.shuffle(musicBands); //перемешивание списка

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> musicBands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand mb : musicBands) {
            if (mb.getYear() > 2000) {
                groupsAfter2000.add(mb);
            }
        }
        return groupsAfter2000;
    }
}
