package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        int higherTurnover = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese el valor para la matriz en la posicion %d, %d ", i, j);
                matriz[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > higherTurnover) {
                    higherTurnover = matriz[i][j];
                }
            }
        }
        System.out.println("la mayor venta fue " + higherTurnover);
    }
}
