import java.util.Scanner;

public class While {
    public static Scanner Teclado = new Scanner(System.in);

        int numero;
        int cantidad = 0;

        do {
            System.out.println("Ingrese un numero");
            numero = Teclado.nextInt();

            if (numero >= 0) {
                cantidad++;
            }
        } while (numero >= 0);

        System.out.println("La cantidad de numeros es: " + cantidad);
    }
    
}