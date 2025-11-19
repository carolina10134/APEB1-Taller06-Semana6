import java.util.Scanner;
/**
 * Ejercicio 04:Dado un número del 1 al 4 que representa una operación matemática
 * básica (suma, resta, multiplicación, división), muestra el nombre de la operación 
 * correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si
 * ingresa 2, debe mostrar "Resta", y así sucesivamente.
 * @author carolina
 * @version 1.0
 */
public class Ejercicio05_DeterminarTipoOperaciónMatemática {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numeroOperacion;
        String nombreOperacion;
          

        System.out.print("Introduce un numero del 1 al 4 (1=Suma, 2=Resta,"
                + " 3=Multiplicacion, 4=Division): ");
             numeroOperacion = tcl.nextInt(); 
             
              switch (numeroOperacion) {
            case 1:
                nombreOperacion = "Suma";
                break;
            case 2:
                nombreOperacion = "Resta";
                break;
            case 3:
                nombreOperacion = "Multiplicacion";
                break;
            case 4:
                nombreOperacion = "Division";
                break;
            default:
                nombreOperacion = "Numero invalido. Debe ser del 1 al 4.";
                break;
        }

        System.out.println("La operacion correspondiente es: " + nombreOperacion);
        
    }
}

/***
 *RUN:Introduce un numero del 1 al 4 (1=Suma, 2=Resta, 3=Multiplicacion, 4=Division): 3
La operacion correspondiente es: Multiplicacion
BUILD SUCCESSFUL (total time: 3 seconds)

 * 
 */