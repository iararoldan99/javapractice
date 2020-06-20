import java.util.Scanner;

public class Solve{
    public static Scanner Teclado = new Scanner(System.in);

 // Dados 2 numeros que representan los lados de una cara de un cubo,
 // calcular y mostrar la superficie.
        int lado1;
        int lado2;
        int superficie;

        System.out.println("Ingrese el primer lado del cubo");

        lado1 = Teclado.nextInt();

        System.out.println("Ingrese el segundo lado del cubo");

        lado2 = Teclado.nextInt();

        superficie = (lado1 * lado2) * 6;

        System.out.println("La superficie del cubo es " + superficie);

}
