import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Primera forma de hacerlo en objetos

        int numero1, numero2, numero3; // se declaran las variables
        System.out.println("Ingresar los lados del triangulo"); // imprimo en pantalla
        numero1 = Teclado.nextInt(); // ingresa datos por teclado
        numero2 = Teclado.nextInt();
        numero3 = Teclado.nextInt();

        Triangulo triangulo = new Triangulo(numero1, numero2, numero3); // el objeto triangulo

        System.out.println("El triangulo es " + triangulo.resolverTipo() + "."); // invoca el metodo resolverTipo()

    }
}
