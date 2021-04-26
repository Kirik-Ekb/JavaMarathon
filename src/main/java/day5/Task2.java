package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myMoto = new Motorbike(2015, "green", "krosse");
        System.out.println("год выпуска " + myMoto.getYear());
        System.out.println("цвет " + myMoto.getCol());
        System.out.println("модель " + myMoto.getMod());

    }
}
