package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("BMW");
        auto.add("Mercedes");
        auto.add("Ford");
        auto.add("Toyota");
        auto.add("Honda");

        System.out.println(auto.toString());

        auto.add((int) (Math.floor(auto.size() / 2)), "Suzuki");
        auto.remove(0);

        System.out.println(auto.toString());
    }
}
