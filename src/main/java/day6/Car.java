package day6;

public class Car {
    private int year;
    private String col;
    private String mod;

    public void setYear(int yaer) {
        this.year = yaer;
    }
    public void setCol(String col) {
        this.col = col;
    }
    public void setMod(String mod) {
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

    void info() {System.out.println("Это автомобиль");}
    int yearDifference(int inputYear) {
        return inputYear - year;
    }
}

