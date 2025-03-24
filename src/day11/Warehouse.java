package day11;

public class Warehouse implements Worker {
    private int countOrder;
    private int balance;

    Warehouse(){}
    Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }
}


