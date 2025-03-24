package day4;
/*
4 Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
максимальной суммой выведите значение суммы и индекс первого элемента тройки.
Пример:
*Для простоты пример показан на массиве размера 10
[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
Тройка с максимальной суммой: [2789, 4, 8742]
Вывод в консоль:
11535
5
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // int[] array = new int[100];
        int[] array = {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};

        Random random = new Random();

        /*for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }*/

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}
