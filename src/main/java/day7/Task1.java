package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Jet", 2017, 84, 53);
        Airplane air2 = new Airplane("Boeing", 2015, 88, 62);
        Airplane.compareAirplanes(air1, air2);
    }
}