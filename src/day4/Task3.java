package day4;
/*3 Заполнить двумерный массив (матрицу) случайными числами от 0 до 50 Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 // сумма - 18
1 2 5 6 2 // сумма - 16
3 4 9 6 4 // сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
*/
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int maxSumIdx = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }

        System.out.println(maxSumIdx);
    }
}
