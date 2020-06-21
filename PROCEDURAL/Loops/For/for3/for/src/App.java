package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Dados N y M números naturales, informar su producto por sumas sucesivas.

        int n;
        int m;
        int producto = 0;

        System.out.println("Ingrese un numero natural");

        n = Teclado.nextInt();

        System.out.println("Ahora ingrese un segundo numero natural");

        m = Teclado.nextInt();

        /*
         * El método de las sumas sucesivas consiste en sumar un numero cuantas veces
         * sea el otro por el cual halla que multiplicar. Ej. 3 X 4 = 3+3+3+3 Para
         * calcular el producto entre dos números por el método de las sumas sucesivas,
         * se hace necesario el uso de ciclos. Los ciclos (while, for) son estructuras
         * repetitivas que permiten que un conjunto de instrucciones se ejecuten cierta
         * cantidad de veces.
         * 
         * Usando For: el iterador i = 1 quiere decir las vueltas que va a ir dando el ciclo, entonces
         * mientras la vuelta sea menor o igual ( <= ) a n, osea al valor del primer numero, 
         * el ciclo va a ir girando y vamos a ir incrementando las vueltas de i, por lo tanto en cada
         * vuelta se va sumar el valor de m a la variable acumuladora "producto", y se va a detener
         * cuando i sea mayor a n. 
         * Por ejemplo, si n=4 y m=5.
         * El iterador va a girar 4 veces, en cada una de esas vueltas le va a sumar 5 a la variable
         * producto, que es la que va a acumular las sumas. 
         * Entonces: 
         * Vuelta 0: producto vale 0
         * Vuelta 1: producto vale 5 (0+5)
         * Vuelta 2: producto vale 10 (5+5 = 10) }
         * Vuelta 3: producto vale 15 (10+5 = 15) } 10, 15 y 20, son la acumulacion de las sumas
         * Vuelta 4: producto vale 20 (15 + 5 =20) }
         * 
         * Ya que: en cada vuelta, producto += m (m vale 5); El signo += significa que se le va a ir 
         * sumando el valor que este despues del signo igual
         * 
         * Las vueltas van a parar segun la condicion que le hayamos puesto, por ejemplo en este caso
         * le dijimos que mientras i sea menor o igual a n (4) que siga girando, pero una vez que supere
         * la 4ta vuelta logicamente se va a detener y nos va a devolver el producto de las sumas
         * sucesivas.
         * 
         * Esto lo vamos a notar debuggeando, pone el breakpoint en el for y en el producto += m;
         * 
         * Fuente: https://tutorias.co/ciclo-while-java-producto-entre-dos-numeros/
         */

        for (int i = 1; i <= n; i++) {
            producto += m;

        }

            System.out.println("Su producto entre: " + m + " Y " + n + " fue: " + producto);

        
    }
}
