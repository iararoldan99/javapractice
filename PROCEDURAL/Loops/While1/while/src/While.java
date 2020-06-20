import java.util.Scanner;

public class While {
    public static Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero;

        numero = Teclado.nextInt();

        int cantidad;

        cantidad = 0;

        while (numero >= 0) {
            cantidad++; // esto es igual a cantidad = cantidad +1

            System.out.println("Ingrese un numero");
            numero = Teclado.nextInt();
        }

        System.out.println("La cantidad de numeros ingresados es " + cantidad);
    }
}