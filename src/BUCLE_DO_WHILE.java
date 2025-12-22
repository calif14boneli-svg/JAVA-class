import java.util.Scanner;

public class BUCLE_DO_WHILE {
    public static void main(String[] args) {
        
//BUCLE DO WHILE: se ejecuta al menos 1 vez, y luego mientras se cumpla la condicion
//SIMPLE EJEMPLO:

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


//Ejemplo 2: menu que se repite hasta elegir salir METODO CON ENTRADA 
        Scanner sc = new Scanner(System.in);
    int opcion;

do {
    System.out.println("1. Saludar");
    System.out.println("2. Salir");
    System.out.print("Elige una opción: ");
    opcion = sc.nextInt();

} while (opcion != 2);


    }
}
