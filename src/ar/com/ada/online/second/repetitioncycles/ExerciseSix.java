package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int counterZeros = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese los datos de la matriz: %d, %d ", i, j);
                matriz[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0){
                    counterZeros = counterZeros + 1;
                }
            }
        }
        System.out.printf("La cantidad de ceros n la matriz es de %d ",counterZeros);
    }
}
