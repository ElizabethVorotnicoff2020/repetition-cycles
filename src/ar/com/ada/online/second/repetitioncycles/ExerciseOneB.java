package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneB {
        public static void main(String[] args) {
            int resultSum = 0;
            int []arrayNumber = new int[10];
            Scanner keyboard = new Scanner(System.in);

            for (int i = 0; i < arrayNumber.length; i++) {
                System.out.printf("Ingrese  el valor para la posicion %d en el arreglo " + i);
                arrayNumber[i] = keyboard.nextInt();
                resultSum = resultSum + arrayNumber[i];
            }
            System.out.printf("La suma de los elementos del array es %d ", + resultSum);
        }
}
