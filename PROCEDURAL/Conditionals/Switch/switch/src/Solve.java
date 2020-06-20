package app;

import java.util.Scanner;

public class Solve {

    public static Scanner Teclado = new Scanner (System.in);

        /// Imprimir las siguietnes opciones y luego hacer que el usuario ingrese una
        /// opcion
        // Opcion 1: 1 cuota
        // Opcion 2: 2 cuotas
        // Opcion 6: 6 cuotas.

        int cuotas;

        System.out.println("Ingrese la cantidad de cuotas a pagar");

        // Mostrarle TODAS las opciones.
        System.out.println("1: 1 cuota");
        System.out.println("2: 2 cuotas");
        System.out.println("6: 6 cuotas");

        // Muestran las opciones, leen el valor.
        cuotas = Teclado.nextInt();

        // switch(expresion)
        switch (cuotas) {
            case 1:
                // no abre llaves
                System.out.println("Ud eligio la cuota 1");
                break; // <-- El break hace que no caiga en los otros cases.
            case 2:
                System.out.println("Ud eligio pagar en 2 cuotas");
                break;
            case 6:
                System.out.println("Ud eligio pagar en 6 cuotas");
                break;
            default: //No es ninguno de los anteriores.
                System.out.println("Opcion no valida");
                break;
        }

    }
}