package ar.com.ada.online.second.repetitioncycles;

public class ExcerciseEight {
    public static void main(String[] args) {
        int [][] matrix = {
            {1, 3},
            {2, 5},
            {-2, 6},
            {0, 1},
            {9, 4}};
        int lesser = matrix[0][0];
        int sum = 0;
        int numberNegative = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]< lesser){
                    lesser = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]< lesser){
                    lesser = matrix[i][j];
                }
                if (i < 2){
                    sum = sum + matrix[i][j];
                }
                if (j >= 0 && j< 1){
                    if (matrix[i][j]< 0) {
                        numberNegative = numberNegative + 1;
                    }
                }
            }
        }
        System.out.printf("El menor numero es: %d\n" , lesser);
        System.out.printf("La suma de las primeras 2 filas es de: %d\n", sum);
        System.out.printf("El total de los neumeros negativos es de: %d\n", numberNegative);
    }
}
