import java.util.Scanner;
/**
 * Ejercicio 04: Dado un número del 1 al 12, que representa un mes del año, 
 * muestra el nombre del mes correspondiente. Por ejemplo, si el usuario ingresa
 * 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 * @author carolina
 * @version 1.0
 */
public class Ejercicio04_ConvertirNúmeroMesNombre {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numeroMes;
        String nombreMes;
                
        System.out.print("Introduce un numero del 1 al 12: ");
        numeroMes = tcl.nextInt();
        
        switch ( numeroMes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número inválido. Debe ser del 1 al 12.";
                break;
        }
        
        System.out.println("El mes correspondiente es: " + nombreMes);
        
       
    }
}
  
    

/***
 *RUN:Introduce un numero del 1 al 12: 9
El mes correspondiente es: Septiembre
BUILD SUCCESSFUL (total time: 3 seconds)
 * 
 */