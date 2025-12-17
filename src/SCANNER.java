import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) {

    //Datos:
        String nombre;
        int edad;

    //Scanner dara acceso a que funcione el texto:"entrada" para que funcione por la terminal
        Scanner entrada= new Scanner(System.in);

    //salida de lo que se pide del problema:
        System.out.println( "Escribe tu nombre: " );

    //acceso a que puedas interactuar en la terminal con este comando:
        nombre=entrada.next();

    //salida despues de escribir en la terminal:
        System.out.println( "Mi nombre es: " + nombre );



        System.out.println( "Escribe tu edad: " );
        edad=entrada.nextInt();
    //salida
        System.out.println( "Mi edad es: " + edad );

 //TUTORIAL: https://www.youtube.com/watch?v=yzhrA1bfMJQ&list=PL2Z95CSZ1N4GD4wqgXMiujfSVuG2xBP9P&index=11
    }
}
