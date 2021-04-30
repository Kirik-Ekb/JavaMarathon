package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("boeing",2008,85,54);
        air.setYear(2010);
        air.setLength(73);
        air.fillUp(1200);
        air.fillUp(15000);
        air.info();
    }
}
