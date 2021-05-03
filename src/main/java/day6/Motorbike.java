package day6;

public class Motorbike {
    private int year;
    private String col;
    private String mod;

    public Motorbike(String mod, String col, int year) {
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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
