
import java.util.Scanner;

public class App3 {
    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // forma PROCEDURAL (ya no se resuelve asi)

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Ingresar los lados del triangulo");

        lado1 = Entrada.nextInt();
        lado2 = Entrada.nextInt();
        lado3 = Entrada.nextInt();

        if (lado1 == lado2 && lado2 == lado3)
            System.out.println("El triangulo es equilatero.");
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            System.out.println("El triangulo es isosceles.");
        else
            System.out.println("El triangulo es escaleno");
    }

}