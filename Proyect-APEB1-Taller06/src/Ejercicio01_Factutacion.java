/**
 * Ejercicio 01: Facturación de 2 productos: La empresa Amazon.com le contrata 
 * como desarrollador de Sistemas Informáticos para programar su sistema de
 * compras online, el cual calcule el precio total de la compra para un cliente.
 * Para ello, se necesita utilizar estructuras secuenciales y de selección 
 * (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
 * Requisitos:
 * La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
 * Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
 * El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 15% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
 * @author carolina
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio01_Factutacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombPrd1, nombPrd2;
        int cantPrd1, cantPrd2, costPrd1, costPrd2, costTrnsp;
        double iva, desc, subTot, subTot_Iva, total;
        System.out.print("Dame Producto1 su cantidad y precio: ");
        nombPrd1 = tcl.next(); cantPrd1 = tcl.nextInt(); costPrd1 = tcl.nextInt();
        System.out.print("Dame Producto2 su cantidad y precio: ");
        nombPrd2 = tcl.next(); cantPrd2 = tcl.nextInt(); costPrd2 = tcl.nextInt();
        System.out.print("Deme consto de transporte: "); 
        costTrnsp = tcl.nextInt();
        subTot = (cantPrd1 * costPrd1) + (cantPrd2 * costPrd2);
        iva = subTot * 0.15;
        subTot_Iva = subTot + iva;
        //If ternario
        //desc = (subTot > 1000) ? (subTot * 0.2) : (subTot * 0.05) ;
        if (subTot > 1000)
            desc = (subTot_Iva * 0.2);
        else
            desc = (subTot_Iva * 0.05);
        total = (subTot_Iva - desc + costTrnsp);
        if (subTot_Iva > 5000)
            total -= costTrnsp;
        System.out.println("PRODUCTO  CANTIDAD  PRECIO  SUBTOTAL");
        System.out.println(nombPrd1 + "\t" + cantPrd1 + "\t" + costPrd1 + "\t " + (cantPrd1 * costPrd1));
        System.out.println(nombPrd2 + "\t" + cantPrd2 + "\t" + costPrd2 + "\t " + (cantPrd2 * costPrd2));
        System.out.println("Subtotal: " + subTot + "\n" + "IVA: " + iva + "\n" + "SubTot_Iva: " + subTot_Iva +
                           "\n" + "Descuento: " + desc + "\n" + "Gastos de envío: " + costTrnsp +
                           "\n" + "MONTO FACTURA: " + total);
    }
}

/***
 *RUN:
 * 
 */