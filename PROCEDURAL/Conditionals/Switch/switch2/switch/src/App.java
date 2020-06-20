
import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Dados un mes y el año correspondiente informar cuantos días tiene el mes.

        String mes;
        int año;

        System.out.println("Ingrese mes");

        mes = Teclado.nextLine();

        System.out.println("Ingrese año");

        año = Teclado.nextInt();

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
            System.out.println("El mes " + mes + "tiene 31 dias");
            break;
            case "abril":
            case "junio":
            case "sepiembre":
            case "noviembre":
            System.out.println("Su mes " + mes + " tiene 30 dias");
            break;
            case "febrero":
            if(año % 4 == 0 && ((año % 100 != 0) || (año % 400 == 0)) ) {
                System.out.println("Su mes " + mes + " tiene 29 dias");
            } else {
                System.out.println("Su mes " + mes + " tiene 28 dias");
            }
            break;
            default:
            System.out.println("el mes ingresado no se reconoce");
            break;       





        }






    }
}