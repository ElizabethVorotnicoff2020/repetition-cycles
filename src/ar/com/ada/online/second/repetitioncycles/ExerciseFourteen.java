package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {

        int array[][] = new int[5][5];
        int negativeNumbers = 0;
        int diagonalZeros = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese valor de la matriz en cada pocision ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                array[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 0) {
                    negativeNumbers += 1;
                }
                if (i == j) {
                    if (array[i][j] == 0) {
                        diagonalZeros += 1;
                    }

                }

            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de elementos negativos es: " + negativeNumbers);
        System.out.println("La cantidad de 0 de la diagonal principal es: " + diagonalZeros);
    }
}
