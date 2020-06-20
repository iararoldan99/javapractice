public class Cuotas {
       // Dado el siguiente enunciado y su representación gráfica
        // especifique los datos de entrada, de salida, estrategia y seguimiento.

        // Enunciado: Dado un número real que representa el importe de una compra
        // informar las posibles formas de pago, según la siguiente tabla:
        // 1 cuota de $.................
        // 2 cuotas de $................. total $................. ( 5% de recargo)
        // 6 cuotas de $................. total $................. ( 40% de recargo)

        double importedecompra;
        double unacuota;
        double doscuotas;
        double doscuotasrec;
        double seiscuotas;
        double seiscuotasrec;

        // se usa double porque se espera que esos valores tengan parte decimal

        System.out.println("Ingrese el importe de la compra");

        importedecompra = Teclado.nextInt();

        unacuota = importedecompra * 1;

        System.out.println("En una cuota el total es " + unacuota);

        doscuotas = (importedecompra * 1.05 / 2);

        System.out.println("En dos cuotas serían de " + doscuotas);

        doscuotasrec = (importedecompra * 1.05);

        System.out.println("En dos cuotas con 5% de recargo el total es " + doscuotasrec);

        seiscuotas = (importedecompra * 1.40 / 6);

        System.out.println("En seis cuotas serían de " + seiscuotas);

        seiscuotasrec = (importedecompra * 1.40);

        System.out.println("En seis cuotas con 40% de recargo el total es " + seiscuotasrec);

    
    
}