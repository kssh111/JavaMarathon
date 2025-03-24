package day6;
/*
1 Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
в пакет текущего дня.
В классах Автомобиль и Мотоцикл реализовать два метода:
info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference() - принимает на вход число (год), и возвращает разницу между
переданным годом и годом выпуска транспортного средства
*/
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setYear(2000);
        car.setModel("audi");
        Motorbike motorbike = new Motorbike(2018,"kawasaki","blue");


        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));



    }
}


