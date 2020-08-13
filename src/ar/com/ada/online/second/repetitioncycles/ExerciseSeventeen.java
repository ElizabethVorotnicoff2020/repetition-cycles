package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        int[][] matrixRowsColumns = {
                {1, 1, 0, 4, 2, 1},
                {2, 2, 2, 9, 1, 0},
                {3, -3, 3, 1, 2,2},
                {2, 2, 2, 5, 2, 1},
                {3, 3, 3, 7, 2, 1},
                {2, 2, 2, 3, 4, 3},
                {3, 3, 3, 2, 3, 1},
                {2, 2, 2, 3, 2, 5}};


        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matrixRowsColumns.length; i++) {
            for (int j = 0; j < matrixRowsColumns[i].length; j++) {
                if (matrixRowsColumns[i][j]< 0){
                    System.out.printf("en la fila %d, columna %d hay valores negativos: %d", i, j, matrixRowsColumns[i][j]);
                }
            }
        }
    }
}

