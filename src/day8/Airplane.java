package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    // "Изготовитель: _ , год выпуска: _ , длина: ..., вес: ..., объем топлива в баке: _"
    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel;
    }
}
