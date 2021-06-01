package day11.task1;

public class Picker implements Worker {
    private Warehouse wh;
    private int salary = 0;
    private boolean isPayed = false;

    public Picker(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        wh.incrementPicketOrders();
    }

    public String toString() {
        return "salary=" + salary + ", isPayed=" + isPayed;
    }

    @Override
    public void bonus() {
        if (wh.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        isPayed = true;
        salary = salary + 70000;
    }
}

