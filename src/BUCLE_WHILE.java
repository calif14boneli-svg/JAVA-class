//BUCLE WHILE: 
import java.util.Scanner;

public class BUCLE_WHILE {
    public static void main(String[] args) {
   
    //Datos:
    int i = 1;

    //Bucle WHILE: mientras se cumpla la condicion, se ejecuta el bloque de codigo

    while (i <= 5) {
    System.out.println(i); i++; }
   

//Ejemplo 2: leer numeros hasta que se ingrese un 0

    Scanner sc = new Scanner(System.in);
int numero;

System.out.print("Ingrese un número (0 para salir): ");
numero = sc.nextInt();

while (numero != 0) {
    System.out.println("Ingresaste: " + numero);
    System.out.print("Ingrese otro número: ");
    numero = sc.nextInt();
}
    }
}
