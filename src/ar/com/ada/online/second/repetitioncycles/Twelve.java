package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        int[]numberOfStudents  = new int[10];
        int ratings = 0;

        int average;
        int  aboveAverageAmount =0;

       Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i <numberOfStudents.length ; i++) {
            System.out.printf("Ingrese su calificacion para la posicion %d: ", i );
            numberOfStudents[i] = keyboard.nextInt();
        }
        for (int i = 0; i <numberOfStudents.length ; i++) {
            ratings = ratings + numberOfStudents[i];
        }
        average = (ratings / numberOfStudents.length);

        System.out.println("La calificacion promedio del grupo es de: "+average);

        for (int i = 0; i <numberOfStudents.length ; i++) {
            if (numberOfStudents [i] > average){
                aboveAverageAmount = aboveAverageAmount + 1;
            }
        }
        System.out.println("Los estudiantes que obtubieron calificaciones por arriba del promedio fueron: " + aboveAverageAmount);

    }
}
