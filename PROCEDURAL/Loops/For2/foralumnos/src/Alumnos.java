import java.util.Scanner;

public class Alumnos {
    public static Scanner Teclado = new Scanner(System.in);

        /*
         * Dado un colegio con N aulas, ingresar para cada aula nombre, año de
         * nacimiento y promedio del alumno. Cada ingreso por aula termina cuando
         * alguien ingresa el nombre "NADIE". Puede haber aulas vacias. Se pide como
         * resultado final, el nombre y nota del promedio mas alto. Cantidad de alumnos
         * que sacaron menos de 4. Cantidad de alumnos que nacieron en un año bisiesto.
         * para el corte del while, usar: nombre.equals("NADIE")
         */

        int cantidadAulas;
        int cantMenosDeCuatro = 0;
        int cantAñoBisiesto = 0;
        String nombre;
        int añoNacimiento;
        double promedioAlumno;
        double promedioMaximo = 0;
        String nombreMaximo = "";

        System.out.println("Ingrese cantidad de aulas");

        cantidadAulas = Teclado.nextInt();
        Teclado.nextLine();

        for (int i = 0; i < cantidadAulas; i++) {
            System.out.println("Ingrese nombre del alumno para aula " + (i + 1));
            nombre = Teclado.nextLine();

            while (!nombre.equals("Nadie")) {
                // 7, 3, 25, 17, 5
                // clara, andrea, alfonsina, facundo, alberto
                System.out.println("Ingrese año de nacimiento");
                añoNacimiento = Teclado.nextInt();
                Teclado.nextLine();
                System.out.println("Ingrese promedio del alumno");
                promedioAlumno = Teclado.nextDouble();
                Teclado.nextLine();
                if (promedioAlumno > promedioMaximo) {
                    promedioMaximo = promedioAlumno;
                    nombreMaximo = nombre;
                }
                if (promedioAlumno < 4) {
                    cantMenosDeCuatro++;

                }

                if (esBisiesto(añoNacimiento)) {
                    cantAñoBisiesto++;
                }

                System.out.println("Ingrese nombre");
                nombre = Teclado.nextLine();

            }

        }

        System.out.println("El alumno " + nombreMaximo + "tiene el promedio mas alto de " + promedioMaximo);
        System.out.println("La cantidad de alumnos con nota menor a cuatro es de " + cantMenosDeCuatro);
        System.out.println("La cantidad de alumnos que nacieron en un año bisiesto es de " + cantAñoBisiesto);

    }

    public static boolean esBisiesto(int anio) {
        // (nro % 4 == 0 AND nro % 100 != 0) OR (nro % 100 == 0 AND nro % 400 == 0)

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}