package day9.Task2;

public abstract class Figure {
    protected String col = "";

    public Figure(String col) {
        this.col = col;
    }

    public String getCol() {
        return col;
    }

    public abstract double area();

    public abstract double perimeter();

}
