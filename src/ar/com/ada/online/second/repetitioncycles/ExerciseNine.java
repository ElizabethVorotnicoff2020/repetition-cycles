package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        int rowA;
        int rowB;
        int columnA;
        int columnB;
        int[][] matrixI;
        int[][] matrixII;
        int[][] matrixIII;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas de la Matriz 1: ");
        rowA = keyboard.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matriz 1: ");
        columnA = keyboard.nextInt();
        System.out.println("Ingrese la cantidad de filas de la Matriz 2: ");
        rowB = keyboard.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matrixz 2: ");
        columnB = keyboard.nextInt();

        matrixI = new int[rowA][columnA];
        matrixII = new int[rowB][columnB];
        matrixIII = new int[rowA][columnA];


        if (matrixI.length != matrixII.length) {
            System.out.println("Estas matrices no se pueden sumar porque son distintas");
        }

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
            System.out.print("Ingrese el numero de la matriz 1, fila: " + i + ", columna: " + j + ": ");
            matrixI[i][j] = keyboard.nextInt();
        }
    }
        for (int i = 0; i < rowB; i++){
            for (int j = 0; j < columnB; j++) {
            System.out.print("Ingrese el numero de la matriz 2, fila: " + i + ", columna: " + j + ": ");
            matrixII[i][j] = keyboard.nextInt();
    }
}
        for (int i = 0; i <rowA; i++){
            for (int j = 0; j <columnA; j++){
                matrixIII[i][j] = matrixI[i][j] + matrixII[i][j];
            }
        }
        System.out.println("Inprimiendo valore: ");
        for (int i = 0; i <rowA; i++){
            for (int j = 0; j <columnA; j++){
                System.out.print(matrixIII[i][j]);
                System.out.printf(" | ");
            }
            System.out.println();
        }

    }
}


