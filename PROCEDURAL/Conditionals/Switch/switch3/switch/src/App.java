package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        /*Dados dos números, mostrar un menú con
         opciones de sumar, restar o multiplicar dichos números. 
         Solicite elegir una opción.
         */

         int num1;
         int num2;
         int suma;
         int resta;
         int multiplicar;

         System.out.println("Ingrese un numero");

         num1 = Teclado.nextInt();

         System.out.println("Ingrese un segundo numero");

         num2 = Teclado.nextInt();

         System.out.println("Elija la operación que desee realizar: para sumar ingrese 1, resta ingrese 2 o multiplicar ingrese 3");
         
         int operacion = Teclado.nextInt();

         switch (operacion) {
             case 1:
             suma = num1 + num2;
             System.out.println("La suma de ambos numeros es " + suma);               
                 break;

            case 2:
            resta = num1 - num2;
            System.out.println("La resta de ambos numeros es " + resta);
               break;

            case 3:
            multiplicar = num1 * num2;
            System.out.println("La multiplicacion de ambos numeros es " + multiplicar);
                break;
         }

    }
}