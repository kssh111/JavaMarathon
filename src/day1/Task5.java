package day1;
/*
Повторить задание 4, но используя цикл for.
 */
public class Task5 {
    public static void main(String[] args) {
        int age = 23;

        for (int i = age; i <= 100; i += 5) {
            System.out.println("Мой возраст " + i);
        }
    }
}
