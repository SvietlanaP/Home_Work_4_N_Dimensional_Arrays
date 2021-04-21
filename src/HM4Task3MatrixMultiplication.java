import java.util.Scanner;

/**
 * Программа умножает матрицы
 */
public class HM4Task3MatrixMultiplication {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag == true){
            //вводим размер матриц
            System.out.println("Сейчас Вам предложат ввести размеры матрицы. Обратите внимание: надо вводить целые положительные числа, иначе программа закончит свое выполнение.");

            Scanner in1 = new Scanner(System.in);
            System.out.println("Введите количество строк первой матрицы:");
            int numberOfLines1 = in1.nextInt();
            if (numberOfLines1 <= 0) {
                break;
            }

            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите количество столбцов первой матрицы (это же число будет и кличеством строк второй матрицы):");
            int numberOfColumns1 = in2.nextInt();
            if (numberOfColumns1 <= 0) {
                break;
            }

            Scanner in3 = new Scanner(System.in);
            System.out.println("Введите количество столбцов второй матрицы:");
            int numberOfColumns2 = in3.nextInt();
            if (numberOfColumns2 <= 0) {
                break;
            }

            // создаем матрицы
            int[][] array1 = new int[numberOfLines1][numberOfColumns1];
            int[][] array2 = new int[numberOfColumns1][numberOfColumns2];
            int[][] resultArray = new int[numberOfLines1][numberOfColumns2];

            System.out.println("Первая матрица:");
            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array1[i].length; j++){
                    array1[i][j] = (int) (Math.random() * 10);
                    System.out.print(array1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Вторая матрица:");
            for (int i = 0; i < array2.length; i++){
                for (int j = 0; j < array2[i].length; j++){
                    array2[i][j] = (int) (Math.random() * 10);
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }

            //умножаем матрицы
            for (int i = 0; i < array1.length; i++){
                for (int k = 0; k < resultArray[0].length; k++){
                    for (int j = 0; j < array1[i].length; j++){
                        resultArray[i][k] += array1[i][j] * array2[j][k];
                    }
                }
            }

            System.out.println("Итоговая матрица:");
            for (int i = 0; i < resultArray.length; i++){
                for (int j = 0; j < resultArray[i].length; j++){
                    System.out.print(resultArray[i][j] + " ");
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
