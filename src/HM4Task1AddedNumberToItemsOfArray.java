import java.util.Scanner;

/**
 * Программа ко всем элементам трехмерного массива добавляет введенное пользователем число
 */

public class HM4Task1AddedNumberToItemsOfArray {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag == true){
            System.out.println("Исходный массив:");
            int n = 2, m = 3, p = 4; // size of array 3D
            int[][][] array = new int[n][m][p];

            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    for (int k = 0; k < array[i][j].length; k++){
                        array[i][j][k] = (int) (Math.random() * 100);
                        System.out.print(array[i][j][k] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }

            //вводим число, которое надо добавить
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число, которое надо прибавить к элементам массива:");
            int numb = in.nextInt();

            // прибавляем число
            System.out.println("Результатирующий массив:");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    for (int k = 0; k < array[i][j].length; k++){
                        array[i][j][k] += numb;
                        System.out.print(array[i][j][k] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }

            Scanner inAnswer = new Scanner(System.in);
            System.out.println("Хотите повторить? Введите 0 - нет, 1 - да.");
            int flag1 = inAnswer.nextInt();
            flag = (flag1 == 1);
        }
    }
}
