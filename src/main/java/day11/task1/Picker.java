package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        } else {
            salary += 70000;
            isPayed = true;
        }
    }
}

