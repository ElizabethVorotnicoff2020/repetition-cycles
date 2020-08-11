package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExcerciseTwo {
    public static void main(String[] args) {
        int [] arrayA;
        int [] arrayB;
        int [] arrayC;
        int sizeArray;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los arreglos: ");
        sizeArray = keyboard.nextInt();

        arrayA = new int[sizeArray];
        arrayB = new int[sizeArray];
        arrayC = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Ingrese el valor para el arreglo A en la posicion " + i + ": ");
            arrayA[i] = keyboard.nextInt();
        }

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Ingrese el valor para el arreglo B en la posicion " + i + ": ");
            arrayB[i] = keyboard.nextInt();
        }

        for (int i = 0; i < sizeArray; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("El resultado de la suma de los elementos de los arreglos A y B es: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.printf("indice: %d, valor: %d\n", i, arrayC[i]);
        }

    }
}
