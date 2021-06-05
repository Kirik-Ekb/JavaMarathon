package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name = "";
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", bandMembers=" + members +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String member: a.getMembers()){
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(getMembers());
    }
}

