package day6;

public class Motorbike {
    private int year;
    private String col;
    private String mod;

    public Motorbike() {
        year = 0;
        col = "не покрашен";
        mod = "ручная сборка";
    }

    public Motorbike(int year, String col, String mod) {
        this.year = year;
        this.col = col;
        this.mod = mod;
    }

    public int getYear() {
        return year;
    }
    public String getCol() {
        return col;
    }
    public String getMod() {
        return mod;
    }

    void info() {System.out.println("Это мотоцикл");}
    int yearDifference(int inputYear) {
        int y = inputYear - year;
        if (y < 0) {
            System.out.println("Введен некорректный год");
            return 0;
        }
        return y;
    }
}
