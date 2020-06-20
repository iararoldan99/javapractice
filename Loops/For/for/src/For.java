import java.util.Scanner;

public class For {
    public static Scanner Teclado = new Scanner(System.in);

        // Dados 5 números ingresados por teclado, calcular la suma

        int suma = 0; // en este caso lo estoy DECLARANDO e INICIALIZANDOLO en cero

        // primer parte: inicializador: int i = 0
        // segunda parte: condicion de corte(cuando de FALSE) de cada vuelta: i < 5
        // tercerparte incrementador: i++ => i = i + 1
        for (int i = 0; i < 5; i++) {
            // Todo lo que pongamos aqui dentro
            // se repite 5 veces.

            // Imprimo "ingrese el nro"
            System.out.println("Ingrese un numero");

            int numero;
            // ingreso el numero
            numero = Teclado.nextInt();

            // Hago la operacion aritmetica
            suma = suma + numero;

        }

        System.out.println("La suma es " + suma);

    }
}