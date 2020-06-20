import java.util.Scanner;

public class Año {

    public static Scanner Teclado = new Scanner(System.in);

    imprimirTituloCabecera();

    int nro;

    nro=Teclado.nextInt();

    int cantidad = 0;

    while(nro>0)
    {

        if (esBisiesto(nro)) {
            cantidad++;
        }
        imprimirTituloCabecera();

        nro = Teclado.nextInt();
    }

    System.out.println("Los años bisiestos son "+cantidad);

    }

    /**
     * Funcion año bisiesto, devuelve true si el año que se paso como parametro es
     * bisiesto. Si no, false. Puede tener o no parametros de entrada, en este caso,
     * tiene uno, que es el anio.
     * 
     * @param anio
     * @return
     */
    public static boolean esBisiesto(int anio) {
        // (nro % 4 == 0 AND nro % 100 != 0) OR (nro % 100 == 0 AND nro % 400 == 0)
        anio = 2001;

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    /***
     * Procedimiento: es una funcion, que no devuelve un valor. Puede o no tener
     * parametros de entrada
     */
    public static void imprimirTituloCabecera() {
        System.out.println("****************** INGRESE AÑO ********************");
        System.out.println("******************HOLA**********************");
        System.out.println("*******************AQUI ABAJO*************************");
        System.out.println("*****");
    }

    public static boolean esBisiestoV2(int anio) {
        // (nro % 4 == 0 AND nro % 100 != 0) OR (nro % 100 == 0 AND nro % 400 == 0)

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            return true;
        }

        return false;

    }

    public static boolean esBisiestoV3(int anio) {
        return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0));
    }

    public static boolean esBisiestoV4(int anio) {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }


}
