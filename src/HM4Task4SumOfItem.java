import java.util.Scanner;

/**
 * Программа считает сумму чисел в массиве.
 */
public class HM4Task4SumOfItem {
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
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            //считаем сумму элементов матрицы
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    sum += array[i][j];
                }
            }
            System.out.println("Сумма элементов матрицы равна " + sum);


            Scanner inAnswer = new Scanner(System.in);
            System.out.println("Хотите повторить? Введите 0 - нет, 1 - да.");
            int flag1 = inAnswer.nextInt();
            flag = (flag1 == 1);
        }
    }
}
