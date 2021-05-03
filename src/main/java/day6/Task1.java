package day6;

public class Task1 {
    public static void main(String[] args) {

        Car myAuto = new Car();
        myAuto.setYear(2018);
        myAuto.setCol("blue");
        myAuto.setMod("porshe");

        Motorbike myMoto = new Motorbike("honda","black",2000);

        myAuto.info();
        myMoto.info();

        System.out.println(myAuto.yearDifference(2021));
        System.out.println(myMoto.yearDifference(2021));
    }
}
