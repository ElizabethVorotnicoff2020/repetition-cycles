package ar.com.ada.online.second.repetitioncycles;

//Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento
//negativo. Realice un algoritmo que indique la posición que ese elemento ocupa en el
//arreglo (en la fila y la columna en la que se encuentra ese elemento). Represéntelo.
public class ExcerciseEight {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3},
                {2, 5},
                {-2, 6},
                {0, 1},
                {9, -4}
        };
        int row = 0, column = 0;

        outer: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    row = i;
                    column = j;
                    break outer;
                }
            }
        }
        if (matrix[row][column] >= 0) {
            System.out.println("No hay un elemento negativo en la matriz");
        } else {
            System.out.printf("En numero negativo esta en la fila %d columna %d y su valor es %d", row, column, matrix[row][column]);
        }
    }
}
