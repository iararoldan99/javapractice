package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //CICLOS: FOR | Informar los primeros 100 números naturales y su sumatoria

        /*
        for (inicializacion ; condicion ; aumento o decremento ) {
            instrucciones;
        }
        */

        int suma = 0; 
        int numero;

        System.out.println("Ingrese numero");

        numero = Teclado.nextInt();

        for (int i=0 ; i < 100 ; i++) {
            System.out.println(i);
            suma = suma + numero; 
            
        }

        System.out.println("La suma es " + suma); 




        
    }
}