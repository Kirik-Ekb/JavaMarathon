package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPicketOrders() {
        countPickedOrders = countPickedOrders + 1;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders = countDeliveredOrders + 1;
    }

    public String toString() {
        return "countPickedOrders  " + countPickedOrders + ", " + "countDeliveredOrders " + countDeliveredOrders;
    }
}
