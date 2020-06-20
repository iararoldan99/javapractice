package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /*
         * Se ingresa una edad, mostrar por pantalla alguna de las siguientes leyendas:
         * - ‘menor’ si la edad es menor o igual a 12 
         * - ‘cadete’ si la edad está comprendida entre 13 y 18 
         * - ‘juvenil’ si la edad es mayor que 18 y no supera los 26 
         * - ‘mayor’ en el caso que no cumpla ninguna de las condiciones
         * anteriores
         */

         int edad;
         
         System.out.println("Ingrese edad");

         edad = Teclado.nextInt();

         if (edad <= 12){
             System.out.println("menor");
         }
         else if (edad > 12 && edad < 19) {
             System.out.println("cadete");
           
         }
         else if (edad > 18 && edad < 26){
             System.out.println("juvenil");
         }
         else{
             System.out.println("mayor");
         }     
        
    }

}