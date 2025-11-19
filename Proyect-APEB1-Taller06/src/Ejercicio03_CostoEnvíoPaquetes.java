import java.util.Scanner;
/**
 * Ejercicio 03:Un servicio de envío cobra diferentes tarifas según la región
 * y el peso del paquete. Si el peso es menor de 5 kg y la región es "local",
 * el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región
 * "nacional". Para cualquier otro caso, el costo es de $15.
 * @author carolina
 * @version 1.0
 */
public class Ejercicio03_CostoEnvíoPaquetes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double peso;
        String region;
        double costo;

        System.out.print("Ingrese el peso del paquete (kg): ");
        peso = tcl.nextDouble();

        System.out.print("Ingrese la region (local/nacional): ");
        region = tcl.next();

        if (peso < 5 && region == "local") {
            costo = 5;
        } else if (peso >= 5 && peso <= 10 && region == "nacional") {
            costo = 10;
        } else {
            costo = 15;
        }

        System.out.println(" El costo del envio es: " + costo);
    }
}

/***
 *run:
Ingrese el peso del paquete (kg): 13
Ingrese la region (local/nacional): local
 El costo del envio es: 15.0
BUILD SUCCESSFUL (total time: 5 seconds)
 * 
 */