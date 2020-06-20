import java.util.Scanner;

public class ejercicio {

    public static Scanner Teclado = new Scanner(System.in);

        //Dados dos valores enteros y distintos, emitir una leyenda apropiada que
        // informe cuál es el mayor entre ellos.

        int n1;
        int n2;

        System.out.println("Ingrese un numero");

        n1 = Teclado.nextInt();

        System.out.println("Ingrese otro numero");

        n2 = Teclado.nextInt();

        if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        }

        else if(n1 == n2){
            System.out.println("n2 es igual a n1");
        }

        else {
            System.out.println("n2 es mayor que n1");
        }

    }

}