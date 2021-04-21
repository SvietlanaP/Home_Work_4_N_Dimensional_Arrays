import java.util.Arrays;

/**
 * Программа раскрашивает шахматную доску
 * Приведено 2 варианта реализации:
 * 1. заполнением первых 2-х строк и последующим их копированием.
 * 2. заполнение каждого элемента матрицы с учетом индекса.
 */
public class HM4Task2ChessBoard {
    public static void main(String[] args) {
       int n = 8;
       char[][] paintingBoard = new char[n][n];

        System.out.println("Первый способ.");
       // расскашиваем первые 2 строки
        // что быстрее работает цикл или присваевание
       for (int i = 0; i < 2; i++){
           for (int j = 0; j < paintingBoard[i].length; j++){
               if(i%2 == 0){
                   if (j%2 == 0){
                       paintingBoard[i][j] = 'W';
                   } else {
                       paintingBoard[i][j] = 'B';
                   }
               } else{
                   if (j%2 == 0){
                       paintingBoard[i][j] = 'B';
                   } else {
                       paintingBoard[i][j] = 'W';
                   }
               }
           }
       }

       //расскрашиваем остальную часть
        for (int i = 2; i < paintingBoard.length; i++){
            if (i%2 == 0){
                paintingBoard[i] = paintingBoard[0];
            } else {
                paintingBoard[i] = paintingBoard[1];
            }
        }

        //печатаем матрицу
        for (int i = 0; i < paintingBoard.length; i++){
            for (int j = 0; j < paintingBoard[i].length; j++){
                System.out.print(paintingBoard[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Второй способ.");
        for (int i = 0; i < paintingBoard.length; i++){
            for (int j = 0; j < paintingBoard.length; j++){
                if ((i + j)%2 == 0){
                    paintingBoard[i][j] = 'W';
                }else {
                    paintingBoard[i][j] = 'B';
                }
            }
        }
        //печать
        for (int i = 0; i < paintingBoard.length; i++){
            for (int j = 0; j < paintingBoard[i].length; j++){
                System.out.print(paintingBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
