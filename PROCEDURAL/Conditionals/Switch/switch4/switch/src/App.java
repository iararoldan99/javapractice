import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
    /*En un torneo de fútbol participan K equipos. El torneo se juega con el sistema 
    de todos contra todos. Por cada partido disputado por un equipo se dispone 
    de la siguiente información :
     a)	Nro. de equipo,
     b)	Código del resultado ('P'= Perdido, 'E'= Empatado, 'G'= Ganado).
    Se arma un lote de datos con todos los resultados del torneo, agrupados por Nro. de equipo.
    Desarrollar el programa que imprima:
    1) Por cada equipo, su número y el puntaje total que obtuvo (suma 3 si gana, y 1 si empata).
    2) Nro. de equipo que totalizó la menor cantidad de puntos. (hay solo uno)
    */

    String codigo;
        int puntos;
        int k;

        puntos = Teclado.nextInt();

        System.out.println("Ingrese cantidad de equipos");
        k = Teclado.nextInt();

        for(int i = 1; i <= k; i++){
            
            System.out.println("Ingrese si el equipo: " + i + " 'P'= Perdido, 'E'= Empatado, 'G'= Ganado");
            codigo = Teclado.nextLine();

            switch(codigo){
                case "P":
                System.out.println("sus puntos fue de 0");   
                puntos = 0;                 
                break;
                case "E":
                System.out.println("sus puntos fue de 1");
                puntos = 1;
                break;
                case "G":
                System.out.println("sus puntos fue de 3");
                puntos = 3;
                break;
                default:
                break;
                }
            
                System.out.println("El equipo: " + i + "tuvo un puntaje de: " + puntos);   
            }
        }




    }