import java.util.Scanner;

public class Exercise {

    public static Scanner Teclado = new Scanner(System.in);

    
        /*
         * Ejercicio 3:
         * 
         * A partir de un valor entero ingresado por teclado, se pide informar: a) La
         * quinta parte de dicho valor b) El resto de la división por 5 c) La séptima
         * parte del resultado del punto a)
         * 
         * Para el resto usar el operador % (operador modulo o resto) que devuelve el
         * resto de una division entera entre 2 numeros. Ej 10 % 5 = 0 ya que 0 es el
         * resto de una division entera entre 10 y 5 11 % 5 = 1 ya que el resto de la
         * division entera por 5 es 1.
         * 
         */

        int nro;
        int quintaParte;
        int resto;
        int septimaParte;

        System.out.println("Ingrese nro");

        nro = Teclado.nextInt();

        quintaParte = nro / 5;

        System.out.println("La quinta parte de dicho valor es " + quintaParte);

        resto = nro % 5;

        System.out.println("El resto de la división por 5 es " + resto);

        septimaParte = quintaParte / 7;

        System.out.println("La septima parte del resultado del punto a es " + septimaParte);

    }

    
}