package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private Warehouse wh;
    private boolean isPayed = false;

    public Courier(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "salary = " + salary + ", isPayed " + isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        wh.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (wh.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary = salary + 50000;
        isPayed = true;
    }

}

