package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int TASK_SALARY = 100;
    private static final int BONUS = 50000;
    private static final int AMOUNT_OF_ORDERS = 10000;
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
        salary += TASK_SALARY;
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < AMOUNT_OF_ORDERS) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else {
            salary += BONUS;
            isPayed = true;
        }
    }
}
