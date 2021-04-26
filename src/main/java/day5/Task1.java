package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myAuto = new Car();
        myAuto.setYear(1991);
        myAuto.setCol("red");
        myAuto.setMod("picap");
        System.out.println("год выпуска " + myAuto.getYear());
        System.out.println("цвет " + myAuto.getCol());
        System.out.println("модель " + myAuto.getMod());
    }
}
