import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа выводит элементы главной и побочной диагонали матрицы, а в случае, если матрица квадратная,
 * то выводится диагональная матрица.
 */
public class HM4Task5Diagonals {
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

            //проверяем является ли матрица квадратной
            if (numberOfColumns != numberOfLines){
                //узнаем количество диагональных элементов и создаем массивы для них
                int sizeResult = Math.min(numberOfColumns, numberOfLines);
                int[] mainDiagonal = new int[sizeResult];
                int[] dopDiagonal = new int[sizeResult];

                //ищем главную диагональ
                for (int i = 0; i < mainDiagonal.length; i++){
                    for (int j = 0; j < mainDiagonal.length; j++){
                        if(i == j){
                            mainDiagonal[i] = array[i][j];
                        }
                    }
                }
                System.out.print("Элементы главной диагонали: ");
                System.out.println(Arrays.toString(mainDiagonal));


                //ищем побочную диагональ
                int k = 0;
                int p = array[0].length-1;
                while (k < dopDiagonal.length && p >= 0){
                    dopDiagonal[k] = array[k][p];
                    k++;
                    p--;
                }
                System.out.print("Элементы побочной диагонали: ");
                System.out.println(Arrays.toString(dopDiagonal));
            }else{
                //инициализируем диагональные матрицы
                int[][] matrixDiagonal = new int[numberOfLines][numberOfColumns];
                int[][] dopMatrixDiagonal = new int[numberOfLines][numberOfColumns];

                //заполняем главную диагональ диагональной матрицы
                System.out.println("Диагональная матрица (главная диагональ): ");
                for (int i = 0; i < matrixDiagonal.length; i++){
                    for (int j = 0; j < matrixDiagonal.length; j++){
                        if(i == j){
                            matrixDiagonal[i][j] = array[i][j];
                        }
                        System.out.print(matrixDiagonal[i][j] + "\t");
                    }
                    System.out.println();
                }

                //заполняем побочную диагональ диагональной матрицы
                System.out.println("Диагональная матрица (побочная диагональ): ");
                for (int i = 0; i < dopMatrixDiagonal.length; i++){
                    for (int j = 0; j < dopMatrixDiagonal.length; j++){
                        if((i + j) == dopMatrixDiagonal.length-1){
                            dopMatrixDiagonal[i][j] = array[i][j];
                        }
                        System.out.print(dopMatrixDiagonal[i][j] + "\t");
                    }
                    System.out.println();
                }
            }

            Scanner inAnswer = new Scanner(System.in);
            System.out.println("Хотите повторить? Введите 0 - нет, 1 - да.");
            int flag1 = inAnswer.nextInt();
            flag = (flag1 == 1);
        }
    }
}

