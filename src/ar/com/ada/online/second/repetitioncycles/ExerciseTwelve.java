package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        int[] arrayRatings = new int[3];
        int [] arraySum = new int[3];
        int [] arrayAverage = new int[3];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayRatings.length; i++) {
            System.out.println("ingrese el valor para el arreglo A en la posicion " + i + ": ");
            arrayRatings[i] = keyboard.nextInt();

            System.out.println("ingrese el valor para el arreglo B en la posicion " + i + ": ");
            arraySum[i] = keyboard.nextInt();
        }

        for (int i = 0; i <arrayRatings.length ; i++) {
            arrayAverage[i] = arrayRatings[i] + arrayAverage[i];
        }

        System.out.println("el resultado de la suma de promedio es de: ");

        for (int i = 0; i < arrayRatings.length; i++) {
            System.out.printf("Indice: %d, Valor: %d\n", i , arraySum[i]);
            
        } 

    }
}
