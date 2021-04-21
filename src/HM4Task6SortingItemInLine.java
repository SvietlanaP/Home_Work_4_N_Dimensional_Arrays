import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа сортирует элементы строк по возрастанию
 */
public class HM4Task6SortingItemInLine {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag == true){
            System.out.println("Сейчас Вам предложат ввести размеры матрицы. Обратите внимание: надо вводить целые положительные числа, иначе программа закончит свое выполнение.");

            Scanner in1 = new Scanner(System.in);
            System.out.println("Введите количество строк матрицы:");
            int numberOfLines = in1.nextInt();
            if (numberOfLines <= 0) {
                break;
            }

            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите количество столбцов матрицы:");
            int numberOfColumns = in2.nextInt();
            if (numberOfColumns <= 0) {
                break;
            }

            // создаем матрицы
            int[][] array = new int[numberOfLines][numberOfColumns];


            System.out.println("Исходная матрица:");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    array[i][j] = (int) (Math.random() * 50);
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            //сортируем элементы
            for (int i = 0; i < array.length; i++){
                Arrays.sort(array[i]);
            }

            System.out.println("Отсортированная матрица:");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            Scanner inAnswer = new Scanner(System.in);
            System.out.println("Хотите повторить? Введите 0 - нет, 1 - да.");
            int flag1 = inAnswer.nextInt();
            flag = (flag1 == 1);
        }
    }
}
