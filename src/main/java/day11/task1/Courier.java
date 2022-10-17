package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else {
            salary += 50000;
            isPayed = true;
        }
    }
}
