import java.util.Scanner;
/**
 * Ejercicio 02:Dado tres valores que representan las longitudes de los lados 
 * de un triángulo, determinar su tipo. Las reglas son:
Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo". 
 * @author carolina
 * @version 1.0
 */
public class Ejercicio02_ClasificaciónTriángulo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        String tipoTriangulo = null;
        System.out.print("Dame los tres lados: ");
        ladoA = tcl.nextInt();
        ladoB = tcl.nextInt();
        ladoC = tcl.nextInt();
        
        if ((ladoA == ladoB) && (ladoB == ladoC))
            tipoTriangulo = "Equilatero";
        else
            if ((ladoA == ladoB) || (ladoB == ladoC)|| (ladoA == ladoC))
                tipoTriangulo = "Isoceles";
            else 
                if ((ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC))
                    tipoTriangulo = "Escaleno"; 
        System.out.println("El tipo de triangulo es: " + tipoTriangulo);
    }
}

/***
 *run: 
 * Dame los tres lados: 5 5 5 
 * El tipo de triangulo es: Equilatero
 * BUILD SUCCESSFUL (total time: 3 seconds)
 * 
 */